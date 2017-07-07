import basic1.junit.Demo1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by chen on 06/07/2017.
 */
public class TestDemo1 {
    private Demo1 test;
    @Before
    public void before(){
       test = new Demo1();
    }
    @Test
    public void test(){
        test.run();
    }

    @After
    public void after(){

    }
}
