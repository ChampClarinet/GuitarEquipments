package com.example.clarinetmaster.guitarequipments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.clarinetmaster.guitarequipments.Adapters.RecyclerViewAdapter;
import com.example.clarinetmaster.guitarequipments.Model.EffectsMenu;
import com.example.clarinetmaster.guitarequipments.Model.GuitarBodyMenu;
import com.example.clarinetmaster.guitarequipments.Model.PickupsMenu;
import com.example.clarinetmaster.guitarequipments.Utilities.Utils;

public class CategoryListActivity extends AppCompatActivity {

    private final String TAG = CategoryListActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_types);

        String category = getIntent().getExtras().getString("Category");

        RecyclerViewAdapter adapter;

        if(category.equals("Body Types")){
            GuitarBodyMenu menu = GuitarBodyMenu.getInstance(this);
            adapter = new RecyclerViewAdapter(this, menu.getCategories());
        }
        else if(category.equals("Pickups")){
            PickupsMenu menu = PickupsMenu.getInstance(this);
            adapter = new RecyclerViewAdapter(this, menu.getCategories());
        }
        else{
            EffectsMenu menu = EffectsMenu.getInstance(this);
            adapter = new RecyclerViewAdapter(this, menu.getCategories());
        }

        RecyclerView categoriesRV = (RecyclerView) findViewById(R.id.body_recycler_view);

        categoriesRV.setHasFixedSize(true);

        categoriesRV.setLayoutManager(new LinearLayoutManager(this));

        categoriesRV.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_action_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.action_search){
            Log.i(TAG, "search");
            Utils.search(this);
        }

        return super.onOptionsItemSelected(item);
    }

}
