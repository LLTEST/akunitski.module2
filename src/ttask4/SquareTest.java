package ttask4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareTest extends BaseTestClass {
    @Test(description = "Simple positive sqrt:", dataProvider = "dataForSqrtPositive", groups = {"positive"})
    public void testSqrtPositive(double first, double expected) {
        double sqrt = calculator.sqrt(first);
        Assert.assertEquals(sqrt, expected);
    }

    @DataProvider(name = "dataForSqrtPositive")
    public Object[][] dataForSqrtPositive() {
        return new Object[][] {
                { 4, 2 },
                { 16, 4 },
                { 0, 0 }
        };
    }

    @Test(description = "Simple negative sqrt:", dataProvider = "dataForSqrtNegative",
            expectedExceptions = Exception.class, groups = {"negative"})
    public void testSqrtNegative(double first) {
        calculator.sqrt(first);
    }

    @DataProvider(name = "dataForSqrtNegative")
    public Object[][] dataForSqrtNegative() {
        return new Object[][] {
                {-4 }   // This a BUG. No exception for negative Sqrt.
        };
    }




}
