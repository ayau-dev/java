// 1️ Student классын құру
class Student {
    String name;
    int age;
    String major;

    void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
    }
}


// 2 Конструкторларды қолдану
class Student {
    String name;
    int age;
    String major;

    Student() {
        name = "Аты жоқ";
        age = 0;
        major = "Мамандығы жоқ";
    }

    Student(String n, int a, String m) {
        name = n;
        age = a;
        major = m;
    }

    void showInfo() {
        System.out.println(name + ", " + age + ", " + major);
    }
}


// 3 this кілт сөзін пайдалану
class Student {
    String name;
    int age;
    String major;

    Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
}


// 4 Бір класстан бірнеше объект құру
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Айдос", 18, "IT");
        Student s2 = new Student("Аружан", 19, "Экономика");
        Student s3 = new Student("Данияр", 20, "Математика");

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
    }
}


