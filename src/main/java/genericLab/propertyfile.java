package genericLab;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile 
{
	public String getproperty(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilepath);
		p.load(fis);
		return p.getProperty(key);
	}

}
