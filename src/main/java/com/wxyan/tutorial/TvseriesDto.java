package com.wxyan.tutorial;

import java.util.Date;

public class TvseriesDto {
    private int id;
    private String name;
    private int seasonCount;
    private Date origionRelease;

    public TvseriesDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasonCount() {
        return seasonCount;
    }

    public void setSeasonCount(int seasonCount) {
        this.seasonCount = seasonCount;
    }

    public Date getOrigionRelease() {
        return origionRelease;
    }

    public void setOrigionRelease(Date origionRelease) {
        this.origionRelease = origionRelease;
    }

    public TvseriesDto(int id, String name, int seasonCount, Date origionRelease) {
        this.id = id;
        this.name = name;
        this.seasonCount = seasonCount;
        this.origionRelease = origionRelease;
    }
}
