package HomeWork;

class Сотрудник {
    private String fio;
    private String position;
    private String email;
    private String telephone;
    private double salary;
    private int age;

    Сотрудник(String fio ,  String position , String email, String telephone,double salary, int age)

    {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + position + " " + email + " " + telephone + " " + salary + " " + age);
    }
}



public class Main {

    public static void main(String[] args) {

        Сотрудник[] persArray = new Сотрудник[5];
        persArray[0] = new Сотрудник("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Сотрудник("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "7897645645", 30300, 25);
        persArray[2] = new Сотрудник("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "4564564566", 40000, 43);
        persArray[3] = new Сотрудник("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "4453453452", 21000, 58);
        persArray[4] = new Сотрудник("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "4845645642", 35000, 40);

        for(Сотрудник item : persArray) {
            if(item.GetAge() >= 40) item.Show();
        }
    }
}
