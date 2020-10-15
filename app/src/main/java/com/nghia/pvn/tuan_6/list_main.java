package com.nghia.pvn.tuan_6;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

public class list_main extends Activity   {
    ListView list;
    String[] web =
            {
                    "アメヲマツ、",
                    "South of the Border",
                    "I'll be there",
                    "All About You",
                    "You Don't Know",
                    "Written In The Stars",
            };
    String[] cs =
            {
                    "美波",
                    "Ed Sheeran(feat. Camila Cabello & Cardi B) ",
                    "Jess glynne",
                    "Taeyeon",
                    "Katelyn Tarver",
                    "WENDY, John Legend",
            };
    Integer[] imageId =
            {
                    R.drawable.h1,
                    R.drawable.h2,
                    R.drawable.h3,
                    R.drawable.h4,
                    R.drawable.h5,
                    R.drawable.h6
            };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nhac);


        CustomList adapter = new CustomList(list_main.this, web, cs, imageId);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override

            public void onItemClick(AdapterView <? > parent, View view,
                                    int position, long id)
            {
                Toast.makeText(list_main.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
