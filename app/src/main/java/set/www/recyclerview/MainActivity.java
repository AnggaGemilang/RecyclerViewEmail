package set.www.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DataEmail dataEmail;

    List<DataEmail> dataEmailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataEmailList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataEmailList.add(
                new DataEmail(
                        "Sam",
                        "Weekend Adventure",
                        "Let's go fishing with john and other. We will do ...",
                        "10 : 42",
                        "S",
                            R.drawable.rounded_sam
                        ));
        dataEmailList.add(
                new DataEmail(
                        "Facebook",
                        "James, you have 1 new notification",
                        "A lot has happened on Facebook since",
                        "16 : 04",
                        "F",
                        R.drawable.rounded_facebook));
        dataEmailList.add(
                new DataEmail(
                        "Google+",
                        "Top Suggested Google+ pages for you",
                        "Top Suggested Google+ pages for you",
                        "18 : 44",
                        "S",
                        R.drawable.rounded_google));
        dataEmailList.add(
                new DataEmail(
                        "Twitter",
                        "Follow T-Mobile, Samsung mobile U",
                        "James, some people you may know",
                        "20 : 04",
                        "T",
                        R.drawable.rounded_twitter));

        dataEmailList.add(
                new DataEmail(
                        "Pinterest Weekly",
                        "Pins you'll love!",
                        "Have you seen this Pins yet? Pinterest",
                        "09 : 04",
                        "P",
                        R.drawable.rounded_pinterest));

        dataEmailList.add(
                new DataEmail(
                        "Josh",
                        "Going Lunch",
                        "Don't forget our lunch at 3PM in Pizza Hut",
                        "01 : 04",
                        "J",
                        R.drawable.rounded_josh));

        dataEmailList.add(
                new DataEmail(
                        "Sabihis",
                        "Assalamualaikum wr, wb",
                        "Hayu ngaji akhi",
                        "16 : 00",
                        "S",
                        R.drawable.rounded_sabihis));

        //creating recyclerview adapter
        AdapterEmail adapter = new AdapterEmail(this, dataEmailList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}
