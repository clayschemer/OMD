package model;

import java.io.IOException;
import expr.Expr;
import expr.ExprParser;
import expr.Parser;

public class ExprSlot extends Slot {

	private Expr expr;
	private Environment env;
	
	public ExprSlot(Environment env, String s) {
		content = s;
		this.env = env;
		Parser parser = new ExprParser();
        try {
        	expr = parser.build(s);
        } catch (IOException e) {
        	throw new XLException(e.getMessage());
        } catch (XLException e) {
        	System.out.println("hej från trycatch i exprslut Xl");
        	System.out.println(e.getMessage());
        	throw e;
        }
	}
	
	public String toString() {
		//return expr.toString();
		return String.valueOf(expr.value(env));
	}

	public double value(Environment env) {
		return expr.value(env);
	}
}
