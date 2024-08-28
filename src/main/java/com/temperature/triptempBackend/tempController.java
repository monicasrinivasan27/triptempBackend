package com.temperature.triptempBackend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/temp")
@CrossOrigin(origins = "http://localhost:3000")
public class tempController {
    @GetMapping("/tempdet")

    public String tempend(@RequestParam String dueDate) {
        //Getting the Year alone from the Input
        String  yearParam  = dueDate.substring(0, 4);


        return yearParam;}
    public int getTemp(@RequestParam int tempVal ) {
        int tempValChange=0;
        int tempValChange2=0;
        int tempValChange3=0;

        return tempValChange;


    }

    public int getPlace(@RequestParam String placeName ) {
        int placeNumber=0;
        int placeNumber2=0;
        int placeNumber3=0;
        return placeNumber;


    }
}
