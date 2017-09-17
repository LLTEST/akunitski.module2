package ttask4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentTest extends BaseTestClass {

    @Test(description = "Positive tg:", dataProvider = "dataForTgPositive", groups = {"positive"})
    public void testTgPositive(double first, double expected) {
        double tg = calculator.tg(first);
        Assert.assertEquals(tg, expected);
    }

    @DataProvider(name = "dataForTgPositive")
    public Object[][] dataForTgPositive() {
        return new Object[][] {
                { 45, 1 },
                { 0, 0 }    // BUG: expected [0.0] but found [NaN].
        };
    }

    @Test(description = "Negative tg:", dataProvider = "dataForTgNegative",
            expectedExceptions = ArithmeticException.class, groups = {"negative"})
    public void testTgNegative(double first) {
        calculator.tg(first);
    }

    @DataProvider(name = "dataForTgNegative")
    public Object[][] dataForTgNegative() {
        return new Object[][] {
                { 90 }   //  BUG: no exception for 90 Tg.
        };
    }

}
