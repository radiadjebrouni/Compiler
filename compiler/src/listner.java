import TableSymboles.TSobjects;
import TableSymboles.TableS;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.management.relation.RelationService;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class listner extends TinyLanguage_SIIBaseListener {

    /*********************
     *Colors
     ******************/

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    public static final Color VERY_LIGHT_RED = new Color(255,102,102);
    private LinkedList<String> stack = new LinkedList<>();
   // private LinkedList<Integer> stackCondition = new LinkedList<>();
    //private LinkedList<Integer> stackAlors = new LinkedList<>();
    private final Quadgen quad = new Quadgen();
    private  static int saveCondition;
    private  static int saveDo;



    private int cptTemps = 0;

    private final static TableS table = new TableS();
    private static final ArrayList<String> errors = new ArrayList<>();
    private static final ArrayList<String> codeAss = new ArrayList<>();
    private final HashMap<ParserRuleContext, Integer> expTypes = new HashMap();

    @Override
    public void exitProgramme(TinyLanguage_SIIParser.ProgrammeContext ctx) {


        if (errors.size() != 0) {
            System.out.println("\n\n");
            System.out.println(String.format("%30s",RED_BOLD_BRIGHT+"\n*************************************** PROGRAM FAILED**********************************************************\n"+ANSI_RESET));

            for (String s : errors) {
                System.out.println(ANSI_RED+s+ANSI_RESET);
            }
        } else
        {
            System.out.println(String.format("%30s",CYAN_BOLD_BRIGHT+"\n*********************************** PROGRAM COMPILED WITH SUCCESS **********************************************\n"+ANSI_RESET));
            //******************************************************************/

            // si aucune erreur alors, ajouter le quad END
            quad.addQuad("END","","","");
            }
        //TABLE DE SYMBOLES
        System.out.println(String.format("%s", ANSI_BLUE+"\n\n----------------------------------------------------------------------------------------------------------------" +ANSI_RESET));
        System.out.println(String.format("%75s", PURPLE_BOLD_BRIGHT+ "TABLE DES SYMBOLES" +ANSI_RESET));
        System.out.println(String.format("%s", ANSI_BLUE+"----------------------------------------------------------------------------------------------------------------" +ANSI_RESET));


        System.out.println(String.format("%45s %21s %20s %26s %15s", PURPLE_BOLD_BRIGHT+"Item"+ANSI_RESET, ANSI_BLUE+"|"+ANSI_RESET, PURPLE_BOLD_BRIGHT+"Type"+ANSI_RESET,ANSI_BLUE+"|"+ANSI_RESET, PURPLE_BOLD_BRIGHT+"Value"+ANSI_RESET));
        System.out.println(String.format("%s", ANSI_BLUE+"----------------------------------------------------------------------------------------------------------------" +ANSI_RESET));

        for (String s : table.table.keySet()) {

            System.out.println(String.format("%30s %25s %10s %25s %10s", s, ANSI_BLUE+"|"+ANSI_RESET, table.getObject(s).getType(), ANSI_BLUE+"|"+ANSI_RESET, table.getObject(s).getValue()));
        }
        System.out.println(String.format("%s", ANSI_BLUE+"----------------------------------------------------------------------------------------------------------------" +ANSI_RESET));


        /* affichage des quadruplets */
        System.out.println(PURPLE_BOLD_BRIGHT+"\n\n-------------- QUADRUPLETS --------------\n"+ ANSI_RESET);
        for(int i=0;i<quad.size();i++){
            System.out.println(ANSI_BLUE+i+ANSI_RESET+"-"+quad.getQuad(i).affich(quad.getQuad(i)));
        }
        System.out.println(PURPLE_BOLD_BRIGHT+"\n-------------------------------------------\n"+ANSI_RESET);


        //******************************************************************/
        if(quad.size()>0){
            codeAss.add(CYAN_BOLD_BRIGHT+"\tBEGIN");

            for(int i=0;i< quad.size();i++)
        {  codeAss.add(ANSI_BLUE+"Etiq"+i +":"+ANSI_RESET);
            if(quad.getQuad(i).getOperateur()!=null){
            if(quad.getQuad(i).getOperateur().equals("+"))
            {
                codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                codeAss.add(GREEN_BOLD_BRIGHT+"\tADD "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+quad.getQuad(i).getContaineur()+" , "+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET);
            }

            if(quad.getQuad(i).getOperateur().equals("-"))
            {
                codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                codeAss.add(GREEN_BOLD_BRIGHT+"\tSUB "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+quad.getQuad(i).getContaineur()+" , "+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET);
            }

            if(quad.getQuad(i).getOperateur().equals("*"))
            {
                codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+ ","+quad.getQuad(i).getOpgauche());
                codeAss.add(GREEN_BOLD_BRIGHT+"\tMUL "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+quad.getQuad(i).getContaineur()+" , "+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET);
            }

            if(quad.getQuad(i).getOperateur().equals("/"))
            {
                codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+ ","+quad.getQuad(i).getOpdroit());
                codeAss.add(GREEN_BOLD_BRIGHT+"\tDIV "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+quad.getQuad(i).getContaineur()+" , "+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET);
            }

                if(quad.getQuad(i).getOperateur().equals(":="))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+quad.getQuad(i).getContaineur() +" , "+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET);
                }

                if(quad.getQuad(i).getOperateur().equals("READ"))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tINPUT  "+ANSI_RESET+quad.getQuad(i).getOpdroit());

                }

                if(quad.getQuad(i).getOperateur().equals("WRITE"))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tOUTPUT  "+ANSI_RESET+quad.getQuad(i).getOpdroit());

                }
                if(quad.getQuad(i).getOperateur().equals("BGE"))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tCOMP "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                    codeAss.add(YELLOW_BOLD_BRIGHT+"\tJGE "+ANSI_RESET+"ETIQ  "+quad.getQuad(i).getContaineur());
                }
                if(quad.getQuad(i).getOperateur().equals("BG"))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tCOMP "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                    codeAss.add(YELLOW_BOLD_BRIGHT+"\tJG "+ANSI_RESET+"ETIQ  "+quad.getQuad(i).getContaineur());
                }

                if(quad.getQuad(i).getOperateur().equals("BLE"))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tCOMP "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                    codeAss.add(YELLOW_BOLD_BRIGHT+"\tJLE "+ANSI_RESET+"ETIQ  "+quad.getQuad(i).getContaineur());
                }
                if(quad.getQuad(i).getOperateur().equals("BL"))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tCOMP "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                    codeAss.add(YELLOW_BOLD_BRIGHT+"\tJL "+ANSI_RESET+"ETIQ  "+quad.getQuad(i).getContaineur());
                }

                if(quad.getQuad(i).getOperateur().equals("BNE"))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tCOMP "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                    codeAss.add(YELLOW_BOLD_BRIGHT+"\tJNE "+ANSI_RESET+"ETIQ  "+quad.getQuad(i).getContaineur());
                }
                if(quad.getQuad(i).getOperateur().equals("BE"))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tCOMP "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                    codeAss.add(YELLOW_BOLD_BRIGHT+"\tJE "+ANSI_RESET+"ETIQ  "+quad.getQuad(i).getContaineur());
                }

                if(quad.getQuad(i).getOperateur().equals("BR"))
                {
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tMOV "+ANSI_RESET+BLUE_BOLD_BRIGHT+"AX "+ANSI_RESET+quad.getQuad(i).getOpdroit());
                    codeAss.add(GREEN_BOLD_BRIGHT+"\tCOMP "+ANSI_RESET+quad.getQuad(i).getOpgauche());
                    codeAss.add(YELLOW_BOLD_BRIGHT+"\tJMP "+ANSI_RESET+"ETIQ  "+quad.getQuad(i).getContaineur());
                }
                if(quad.getQuad(i).getOperateur().equals("END"))
                {
                    codeAss.add(CYAN_BOLD_BRIGHT+"\tEND");

                }

            }
        }}

        // affichage du code objet

        //******************************************************************/
        if (codeAss.size() != 0) {
            System.out.println(PURPLE_BOLD_BRIGHT+"\n-------------- CODE D'OBJET --------------\n"+ANSI_RESET);

            for (String s : codeAss) {
                System.out.println(s);
            }
        }


    }


    @Override
    public void exitDeclar(TinyLanguage_SIIParser.DeclarContext ctx) {
     super.exitDeclar(ctx);
    }

    @Override
    public void exitDec(TinyLanguage_SIIParser.DecContext ctx) {
        //table.table.clear();
        TinyLanguage_SIIParser.IdsContext idss = ctx.ids();
        int type = 0;
        String c="";
        Object value = null;
        String t = ctx.type().getText();
        if (t.equals("intCompil")) {type = 0; value=0; }//initialisation par defaut
        if (t.equals("floatCompil")){ type = 1; value=0.0;}
        if (t.equals("stringCompil")) {type = 2; value=c;}
        // if(!idss.isEmpty()) {
        String idname;

        //    for (; ; idss = idss != null ? idss.ids() : null) {
        // for (; ; idss = idss.ids()){
        if (idss.getText().split(",").length>1){
            for (String s : idss.getText().split(",")) {

                if (idss.ids() == null)
                    return;

                idname = s;//idss.getChild(0).getText();
                if (table.lookUp(idname)) {
                    errors.add("Variable " + idname + " deja declarée");
                } else //add the var to the table
                {
                    TSobjects o = new TSobjects(value, 1, type);
                    table.addObject(idname, o);

                }

            }
        }
        else { //one declared id
            if (table.lookUp(idss.getText())) {
                errors.add("Variable " + idss.getText() + " deja declaree");
            } else
            {
                TSobjects o = new TSobjects(value, 1, type);
            table.addObject(idss.getText(), o);

        }

        }

    }

    @Override
    public void exitDesc(TinyLanguage_SIIParser.DescContext ctx) {
        super.exitDesc(ctx);
    }

    @Override
    public void exitInst(TinyLanguage_SIIParser.InstContext ctx) {
        super.exitInst(ctx);
    }

    @Override
    public void exitInstif(TinyLanguage_SIIParser.InstifContext ctx) {
        quad.getQuad(saveCondition-1).setContaineur(""+(quad.size())); //le 3eme element

    }

    @Override
    public void exitDoo(TinyLanguage_SIIParser.DooContext ctx) {
        saveDo=quad.size();
       // System.out.println(saveDo);
    }

    @Override
    public void exitBoucle(TinyLanguage_SIIParser.BoucleContext ctx) {
        quad.getQuad(quad.size()-1).setContaineur(""+(saveDo)); //le 3eme element
        if ( quad.getQuad(quad.size()-1).getOperateur().equals("BGE")) quad.getQuad(quad.size()-1).setOperateur("BL");
        if ( quad.getQuad(quad.size()-1).getOperateur().equals("BLE")) quad.getQuad(quad.size()-1).setOperateur("BG");
        if ( quad.getQuad(quad.size()-1).getOperateur().equals("BE")) quad.getQuad(quad.size()-1).setOperateur("BNE");
        else {
            if (quad.getQuad(quad.size() - 1).getOperateur().equals("BNE"))
                quad.getQuad(quad.size() - 1).setOperateur("BE");
        }
    }


    @Override
    public void exitComp(TinyLanguage_SIIParser.CompContext ctx) {

        if(expTypes.containsKey(ctx.opr(0))
           && expTypes.containsKey(ctx.opr(1))
        &&!expTypes.get(ctx.opr(0)).equals(expTypes.get(ctx.opr(1))))
        {
            errors.add("Inconpatiblite de type dans la comparaison " + ctx.getText());

        }
        expTypes.clear();
        String t1="";String t2 = "";
       if(!stack.isEmpty())
       {t1 = stack.removeLast();
         t2 = stack.removeLast();}

       String comp=ctx.Comp().getText();
       if(comp.equals(">")) saveCondition = quad.addQuad("BLE",t2,t1,"");
       if(comp.equals("<")) saveCondition = quad.addQuad("BGE",t2,t1,"");
       if(comp.equals("==")) saveCondition = quad.addQuad("BNE",t2,t1,"");
       if(comp.equals("!=")) saveCondition = quad.addQuad("BE",t2,t1,"");


    }

    @Override
    public void exitAff(TinyLanguage_SIIParser.AffContext ctx) {
        if (expTypes.containsKey(ctx.opr())) {

            //verification de type

            if (table.lookUp(ctx.idp().ID().getText())) {
                if ((table.getObject(ctx.idp().ID().getText()).getType() ==0
                        && expTypes.get(ctx.opr())!=0)
                || (table.getObject(ctx.idp().ID().getText()).getType() ==1
                        && expTypes.get(ctx.opr())==2)){
                    errors.add("Inconpatiblite de type dans l'affectation " + ctx.getText());
                } else {
                    if (ctx.opr().t().exp().val() != null
                            && ctx.opr().OPL() == null
                            && ctx.opr().t().OPH() == null) {
                        // affecter la valeur
                        if(ctx.opr().t().exp().val().ID()!=null)
                            table.update(ctx.idp().ID().getText(), table.getObject(ctx.opr().t().exp().val().ID().getText()).getValue());
                        else {
                            if (ctx.opr().t().exp().val().Entier()!=null) table.update(ctx.idp().ID().getText(), ctx.opr().t().exp().val().Entier().getText());

                            if(ctx.opr().t().exp().val().EntierS()!=null) table.update(ctx.idp().ID().getText(), ctx.opr().t().exp().val().EntierS().getText());
                            if(ctx.opr().t().exp().val().Reel()!=null) table.update(ctx.idp().ID().getText(), ctx.opr().t().exp().val().Reel().getText());
                            if(ctx.opr().t().exp().val().ReelS()!=null) table.update(ctx.idp().ID().getText(), ctx.opr().t().exp().val().ReelS().getText());

                        }
                    }

                }
            } else {
                errors.add("variable "+ctx.idp().ID().getText()+" non déclarée  dans l'affectation " + ctx.getText());

            }}

        //***************************************************
        // add quad
        //*****************************************************
        String tmp = stack.removeLast();
        quad.addQuad(":=",tmp,"",ctx.idp().ID().getText());

        expTypes.clear();  //vider les ctx
    }

    @Override
    public void exitEl(TinyLanguage_SIIParser.ElContext ctx)
    {
        quad.getQuad(saveCondition-1).setContaineur(
                ""+(quad.size()+1));
        saveCondition = quad.addQuad("BR","","","");
    }
    @Override
    public void exitOpr(TinyLanguage_SIIParser.OprContext ctx) {
        if(ctx.opr()==null)  ///on est dans t
        {
            expTypes.put(ctx,expTypes.get(ctx.t()));

        }
        else { // on est dans (opr OP t )tester la comptabilité de type
            if(expTypes.containsKey(ctx.t())){
            if(expTypes.get(ctx.opr())==0 && expTypes.get(ctx.t())==0 )
            //   ||expTypes.get(ctx.exp())==0 && expTypes.get(ctx.exp())==1 )

            {
                expTypes.put(ctx,0);
            }
            else{
                if((expTypes.get(ctx.opr())==0 && expTypes.get(ctx.t())==0 )
                        ||(expTypes.get(ctx.opr())==0 && expTypes.get(ctx.t())==1 ))

                    expTypes.put(ctx,1);
                else {
                    if((expTypes.get(ctx.opr())!=2))
                    errors.add("Incomptabilité de type dans l'operation "+ctx.getText() );
                    //expTypes.put(ctx,2);

                }
            }

        }
         // **********************quads******************
                String t1 = stack.removeLast();
                String t2 = stack.removeLast();
                String temp = "Temp"+(++cptTemps);
                quad.addQuad(ctx.OPL().getText(),t2,t1,temp);
                stack.add(temp);


        }
    }

    @Override
    public void exitT(TinyLanguage_SIIParser.TContext ctx) {
       if ( ctx.t()==null)
       { expTypes.put(ctx,expTypes.get(ctx.exp()));}
       else {
           //division par 0

           if(ctx.exp().val().Entier()!=null)
           {
           if (ctx.OPH() != null && ctx.OPH().getText().equals("/")

           &&( Integer.parseInt(String.valueOf(ctx.exp().val().Entier().getText()))==0))
//           || Integer.parseInt(String.valueOf(table.getObject(ctx.exp().val().ID().getText()).getValue()))==0)) {
           { errors.add("Erreur de division par 0 dans l'operation " + ctx.getText());
           }
           }else {
               if(ctx.exp().val().ID()!=null)
               {
                   if (ctx.OPH() != null && ctx.OPH().getText().equals("/")
                              && table.lookUp(ctx.exp().val().ID().getText())
                           &&//Integer.parseInt(String.valueOf(table.getObject(
                           Float.parseFloat(String.valueOf(table.getObject(ctx.exp().val().ID().getText()).getValue()))==0) {
                       errors.add("Erreur de division par 0 dans l'operation " + ctx.getText());


                   }
               }


           }
               //verifier la comptabilité de type entre t est exp
               if (expTypes.get(ctx.t()) == 0 && expTypes.get(ctx.exp()) == 0)
               //   ||expTypes.get(ctx.exp())==0 && expTypes.get(ctx.exp())==1 )

               {
                   expTypes.put(ctx, 0);
               } else {
                   if ((expTypes.get(ctx.t()) == 0 && expTypes.get(ctx.exp()) == 0)
                           || (expTypes.get(ctx.t()) == 0 && expTypes.get(ctx.exp()) == 1)) {
                       expTypes.put(ctx, 1);
                   } else {
                       expTypes.put(ctx, 2); //erreur
                       errors.add("Incomptabilité de type dans l'expression " + ctx.getText());
                   }
               }
           //**********************quads***************************
           String t1=null,t2 = null;
           if(!stack.isEmpty()) t1= stack.removeLast();
           if(!stack.isEmpty()) t2 = stack.removeLast();
           String temp = "Temp"+(++cptTemps);
           quad.addQuad(ctx.OPH().getText(),t2,t1,temp);
           stack.add(temp);
           }






    }

    @Override
    public void exitExp(TinyLanguage_SIIParser.ExpContext ctx) {
       //extracte le type depuis le hashmap

        if(ctx.opr()!=null) expTypes.put(ctx,expTypes.get(ctx.opr()));
        else { //type de val

            expTypes.put(ctx,expTypes.get(ctx.val()));
            stack.add(ctx.getText());
        }


    }

    @Override
    public void exitVal(TinyLanguage_SIIParser.ValContext ctx) {

        //enregistrer le type de val pour verifier la compatibilité dans lesxpression
        //on l'insere dans le hashmap
        //si c un id alors on lextracte deouis la TS
        if( ctx.ID()!=null) {
            if(table.table.containsKey(ctx.ID().getText())) {
          //      System.out.println(table.getObject(ctx.ID().getText()).getType());
                expTypes.put(ctx, table.getObject(ctx.ID().getText()).getType());
            }else {
                errors.add("variable "+ctx.ID().getText()+" non déclarée ");
                expTypes.put(ctx,2);

            }


        }
        else {
            if (ctx.Entier()!=null || ctx.EntierS()!=null)
                expTypes.put(ctx,0);
            else { //un float
                expTypes.put(ctx,1);
            }

        }

    }


    @Override
    public void exitScan(TinyLanguage_SIIParser.ScanContext ctx) {
        Scanner scanner = new Scanner(System.in);
        TinyLanguage_SIIParser.IdContext idss = ctx.id();
        System.out.println("ENTRER UNE VALEUR");
        int type = 0;
        if (scanner.hasNextInt()) {
            int f = scanner.nextInt();

            for (String s : idss.getText().split(",")) {
                if(table.table.containsKey(s)) {
                    type = table.getObject(s).getType();

                    if ((type == 0)) {
                       // System.out.println(f);
                        table.update(s, f);
                    } else {
                        errors.add("Incompatibilité de type dans le scan de "+ s );

                    }
                }
            }

        }else {
            if (scanner.hasNextFloat()) {
                float f = scanner.nextFloat();

                for (String s : idss.getText().split(",")) {
                    if(table.table.containsKey(s)) {
                    type = table.getObject(s).getType();
                 //   System.out.println(type);
                    if ((type == 0 || type == 1)) {
                        table.update(s, f);
                    } else {
                        errors.add("Incompatibilité de type dans le scan de " + s);

                    }

                }}

            } else {

                    if (scanner.hasNextLine()) {
                        String f = scanner.nextLine();

                        for (String s : idss.getText().split(",")) {
                            if(table.table.containsKey(s)) {
                            type = table.getObject(s).getType();
                            if (type == 2) {
                                table.update(s, f);
                            } else {
                                errors.add("Incompatibilité de type dans le scan de " +s);

                            }

                        }

                    }}
                }



    }
        //******************************************************************/
        for (String s: ctx.id().getText().split(","))
        quad.addQuad("READ",s,"","");
        //******************************************************************/
    }
    @Override
    public void exitPrint(TinyLanguage_SIIParser.PrintContext ctx) {
        TerminalNode id=ctx.idp().ID();
       // System.out.println("prriiiiiint");
        int n=0;
        if (id!=null ) {

            if (!table.lookUp(id.getText())) {
                System.out.println(id.getText());
                quad.addQuad("WRITE",id.getText(),"","");


            } else {
                quad.addQuad("WRITE",String.valueOf(table.getObject(id.getText()).getValue()),"","");

                System.out.println(table.getObject(id.getText()).getValue());

            }
        }//else System.out.println("");

    }

    @Override
    public void exitIds(TinyLanguage_SIIParser.IdsContext ctx) {
        super.exitIds(ctx);
    }

    @Override
    public void exitId(TinyLanguage_SIIParser.IdContext ctx) {
        if( !table.table.containsKey(ctx.ID().getText()))
            errors.add("variable "+ ctx.ID().getText()+" non declaree");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }


}
