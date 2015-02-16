package uva.ql.ast.expressions.literals;

public class Identifier extends Literal<String>{

	public Identifier(String _value) {
		super(_value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		return this.getValue();
	}
}
