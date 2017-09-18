package ttask4.Runners;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import ttask4.Listeners.MyCustomListener;

import java.util.ArrayList;

public class TestRunner {


    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new TestListenerAdapter());
        testNG.addListener(new MyCustomListener());

       final XmlSuite xmlsuite = new XmlSuite();
        xmlsuite.setName("Calculator Tests suite");
        xmlsuite.setSuiteFiles(new ArrayList<String>() {
            {
                add(".\\src\\ttask4\\suites\\runtests.xml");
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