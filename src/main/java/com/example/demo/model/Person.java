package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;
    private final String last_name;
    private final String email;
    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name,
                  @JsonProperty("last_name") String last_name, @JsonProperty("email") String email) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }
}
