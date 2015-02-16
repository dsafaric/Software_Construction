package uva.ql.ast.expressions.literals;

public class Literal<T> {
	private T value;
	
	public Literal(T _value){
		this.setValue(_value);
	}
	
	private void setValue(T _value){
		if (_value != null) this.value = _value;
	}
	
	public T getValue(){
		return this.value;
	}
	
	public String toString(){
		return this.value.toString();
	}
}
