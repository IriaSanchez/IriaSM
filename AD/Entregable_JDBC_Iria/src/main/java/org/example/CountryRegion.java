package org.example;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class CountryRegion {

    private ArrayList State;

    public CountryRegion() {
    }

    public CountryRegion(ArrayList state) {
        State = state;
    }

    public ArrayList getState() {
        return State;
    }

    @XmlElement(name = "State")
    public void setState(ArrayList state) {
        State = state;
    }

    @Override
    public String toString() {
        return "CountryRegion{" +
                "State=" + State +
                '}';
    }
}
