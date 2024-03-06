package q2;

import java.util.Scanner;

public class Dog {
    private String name;
    private String breed;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter breed: ");
        breed = scanner.nextLine();
    }

    public void putData() {
        System.out.println("Dog - Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("Enter data for Dog 1:");
        dog1.getData();
        System.out.println("Enter data for Dog 2:");
        dog2.getData();

        System.out.println("Dog 1:");
        dog1.putData();
        System.out.println("Dog 2:");
        dog2.putData();
    }
}
