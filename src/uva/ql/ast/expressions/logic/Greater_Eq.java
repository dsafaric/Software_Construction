package uva.ql.ast.expressions.logic;

import uva.ql.ast.expressions.BinaryExpressions;
import uva.ql.ast.expressions.Expressions;
import uva.ql.ast.expressions.Operators;

public class Greater_Eq extends BinaryExpressions{

	public Greater_Eq(Expressions _left, Expressions _right, String _operator)
			throws Exception {
		super(_left, _right, Operators.GREATER_EQ);
	}
	
	@Override
	public String toString(){
		return this.getLeftExpr() + Operators.GREATER_EQ + this.getRightExpr();
	}
}
