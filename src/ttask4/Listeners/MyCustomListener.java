package ttask4.Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyCustomListener implements ISuiteListener {



    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("Suite started: "+iSuite.getName());
    }

    @Override
    public void onFinish(ISuite iSuite) {
    }
}