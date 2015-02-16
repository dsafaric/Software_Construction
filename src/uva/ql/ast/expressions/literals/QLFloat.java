package uva.ql.ast.expressions.literals;

public class QLFloat extends NumberLiteral<Float>{	
	
	public QLFloat(float _value) {
		super(_value);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.getValue());
	}
}
