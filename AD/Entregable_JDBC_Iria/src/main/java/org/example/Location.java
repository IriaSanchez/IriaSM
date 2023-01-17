package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Location {

    private ArrayList CountryRegion;

    public Location(ArrayList countryRegion) {
        CountryRegion = countryRegion;
    }

    @XmlElement(name = "CountryRegion")
    public ArrayList getCountryRegion() {
        return CountryRegion;
    }

    public void setCountryRegion(ArrayList countryRegion) {
        CountryRegion = countryRegion;
    }

    @Override
    public String toString() {
        return "Location{" +
                "CountryRegion=" + CountryRegion +
                '}';
    }

    public Location() {
    }
}
