package ttask4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class isPositiveTest extends BaseTestClass {

    @Test(description = "Simle positive isNegative:", dataProvider = "dataForIsNegative", groups = {"positive"})
    public void testIsNegative(long first, boolean expected) {
        boolean isPositive = calculator.isPositive(first);
        Assert.assertEquals(isPositive, expected);
    }

    @DataProvider(name = "dataForIsNegative")
    public Object[][] dataForIsPositive() {
        return new Object[][] {
                {-50, false},
                {50, true}
        };
    }

}
