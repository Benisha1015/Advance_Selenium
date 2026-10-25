package Com.Demowebshop_GenericUtility;

import java.time.LocalDateTime;

public class javaUtility {
	
	public String LocalDateAndTime()
	{
		String value = LocalDateTime.now().toString().replace(":","").replace(".","").replace("-","");
		return value;
	}

}
