public class Test {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("Kamil");
        person2.setName("Bartek");
        Task task = new Task();
        task  = new Task("Zadanie1" , "Cleaning house", task.highPriority(5),person1);
        Task task1 = new Task("Zadanie 2" , "Shopping ", task.mediumPriority(0), person1 );
        Task task2 = new Task("Zadanie 3 " , "Wash car",task.lowPriority(-1),person2);
        Task task3 = new Task("Zadanie4", "Cinema");


        task.showInfo();
        task1.showInfo();
        task2.showInfo();
        task3.showInfo();

    }


}
