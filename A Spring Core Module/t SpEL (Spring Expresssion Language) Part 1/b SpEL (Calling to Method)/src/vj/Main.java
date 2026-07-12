package vj;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) 
	{
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression(" T(vj.MyClass).m1() "); 
		expression.getValue();
		
		System.out.println("----------------------------------");
		
		ExpressionParser parser2 = new SpelExpressionParser();
		Expression expression2 = parser2.parseExpression(" T(vj.MyClass).m3() "); 
		int i =(Integer)expression2.getValue();
		System.out.println(i);
		    				// Or
		/*
		 ExpressionParser parser2 = new SpelExpressionParser();
		Expression expression2 = parser2.parseExpression(" T(vj.MyClass).m3() "); 
		int i = expression2.getValue(Integer.class);
		System.out.println(i);
		*/
		
		System.out.println("----------------------------------");
		ExpressionParser parser3 = new SpelExpressionParser();
		Expression expression3 = parser3.parseExpression(" new vj.MyClass().m2() "); 
		expression3.getValue();		
	}

}

// Output:-

/*
 
m1() Static mehod....
----------------------------------
16
----------------------------------
m2() Instance mehod....
 
*/
  