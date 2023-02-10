grammar TinyLanguage_SII;

/*______________________________________________________________________________________

lexer Rules
______________________________________________________________________________________*/

programme:COMPIL NomProg '{' declar 'start' desc '}';


//declaration des variables
declar:declar dec|dec;
dec:type ids ';';
type: Int|Float|String;


//contenu du programme
desc: inst|inst desc;
inst:comp|instif|aff|boucle|scan|print;//|aff ;
instif: 'if' '(' comp ')' Then '{' desc '}'(|el'{'desc'}') ;  //if
comp: opr Comp opr ;                                      //comparaison
aff:idp AFF opr ';';                                       //affectation
el:Else;
/****** OPH: plus priotaires  OPL: moins prioritaires ****/
opr:opr OPL t|t;
t:t OPH exp|exp;
exp: val|'(' opr ')';
val:Entier|Reel|ID|EntierS |ReelS ;

// boucle do while
boucle: doo '{'desc '}'DoWhile '(' comp ')';
doo:Do;
// L’instruction de l’ecture
scan:Scan '('id ')' ';';

// L’instruction d’écriture
print: Print '(' idp ')' ';';

ids:ID ',' ids|ID;
id: ID ',' id|ID;
idp:ID;


/*______________________________________________________________________________________

mots clés
______________________________________________________________________________________*/


//debut de programme
COMPIL:'compil ';
Start:'start';
Int:'intCompil';
String:'stringCompil';
Float:'floatCompil';
Then:'then';
Else:'else' ;
If:'if';
DoWhile:'while';
Do:'do';
Print:'printCompil';
Scan:'scanCompil';

/*______________________________________________________________________________________

Exp Reg
______________________________________________________________________________________*/

NomProg:[A-Z][A-Z a-z]* ESPACE* Space*'('ESPACE* Space*')';
ID :[a-zA-Z][a-zA-Z0-9]*;
EntierS:'('[+-][0-9]+')';
Entier:[0-9]+;
ReelS:'('[+-][0-9]+ '.'?[0-9]+')';
Reel:[0-9]+ '.'?[0-9]+;


/*----------------------------------------------------

operators

--------------------------------*/
OPL :PLUS|MINUS;
OPH: DIV|MUL;
Op:PLUS|MUL|MINUS|DIV;//'*'|'/'|'+'|'-';
Comp:SUP|EQ|INF|DIF;//'>'| '<'| '=='| '!=';
AFF : '=';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
SUP : '>';
INF : '<';
EQ : '==';
DIF : '!=';


/*****************************************

To skip

----------------------------------------*/

COMM1L : '/''/'(~[\n])* -> skip;
COMM2L : '/*' (.)*?'*/' -> skip;
ESPACE : [ \n\t\r] -> skip;
Space: ' '->skip;


