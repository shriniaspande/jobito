package jobito;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("D:\\JavaDev\\jobito\\userrrData.properties");
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));
		System.out.println(pro.getProperty("address"));
		

	}

}
