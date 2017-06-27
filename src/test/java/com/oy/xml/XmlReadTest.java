package com.oy.xml;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlReadTest {

	// @Test
	public void testDom() {
		try {
			File f = new File("src//test//java//com//oy//xml//demo.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(f);

			NodeList list = doc.getElementsByTagName("VALUE");
			for (int i = 0; i < list.getLength(); i++) {
				System.out.println("no:" + doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());
				System.out.println("addr:" + doc.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test
	public void testSax() {
		long lasting = System.currentTimeMillis();
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			MyXMLReader reader = new MyXMLReader();
			parser.parse("src//test//java//com//oy//xml//demo.xml", reader);
			System.out.println("运行时间：" + (System.currentTimeMillis() - lasting) + "毫秒");
		} catch (ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void testJdom() {
		try {
			SAXBuilder builder = new SAXBuilder();
			org.jdom.Document doc = builder.build(new File("src//test//java//com//oy//xml//demo.xml"));
			org.jdom.Element foo = doc.getRootElement();
			List allChildren = foo.getChildren();
			for (int i = 0; i < allChildren.size(); i++) {
				System.out.print("车牌号码:" + ((org.jdom.Element) allChildren.get(i)).getChild("NO").getText());
				System.out.println("车主地址:" + ((org.jdom.Element) allChildren.get(i)).getChild("ADDR").getText());
			}
		} catch (JDOMException | IOException e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void testDom4j() {
		try {
			File f = new File("src//test//java//com//oy//xml//demo.xml");
			SAXReader reader = new SAXReader();
			org.dom4j.Document doc = reader.read(f);
			Element root = doc.getRootElement();

			Element foo;
			for (Iterator iterator = root.elementIterator("VALUE"); iterator.hasNext();) {
				foo = (Element) iterator.next();
				System.out.println("车牌号码：" + foo.elementText("NO"));
				System.out.println("车主地址：" + foo.elementText("ADDR"));
			}

		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEverything(){
	}
}

class MyXMLReader extends DefaultHandler {
	Stack<String> tags = new Stack<String>();

	public MyXMLReader() {
		super();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		tags.push(qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String tag = tags.peek();

		if (tag.equals("NO")) {
			System.out.println("车牌号码：" + new String(ch, start, length));
		}

		if (tag.equals("ADDR")) {
			System.out.println("地址：" + new String(ch, start, length));
		}
	}

}
