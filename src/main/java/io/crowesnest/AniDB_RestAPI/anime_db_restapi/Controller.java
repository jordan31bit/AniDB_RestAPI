package io.crowesnest.AniDB_RestAPI.anime_db_restapi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@ComponentScan
@RestController
public class Controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final Services services;
        public Controller(Services services) {
            this.services = services;
        }

    @GetMapping("/api/anidb/fetch")
    public Iterable<Models> world() {
            return services.fetchAll();
            //return "TACO TACO TACO";
    }
    @GetMapping("api/anidb/save")
    public String save(@RequestParam(value = "name", defaultValue = "yeeeehaaaaw") Models name) {
            return services.save(name);
    }
//    @GetMapping("/world")
//    public Iterable<Models> world() {
//            return services.findAll();
//    }
//    @GetMapping("/search")
//    public Iterable<Models> findName(@RequestParam(value = "name", defaultValue = "Kabul") String name) {
//            System.out.println(name.toString());
//            return services.findByName(name);
//    }
//    @GetMapping("/country")
//    public Iterable<Models> findCountry(@RequestParam(value = "countrycode", defaultValue = "") String countrycode) {
//            return services.findByCountry(countrycode);
//    }
}
