import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;


public class TestProperties {
	
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		OutputStream configOps=new FileOutputStream(new File("D:"+File.separator+"config.properties"));
		prop.setProperty("name","张三");
		prop.setProperty("age","23");
		prop.setProperty("sex","男");
		prop.store(configOps, "ConfigFile");
	}

}
