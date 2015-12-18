package com.example.qwerto.qwertocustomer;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class DiscoverActivity extends ActionBarActivity {
    RecyclerView discoverRecycler;
    private TextView toolbarheading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Typeface quicksand = Typeface.createFromAsset(getAssets(), "fonts/Quicksand-Regular.ttf");
        toolbarheading = (TextView) toolbar.findViewById(R.id.toolbarheading);
        toolbarheading.setTypeface(quicksand);


        discoverRecycler = (RecyclerView) findViewById(R.id.discoverrecycler);
        discoverRecycler.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        discoverRecycler.setLayoutManager(llm);
        
        DiscoverRecyclerAdapter adapter = new DiscoverRecyclerAdapter(createList(), getApplicationContext());
        discoverRecycler.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_discover, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    private List<DiscoverItem> createList() {

        List<DiscoverItem> result = new ArrayList<DiscoverItem>();

        DiscoverItem ci = new DiscoverItem("Rhythm", "Experience music like it's the 60's with this beautiful record player.", "#Audiophile #Rock&Roll", "Abraham carey, Barath, 202", "55 Recommendations",
                    "1968 Record Player", "Rs.9500",  R.drawable.rhythm_icon, R.drawable.record_player, R.drawable.like, R.drawable.recommendations);
        result.add(ci);

        return result;
    }
}
