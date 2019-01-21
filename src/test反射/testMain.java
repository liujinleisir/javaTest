package test反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testMain {
    @Test
    public void demo1() {
        try {
            //1.通过路径来获得class对象
            Class clzz = Class.forName("test反射.Person");
            System.out.println(clzz.getName());
            //2.通过类名.class来获取class对象
            Class clzz1 = Person.class;
            System.out.println(clzz1.getName());
            //3.通过对象.getClass来获得
            Person p = new Person();
            Class clzz2 = p.getClass();
            System.out.println(clzz2.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demo2() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Class clzz = Class.forName("test反射.Person");
            Constructor con1 = null;
            try {
                con1 = clzz.getDeclaredConstructor(String.class, String.class);
                Person p = (Person) con1.newInstance("nima", "4312");
                p.setAge(18);
                System.out.println("获取指定参数类型的构造方法并生成对象\n" + p.toString());

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demo3() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Class clzz = Class.forName("test反射.Person");
            Constructor con1 = null;
            try {
                //获取所有的公有的构造方法
                //Constructor[] conArray = clzz.getConstructors();
                //获取所有的构造方法
                //Constructor[] conArray = clzz.getDeclaredConstructors();
                con1 = clzz.getConstructor(null);
                Person p = (Person) con1.newInstance();
                p.setAge(18);
                p.setName("rnm");
                p.setPhoneNum("43124265");
                System.out.println("获取无参构造\n" + p.toString());

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void demo4() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Class clzz = Class.forName("test反射.Person");
            //获取所有的属性
            Field[] fieds = clzz.getDeclaredFields();
            for (Field field : fieds) {
                System.out.println(field.getName());
            }
            Person p = (Person) clzz.newInstance();

            Field feldName = clzz.getField("name");
            Field feldPhoneNum = clzz.getDeclaredField("phoneNum");
            Field feldAge = clzz.getDeclaredField("age");
            //属性赋值
            // 1.field.set(obj,value)
            feldName.set(p, "mignzi");
            // 2.直接赋值
            //p.setPhoneNum("41234324");
            //私有的所有属性赋值
            feldPhoneNum.setAccessible(true);//暴力赋值
            feldPhoneNum.set(p, "432532");
            feldAge.setAccessible(true);
            feldAge.set(p, 12);//age属于静态的属性
            System.out.println(feldName.get(p));
            System.out.println(p);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demo5() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Class clzz = Class.forName("test反射.Person");
            Person p = (Person) clzz.getDeclaredConstructor().newInstance();
            //获取所有公有方法
            Method[] methodPublics = clzz.getMethods();
            //获取所有方法
            Method[] methods = clzz.getDeclaredMethods();
            //获取指定的公有方法
            Method methodPublic = clzz.getMethod("toString");
            String aa = (String) methodPublic.invoke(p);
            System.out.println(aa);
            //获取指定的所有方法
            Method method = clzz.getDeclaredMethod("getAge", String.class);
            method.setAccessible(true);
            method.invoke(p, "12");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demo6() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Class clzz = Class.forName("test反射.Person");
            Class superClzz = clzz.getSuperclass();
            System.out.println(superClzz.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
