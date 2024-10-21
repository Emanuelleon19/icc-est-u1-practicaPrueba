package views;

import java.util.Scanner;

import models.Person;

public class View {

    private Scanner scanner;

    public View(){
        scanner = new Scanner(System.in);
    }

    public int showMenu(){
        System.out.println("Ingrese la cantidad a ordenar");
        System.out.println("1. Por nombre");
        System.out.println("2. por edad");
        System.out.println("Ingrese una opcion");
        return scanner.nextInt();
    }

    public int inputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
    public Person inputPersons(){
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }
    public String inputName(){
        System.out.println("Ingrese el nombre: ");
        return scanner.next();
    }
    public int inputAge(){
        return inputInt("Ingrese la edad");
    }

    public void showMessage(String message) {
            System.out.println(message);
    }

    public int selectSortingMethod() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectSortingMethod'");
    }
}
