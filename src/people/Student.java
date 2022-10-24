package people;

public class Student extends Person{
    private String group;
    Student(int ID,String name, String lastname, String middlename, int age, String group){
        super(ID, name, lastname, middlename, age);
        this.group = group;
    }
    @Override
    public String toString(){
        return super.toString() + " - студент(группа: "+ this.group+")\n";
    }
}
