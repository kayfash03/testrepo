package com.company;

import java.util.ArrayList; // This automatically comes out when you declare ArrayList<>

public class ArrayListExample {

    public static void main(String[] args) {
        int [] ex = {1,2,3,6,7};
        ArrayList <Integer> numberz = new ArrayList<Integer>(); // This is how to create an arrayList
      numberz.add(10);
      numberz.add(20);
        numberz.add(30);
        numberz.add(40);
        numberz.add(50); // This the way to add elements flexibly in an array. By default it appends new element
        numberz.add(4,30); // This is how to add an element on a particular
        numberz.remove(3); // This is how to an element on index 3
        numberz.clear();
        numberz.add(30);
        System.out.println(numberz.indexOf(2)); // Checks to see the index position of element 2 (-1 means doesn't exist)
        numberz.isEmpty(); //Checks to see if the arrayList is empty
       // System.out.println(numberz);
        numberz.set(2,5); // This is how to replace the value of an element
        for (int i=0;i<numberz.size();i++)
        {
            System.out.println(numberz.get(i)); // This is how to loop through an ArrayList
        }

       // System.out.println(ex[2]); //prints address
    Boolean checking = numberz.contains(30);
    if (checking)
    {
        System.out.println("30 is in there");
    }
        //  System.out.println("Hello World!");

    }
  /*  int Sleep()
    {
        return 12;
    }

   */

}
