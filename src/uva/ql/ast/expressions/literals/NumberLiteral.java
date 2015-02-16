package uva.ql.ast.expressions.literals;

public class NumberLiteral<T> extends Literal<T>{
	private T value;
	
	public NumberLiteral(T _value){
		super(_value);
	}
	
	@Override
	public String toString(){
		return this.value.toString();
	}
}
