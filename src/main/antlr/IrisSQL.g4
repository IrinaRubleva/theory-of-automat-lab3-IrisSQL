grammar IrisSQL;
prog: request EOF;


//поддерживаемые команды
request
    : createDataBase | dropDataBase | createTable | dropTable | insert | select;

createDataBase: CREATE DATABASE name SEMICOLON;
dropDataBase: DROP DATABASE name SEMICOLON;

createTable : CREATE TABLE name LPAREN columnDef (COMMA columnDef)* RPAREN SEMICOLON;
dropTable : DROP TABLE name SEMICOLON;

columnDef : name dataType columnModifier* ;
columnModifier
    : PRIMARY KEY | UNIQUE | NOT NULL;

insert: INSERT INTO name VALUE LPAREN expr (COMMA expr)* RPAREN SEMICOLON;

select: SELECT projection FROM tableRef whereClause? orderClause? SEMICOLON;
projection: STAR | selectItem (COMMA selectItem)*;
selectItem: expr (AS name)?;

tableRef: name | LPAREN select RPAREN;
whereClause: WHERE expr;
orderClause: ORDER BY orderItem (COMMA orderItem)*;
orderItem: name (ASC | DESC)?;

expr
    : expr op=('*' | '/' | '%') expr
    | expr op=('+' | '-') expr
    | expr op=(EQ | NEQ) expr
    | expr op=AND expr
    | expr op=OR expr
    | NOT expr
    | LPAREN expr RPAREN
    | literal
    | name ;

literal : INTEGER_NUM | REAL_NUM | STRING | TRUE | FALSE | NULL ;
dataType : TEXT | INTEGER_TYPE | REAL_TYPE | LOGIC ;


CREATE : [cC][rR][eE][aA][tT][eE];
DATABASE : [dD][aA][tT][aA][bB][aA][sS][eE];
TABLE : [tT][aA][bB][lL][eE];
DROP : [dD][rR][oO][pP];
INSERT : [iI][nN][sS][eE][rR][tT];
INTO : [iI][nN][tT][oO];
VALUE : [vV][aA][lL][uU][eE];
SELECT : [sS][eE][lL][eE][cC][tT];
FROM : [fF][rR][oO][mM];
WHERE : [wW][hH][eE][rR][eE];
ORDER : [oO][rR][dD][eE][rR];
BY : [bB][yY];
ASC : [aA][sS][cC];
DESC : [dD][eE][sS][cC];
AS : [aA][sS];
PRIMARY : [pP][rR][iI][mM][aA][rR][yY];
KEY : [kK][eE][yY];
UNIQUE : [uU][nN][iI][qQ][uU][eE];
NOT : [nN][oO][tT];
NULL : [nN][uU][lL][lL];
AND : [aA][nN][dD];
OR : [oO][rR];
TRUE : [tT][rR][uU][eE];
FALSE : [fF][aA][lL][sS][eE];
TEXT : [tT][eE][xX][tT];
LOGIC : [lL][oO][gG][iI][cC];
INTEGER_TYPE : [iI][nN][tT][eE][gG][eE][rR];
REAL_TYPE : [rR][eE][aA][lL];


EQ : '=';
NEQ : '<>';


LPAREN : '(';
RPAREN : ')';
COMMA : ',';
SEMICOLON : ';';
STAR : '*';


name: IDENTIFIER;
IDENTIFIER: [a-zA-Z_$][a-zA-Z0-9_$]*;

INTEGER_NUM : [0-9] ([0-9] | '_' [0-9])*;
REAL_NUM : [0-9] ([0-9] | '_' [0-9])* '.' [0-9] ([0-9] | '_' [0-9])*;


STRING : '"' (ESC | ~["\\])* '"';
fragment ESC : '\\' ["\\];


WS : [ \t\r\n]+ -> skip;