package com.ft.spikes.controllers;

import com.ft.spikes.models.Person;
import com.ft.spikes.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by dan.murphy on 24/11/2015.
 */
@RestController
@RequestMapping("people")
public class People {

    @Autowired
    PersonRepository people;

    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Person getPersonByUuid(@PathVariable String uuid) {
        Person someone = people.findOne(uuid);
        return someone;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Collection<Person> listPeople() {
        Collection<Person> allFolks = people.findAll();
        return allFolks;
    }
}
