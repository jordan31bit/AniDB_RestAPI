package io.crowesnest.AniDB_RestAPI.anime_db_restapi;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class Services {
    private final Repository repository;

    public Services(Repository repository) {
        this.repository = repository;
    }

    public Iterable<Models> fetchAll() {
        return repository.findAll();
        //return "TACO TACO TACO TACO TACO";
    }
    public String save(Models models) {
        repository.save(models);
        return "Saved";
    }
//    public Iterable<Models> findByName(String name) {
//        return restApi_Repository.findByName(name);
//        //return restApi_Repository.findAll();
//    }
//    public Iterable<Models> findByCountry(String countrycode) {
//        return restApi_Repository.findByCountrycode(Sort.by(Sort.Direction.ASC, "name"), countrycode);
//        //Iterable<Models> sortedModels = restApi_Repository.sortAlphabetically(models);
//        //return sortedModels;
//        //return restApi_Repository.findByCountrycode(countrycode);
//    }
}
