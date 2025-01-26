package io.crowesnest.AniDB_RestAPI.fetch_sources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
@ComponentScan
@RestController
public class FetchSources_Controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final from_nyaa from_nyaa = new from_nyaa();

    @GetMapping("/api/sources/fetch")
    public String world() throws IOException, InterruptedException, ParserConfigurationException, SAXException {
            from_nyaa.fetchXml();
            return "TACO TACO TACO";
    }
}
