package com.ft.spikes;

import com.ft.spikes.models.Person;
import com.ft.spikes.repositories.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MongoRepositoryApplication.class)
public class PersonRepositoryTests {

    @Autowired
    PersonRepository people;

	@Test
	public void canStoreSomePeople() {
        for (int i=0; i<10; i++){
            Person someone = new Person();
            someone.name = "Murphy, Dan" + i;
            someone.uuid = UUID.randomUUID().toString();
            someone.dob = new Date();
            people.save(someone);
        }
	}

}
