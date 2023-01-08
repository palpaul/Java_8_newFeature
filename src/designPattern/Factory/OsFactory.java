package designPattern.Factory;

public class OsFactory {
	// here return type should be Interface name in this case is OS not void(because
	// OS is my interface name)

	public OS getInstance(String str) {
		if (str.equals("Android")) {
			return new Android();
		} else if (str.equals("IOS")) {
			return new IOS();
		} else
			return new Windows();

	}

}
