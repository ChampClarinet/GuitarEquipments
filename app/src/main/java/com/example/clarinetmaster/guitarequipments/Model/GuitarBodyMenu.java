package com.example.clarinetmaster.guitarequipments.Model;

import android.content.Context;

import java.util.ArrayList;

public class GuitarBodyMenu {

    private static GuitarBodyMenu mInstance;
    private static Context mContext;

    private static ArrayList<appCategory> categories = new ArrayList<>();

    public static GuitarBodyMenu getInstance(Context context){
        if(mInstance == null) new GuitarBodyMenu(context);
        return mInstance;
    }

    public GuitarBodyMenu(Context context) {
        this.mContext = context;
        createCategory();
    }

    private void createCategory() {
        categories.clear();
        String strat = "Stratocaster หรือทรงมาตรฐาน (Strat) เป็นทรงตลาดที่ไม่ว่าร้านกีต้าร์ที่ไหนก็มีขาย บางผู้ผลิตก็การทำหัวกีต้าร์ให้แตกต่างกัน แต่ว่ายังเป็นทรงเดิม เจ้าของผู้คิดค้นรูปทรงกีต้าร์นี้ คือ Fender ออกแบบโดย Leo Fender ร่วมกับ George Fullerton และ Freddie Tavares ในปี 1954 ซึ่งถือว่าเป็นทรงกีต้าร์ที่เก่าแก่ และคลาสสิค สามารถเล่นได้กับทุกรูปแบบเพลง";
        String tele = "Telecaster (Tele) ทรงนี้แต่เดิมชื่อ Broadcaster ออกมาในปี 1950 ตัวกีต้าร์ทรงนี้จะมีความโค้งมน แลความสมดุล โดยผู้ผลิตก็เป็น Fender อีกแล้ว แต่สไตล์เพลงที่เหมาะกับกีต้าร์ทรงนี้จะเป็นแนวพวก Country, Rock และ Jazz";
        String les_paul = "Les Paul เจ้าของคือ Gibson ซึ่งเป็นที่นิยมพอๆกับสองทรงด้านบน ออกแบบโดย Ted McCarty ร่วมกับ Les Paul ถูกขายครั้งแรกในปี 1952";
        String sg = "SG เป็นกีต้าร์ที่มีน้ำหนักเบา คอบาง ตัวแบน เปิดตัวในปี 1961 โดย Gibson";
        categories.add(new appCategory("Stratocaster", "stratocaster.png", strat));
        categories.add(new appCategory("Telecaster", "telecaster.png", tele));
        categories.add(new appCategory("Les Paul", "les_paul.png", les_paul));
        categories.add(new appCategory("SG", "sg.png", sg));
    }

    public static ArrayList<appCategory> getCategories() {
        return categories;
    }

}
