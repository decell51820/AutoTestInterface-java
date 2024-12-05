package autoTest.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class dataParameterTest {
    @Test(dataProvider = "data")
    public void test0001(String name, int age) {
        System.out.println("name = " + name + "age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhangsna", 18},
                {"lisi", 20}
        };
        return o;
    }


    @Test
    public void test_speak001(String name, int age) {
        System.out.println("我的名字是" + name + ",今年" + age + "岁了");
    }

    @Test
    public void test_speak002(String name, int age) {
        System.out.println("我的名字是" + name + ",今年" + age + "岁了");
    }

    @DataProvider
    public Object[][] methodData(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test_speak001")) {
            result = new Object[][]{
                    {"zhansan", 12},
                    {"lisi", 20}
            };
        } else if (method.getName().equals("test_speak002")) {
            result = new Object[][]{
                    {"wangwu", 32},
                    {"zhangmazi", 50}
            };

        }
        return result;
    }

}
