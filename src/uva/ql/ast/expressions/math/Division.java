package uva.ql.ast.expressions.math;

import uva.ql.ast.expressions.BinaryExpressions;
import uva.ql.ast.expressions.Expressions;
import uva.ql.ast.expressions.*;

public class Division extends BinaryExpressions{

	public Division(Expressions left, Expressions right) 
			throws Exception {
		super(left, right, Operators.DIV);
	}
	
	@Override
	public String toString(){
		return this.getLeftExpr() + Operators.DIV + this.getRightExpr();
	}

}
