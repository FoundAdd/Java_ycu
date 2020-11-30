package cn.hy.ch8;

import org.junit.Test;

/*
编写程序Ch8Demo4，定义一个泛型类和泛型接口，类名和接口名自己定义，并加以测试。
 */
public class Ch8Demo4{
    TestClassT<String> val;
    TestClassT<Integer> val2;

    @Test
    public void testClass() {
        val = new TestClassT<>("123");
        val2 = new TestClassT(456);

        System.out.println(val.getVar());
        System.out.println(val2.getVar());
    }

    @Test
    public void testInterface() {
        TestInterfaceT val1 = new ImplementTest("789");
        System.out.println(val1.method());
    }
}

class TestClassT<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public TestClassT(T var) {
        this.var = var;
    }
}

class ImplementTest<T> implements TestInterfaceT {
    private T var;

    public ImplementTest(T var) {
        this.var = var;
    }

    @Override
    public T method() {
        return this.var;
    }
}

interface TestInterfaceT<T> {
    public T method();
}