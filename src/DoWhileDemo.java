
public class DoWhileDemo {
   public static void main(String[] args) {
	int n=1;
	double dSum=1.0,dTemp;
	do{
		dTemp=1.0/(2*n+1);
		dSum+=dTemp;
		n++;
	}while(dTemp>=0.00001);
	System.out.println("循环结束时n的值是："+(n-1));
	System.out.println("计算出的结果是："+dSum);
}
}
