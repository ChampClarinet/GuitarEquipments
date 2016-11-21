package com.example.clarinetmaster.guitarequipments.Utilities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.clarinetmaster.guitarequipments.Model.appCategory;
import com.example.clarinetmaster.guitarequipments.R;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by CLARINETMASTER on 21/11/2559.
 */

public class Utils {

    public static Drawable getDrawableFromAssets(Context context, String pictureFileName) {
        AssetManager am = context.getAssets();
        try {
            InputStream stream = am.open(pictureFileName);
            Drawable drawable = Drawable.createFromStream(stream, null);
            return drawable;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void search(Context context) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.search_layout, null);
        EditText searchEditText = (EditText) layout.findViewById(R.id.search_edit_text);
        dialog.setView(layout);
        dialog.setTitle("Search");
        dialog.setNegativeButton("BACK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.setPositiveButton("GO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //search
            }
        });
        dialog.show();
    }

    public static void showContent(Context context, appCategory selectedContent){
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.content_dialog_layout, null);
        ImageView imageView = (ImageView) layout.findViewById(R.id.content_dialog_image_view);
        TextView textView = (TextView) layout.findViewById(R.id.content_dialog_desc);
        imageView.setImageDrawable(getDrawableFromAssets(context, selectedContent.getImageFileName()));
        textView.setText(selectedContent.getContent());
        textView.setMovementMethod(new ScrollingMovementMethod());
        dialog.setTitle(selectedContent.getName());
        dialog.setView(layout);
        dialog.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}
