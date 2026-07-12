package vj2;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) 
	{
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression(" T(vj2.MyClass).m1('zzz') "); 
		expression.getValue();
		
		
		System.out.println("----------------------------------");
		ExpressionParser parser3 = new SpelExpressionParser();
		Expression expression3 = parser3.parseExpression(" new vj2.MyClass().m2(1606) "); 
		expression3.getValue();		
	}

}

// Output:-

/*
 
str : zzz
----------------------------------
Number: 1606
 
*/
  