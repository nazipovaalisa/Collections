package people;

abstract class Person{
    private int ID;
    private String name;
    private String lastname;
    private String middlename;
    private int age;
    Person(int ID,String name, String lastname, String middlename, int age){
        this.ID = ID;
        this.name = name;
        this.lastname = lastname;
        this.middlename = middlename;
        this.age = age;
    }
    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public String getLastname() {
        return lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        return  "" + ID + ". " +lastname + ". " + name.charAt(0) + "." + middlename.charAt(0)+".";
    }
}
