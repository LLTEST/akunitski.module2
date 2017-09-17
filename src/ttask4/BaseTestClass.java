package ttask4;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

    protected Calculator calculator;

    @BeforeClass(groups = { "positive", "negative" })
    public void BeforeClass(){
        calculator=new Calculator();
    }

    @BeforeMethod(groups = { "positive", "negative" })
    public void BeforeMethod(){

    }

    @AfterMethod(groups = { "positive", "negative" })
    public void AfterMethod(){
        System.out.println();
    }

}
