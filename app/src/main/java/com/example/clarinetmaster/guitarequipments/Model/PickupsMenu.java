package com.example.clarinetmaster.guitarequipments.Model;

import android.content.Context;

import java.util.ArrayList;

public class PickupsMenu {

    private static PickupsMenu mInstance;
    private static Context mContext;

    private static ArrayList<appCategory> categories = new ArrayList<>();

    public static PickupsMenu getInstance(Context context){
        if(mInstance == null) new PickupsMenu(context);
        return mInstance;
    }

    public PickupsMenu(Context context) {
        this.mContext = context;
        createCategory();
    }

    private void createCategory() {
        categories.clear();
        String single = "Single Coil เป็น pickup นิยมใช้ในกีตาร์แนว fender โดยเฉพาะทรง Stratocaster และ Telecaster จะให้เสียงที่เด้ง ใส แต่จะมีข้อเสียตรงที่สัญญาณจะเบาและโดนรบกวนได้ง่าย เหมาะสำหรับเล่นเพลงเบาๆเช่น Jazz, Pop, Vintage Rock";
        String hum = "Humbucker ทำขึ้นมาเพื่อแก้ปัญหาเสียงฮัม โดยใส่ตัว coil เข้าไป 2 อัน แล้วเชื่อมต่อขั้วแม่เหล็กคนละด้านกัน เสียงที่ได้จะหนักและหนากว่า Single Coil แต่จะมีเสียงที่ใสสู้แบบ Single Coil ไม่ได้ เหมาะสำหรับเล่นเพลงที่หนักขึ้นมาจากแบบ Single Coil หรือเพลงที่ต้องการเสียงที่นุ่มนวล";
        String active = "Active Pickups เป็น Single Coil Humbuckers ที่ต้องอาศัยไฟฟ้าจากถ่านในการเพิ่มแรงขับสัญญาณด้วย ซึ่งจะทำให้ได้เสียงที่แรงกว่า แบบไม่ใส่ถ่าน";
        categories.add(new appCategory("Single Coil", "single_coil.png", single));
        categories.add(new appCategory("Humbucker", "humbucker.png", hum));
        categories.add(new appCategory("Active Pickup", "active.png", active));
    }

    public static ArrayList<appCategory> getCategories() {
        return categories;
    }

}
