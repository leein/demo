
public class ChengFaBiao {
   public static void main(String[] args) {
	System.out.println("九九乘法表");
	int i,j;
	for (i=1;i<=9;i++) {
		for(j=1;j<=i;j++){
			System.out.print(i+"*"+j+"="+i*j+"\t");
		}
		System.out.println(" ");
	}
}
}
