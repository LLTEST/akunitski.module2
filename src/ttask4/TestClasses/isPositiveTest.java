package ttask4.TestClasses;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class isPositiveTest extends BaseTestClass {

    @Test(description = "Simle positive isNegative:", dataProvider = "dataForIsNegative", groups = {"positive"})
    public void IsNegative(long first, boolean expected) {
        boolean isPositive = calculator.isPositive(first);
        Assert.assertEquals(isPositive, expected);
    }

    @DataProvider(name = "dataForIsNegative")
    public Object[][] ForIsPositive() {
        return new Object[][] {
                {-10, false},
                {10, true}
        };
    }

}
