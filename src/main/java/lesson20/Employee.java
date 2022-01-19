package lesson20;

import jakarta.xml.bind.annotation.*;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@Getter
@Setter
@XmlRootElement(name = "employee")
@XmlAccessorType
@XmlType
public class Employee {

    private int personnelNumber;
    private String login;
    private String fullName;
    private Department department;
    private Position position;
}
