package com.example.demo.Controller;




import com.example.demo.Repository.HotelRepository;
import com.example.demo.model.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/all")
    public List<Hotel> getAll() {

        //use this code demonstrate listener effect
        /*Hotel marriot = new Hotel("130", "Marriot", 150,
                new Address("Paris" , "France"),
                Arrays.asList(new Review("John", 8, false),
                        new Review("Smith", 9, true)));

        ArrayList<Hotel> hotelss = new ArrayList<>();
        hotelss.add(marriot);
        this.hotelRepository.saveAll(hotelss);*/

        List<Hotel> hotels = this.hotelRepository.findAll();
        return hotels;
    }

}
