grammar TinyLanguage_SII;




/*______________________________________________________________________________________

lexer Rules
______________________________________________________________________________________*/

programme:COMPIL NomProg '()' '{' declar 'start' desc '}';


//declaration des variables
declar: type ids ';';
type: Int|Float|String;


//contenu du programme
desc: inst|inst desc;
inst:opr|comp|if|boucle|scan|print ;
if: 'if' '(' comp ')' Then '{' desc '}'(|Else'{'desc'}') ;
comp: exp Comp exp ;
opr:(exp Op opr )|exp';';
exp: val|(val Op exp);
val:Entier|Reel|ID;

// boucle do while
boucle: Do desc DoWhile comp ')''}';

// L’instruction de l’ecture
scan:Scan ids ');';
// L’instruction d’écriture
print: Print ids ');';
ids: ID ',' ids|ID;

/*______________________________________________________________________________________

mots clés
______________________________________________________________________________________*/


/*______________________________________________________________________________________

mots clés
______________________________________________________________________________________*/
COMPIL:'compil ';
Start:'start';
Int:'intCompil';
String:'stringCompil';
Float:'floatCompil';
Then:'then';
Else:'else' ;
If:'if';
DoWhile:'} while (';
Do:'do {';
Print:'printCompil (';
Scan:'scanCompil (';

/*______________________________________________________________________________________

exp reg
______________________________________________________________________________________*/

NomProg:[A-Z][A-Z a-z]*;
ID :[a-zA-Z][a-zA-Z0-9]*;

Entier:[0-9]+;
Reel:[0-9]+ ','?[0-9]+;

Op:'*'|'/'|'+'|'-'|'=';
Comp:'>'| '<'| '=='| '!=';

COMM: '/*' (.)*'*/' -> skip;
Sauts: [\n|\t\r] -> skip;
Space: ' '->skip;