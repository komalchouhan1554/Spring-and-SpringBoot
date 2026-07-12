package vj;

// Logical Operators
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main6 {

	public static void main(String[] args) 
	{
		ExpressionParser parsor = new SpelExpressionParser();
		String str_exp = " 'vishal jadhav'.length() ";
		Expression expression = parsor .parseExpression(str_exp); 
		System.out.println(expression.getValue());
		
		
		String str_exp2 = " 'vishal jadhav'.toUpperCase() ";
		Expression expression2 = parsor .parseExpression(str_exp2); 
		System.out.println(expression2.getValue());
		
		String str_exp3 = " 'vishal ' +  'jadhav' ";
		Expression expression3= parsor .parseExpression(str_exp3); 
		System.out.println(expression3.getValue());
		
	}

}

// Output:-

/*

13
VISHAL JADHAV
vishal jadhav   

*/