package ttask4.TestClasses;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CoTangentTest extends BaseTestClass {
    @Test(description = "Positive ctg:", dataProvider = "dataForCtgPositive", groups = {"positive"})
    public void CtgPositive(double first, double expected) {
        double ctg = calculator.ctg(first);
        Assert.assertEquals(ctg, expected);
    }

    @DataProvider(name = "dataForCtgPositive")
    public Object[][] ForCtgPositive() {
        return new Object[][] {
                { 45, 1 },
                { 90, 0 }    // BUG: expected [0.0] but found [1.0]
        };
    }

    @Test(description = "Negative ctg:",
            expectedExceptions = ArithmeticException.class, groups = {"negative"})
    public void CtgNegative() {
        double first=0;  // BUG: method should have thrown an exception of class java.lang.ArithmeticException
        calculator.ctg(first);
    }


}
