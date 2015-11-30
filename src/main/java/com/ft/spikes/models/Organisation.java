package com.ft.spikes.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

/**
 * Created by dan.murphy on 24/11/2015.
 */
@Document
public class Organisation {
    @Id
    public String uuid;
    public String name;
    @Reference
    public Collection<Person> members;
}
