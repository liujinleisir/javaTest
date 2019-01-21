package test泛型;

import org.junit.Test;

public class testMain {
    @Test
    public void demo1() {
        //Generic<String>  generic = new Generic<>(123);编译报错
        A_GenericClass<String> genericString = new A_GenericClass<>("mmp");
        A_GenericClass<Integer> genericInteger = new A_GenericClass<Integer>(123456);
        System.out.println("泛型测试 key is " + genericInteger.getKey());
        System.out.println("泛型测试 key is " + genericString.getKey());
    }

    @Test
    public void demo2() {
        A_GenericClass genericString = new A_GenericClass<>("mmp1");
        A_GenericClass genericInteger = new A_GenericClass<Integer>(1234567);
        A_GenericClass genericDouble = new A_GenericClass(55.55);
        A_GenericClass genericBoolean = new A_GenericClass(false);
        System.out.println("泛型测试 key is " + genericInteger.getKey());
        System.out.println("泛型测试 key is " + genericString.getKey());
        System.out.println("泛型测试 key is " + genericDouble.getKey());
        System.out.println("泛型测试 key is " + genericBoolean.getKey());
    }

    @Test
    public void demo3() {
        B_1GenericClass b_class = new B_1GenericClass();
        System.out.println("泛型测试 key is " + b_class.getKey("QQQ"));
    }

    @Test
    public void demo4() {
        A_GenericClass<Integer> generictest = new A_GenericClass<Integer>(32213543);
        showKeyValue(generictest);
        //showKeyValue1(generictest);
        // showKeyValue这个方法编译器会为我们报错：Generic<java.lang.Integer>
        // cannot be applied to Generic<java.lang.Number>
        // showKeyValue(gInteger);
        //通过提示信息我们可以看到Generic<Integer>不能被看作为`Generic<Number>的子类。由此可以看出:同一种泛型可以对应多个版本（因为参数类型是不确定的），不同版本的泛型类实例是不兼容的。
    }

    @Test
    public void demo5() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        A_GenericClass a_GenericClass = (A_GenericClass) getMethod(Class.forName("test泛型.A_GenericClass"));
        System.out.println("泛型测试ok  " + a_GenericClass.getClass().getName());

    }

    public void showKeyValue1(A_GenericClass<Number> obj) {
        System.out.println("泛型测试key value is " + obj.getKey());
    }

    public void showKeyValue(A_GenericClass<?> obj) {
        System.out.println("泛型测试key value is " + obj.getKey());
    }

    /**
     * 泛型方法的基本介绍
     *
     * @param mclass 传入的泛型实参
     * @return T 返回值为T类型
     * 说明：
     * 1）public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
     * 2）只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
     * 3）<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
     * 4）与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
     */
    public <T> T getMethod(Class<T> mclass) throws InstantiationException,
            IllegalAccessException {
        T instance = mclass.newInstance();
        return instance;
    }

}
