package Com.Demowebshop_GenericUtility;

public interface Framework {

	
javaUtility javautility=new javaUtility();
	
	static String ExcelFilePath="./src/test/resources/TestData/testScrpt.xlsx";
			
	static String PropertyFilePath="./src/test/resources/TestData/commonData.properties";
	
	static String screenshotPath="./screenshot/"+ javautility.LocalDateAndTime() +".png";
	
			
	
	static String reports="./reports/"+ javautility.LocalDateAndTime() +".html";

}


