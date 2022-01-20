package lesson20;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.FileWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.Arrays;

public class EmployeeXML {

    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance(Employees.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        Employee ivanov = new Employee();
        ivanov.setPersonnelNumber(1);
        ivanov.setLogin("ivanovii");
        ivanov.setFullName("Иванов Иван Иванович");
        Department ngch = new Department();
        ngch.setName("НГЧ-2");
        ngch.setCity("Новосибирск");
        Position master = new Position();
        master.setName("мастер участка");
        master.setSalary(BigDecimal.valueOf(47000.0));
        ivanov.setDepartment(ngch);
        ivanov.setPosition(master);

        Employee petrov = new Employee();
        petrov.setPersonnelNumber(1);
        petrov.setLogin("petrovpp");
        petrov.setFullName("Петров Петр Петрович");
        Department dtv = new Department();
        dtv.setName("ДТВу1");
        dtv.setCity("Омск");
        Position ingener = new Position();
        ingener.setName("инженер по технике безопасности");
        ingener.setSalary(BigDecimal.valueOf(35000.0));
        petrov.setDepartment(dtv);
        petrov.setPosition(ingener);

        Employee sidorov = new Employee();
        sidorov.setPersonnelNumber(1);
        sidorov.setLogin("sidorovss");
        sidorov.setFullName("Сидоров Сидр Сидорович");
        Department tch = new Department();
        tch.setName("ТЧ-3");
        tch.setCity("Барабинск");
        Position driver = new Position();
        driver.setName("машинист электровоза");
        driver.setSalary(BigDecimal.valueOf(103000.0));
        sidorov.setDepartment(tch);
        sidorov.setPosition(driver);

        Employees employees = new Employees();
        employees.setEmployees(Arrays.asList(ivanov, petrov, sidorov));
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(employees, stringWriter);
        String str = stringWriter.toString();
        System.out.println(str);
        FileWriter employee = new FileWriter("F:/employees.xml", true);
        employee.write(str);
        employee.flush();
        employee.close();
    }
}
