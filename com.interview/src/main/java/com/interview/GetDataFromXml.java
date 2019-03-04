package com.interview;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class GetDataFromXml {

	public static void main(String[] args) throws Exception, IOException, Exception
	{
		GetDataFromXml.getDatafromXml("D:\\BAT\\BAT-MAN\\Requirements\\GMM-77\\LoginInfo.xml");
	}
	public static void getDatafromXml(String filename) throws SAXException, IOException, Exception
	{
		File fXmlFile = new File(filename);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getDocumentElement().getChildNodes();//.getElementsByTagName("FirstName");
		for(int i=0;i<nList.getLength();i++)
		System.out.println(nList.item(i).getTextContent());
		System.out.println("----------------------------");
	}
}
