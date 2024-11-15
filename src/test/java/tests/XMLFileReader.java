package tests;

import java.net.URL;
import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import io.restassured.response.ValidatableResponse;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


public class XMLFileReader {


    public static void main(String[] args) {
        List<String> urls = new ArrayList<>();
        try {
            String filePath2 = "https://sweet.tv/sitemap.xml";
            URL url2 = new URL(filePath2);
            DocumentBuilderFactory dbf2 = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder2 = dbf2.newDocumentBuilder();
            Document doc2 = dBuilder2.parse(String.valueOf(url2));
            doc2.getDocumentElement().normalize();
            NodeList nodeList2 = doc2.getElementsByTagName("sitemap");
            int tLength = nodeList2.getLength();

            for (int i = 0; i < tLength; i++) {
                Node node2 = nodeList2.item(i);

                if (node2.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node2;
                    urls.add(element.getElementsByTagName("loc").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int y = 0; y < urls.size(); y++) {

            try {
                String filePath = urls.get(y);
                URL url = new URL(filePath);
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbf.newDocumentBuilder();
                Document doc = dBuilder.parse(String.valueOf(url));
                doc.getDocumentElement().normalize();
                NodeList nodeList = doc.getElementsByTagName("url");
                int tLength = nodeList.getLength();

                for (int i = 0; i < tLength; i++) {
                    Node node = nodeList.item(i);

                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        try {
                            ValidatableResponse trailer = given().baseUri(element.getElementsByTagName("loc").item(0).getTextContent())
                                    .cookie("debug_player", "1")
                                    .when().get()
                                    .then()
                                    .assertThat().statusCode(is(200));
                        } catch (AssertionError e) {
                            System.out.println("Error =  " + element.getElementsByTagName("loc").item(0).getTextContent());
                        }
                    }


                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}




