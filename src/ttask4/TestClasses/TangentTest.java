package ttask4.TestClasses;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentTest extends BaseTestClass {

    @Test(description = "Positive tg:", dataProvider = "dataForTgPositive", groups = {"positive"})
    public void TgPositive(double first, double expected) {
        double tg = calculator.tg(first);
        Assert.assertEquals(tg, expected);
    }

    @DataProvider(name = "dataForTgPositive")
    public Object[][] ForTgPositive() {
        return new Object[][] {
                { 45, 1 },
                { 0, 0 }    // BUG: expected [0.0] but found [NaN].
        };
    }

    @Test(description = "Negative tg:", dataProvider = "dataForTgNegative",
            expectedExceptions = ArithmeticException.class, groups = {"negative"})
    public void TgNegative(double first) {
        calculator.tg(first);
    }

    @DataProvider(name = "dataForTgNegative")
    public Object[][] ForTgNegative() {
        return new Object[][] {
                { 90 }   //  BUG: should have thrown an exception of class java.lang.ArithmeticException
        };
    }

}
