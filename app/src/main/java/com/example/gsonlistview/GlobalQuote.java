package com.example.gsonlistview;

import com.google.gson.annotations.SerializedName;

public class GlobalQuote {
    @SerializedName("Global Quote") private Stock globalQuote;

    public void setGlobalQuote(Stock s){
        this.globalQuote = s;
    }

    public Stock getGlobalQuote(){
        return this.globalQuote;
    }

}
