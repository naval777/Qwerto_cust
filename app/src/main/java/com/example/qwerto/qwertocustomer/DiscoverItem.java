package com.example.qwerto.qwertocustomer;

/**
 * Created by adarsh on 11/12/15.
 */
public class DiscoverItem {
    protected String recommendations;
    protected String name;
    protected String hashtags;
    protected String likes;
    protected String description;
    protected String productname;
    protected String price;
    protected int profilepic;
    protected int itempic;
    protected int fieldimage1;
    protected int fieldimage2;

    public DiscoverItem(){};
    public DiscoverItem(String dname, String ddescription, String dhashtags, String dlikes, String drecommendations, String dproductname, String dprice, int dprofilepic, int ditempic, int dfieldimage1, int dfieldimage2) {
        this.name = dname;
        this.description = ddescription;
        this.hashtags = dhashtags;
        this.likes = dlikes;
        this.recommendations = drecommendations;
        this.productname = dproductname;
        this.price = dprice;
        this.profilepic = dprofilepic;
        this.itempic = ditempic;
        this.fieldimage1 = dfieldimage1;
        this.fieldimage2 = dfieldimage2;
    };



    protected static final String NAME_PREFIX = "Name_";
    protected static final String SURNAME_PREFIX = "Surname_";
    protected static final String EMAIL_PREFIX = "email_";

    public String getItemName(){
        return name;
    }

    public String getItemDescription(){
        return description;
    }
}

