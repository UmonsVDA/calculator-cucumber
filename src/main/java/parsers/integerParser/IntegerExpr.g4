grammar IntegerExpr;

input : expr EOF;
expr  : prefixOperation
      | infixOperation
      | postfixOperation
      | num
      ;

prefixOperation : operator SEPARATOR? (values|'(' prefixOperation ')');
postfixOperation : ('(' postfixOperation ')'|values) SEPARATOR? operator;

values : num
       | '(' values ')'
       | values SEPARATOR values
       ;


operator: ('+')     #Plus
        | ('-')     #Minus
        | ('*')     #Times
        | ('/')     #Divides
        | ('%')     #Modulo
        | ('^')     #Power
        | ('gcd')   #GCD
        | ('lcm')   #LCM
        ;


/* Infix operation
   Grammar from the compilation course
*/
infixOperation : e;
e : t e2 #StartValueInfix;
e2 : '+' t e2       #InfixPlus
   | '-' t e2       #InfixMinus
   | /* epsilon */  #Void
   ;
t : f t2    #SecondValueInfix;
t2 : '*' f t2       #InfixTimes
   | '/' f t2       #InfixDivides
   | /* epsilon */  #Void2
   ;
f : num
  | '(' expr ')'
  ;

num   : INT     #Integer
      ;

SEPARATOR : ','
          | ' '+;

INT : [0-9]+;