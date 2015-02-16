package uva.ql.ast.expressions.literals;

public class QLCurrency extends NumberLiteral<Float>{

	public QLCurrency(float _value) {
		// Currency type is rounded by default to 4 decimals
		super((float)Math.round(_value * 10000) / 10000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		return String.valueOf(this.getValue());
	}
}
