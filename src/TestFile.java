import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class TestFile {
	/**
	 * 分割原始文件
	 * @param originalFilepath 原始文件地址
	 * @param partFilepath 分割后的文件地址
	 * @throws IOException 
	 */
	public static void splitFile(String originalFilepath,String partFilepath) throws IOException{
		File file=new File(originalFilepath);
		InputStream ips=null;
		OutputStream ops=null;
		int partLength=0;
		int number=1;
	    byte[] buffer=null;
		ips= new FileInputStream(file);
		buffer=new byte[1024*1024];//设置1M缓存区
		while((partLength=ips.read(buffer, 0, 1024*1024))!=-1){//以每个文件1M分割原始文件
			String pFilePath=partFilepath+number++;
		    ops=new FileOutputStream(new File(pFilePath));
		    ops.write(buffer, 0, partLength);
		    ops.close();
		}
		System.out.println("原始文件已分成"+(number-1)+"部分，分割已完成");
	}
	
	/**
	 * 合并分割文件
	 * @param splitPath 分割文件的文件夹路径
	 * @param newPath 合成新文件的路径
	 * @throws IOException 
	 */
	public static void union(String splitPath,String newPath) throws IOException{
		File file=new File(splitPath);
		File list[]=file.listFiles();
		File newFile=new File(newPath);
		int readcount;
		byte buffer[]=null;
				
		FileOutputStream writer=new FileOutputStream(newFile);
		for (File f : list) {
			buffer=new byte[(int) f.length()];
			FileInputStream reader=new FileInputStream(f);
			while((readcount=reader.read(buffer))!=-1){
				writer.write(buffer);
			}
			reader.close();
		}
		writer.close();
	}
	
	public static void main(String[] args) throws IOException {
		String filepath="E:"+File.separator+"web2.0"+File.separator+"JeeSite About.docx";
		String parthFilePath="E:"+File.separator+"web2.0"+File.separator+"part"+File.separator+"part_";
		splitFile(filepath, parthFilePath);
		
		String splitPath="E:"+File.separator+"web2.0"+File.separator+"part";
		String newPath="E:"+File.separator+"web2.0"+File.separator+"part"+File.separator+"newFile.docx";
		union(splitPath, newPath);
		
	}

}
