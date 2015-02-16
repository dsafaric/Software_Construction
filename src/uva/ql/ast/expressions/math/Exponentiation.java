package uva.ql.ast.expressions.math;

import uva.ql.ast.expressions.BinaryExpressions;
import uva.ql.ast.expressions.Expressions;
import uva.ql.ast.expressions.*;

public class Exponentiation extends BinaryExpressions{

	public Exponentiation(Expressions left, Expressions right) 
			throws Exception {
		super(left, right, Operators.EXP);
	}
	
	@Override 
	public String toString(){
		return this.getLeftExpr() + Operators.EXP + this.getRightExpr(); 
	}
	
}
