package com.example.clarinetmaster.guitarequipments.Model;

import android.content.Context;

import java.util.ArrayList;

public class MainMenu {

    private static MainMenu mInstance;
    private static Context mContext;

    private static ArrayList<appCategory> categories = new ArrayList<>();

    public static MainMenu getInstance(Context context){
        if(mInstance == null) new MainMenu(context);
        return mInstance;
    }

    public MainMenu(Context context) {
        this.mContext = context;
        createCategory();
    }

    private void createCategory() {
        categories.clear();
        categories.add(new appCategory("Body Types", "stratocaster.png"));
        categories.add(new appCategory("Pickups", "humbuckers.png"));
        categories.add(new appCategory("Effects", "Metal.png"));

    }

    public static ArrayList<appCategory> getCategories() {
        return categories;
    }

}
