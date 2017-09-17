package ttask4;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;

public class TestRunner {

    @SuppressWarnings("serial")
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new TestListenerAdapter());
        testNG.addListener(new MyCustomListener());

       final XmlSuite xmlsuite = new XmlSuite();
        xmlsuite.setName("Calculator Tests suite");
        xmlsuite.setSuiteFiles(new ArrayList<String>() {
            {
                add(".\\src\\ttask4\\runtests.xml");
            }
        });
        testNG.setXmlSuites(new ArrayList<XmlSuite>() {
            {
                add(xmlsuite);
            }
        });
        testNG.run();
    }
}