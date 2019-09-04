package com.wxyan.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {
    @GetMapping
    public List<TvseriesDto> getAll(){
        List<TvseriesDto> list = new ArrayList<>();
        Calendar calender = Calendar.getInstance();
        calender.set(2016,Calendar.OCTOBER,2,0,0);
        list.add(new TvseriesDto(1,"WestWorld",1,calender.getTime()));
        return  list;
    }
}
