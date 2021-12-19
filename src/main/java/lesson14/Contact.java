package lesson14;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact {

    private final String fullName;
    private final int phoneNumber;
    private final CellularOperators cellularOperator;
    private final Set<Contact> linkedContacts = new HashSet<>();

    public Contact(String fullName, int phoneNumber, CellularOperators cellularOperator) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.cellularOperator = cellularOperator;
    }

    public Set<Contact> getLinkedContacts() {
        return linkedContacts;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", cellularOperator=" + cellularOperator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phoneNumber == contact.phoneNumber && Objects.equals(fullName, contact.fullName);
    }

    @Override
    public int hashCode() {
        //return 7;
        return Objects.hash(fullName, phoneNumber);
    }
}