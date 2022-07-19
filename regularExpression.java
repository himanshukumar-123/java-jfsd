import java.util.regex.*;

public class regularExpression {

public static void main(String[] args) {

	String pattern = "[a-z]+";
	String check = "HiManshu KuMar";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.print( check.substring( c.start(), c.end() ) );
	}
}
