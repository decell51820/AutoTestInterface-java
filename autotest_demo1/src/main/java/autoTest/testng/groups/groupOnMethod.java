package autoTest.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupOnMethod {
    @Test(groups = "server")
    public void test0001(){
        System.out.println("这是服务端测试001");
    }
    @Test(groups = "server")
    public void test002(){
        System.out.println("这是服务端测试002");
    }
    @Test(groups = "client")
    public void test003(){
        System.out.println("这是客户端测试003");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnMethod_server(){
        System.out.println("这是服务端运行测试前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnMethod_server(){
        System.out.println("这是服务端运行测试后运行的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnMethod_client(){
        System.out.println("这是服务端运行测试前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnMethod_client(){
        System.out.println("这是服务端运行测试后运行的方法");
    }
}
