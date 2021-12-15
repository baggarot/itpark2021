package lesson13;

import java.util.Objects;

public class Employee {

    private Integer id;
    private String fullName;
    private int workAge;

    public Employee(Integer id, String fullName, int workAge) {
        this.id = id;
        this.fullName = fullName;
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", workAge=" + workAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return workAge == employee.workAge && Objects.equals(id, employee.id)
                && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, workAge);
    }
}