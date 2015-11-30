package com.ft.spikes;

import com.ft.spikes.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoRepositoryApplication implements CommandLineRunner
{
    @Autowired
    public PersonRepository people;

    public static void main(String[] args) {
        SpringApplication.run(MongoRepositoryApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
    }
}
