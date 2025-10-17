package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */

public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    //Took help from GPT to write the following methods
    /**
     * This returns a boolean if city is in list
     * @param city the city to check
     * @return
     * Return True or False
     * */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    /**
     * This method just deletes a city in list or throw a exception
     * @param city the city to check
     * 
     * */
    public void delete(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException("City not found in the list");
        }
    }
    /**
     * This method just count total cities in array
     * @return
     * Return number of total cities in array
     * */
    public int countCities() {
        return cities.size();
    }
}
