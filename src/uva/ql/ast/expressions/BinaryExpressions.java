package uva.ql.ast.expressions;

public class BinaryExpressions extends Expressions{

	private Expressions left;
	private Expressions right;
	private String operator;
	
	public BinaryExpressions(Expressions _left, Expressions _right, String _operator) throws Exception{
		this.left = isValidExpression(_left);
		this.right = isValidExpression(_right);
		this.operator = _operator;
	}
	
	public Expressions getLeftExpr(){
		return this.left;
	}
	
	public Expressions getRightExpr(){
		return this.right;
	}
	
	public String getOperator(){
		return this.operator;
	}
	
	private Expressions isValidExpression(Expressions e) throws Exception{
		if (e != null){
			return e;
		}
		else throw new Exception("Expressions are null");
	}
	
}
