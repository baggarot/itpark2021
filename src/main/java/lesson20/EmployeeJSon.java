package lesson20;

import org.json.JSONObject;
import org.json.XML;

import java.io.FileReader;
import java.io.FileWriter;

public class EmployeeJSon {

    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("F:/employees.xml");
        JSONObject employeeJSon = XML.toJSONObject(reader);
        System.out.println(employeeJSon);
        FileWriter writer = new FileWriter("F:/employees.json", true);
        writer.write(employeeJSon.toString());
        writer.flush();
        writer.close();
        reader.close();
    }
}
