package io.crowesnest.AniDB_RestAPI.world;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestApi_Repository extends CrudRepository<RestApi_Model, Integer> {
    long countAllByCountrycodeAfter(String countrycodeAfter);

    Iterable<RestApi_Model> findByName(String name);

    Iterable<RestApi_Model> findByCountrycode(Sort sort, String countrycode);

    //Iterable<Models> sortAlphabetically(Iterable<Models> models);
}
