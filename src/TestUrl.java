import java.io.IOException;
import java.util.HashMap;
import java.util.Random;


public class TestUrl {
	public static void main(String[] args) throws IOException {
//		URL ab=new URL("http://www.baidu.com");
//		InputStream inpt=ab.openStream();
//		InputStreamReader inb=new InputStreamReader(inpt);
//		BufferedReader br=new BufferedReader(inb);
//		String str=null;
//		StringBuffer result=new StringBuffer();
//		while ((str=br.readLine())!=null) {
//			result.append(str);
//		}
//		System.out.println(result);
		
		int[] coin={1,2,3,4,5,6,7,8};
		for (int i = 0; i < coin.length; i++) {
			System.out.println(i);
			System.out.println("----------上面是i,-----------下面是值");
			System.out.println(coin[i]);
		}
		
	}
}
