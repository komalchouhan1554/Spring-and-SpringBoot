package vj;

// Relational Operators
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main4 {

	public static void main(String[] args) 
	{
		ExpressionParser parsor = new SpelExpressionParser();
		
		System.out.println("---> Is equal");
		// Expression expression =  parsor.parseExpression(" 10 == 20 "); // false
								// OR
		Expression expression = parsor .parseExpression(" 10 eq 20"); // false
		System.out.println(expression.getValue());
		
		
		System.out.println("---> Is not equal");
		// Expression expression2 =  parsor.parseExpression(" 10 != 20 "); // true
								// OR
		Expression expression2 =  parsor.parseExpression(" 10 ne 20 "); // true
		System.out.println(expression2.getValue());
		

		System.out.println("---> less than");
		// Expression expression3 =  parsor.parseExpression(" 10 < 20 "); // true
								// OR
		Expression expression3 =  parsor.parseExpression(" 10 lt 20 "); // true
		System.out.println(expression3.getValue());

		
		System.out.println("---> greator than");
		// Expression expression4 =  parsor.parseExpression(" 10 > 20 "); // false
								// OR
		Expression expression4 =  parsor.parseExpression(" 10 gt 20 "); // false
		System.out.println(expression4.getValue());

		
		System.out.println("---> less than or equal");
		// Expression expression5 =  parsor.parseExpression(" 10 <= 20 "); // true
								// OR
		Expression expression5 =  parsor.parseExpression(" 10 le 20 "); // true
		System.out.println(expression5.getValue());
		
		
		System.out.println("---> greator than or equal");
		// Expression expression6 =  parsor.parseExpression(" 10 >= 20 "); // false
								// OR
		Expression expression6 =  parsor.parseExpression(" 10 ge 20 "); // false
		System.out.println(expression6.getValue());
	}

}

// Output:-

/*

---> Is equal
false
---> Is not equal
true
---> less than
true
---> greator than
false
---> less than or equal
true
---> greator than or equal
false

*/