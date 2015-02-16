package uva.ql.main;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import uva.ql.parser.QLLexer;
import uva.ql.parser.QLParser;


public class Main{
	
	public static void main(String[] args) throws IOException{
		InputStream inputStream = new FileInputStream("SupportingFiles/Test.ql");
		
		if (inputStream.available() >= 1){
			System.out.println(inputStream.toString());
			ANTLRInputStream charStream = new ANTLRInputStream(inputStream);
			QLLexer lexer = new QLLexer(charStream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			QLParser parser = new QLParser(tokens);
			parser.expr();
		}
	}
	
	
}
