package io.crowesnest.AniDB_RestAPI.anime_db_restapi;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Models, Integer> {
//    long countAllByCountrycodeAfter(String countrycodeAfter);
//
//    Iterable<Models> findByName(String name);
//
//    Iterable<Models> findByCountrycode(Sort sort, String countrycode);

    //Iterable<Models> sortAlphabetically(Iterable<Models> models);
}
