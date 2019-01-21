package test泛型;
/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class B_1GenericClass<T> implements B_GenericInterface<T>
 * 如果不声明泛型，如：class B_1GenericClass implements B_GenericInterface<T>，编译器会报错："Unknown class"
 */

//public class B_1GenericClass<T> implements B_GenericInterface<T>{
//    @Override
//    public T getKey(T key) {
//        return null;
//    }
//}


/**
 * 传入泛型实参时：
 * 定义一个生产器实现这个接口,虽然我们只创建了一个泛型接口B_GenericInterface<T>
 * 但是我们可以为T传入无数个实参，形成无数种类型的Generator接口。
 * 在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
 * 即：public T getKey(T key);中的的T都要替换成传入的String类型。
 */

public class B_1GenericClass implements B_GenericInterface<String> {

    @Override
    public String getKey(String key) {
        return key;
    }
}
