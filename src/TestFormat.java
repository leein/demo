import java.text.MessageFormat;
import java.util.Locale;


public class TestFormat {
	
	private static String name;
	
	private static int age;
	
	public TestFormat(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public static void tsFormat(){
		String str=MessageFormat.format("welcom {0} to my java world,you are {1}",name,age);
		String a=String.format("%h",12);
		System.out.println(str+"------------"+a);
	}

	 public static void main(String[] args) {
		 TestFormat tf=new TestFormat("王世尔",29);
		 tf.tsFormat();
	}
}
