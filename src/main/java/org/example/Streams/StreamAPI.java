package org.example.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,4,3,1));

        //map
        System.out.println("Map: " + list.stream().map(a->a*2).toList());

        //filter
        System.out.println("Filter even numbers: " + list.stream().filter(a->a%2==0).toList());

        //reduce
        System.out.println("reduce(): " + list.stream().reduce(0,(a,b)->a+b));

        //sorted
        System.out.println("sorted(): " + list.stream().sorted().toList());

        //distinct
        System.out.println("distinct(): " + list.stream().distinct().toList());

        //limit
        System.out.println("limit(): " + list.stream().limit(4).toList());

    }
}
