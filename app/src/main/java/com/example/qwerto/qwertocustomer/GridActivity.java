package com.example.qwerto.qwertocustomer;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class GridActivity extends ActionBarActivity {
    RecyclerView discoverRecycler;
    private TextView toolbarheading;
    public int RecyclerHeight;
    private TextView[] texts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
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
        discoverRecycler.setNestedScrollingEnabled(false);
        // Toast.makeText(getApplicationContext(), String.valueOf(discovercard.getHeight()),Toast.LENGTH_LONG).show();
        List<DiscoverItem> listdata = createList();
        discoverRecycler.getLayoutParams().height = 0;
//        LinearLayoutManager llm = new LinearLayoutManager(this);
//        llm.setOrientation(LinearLayoutManager.VERTICAL);
        discoverRecycler.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        GridRecyclerAdapter adapter = new GridRecyclerAdapter(listdata, GridActivity.this);
        discoverRecycler.setAdapter(adapter);
        // discoverRecycler.getLayoutParams().height = 2000;

//        for(int i=0; i<listdata.size(); i++)
//        {
//            int v = discoverRecycler.getC();
//            // int height = discoverRecycler.getChildAt(i).getHeight();
//            Toast.makeText(getApplicationContext(), String.valueOf(v), Toast.LENGTH_LONG).show();
//        }
        texts = new TextView[]{
                (TextView) findViewById(R.id.profiletitle),
                (TextView) findViewById(R.id.profileaddress),
                (TextView) findViewById(R.id.profilephone),
                (TextView) findViewById(R.id.profiledesc),
                (TextView) findViewById(R.id.profilelikes),
                (TextView) findViewById(R.id.profilerecommended),
                (TextView) findViewById(R.id.profilefollowers)
        };
        formattxt(texts);
    }

    private void formattxt(TextView[] texts) {
        for(int i=0;i<texts.length; i++)
        {
            Typeface quicksand = Typeface.createFromAsset(getAssets(), "fonts/Quicksand-Regular.ttf");
            texts[i].setTypeface(quicksand);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_grid) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<DiscoverItem> createList() {

        List<DiscoverItem> result = new ArrayList<DiscoverItem>();

        DiscoverItem ci = new DiscoverItem("Rhythm", "Experience music like it's the 60's with this beautiful record player.", "#Audiophile #Rock&Roll", "Abraham carey, Barath, 202", "55 Recommendations",
                "1968 Record Player", "Rs.9500",  R.drawable.rhythm_icon, R.drawable.record_player, R.drawable.like, R.drawable.recommendations);
        result.add(ci);
        result.add(ci);

        return result;
    }
}
