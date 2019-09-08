package com.kedaiit.yukmengenalhewan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Animal> list = new ArrayList<Animal>();
    private String title = "Mode List";


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.action_list:
//                setActionBarTitle("Yuk Mengenal Hewan");
//                showRecyclerList();
//                break;
//
//            case R.id.action_grid:
//                setActionBarTitle("Mode Grid");
//                break;
//
//            case R.id.action_cardview:
//                setActionBarTitle("Yuk Mengenal Hewan");
//                showRecyclerCardView();
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(AnimalData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListAnimalAdapter listAnimalAdapter = new ListAnimalAdapter(this);
        listAnimalAdapter.setListAnimal(list);
        rvCategory.setAdapter(listAnimalAdapter);
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewAnimalAdapter cardViewPresidentAdapter = new CardViewAnimalAdapter(this);
        cardViewPresidentAdapter.setListAnimal(list);
        rvCategory.setAdapter(cardViewPresidentAdapter);
    }
}
