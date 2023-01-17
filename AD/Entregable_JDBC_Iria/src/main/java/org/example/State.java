package org.example;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class State {

    private ArrayList City;

    public State() {
    }

    public State(ArrayList city) {
        City = city;
    }

    @XmlElement(name = "City")
    public ArrayList getCity() {
        return City;
    }

    public void setCity(ArrayList city) {
        City = city;
    }

    @Override
    public String toString() {
        return "State{" +
                "City=" + City +
                '}';
    }


}
