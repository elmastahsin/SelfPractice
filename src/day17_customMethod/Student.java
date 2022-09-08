package day17_customMethod;

public class Student {
    public String name;
    public char gender;
    public String studentId;
    public char grade;
    public boolean isFullTime;

    public void setInfo(String name, char gender, String studentId, char grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void  study(){

    }
}
/*
* 2. Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student
			* object
			toString(): when a student object is passed in
			* print statement,
					it should display all the information
					* of the student object
			study()

*/