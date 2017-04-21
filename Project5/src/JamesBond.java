import java.util.regex.*;

public class JamesBond {
	String pattern007 = "(007)";
	Pattern pattern;
	Matcher matcher;

	public boolean bondRegex(String input) {
		pattern = Pattern.compile(pattern007);
		matcher = pattern.matcher(input);
		return matcher.find();
	}
}