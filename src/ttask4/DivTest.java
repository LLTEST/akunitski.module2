package ttask4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest extends BaseTestClass {

    @Test(description = "Positive long division:", dataProvider = "dataForDivLongPositive",
            groups = {"positive"})
    public void testDivLongPositive(long first, long second, long expected) {
        long div = calculator.div(first, second);
        Assert.assertEquals(div, expected, "");
    }

    @DataProvider(name = "dataForDivLongPositive")
    public Object[][] dataForDivLongPositive() {
        return new Object[][] {
                { 4, 2, 2 },
                { 12, 3, 4 },
                { 6, -3, -2 },
                { 0, 1, 0 },
                { -1, 1, -1 }
        };
    }

    @Test(description = "Negative long division:", dataProvider = "dataForDivLongNegative",
            expectedExceptions = NumberFormatException.class, groups = {"negative"})
    public void DivLongNegative(long first, long second) {
        calculator.div(first, second);
    }

    @DataProvider(name = "dataForDivLongNegative")
    public Object[][] dataForDivLongNegative() {
        return new Object[][] {
                { 7, 0 }
        };
    }

    @Test(description = "Simple positive double division:", dataProvider = "dataForDivDoublePositive",
            groups = {"positive"})
    public void DivDoublePositive(double first, double second, double expected) {
        double div = calculator.div(first, second);
        Assert.assertEquals(div, expected, "");
    }

    @DataProvider(name = "dataForDivDoublePositive")
    public Object[][] ForDivDoublePositive() {
        return new Object[][] {
                { 6.3, -3.0, -2.1 },
                { -2.2, 2.0, -1.1 },
                { -2.2, -2.0, 1.1 },
                { 0.3, 3.0, 0.1 },  // BUG: expected [0.1] but found [0.09999999999999999]
                { 7.0, 0.7, 10.0 }
        };
    }

    @Test(description = "Simple negative double division:", dataProvider = "dataForDivDoubleNegative",
            expectedExceptions = ArithmeticException.class, groups = {"negative"})
    public void DivDoubleNegative(double first, double second) {
        calculator.div(first, second);
    }

    @DataProvider(name = "dataForDivDoubleNegative")
    public Object[][] ForDivDoubleNegative() {
        return new Object[][] {
                { 4.2, 0 }    // BUG: no exception for div on 0 for double.
        };
    }
}