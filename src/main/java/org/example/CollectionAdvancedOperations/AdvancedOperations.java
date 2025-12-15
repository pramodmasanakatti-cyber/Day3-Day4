package org.example.CollectionAdvancedOperations;

import java.util.*;

import static java.lang.CharSequence.compare;

public class AdvancedOperations {
    //sorting
    static void sortingCollections() {
        System.out.println("--Sorting operation");
        List<String> list=new ArrayList<>(Arrays.asList("Pramod","Abc","Xyz"));
        Collections.sort(list);
        System.out.println("Natural ordering: " + list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("Reerse ordering: " + list);
    }
//reversing
    static void reverseOrder() {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println("\n--Reverse Order--");
        System.out.println("Original List: " + list);
        Collections.reverse(list);
        System.out.println("Reverse Order: " + list);
        System.out.println("\n--Max Min--");
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));
    }
    //mapping
    static void mappingColections() {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println("\n--Mapping--");
        System.out.println("Original List: " + list);
        System.out.println("List with each element multiplied by2: "+ list.stream().map((a)->a*2).toList());

    }
    //reducing
    static void reducingCollections() {
    List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    System.out.println("\n--Reducing--");
    System.out.println("List: " +list);
    System.out.println("Sum of elements: " + list.stream().reduce(0,(a,b)->a+b));
    }
    //filtering
    static void filteringCollections() {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("\n--Filtering--");
        System.out.println("List: " + list );
        System.out.println("Even numbers in list: " + list.stream().filter(a->a%2==0).toList());

        List<String> stringList=new ArrayList<>(Arrays.asList("Abc","bca","Ab","xyz"));
        System.out.println("\nList of names: " + stringList);
        System.out.println("Names starting with A" + stringList.stream().filter(a->a.startsWith("A")).toList());
    }
    //binarySearch in collection
    static void binarySearchCollection() {
       List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       System.out.println("\n--Binary search--");
       System.out.println("Binary search when element found: " + Collections.binarySearch(list,2));
       System.out.println("Binary search when element not found: " + Collections.binarySearch(list,20));
    }
    //set operaitions
    static void setOperations() {
        Set<Integer> a=new HashSet<>(Arrays.asList(1,1,3,4,2,5,6));
        Set<Integer> b=new HashSet<>((Arrays.asList(3,7,8,2,4,1,5,2)));

        Set<Integer> union=new HashSet<>(a);
        union.addAll(b);
        System.out.println("\n--Set operations--");
        System.out.println("Union: " + union);

        Set<Integer> intersection=new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection: " + intersection);

        Set<Integer> difference=new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Difference: " + difference);
    }
    public static void main(String[] args) {
sortingCollections();
mappingColections();
reducingCollections();
filteringCollections();
reverseOrder();
binarySearchCollection();
setOperations();
    }
}
