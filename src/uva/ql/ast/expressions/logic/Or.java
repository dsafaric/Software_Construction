package uva.ql.ast.expressions.logic;

import uva.ql.ast.expressions.BinaryExpressions;
import uva.ql.ast.expressions.Expressions;
import uva.ql.ast.expressions.Operators;

public class Or extends BinaryExpressions{

	public Or(Expressions _left, Expressions _right, String _operator)
			throws Exception {
		super(_left, _right, Operators.OR);
	}
	
	@Override
	public String toString(){
		return this.getLeftExpr() + Operators.OR + this.getRightExpr();
	}
}
