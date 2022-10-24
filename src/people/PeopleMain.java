package people;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PeopleMain {
    public static void main(String[] args){
        Person t1 = new Teacher(1, "����", "������", "��������",50,"������ ������ � ���������� ����������������");
        Person t2 = new Teacher(2, "����", "������", "����������", 40, "���������� ���������� � �����������");
        Person t3 = new Teacher(3,"��������", "�������", "��������", 60, "�������������� ������������ � �����������");
        Person s1 = new Student(4,"�����","��������","���������",21,"09-902");
        Person s2 = new Student(5,"�������","��������","���������",21,"09-902");
        Person s3 = new Student(6,"����","��������","���������",20,"09-002");
        Person s4 = new Student(7,"����","�������","���������",19,"09-102");
        Person s5 = new Student(8,"����","���������","���������",18,"09-202");
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(t1);
        people.add(t2);
        people.add(t3);
        people.add(s1);
        people.add(s2);
        people.add(s3);
        people.add(s4);
        people.add(s5);

        Collections.sort(people, new PersonNameComparator());
        System.out.println(people.toString());
        Collections.sort(people, new PersonAgeComparator());
        Person min = people.get(0);
        Person max = people.get(people.size()-1);
        System.out.println("C���� ������� �������: " + min + " " + min.getAge());
        System.out.println("����� ������� �������: " + max + " " + max.getAge());

    }
}
