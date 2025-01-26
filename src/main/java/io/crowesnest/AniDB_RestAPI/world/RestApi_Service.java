package io.crowesnest.AniDB_RestAPI.world;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class RestApi_Service {
    private final RestApi_Repository restApi_Repository;

    public RestApi_Service(RestApi_Repository restApi_Repository) {
        this.restApi_Repository = restApi_Repository;
    }

    public Iterable<RestApi_Model> findAll() {
        return restApi_Repository.findAll();
        //return "TACO TACO TACO TACO TACO";
    }
    public Iterable<RestApi_Model> findByName(String name) {
        return restApi_Repository.findByName(name);
        //return restApi_Repository.findAll();
    }
    public Iterable<RestApi_Model> findByCountry(String countrycode) {
        return restApi_Repository.findByCountrycode(Sort.by(Sort.Direction.ASC, "name"), countrycode);
        //Iterable<Models> sortedModels = restApi_Repository.sortAlphabetically(models);
        //return sortedModels;
        //return restApi_Repository.findByCountrycode(countrycode);
    }
}
