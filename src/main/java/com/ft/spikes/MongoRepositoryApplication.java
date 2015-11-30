package com.ft.spikes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoRepositoryApplication implements CommandLineRunner
{
    public static void main(String[] args) {
        SpringApplication.run(MongoRepositoryApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
    }
}
