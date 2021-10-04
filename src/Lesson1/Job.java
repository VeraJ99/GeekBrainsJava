package lesson5;


public class Job {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;
    private int salary;

    public Job(String name, String position, String email, String phone, int age, int salary) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }
    public  static void main(String[] args) {


        Job person1 = new Job("Ivan Petrov", "manager", "ipetrov.job", "2223222", 27, 50000);
        Job person2 = new Job("Igor Smirnov", "supermanager", "ismirnov.job", "2223322", 35, 60000);
        Job person3 = new Job("Maria Kazakova", "sysAdmin", "mkazakova.job", "2223232", 23, 70000);
        Job person4 = new Job("Anton Sokolov", "director", "asokolov.job", "2223333", 41, 100000);
        Job person5 = new Job("Irina Kovaleva", "buhgalter", "ikovaleva.job", "2223233", 47, 80000);


    System.out.println(person2.getName());
    System.out.println(person3.getPosition());
    System.out.println(person1.getEmail());
    System.out.println(person5.getPhone());
    System.out.println(person4.getAge());
    System.out.println(person3.getSalary());
        System.out.println(person3.getFullInfo());


   /*getOldPerson(Job,40);*/

        Job[]person={ person1, person2, person3, person4, person5};


    }
    public String getName () {
        return name;
    }
    public String getPosition(){
    return position;
}
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }
    String getFullInfo() {
        return this.name + ", " +
                this.age + " years old, " +
                this.position + ", Phone number: " +
                this.phone + ". Salary is " +
                this.salary + " RU;";
    }

    private static void getOldPerson(Job[]person, int age) {
        for (int i = 0; i < person.length; i++)
            if (person[i].getAge() > 40) {
                System.out.println(person[i].getAge());
            }
    }


   private static void getAllPersonsInOffice(Job[]person) {
       System.out.println("All person: ");
       for (int i = 0; i < person.length; i++) ;
      /* System.out.println((i + 1) + " " + Job[i].getName());*/
   }}











