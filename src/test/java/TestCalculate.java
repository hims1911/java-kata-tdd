import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalculate {
    private Calculator cal;

    @BeforeTest
    public void init(){
        cal = new Calculator();
    }

    public void emptyStringReturnsZero(){
        assertEquals(cal.calculate(""), 0);
    }

    public void singleValueIsInput(){
        assertEquals(cal.calculate("1"), 1);
    }
}
