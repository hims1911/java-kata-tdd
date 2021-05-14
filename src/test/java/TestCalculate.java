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

    public void twoNumberCommaSeparated(){
        assertEquals(cal.calculate("1,2"),3);
    }

    public void twoNumbersNewLineSeparated(){
        assertEquals(cal.calculate("1\n2"), 3);
    }

    public void threeNumbersCommaSeparated(){
        assertEquals(cal.calculate("1,2,3"), 6);
    }

    public void negativeInputReturnsException(){
        try{
            cal.calculate("-1,2");
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives not allowed: -1");
        }
        try {
            cal.calculate("2,-4,3,-5");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
        }
    }

    public void NumbersOverThousand(){
        assertEquals(cal.calculate("1000,2"), 2);
    }

    public void NumberWithOtherSeparator(){
        assertEquals(cal.calculate("//;\n1;2"),3);
    }

}
