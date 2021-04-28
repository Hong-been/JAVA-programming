class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
    static void print(Person p) {
        if (p instanceof Person) {
            System.out.print("Person ");
        }
        if (p instanceof Student) {
            System.out.print("Student ");
        }
        if (p instanceof Researcher) {
            System.out.print("Researcher ");
        }
        if (p instanceof Professor) {
            System.out.print("Professor ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.print("new Student() -> ");
        print(new Student()); //레퍼런스를 지정하지않고(저장안할때) 임시로 객체만 생성함
        System.out.print("new Researcher() -> ");
        print(new Researcher());
        System.out.print("new Professor() -> ");
        print(new Professor());
    }
}
