package lesson20;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeXPath {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDocument = builder.parse("F:/employees.xml");
        XPath xPath = XPathFactory.newInstance().newXPath();
        double avg = (Double) xPath.compile("sum(/employees/employees/position/salary) " +
                "div count(/employees/employees/position/salary)").evaluate(xmlDocument, XPathConstants.NUMBER);
        List<String> names = getEmployee(xmlDocument, xPath, BigDecimal.valueOf(avg));
        System.out.println("Работники с заработной платой выше среднего: " + names);
    }

    private static List<String> getEmployee(Document doc, XPath xPath, BigDecimal value) throws Exception {
        List<String> list = new ArrayList<>();
        XPathExpression xPathException = xPath.compile("/employees/employees[position/salary>"
                + value + "]/fullName/text()");
        NodeList nodes = (NodeList) xPathException.evaluate(doc, XPathConstants.NODESET);
        for (int i = 0; i < nodes.getLength(); i++) {
            list.add(nodes.item(i).getNodeValue());
        }
        return list;
    }
}
