package org.example.ModernJava21Features.SealedClasses;

sealed class Shape permits Circle, Square {
    void printShape() {
        System.out.println("This is shape class");
    }
}
