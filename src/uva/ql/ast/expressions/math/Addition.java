package uva.ql.ast.expressions.math;
import uva.ql.ast.expressions.*;
public class Addition extends BinaryExpressions{

	public Addition(Expressions left, Expressions right) 
			throws Exception {
		super(left, right, Operators.ADD);
	}
	
	@Override
	public String toString(){
		return this.getLeftExpr() + Operators.ADD + this.getRightExpr();
	}
}
