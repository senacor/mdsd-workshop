package com.senacor.mdsd.hh.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {
    private String greeting;
    private String name;

    public Greeting() {
    }

    public Greeting(String greeting, String name) {
        this.greeting = greeting;
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
