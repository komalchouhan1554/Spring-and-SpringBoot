package vj;

// Regular Expression (Regex)
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main7 {

	public static void main(String[] args) 
	{
		ExpressionParser parsor = new SpelExpressionParser();
		String str_exp = " 'vishal' matches 'vishal' ";
		Expression expression = parsor .parseExpression(str_exp); 
		System.out.println(expression.getValue());
		
		System.out.println("-----------------------------");
		
		String str_exp2 = " 'vishal' matches 'Vishal' ";
		Expression expression2 = parsor .parseExpression(str_exp2); 
		System.out.println(expression2.getValue());
		
		System.out.println("-----------------------------");
		
		String str_exp3 = " 'vishal' matches  '[a-zA-Z]{5,15}' ";
		Expression expression3= parsor .parseExpression(str_exp3); 
		System.out.println(expression3.getValue());
		
		System.out.println("-----------------------------");
		
		String str_exp4 = " 'vishal jadhav' matches  '[a-zA-Z ]{5,15}' "; // Space included here
		Expression expression4= parsor .parseExpression(str_exp4); 
		System.out.println(expression4.getValue());
		
		System.out.println("-----------------------------");
		
		String str_exp5 = " '9876543210' matches  '[0-9]{10}' "; 
		Expression expression5= parsor .parseExpression(str_exp5); 
		System.out.println(expression5.getValue());
		
		System.out.println("-----------------------------");
		
		String str_exp6 = " 'vishal_123@gmail.com' matches '[a-zA-Z0-9_]*@gmail.com' "; 
		Expression expression6= parsor .parseExpression(str_exp6); 
		System.out.println(expression6.getValue());
	}

}

// Output:-

/*

true
-----------------------------
false
-----------------------------
true
-----------------------------
true
-----------------------------
true
-----------------------------
true  

*/