package lesson20;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.*;

@Data
@XmlRootElement
@XmlAccessorType
@XmlType
public class Department {

    private String name;
    private String city;
}
