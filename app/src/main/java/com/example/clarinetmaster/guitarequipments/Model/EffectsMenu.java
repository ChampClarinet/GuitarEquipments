package com.example.clarinetmaster.guitarequipments.Model;

import android.content.Context;

import java.util.ArrayList;

public class EffectsMenu {

    private static EffectsMenu mInstance;
    private static Context mContext;

    private static ArrayList<appCategory> categories = new ArrayList<>();

    public static EffectsMenu getInstance(Context context){
        if(mInstance == null) new EffectsMenu(context);
        return mInstance;
    }

    public EffectsMenu(Context context) {
        this.mContext = context;
        createCategory();
    }

    private void createCategory() {
        categories.clear();
        String distortion = "เอฟเฟคจำพวกเสียงแตกนั้นจัดได้ว่าเป็นส่วนสำคัญที่เอามาใช้ในการเล่นกีตาร์สไตล์ต่างๆ หลากหลาย โดยเฉพาะอย่างยิ่งแนว rock, hard rock และ metal ซึ่งวิธีการของเอฟเฟคจำพวกนี้ก็คือการบิดเบือนลักษณะสัญญาณเสียงกีตาร์ปกติและดันขึ้นไปจนกระทั่งถึงแตกพร่าในที่สุด เอฟเฟคตระกูลเสียงแตกนั้นมีอยู่ด้วยกันหลายแบบ อย่างเช่น overdrive/distortion (หรือเสียงแตกเลียนแบบหลอดสุญญากาศ), แตกพอประมาณแบบ overdrive/crunch, แตกพร่าๆ แบบ fuzz, และแตกโหดๆแบบ hi-gain ซึ่งแต่ละแบบนั้นก็มีลักษณะเสียงในแบบฉบับของตัวเองต่างกันไป";
        String chorus = "เป็นเอฟเฟคที่จะทำให้เสียงที่ได้เหมือนมีกีตาร์อีกตัวเล่นเสริมขึ้นมาด้วย";
        String reverb = "เป็นเอฟเฟคที่จะสร้างเสียงก้องให้กับเสียงกีตาร์ของเรา";
        String delay = "เป็นเอฟเฟคที่จะสร้างเสียงสะท้อนให้กับเสียงกีตาร์ของเรา สามารถใส่ลูกเล่นได้มากมาย";
        String multi = "เป็นเอฟเฟคที่รวมเอฟเฟคหลายๆ ตัวไว้ด้วยกัน";
        categories.add(new appCategory("Distortion", "distortion.png", distortion));
        categories.add(new appCategory("Chorus", "chorus.png", chorus));
        categories.add(new appCategory("Reverb", "reverb.png", reverb));
        categories.add(new appCategory("Delay", "delay.png", delay));
        categories.add(new appCategory("Multiple Effects", "multiple_effects.png", multi));
    }

    public static ArrayList<appCategory> getCategories() {
        return categories;
    }

}
