package com.example.anushmp.eval2submissionjavaseptember2021;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Media {

    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
