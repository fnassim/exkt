package DataClass;

public class HumanJava {
    private String name;
    private String sex;
    private int age;

    public HumanJava(String name, String sex, int age ){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public HumanJava(){
        this.name = "John Doe";
        this.sex = "male";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
