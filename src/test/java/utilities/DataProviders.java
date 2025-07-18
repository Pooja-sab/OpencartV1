package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	@DataProvider(name="LoginData")
	public String [] []  getData() throws IOException 
			{
		String path=".\\TestData\\OpenCart_LoginData.xlsx"; // taking xl file from testData
		
		ExcelUtility xlutil=new ExcelUtility(path); // creating an object for xlUtility 
		
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1", 1);
		
		String logindata [] []=new String [totalrows][totalcols]; // created for two dimentional array which can store rows and col  
		
		for(int i=1;i<=totalrows;i++) //1  read the data  from xl storing in 2 dimentinal array i
		{
			for(int j=0;j<totalcols;j++) // 0 i is row j is col 
			{
				logindata[i-1][j]=xlutil.getCellData("Sheet1", i, j); //1,0 
				
			}
		}
		return logindata; // returning 2 dimentional array
		
		
			}
	//Data Provider 2
	
	// Data Provider 3 

}
