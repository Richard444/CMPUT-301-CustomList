

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void deleteCityTest(){
        City testCity = new City("Montreal", "QB");
        list.addCity(testCity);
        int listSize = list.getCount();
        list.deleteCity(testCity);
        assertEquals(listSize-1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        City testCity = new City("Montreal", "QB");
        list.addCity(testCity);
        list.hasCity(testCity);
        assertTrue(list.hasCity(testCity));
    }
}
