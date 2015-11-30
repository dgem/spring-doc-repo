package com.ft.spikes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ft.spikes.models.Person;

/**
 * Created by dan.murphy on 24/11/2015.
 */
@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
}
