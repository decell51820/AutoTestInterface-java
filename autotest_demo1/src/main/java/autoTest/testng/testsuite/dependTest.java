package autoTest.testng.testsuite;

import org.testng.annotations.Test;

public class dependTest {
    @Test
    public void test001(){
        System.out.println("test1 run");
    }
    @Test(dependsOnMethods = {"test001"})
    public void test2(){
        System.out.println("test2 run");
    }
}
