package uva.ql.ast.expressions.literals;

public class QLInt extends NumberLiteral<Integer>{
	
	public QLInt(int _value) {
		super(_value);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.getValue());
	}
	
}
