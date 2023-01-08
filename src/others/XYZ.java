package others;

public class XYZ extends ABC{
	public XYZ(){
		System.out.println("IM in XYZ");
		}
	
	
	public static void main(String[] args) {
		//XYZ z = new XYZ();
		//Im in ABC
		//Im in XYZ
		XYZ z2 = (XYZ) new ABC();
		//Im in ABC
		//Im in XYZ
		//ABC obj = new ABC();
		//Im in ABC

		//ABC obj2 = new XYZ();
		//Im i ABC
		//Im in XYZ
	}
}
