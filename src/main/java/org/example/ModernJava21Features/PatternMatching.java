package org.example.ModernJava21Features;

public class PatternMatching {
    
    public static void main(String[] args) {
        
        Object value=123;
        if(value instanceof Integer item) {
            System.out.println("Integer: " + item);
        }
        
        switch (value) {
            case Integer item->System.out.println("Integer: "+ item);
            case Double item->System.out.println("Double: " + item);
            case String item->System.out.println("String: " + item);
            default -> System.out.println("Unexpected value: " + value);
        }
    }
}
