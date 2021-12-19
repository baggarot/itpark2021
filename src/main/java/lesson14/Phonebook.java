package lesson14;

import java.util.*;

public class Phonebook {

    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            contactList.add(generateContact());
        }
        Random random = new Random();
        for (Contact contact : contactList) {
            for (int i = 0; i < 10; i++) {
                Contact randomContact = contactList.get(random.nextInt(contactList.size()));
                contact.getLinkedContacts().add(randomContact);
            }
        }
        ListIterator<Contact> contactListIterator = contactList.listIterator();
        for (Contact contact : contactList) {
            if (contact.getLinkedContacts().contains(contactListIterator.next()))
                System.out.println(contact);
        }
    }

    private static Contact generateContact() {
        Random random = new Random();
        int rand = random.nextInt(10000);
        String name = "Ф.И.О." + rand;
        int randomNumber = random.nextInt(8999999);
        int phoneNumber = 1000000 + randomNumber;
        int randomOperators = random.nextInt(5);
        CellularOperators operator = switch (randomOperators) {
            case 0 -> CellularOperators.as(1);
            case 1 -> CellularOperators.as(2);
            case 2 -> CellularOperators.as(3);
            case 3 -> CellularOperators.as(4);
            case 4 -> CellularOperators.as(5);
            default -> throw new IllegalStateException("Unexpected value: " + randomOperators);
        };
        return new Contact(name, phoneNumber, operator);
    }
}