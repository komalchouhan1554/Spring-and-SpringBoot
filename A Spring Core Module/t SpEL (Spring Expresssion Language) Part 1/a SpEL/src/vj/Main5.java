package vj;

// Logical Operators, Ternary Operator  & Type class
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main5 {

	public static void main(String[] args) 
	{
		ExpressionParser parsor = new SpelExpressionParser();
		
		System.out.println("---> and(&&) Operator");
		// Expression expression =  parsor.parseExpression(" (10 > 20) && (30 >12) "); // false
								// OR
		Expression expression = parsor .parseExpression(" (10 > 20) and (30 >12)"); // false
		System.out.println(expression.getValue());
		
		
		System.out.println("---> or(||) Operator");
		// Expression expression2 =  parsor.parseExpression(" (10 > 20) || (30 >12) "); // true
								// OR
		Expression expression2 =  parsor.parseExpression(" (10 > 20) or (30 > 12) "); // true
		System.out.println(expression2.getValue());
		

		System.out.println("---> not(!) Oprator");
		// Expression expression3 =  parsor.parseExpression(" !(10 < 20) "); // false
								// OR
		Expression expression3 =  parsor.parseExpression(" not(10 lt 20) "); // false
		System.out.println(expression3.getValue());

		
		System.out.println("---> Ternary Operator");
		// Expression expression4 =  parsor.parseExpression(" (10 < 20) ? '111' : '222' "); // false
								// OR
		Expression expression4 =  parsor.parseExpression(" (10 lt 20) ? '111' : '222' "); // false
		System.out.println(expression4.getValue());

		
		System.out.println("---> Type Operator");
		Expression expression5 =  parsor.parseExpression(" T(org.springframework.expression.ExpressionParser) "); // interface
		Expression expression6 =  parsor.parseExpression(" T(java.lang.String) "); //Class
		System.out.println(expression5.getValue());
		System.out.println(expression6.getValue());
		
	}

}

// Output:-

/*

---> and(&&) Operator
false
---> or(||) Operator
true
---> not(!) Oprator
false
---> Ternary Operator
111
---> Type Operator
interface org.springframework.expression.ExpressionParser
class java.lang.String    

*/