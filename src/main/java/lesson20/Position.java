package lesson20;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.*;

import java.math.BigDecimal;

@Data
@ToString
@NoArgsConstructor
@Getter
@Setter
@XmlRootElement
@XmlAccessorType
@XmlType
public class Position {

    private String name;
    private BigDecimal salary;
}
