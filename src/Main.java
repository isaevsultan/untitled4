//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("00");
        /**Cоздайте класс Person c полями(name,
         age, work, salary, phone). В main
         создайте 5 объектов класса, дайте
         значения через конструктор,
         положите эти объекты в массив,
         сначала выведите все эти объекты на
         консоль.
         Теперь выведите человека у которого
         самая высокая зарплата, выведите у
         кого самая низкая зарплата, выведите у
         кого самый дорогой телефон**/

        Person person1 = new Person("Sultan",(byte)24,56575L,15000);
        person1.getInfo();
        System.out.println();
        Person  person2  = new Person("dima",(byte)21,56000L,17000);
        person2.getInfo();
        System.out.println();
        Person  person3  = new Person("Tom",(byte)28,70000L,45000);
        person3.getInfo();

        System.out.println();
        Person  person4  = new Person("Sasha",(byte)45,45000L,45000);
        person4.getInfo();
        System.out.println();
        Person  person5  = new Person("Anna",(byte)6,65000L,10000);
        person5.getInfo();

        Person[] people = {person1,person2,person3,person4};
        for(Person person: people){

        }

        System.out.println(Person.methodPhone(people));










    }
}