grammar IrisSQL;
prog: request EOF;


//поддерживаемые команды
request
    : createDataBase
    | dropDataBase
    | createTable
    | dropTable
    | insert
    | selectStatement
    | delete
    | alter
    ;

delete: DELETE FROM name whereClause? SEMICOLON;
createDataBase: CREATE DATABASE name SEMICOLON;
dropDataBase: DROP DATABASE name SEMICOLON;

createTable : CREATE TABLE name LPAREN columnDef (COMMA columnDef)* RPAREN (WITH INDEXING BY indexType)? SEMICOLON;
indexType : ORDER | HASH | TREE;
dropTable : DROP TABLE name SEMICOLON;

columnDef : name dataType columnModifier* ;
columnModifier
    : PRIMARY KEY | UNIQUE | NOT NULL;

insert: INSERT INTO name VALUE LPAREN expr (COMMA expr)* RPAREN SEMICOLON;

selectStatement
    : selectCore SEMICOLON
    ;

selectCore
    : SELECT projection
      FROM tableRef
      joinClause*
      whereClause?
      groupByClause?
      orderClause?
      skipClause?
      limitClause?
    ;

skipClause : SKIP_ INTEGER_NUM;
limitClause : LIMIT INTEGER_NUM;

projection: STAR | selectItem (COMMA selectItem)*;
selectItem: expr (AS name)?;

alter
    : ALTER TABLE name ADD COLUMN columnDef SEMICOLON
    | ALTER TABLE name DROP COLUMN name SEMICOLON
    | ALTER TABLE name EDIT COLUMN columnDef SEMICOLON
    | ALTER TABLE name ADD CONSTRAINT name constraintDef SEMICOLON
    | ALTER TABLE name DROP CONSTRAINT name SEMICOLON
    ;

constraintDef
    : PRIMARY KEY LPAREN columnList RPAREN
    | UNIQUE LPAREN columnList RPAREN
    ;


tableRef: name | LPAREN selectCore RPAREN;
joinClause: (LEFT | RIGHT | FULL)? JOIN tableRef ON expr;
columnList: name (COMMA name)*;
whereClause: WHERE expr;
orderClause: ORDER BY orderItem (COMMA orderItem)*;
orderItem: name (ASC | DESC)?;
groupByClause: GROUP BY columnList;

expr
    : expr op=('*' | '/' | '%') expr
    | expr op=('+' | '-') expr
    | expr op=(EQ | NEQ | G | GE | L | LE) expr
    | expr op=AND expr
    | expr op=OR expr
    | NOT expr
    | LPAREN expr RPAREN
    | literal
    | name
    | funcCall ;

funcCall: name LPAREN (expr (COMMA expr)*)? RPAREN;
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
GROUP: [Gr][Rr][Oo][Uu][Pp];
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
LEFT: [Ll][Ee][Ff][Tt];
RIGHT: [Rr][Ii][Gg][Hh][Tt];
FULL: [Ff][Uu][Ll][Ll];
JOIN: [Jj][Oo][Ii][Nn];
ON: [Oo][Nn];
ALTER: [Aa][Ll][Tt][Ee][Rr];
COLUMN: [Cc][Oo][Ll][Uu][Mm][Nn];
ADD: [Aa][Dd][Dd];
EDIT: [Ee][Dd][Ii][Tt];
DELETE: [Dd][Ee][Ll][Ee][Tt][Ee];
SKIP_: [Ss][Kk][Ii][Pp];
LIMIT: [Ll][Ii][Mm][Ii][Tt];
WITH : [Ww][Ii][Tt][Hh];
INDEXING : [Ii][Nn][Dd][Ee][Xx][Ii][Nn][Gg];
HASH : [Hh][Aa][Ss][Hh];
TREE : [Tt][Rr][Ee][Ee];
CONSTRAINT: [Cc][Oo][Nn][Ss][Tt][Rr][Aa][Ii][Nn][Tt];


EQ : '=';
NEQ : '<>';
G : '>';
GE: '>=';
L: '<';
LE: '<=';


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