package people;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        if(o1.getLastname().compareTo(o2.getLastname()) != 0)
            return o1.getLastname().compareTo(o2.getLastname());
        else if (o1.getName().compareTo(o2.getName()) != 0)
            return o1.getName().compareTo(o2.getName());
        else
            return o1.getMiddlename().compareTo(o2.getMiddlename());
    }
}
