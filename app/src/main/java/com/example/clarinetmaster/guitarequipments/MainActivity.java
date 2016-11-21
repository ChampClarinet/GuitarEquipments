package com.example.clarinetmaster.guitarequipments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.clarinetmaster.guitarequipments.Adapters.CategoryRecyclerAdapter;
import com.example.clarinetmaster.guitarequipments.Model.CategoryMenu;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView categoriesRV = (RecyclerView) findViewById(R.id.category_recycler_view);
        
        categoriesRV.setHasFixedSize(true);

        categoriesRV.setLayoutManager(new LinearLayoutManager(this));

        CategoryMenu categoryMenu = CategoryMenu.getInstance(this);

        CategoryRecyclerAdapter adapter = new CategoryRecyclerAdapter(this, categoryMenu.getCategories());
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
        }

        return super.onOptionsItemSelected(item);
    }

}
