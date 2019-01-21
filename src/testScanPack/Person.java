package testScanPack;

public class Person {
    public String name;
    private String phoneNum;
    private static Integer age;

    public Person() {

    }

    public Person(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }


    private Person(String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    private static Integer getAge(String pram) {
        System.out.println("getAge:" + pram);
        return age;
    }

    public static void setAge(Integer age) {
        Person.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

}
