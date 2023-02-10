import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {

    public static void main(String[] args) {


        try {

            String source= "test.txt";
            CharStream cs =fromFileName(source);
            TinyLanguage_SIILexer lexer=new TinyLanguage_SIILexer(cs);
            CommonTokenStream token =new CommonTokenStream(lexer);
            TinyLanguage_SIIParser parser =new TinyLanguage_SIIParser(token);
            ParseTree tree=parser.programme();
            listner l=new listner();

          //  myVisitor visitor=new myVisitor();
            //visitor.visit(tree);

            ParseTreeWalker walker=new ParseTreeWalker();
            walker.walk(l,tree);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
