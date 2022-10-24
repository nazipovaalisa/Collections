package people;

public class Teacher extends Person{
    private String department;

    Teacher(int ID,String name, String lastname, String middlename, int age, String department){
        super(ID, name, lastname, middlename, age);
        this.department = department;
    }
    @Override
    public String toString(){
        return super.toString() +" - преподаватель(кафедра: " + this.department + ")\n";

    }
}
