package ru.Salamon.Dates;

import com.github.javafaker.Faker;

public class Fake {

    Faker faker = new Faker();

    public String userTitle(){
        return faker.name().title();
    }

    public String userID(){
        return faker.idNumber().valid();
    }

    public String bodyText(){
        return faker.address().streetAddress();
    }


}
