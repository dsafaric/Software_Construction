package uva.ql.ast.expressions.math;

import uva.ql.ast.expressions.BinaryExpressions;
import uva.ql.ast.expressions.Expressions;
import uva.ql.ast.expressions.*;

public class Multiplication extends BinaryExpressions{

	public Multiplication(Expressions left, Expressions right) 
			throws Exception {
		super(left, right, Operators.MUL);
	}
	
	@Override
	public String toString(){
		return this.getLeftExpr() + Operators.MUL + this.getRightExpr();
	}
}
