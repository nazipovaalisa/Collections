package Pets;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>();
        pets.add(new Pet("Cat"));
        pets.add(new Pet("Dog"));
        pets.add(new Pet("Rabbit"));
        pets.add(new Pet("Mouse"));
        for(Pet p : pets){
            System.out.println(p);
        }
        System.out.println("First pet: "+pets.peekFirst());
        System.out.println("Last pet: "+pets.peekLast());
        System.out.println("Delete last pet: "+pets.removeLast());
        for(Pet p: pets){
            System.out.println(p);
        }
        System.out.println("Delete first pet: "+pets.removeFirst());
        for(Pet p: pets){
            System.out.println(p);
        }
        System.out.println("Delete head: "+pets.pollFirst());
        pets.addFirst(new Pet("Hamster"));
        for(Pet p: pets){
            System.out.println(p);
        }
        System.out.println("Offer first pet: "+pets.offerFirst(new Pet("Parrot")));
        for(Pet p: pets)
            System.out.println(p);
        System.out.println("Offer last pet: "+pets.offerLast(new Pet("Turtle")));
        for(Pet p: pets)
            System.out.println(p);
    }
}
