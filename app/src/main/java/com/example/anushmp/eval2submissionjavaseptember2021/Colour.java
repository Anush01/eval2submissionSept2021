package com.example.anushmp.eval2submissionjavaseptember2021;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Colour {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("color")
    @Expose
    private String color;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
