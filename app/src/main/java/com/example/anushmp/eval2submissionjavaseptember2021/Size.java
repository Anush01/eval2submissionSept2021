package com.example.anushmp.eval2submissionjavaseptember2021;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Size {

    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("id")
    @Expose
    private Integer id;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
