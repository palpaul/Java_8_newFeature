package competative;

import java.util.stream.Collectors;

public class JavaEleven {
public static void main(String[] args) {
	String string = "Hello\nWorld\nHello";
	System.out.println(string);
			System.out.println(string.lines().collect(Collectors.toList()));
}
}
