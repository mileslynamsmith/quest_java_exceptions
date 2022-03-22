import org.junit.Assert;
import org.junit.Test;

public class OddSumTest {
// this is a test class
    @Test
    // this the test which returns throwing an exception but which ones
    public void testTrue() throws Exception {
        // what is true?  same as above?
        Assert.assertEquals(true, true);
    }

    @Test
    public void testOdds1() throws Exception {
        // creates string arrays called in
    	String[] in = {"1", "2", "3", "4", "5", "6"};
        // uses class oddsum to test result
        Assert.assertEquals(9, OddSum.run(in, true));
    }
    
    @Test
    public void testOdds2() throws Exception {
    	String[] in = {"1", "20", "31", "45", "52", "61"};
        Assert.assertEquals(138, OddSum.run(in, true));
    }
    @Test
    public void testException() throws Exception {
    	String[] in = {"1", "2", "3", "4", "5", "a"};
        Assert.assertEquals(-1, OddSum.run(in, true));
    }

}
