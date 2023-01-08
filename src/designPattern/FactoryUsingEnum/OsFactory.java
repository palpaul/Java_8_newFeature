package designPattern.FactoryUsingEnum;

public class OsFactory {
	// here return type should be Interface name in this case is OS not void(because
	// OS is my interface name)
	
	public OsFactory()throws IllegalAccessException{
		throw new IllegalAccessException("Can't be created");
	}

	public static OS getInstance(OSType type) {
		switch (type) {
		case ANDROID:
			return new Android();
		case IOS:
			return new IOS();
		case WINDOWS:
			return new Windows();

		default:
			return null;
		}

	}

}
