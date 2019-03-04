package com.interview;
import java.io.IOException;


public class SoapTest {

	public static void main(String[] args)
	{
		String path = "cmd /c start D:\\eclipse\\Workspace\\BAT-MAN\\SFQLoipro.bat 10.94.199.101 Test_121313 D:\\eclipse\\Workspace\\BAT-MAN\\resource\\TestData\\SoapUIFiles\\NSMLoipro-soapui-project.xml ";
		
		/*String path = "cmd /c start invokeSoapTest.bat " + endPointURL + " "
				+ orderNumber;*/
		Runtime rn = Runtime.getRuntime();
		try {
			rn.exec(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		%~dp0resource\TestData\SoapUIFiles\PMCard-soapui-project.xml
		
	}
}
