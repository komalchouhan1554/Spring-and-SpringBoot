package vj;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main2 {

	public static void main(String[] args) 
	{
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression(" 10+20 "); // 30
		// Expression expression = parser.parseExpression(" '10+20' "); // 10+20
		Object obj = expression.getValue();
		System.out.println(obj);

	}

}

//Output:-

/*

30 

*/