public class Main {

    public static void main(String[] args) {

        Student1 s1 = new Student1("Ali",18);
        Student1 s2 = new Student1("Dana",19);
        System.out.println("Student count: " + Student1.count);

        Student2 st1 = new Student2("Aruzhan");
        st1.show();

        System.out.println("Square: " + MathUtils.square(4));
        System.out.println("Cube: " + MathUtils.cube(3));

        Counter.increment();
        Counter.increment();
        System.out.println("Count: " + Counter.count);

        System.out.println(Config1.appName + " version " + Config1.version);

        Config2.show();

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.showMessage();

        University uni = new University();
        University.Student student = uni.new Student("Ayan","IT");
        student.show();

        Computer comp = new Computer();
        Computer.Processor p = comp.new Processor(3.6);
        p.show();

        Library lib = new Library();
        Library.Book book = lib.new Book("Java Programming");
        book.show();

        Car car = new Car();
        Car.Engine eng = car.new Engine(250);
        eng.show();

        System.out.println("Interest: " + Bank.calculateInterest(1000));

        Company compa = new Company();
        Company.Employee emp = compa.new Employee("Dias","Manager");
        emp.show();

        Course course = new Course("Java Course");
        Course.Student cs = course.new Student("Arman");
        cs.show();

        UniversityStat.addStudent();
        UniversityStat.addStudent();
        System.out.println("Students: " + UniversityStat.studentCount);
    }

}

/* Есеп 1 */
class Student1{
    String name;
    int age;
    static int count = 0;

```
    Student1(String name,int age){
        this.name=name;
        this.age=age;
        count++;
    }
```

}

/* Есеп 2 */
class Student2{
    String name;
    static String university="AITU";

```
    Student2(String name){
        this.name=name;
    }

    void show(){
        System.out.println(name + " studies at " + university);
    }
```

}

/* Есеп 3 */
class MathUtils{

```
    static int square(int x){
        return x*x;
    }

    static int cube(int x){
        return x*x*x;
    }
```

}

/* Есеп 4 */
class Counter{

```
    static int count=0;

    static void increment(){
        count++;
    }
```

}

/* Есеп 5 */
class Config1{
    static String appName="MyApp";
    static int version=1;
}

/* Есеп 6 */
class Config2{

```
    static String name;
    static int version;

    static{
        name="SystemApp";
        version=2;
        System.out.println("Static block executed");
    }

    static void show(){
        System.out.println(name+" "+version);
    }
```

}

/* Есеп 7 */
class Outer{

```
    class Inner{

        void showMessage(){
            System.out.println("Hello from Inner class");
        }
    }
```

}

/* Есеп 8 */
class University{

```
    class Student{
        String name;
        String major;

        Student(String n,String m){
            name=n;
            major=m;
        }

        void show(){
            System.out.println(name+" - "+major);
        }
    }
```

}

/* Есеп 9 */
class Computer{

```
    class Processor{

        double frequency;

        Processor(double f){
            frequency=f;
        }

        void show(){
            System.out.println("Processor frequency: "+frequency+" GHz");
        }
    }
```

}

/* Есеп 10 */
class Library{

```
    class Book{

        String title;

        Book(String t){
            title=t;
        }

        void show(){
            System.out.println("Book: "+title);
        }
    }
```

}

/* Есеп 11 */
class Car{

```
    class Engine{

        int power;

        Engine(int p){
            power=p;
        }

        void show(){
            System.out.println("Engine power: "+power+" hp");
        }
    }
```

}

/* Есеп 12 */
class Bank{

```
    static double interestRate=0.1;

    static double calculateInterest(double amount){
        return amount*interestRate;
    }
```

}

/* Есеп 13 */
class Company{

```
    class Employee{

        String name;
        String position;

        Employee(String n,String p){
            name=n;
            position=p;
        }

        void show(){
            System.out.println(name+" - "+position);
        }
    }
```

}

/* Есеп 14 */
class Course{

```
    String courseName;

    Course(String name){
        courseName=name;
    }

    class Student{

        String name;

        Student(String n){
            name=n;
        }

        void show(){
            System.out.println(name+" enrolled in "+courseName);
        }
    }
```

}

/* Есеп 15 */
class UniversityStat{

```
    static int studentCount=0;

    static void addStudent(){
        studentCount++;
    }
```

}
