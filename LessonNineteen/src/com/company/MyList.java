package com.company;

public class MyList {
    // head всегда будет содержать ссылку на первый элемент
    private Node head; // если null значит нет элементов

    // метод добавления элементов в список
    public void add(int value) {
        // если список пустой (head == null)
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }

        // список не пустой
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new Node(value);
    }

    // метод выведения списка
    public void print() {
        Node last = this.head;
        while (last != null) {
            System.out.println(last.value);
            last = last.next;
        }
    }
}
