package com.queue;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        Product laptop = new Product(1, "Laptop", 1300000);
        Product mouse = new Product(2, "Mouse", 50000);
        Product komputer = new Product(3, "Komputer", 2200000);
        Product keyboard = new Product(4, "Keyboard", 120000);
        Product monitor = new Product(4, "Monitor", 20000);

        queue.add(laptop);
        queue.add(mouse);
        queue.add(komputer);
        queue.add(keyboard);
        queue.add(monitor);

        queue.remove();

        queue.add(hp);

        queue.printQueue();
    }
}
