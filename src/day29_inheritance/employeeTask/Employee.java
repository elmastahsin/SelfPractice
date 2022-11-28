package day29_inheritance.employeeTask;

public class Employee {
    private String name;
    private char gender;
    private int age, id;
    private String jobTitle;
    private double salary;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) { //gender can only be 'M' or 'F'
        if (!(gender == 'M') || !(gender == 'F')) {
            System.err.println("Invalid gender " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {//	 age can not be nagative
        if (age < 0) {
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        if (age < 18 || age > 65) {//age MUST be between 18 to 65
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {// salary can not be negative
        if (salary < 0) {
            System.err.println("Invalid salary: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +  // this gets the class name automatically
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*employeeTask:
	1. Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement*/