package com.ft.spikes.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.Date;

/**
 * Created by dan.murphy on 24/11/2015.
 */
@Document
public class Person {

    @Id
    public String uuid;

    public String name;

    public Date dob;

    @Reference
    public Collection<Organisation> memberOf;
}
