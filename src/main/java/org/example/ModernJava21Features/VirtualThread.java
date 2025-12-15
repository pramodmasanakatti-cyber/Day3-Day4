package org.example.ModernJava21Features;

public class VirtualThread {
    public static void main(String[] args) throws InterruptedException {
     Thread.startVirtualThread(()->{
            System.out.println("This is a virtual thread.");
     }).join();
    }
}
