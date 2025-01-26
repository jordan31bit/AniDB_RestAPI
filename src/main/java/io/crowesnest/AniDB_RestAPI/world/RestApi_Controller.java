package io.crowesnest.AniDB_RestAPI.world;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@ComponentScan
@RestController
public class RestApi_Controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final RestApi_Service restApi_Service;
        public RestApi_Controller(RestApi_Service restApi_Service) {
            this.restApi_Service = restApi_Service;
        }

    @GetMapping("/test")
    public String world(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "TACO TACO TACO";
    }
    @GetMapping("/world")
    public Iterable<RestApi_Model> world() {
            return restApi_Service.findAll();
    }
    @GetMapping("/search")
    public Iterable<RestApi_Model> findName(@RequestParam(value = "name", defaultValue = "Kabul") String name) {
            System.out.println(name.toString());
            return restApi_Service.findByName(name);
    }
    @GetMapping("/country")
    public Iterable<RestApi_Model> findCountry(@RequestParam(value = "countrycode", defaultValue = "") String countrycode) {
            return restApi_Service.findByCountry(countrycode);
    }
}
