package Teacher;

public class Teacher {
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private String subject;
    private String className;
    private int level;

    public Teacher(String name, int age, String phoneNumber, String email, String subject, String className, int level) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.subject = subject;
        this.className = className;
        this.level = level;
    }

    public boolean isRetired() {
        return age >= 60;
    }

    public void printSalary() {
        int salary = 0;
        switch (level) {
            case 1:
                salary = 5000000;
                break;
            case 2:
                salary = 7000000;
                break;
            case 3:
                salary = 9000000;
                break;
            default:
                System.out.println("Bac khong hop le: ");
        }
        System.out.println("Salary: " + salary);
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Class name: " + className);
        System.out.println("Level: " + level);
    }
}
