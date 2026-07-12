package vj;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main3 {

	public static void main(String[] args) 
	{
		ExpressionParser parser = new SpelExpressionParser();
		
		EvaluationContext context = new StandardEvaluationContext(); // To give values at runtime
		context.setVariable("no1", 100); 
		context.setVariable("no2", 200);
		
		Expression expression = parser.parseExpression(" #no1 + #no2 "); // 30
		
		Object obj = expression.getValue(context);
		System.out.println(obj);

	}

}

//Output:-

/*

300

*/