// Student классы
class Student {
    String name;
    int age;
    String major;

    // 1
    Student() {
        this.name = "Аты белгісіз";
        this.age = 0;
        this.major = "Мамандығы жоқ";
    }

    // 2️
    Student(String name, int age, String major) {
        // 3
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Объект туралы ақпаратты экранға шығаратын әдіс
    void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("--------------------");
    }
}

// Негізгі класс
public class Main {
    public static void main(String[] args) {

        //4
        Student s1 = new Student(); // әдепкі конструктор
        Student s2 = new Student("Айдос", 19, "Информатика");
        Student s3 = new Student("Аружан", 20, "Экономика");

        // Әр объекттің мәндері тәуелсіз екенін көреміз
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
    }
}
