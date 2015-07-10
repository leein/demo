
public class ShowAscii {
  public static void main(String[] args) {
	String temp="";
	for (int i = 32; i <=126; i++) {
            temp=i<100?("0"+i):(""+i);
            System.out.print(temp+"="+(char)i+"  ");
	     if((i-31)%8==0){
	    	 System.out.println("\n");
	     }
	}
}
}
