package com.example.clarinetmaster.guitarequipments.Model;

import android.content.Context;

import java.util.ArrayList;

public class CategoryMenu {

    private static CategoryMenu mInstance;
    private static Context mContext;

    private static ArrayList<appCategory> categories = new ArrayList<>();

    public static CategoryMenu getInstance(Context context){
        if(mInstance == null) new CategoryMenu(context);
        return mInstance;
    }

    public CategoryMenu(Context context) {
        this.mContext = context;
        createCategory();
    }

    private void createCategory() {
        categories.clear();
        categories.add(new appCategory("Body Types", "stratocaster.png"));
        categories.add(new appCategory("Pickups", "humbuckers.png"));
        categories.add(new appCategory("Effects", "effects.png"));
        /*String name = "Body Types";
        String image = "stratocaster.png";
        categories.add(new appCategory(name, image));*/

    }

    public static ArrayList<appCategory> getCategories() {
        return categories;
    }

}
