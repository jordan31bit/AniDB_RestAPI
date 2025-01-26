package io.crowesnest.AniDB_RestAPI.fetch_sources;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class from_nyaa {
    private String url = "https://nyaa.si/?page=rss&c=1_2&f=0&u=Yameii";
    public void fetchXml() throws IOException, InterruptedException, SAXException, ParserConfigurationException {
        this.url = url;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response;
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println(response.body());
        Document doc;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.parse(response.body());
        doc.getDocumentElement().normalize();
        //System.out.println(doc.getElementsByTagName("title").item(1).getTextContent());
        System.out.println(doc.getElementsByTagName("title").item(12).getTextContent());
        //System.out.println(doc.getDocumentElement().getNodeName());
    }
}
