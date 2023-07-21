//Соболевская 4619


package hw5;

/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут 
повторяющиеся имена с разными телефонами, их необходимо считать, 
как одного человека с разными телефонами. Вывод должен быть 
отсортирован по убыванию числа телефонов. */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;


// При функциях 2, 3, 4 повторно не позволяет вводить значения. Не понимаю в чем ошибка
// Не понимаю, как сделать сортировку по номерам
public class hw5 {
    public static void main(String[] args) {
        Map<String, LinkedList<Integer>> contacts = new HashMap<>();
        contacts.put("Ivanov", new LinkedList<>());
        contacts.get("Ivanov").add(89035678);
        contacts.put("Sidorov", new LinkedList<>());
        contacts.get("Sidorov").add(89023374);
        contacts.put("Turin", new LinkedList<>());
        contacts.get("Turin").add(89023374);
        contacts.get("Ivanov").add(89457386);
        contacts.put("Borner", new LinkedList<>());
        contacts.get("Borner").add(89045385);
        menu(contacts);

    }
    static void drawing(){
        System.out.println("1 - show contacts");
        System.out.println("2 - add contact");
        System.out.println("3 - search contact");
        System.out.println("4 - delete contact");
        System.err.println("5 - exit");
    }

    static void menu(Map<String, LinkedList<Integer>> contacts){
        drawing();
        Scanner input = new Scanner(System.in);
        System.out.println("Input number from 1 to 5: ");
        Integer user_choice = Integer.parseInt(input.nextLine());
        if (user_choice == 1){
            show_contacts(contacts);
        }
        else if (user_choice == 2){
            add_contacts(contacts);
        }
        else if (user_choice == 3){
            search_contacts(contacts);
            menu(contacts);
        }
        else if (user_choice == 4) {
            delete_contacts(contacts);
            menu(contacts);
        }
        else if (user_choice == 5) 
            System.out.println("have a nice day");
        input.close();
    }
    
    private static void show_contacts(Map<String, LinkedList<Integer>> contacts) {
        for (Map.Entry<String, LinkedList<Integer>> contact : contacts.entrySet()) {
            System.out.printf("%s : ", contact.getKey());
            for (Integer number : contact.getValue()) {
                System.out.printf("%s ", number);
            }
            System.out.println();
        }
        menu(contacts);
    }

    static void add_contacts(Map<String, LinkedList<Integer>> contacts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a name: ");
        String name = input.nextLine();
        System.out.println("Input a number: ");
        Integer number = Integer.parseInt(input.nextLine());
        System.out.println();

        if( contacts.containsKey(name)){
            contacts.get(name).add(number);
        } else {
            contacts.put(name, new LinkedList<>());
            contacts.get(name).add(number);
        }
        input.close();
    }

    private static void search_contacts(Map<String, LinkedList<Integer>> contacts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a name: ");
        String name = input.nextLine();        
        System.out.println();
        if(contacts.containsKey(name))
            for (Integer number : contacts.get(name)) 
                System.out.println(number);
        else System.out.println("Contact not find");
        input.close();
        System.out.println();
    }

    private static void delete_contacts(Map<String, LinkedList<Integer>> contacts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a name: ");
        String name = input.nextLine();        
        System.out.println();
        if(contacts.containsKey(name))
            contacts.remove(name);
        else System.out.println("Contact not find");
        input.close();
        System.out.println(contacts);
    }
    
}