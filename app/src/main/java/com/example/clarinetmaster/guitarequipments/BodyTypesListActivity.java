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
import com.example.clarinetmaster.guitarequipments.Model.GuitarBodyMenu;
import com.example.clarinetmaster.guitarequipments.Utilities.Utils;

public class BodyTypesListActivity extends AppCompatActivity {

    private final String TAG = BodyTypesListActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_types);

        RecyclerView categoriesRV = (RecyclerView) findViewById(R.id.body_recycler_view);

        categoriesRV.setHasFixedSize(true);

        categoriesRV.setLayoutManager(new LinearLayoutManager(this));

        GuitarBodyMenu menu = GuitarBodyMenu.getInstance(this);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, menu.getCategories());
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
