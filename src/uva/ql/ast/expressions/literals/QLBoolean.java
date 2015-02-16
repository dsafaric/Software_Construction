package uva.ql.ast.expressions.literals;


public class QLBoolean extends Literal<Boolean> {

	public QLBoolean(boolean _value) {
		super(_value);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.getValue());
	}
}
