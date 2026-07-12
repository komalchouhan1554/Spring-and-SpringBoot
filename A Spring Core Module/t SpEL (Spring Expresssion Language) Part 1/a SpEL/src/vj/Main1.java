package vj;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main1 {

	public static void main(String[] args) 
	{
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression(" 'Hello Uday' "); // Single cote is must here.
		Object obj = expression.getValue();
		System.out.println(obj);
		

	}

}

// Output:-

/*
 
 Hello Uday 
 
*/
  