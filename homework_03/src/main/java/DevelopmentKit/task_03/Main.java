//Описать интерфейс Person с методами doWork() и haveRest(). Написать два класса работник и бездельник, реализующих
//        интерфейс. Работник работает, и не умеет бездельничать, в то время как бездельник не умеет работать,
//        но умеет отдыхать. Написать обобщённые классы Workplace и Club, содержащие массив из Person.
//        В классах необходимо вызывать у всего массива людей вызывать соответствующие методы.
//
package DevelopmentKit.task_03;
public class Main {

    public static void main(String[] args) {
        Person person1 = new HardWorker();
        Person person2 = new HardWorker();
        Person person3 = new HardWorker();
        Person person4 = new HardWorker();
        Person person5 = new HardWorker();
        Person person6 = new Idle();
        Person person7 = new Idle();
        Person person8 = new Idle();
        Person person9 = new Idle();
        Person person10 = new Idle();

//        Person[] workers = {person1, person3, person5, person7, person9};
//        Person[] idlers = {person2, person4, person6, person8, person10};
//
//        WorkPlace<? extends Person> factory = new WorkPlace<>(workers);
//        Club<? extends Person> club = new Club<>(idlers);
//
//        factory.workForAll();
//        club.restForAll();

//        Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
//        чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.

        Person[] people = {person1, person2, person3, person4, person5, person6, person7, person8, person9, person10};

        WorkPlace<? extends Person> factory = new WorkPlace<>(people);
        Club<? extends Person> club = new Club<>(people);

        factory.workForAll();
        club.restForAll();

        for (Person person: people) {
            System.out.println(person);
        }
    }
}