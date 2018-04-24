package ru.androidacademy.spb.gallerylist;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerView.LayoutManager layoutManager;

        if (getResources().getBoolean(R.bool.is_landscape))
        {
            layoutManager = new GridLayoutManager(this,2);
        }
        else
        {
            layoutManager = new LinearLayoutManager(this);
        }
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new ParrotsAdapter(generateParrots()));
    }

    @NonNull
    public static List<Parrot> generateParrots() {
        List<Parrot> parrots = new ArrayList<>();
        parrots.add(new Parrot("https://pp.userapi.com/c846016/v846016834/29f0d/J8T8BZb3Eg8.jpg"));
        parrots.add(new Parrot("https://sun9-6.userapi.com/c840637/v840637453/754bf/GMWJQItTkt8.jpg"));
        parrots.add(new Parrot("https://pp.userapi.com/c830408/v830408310/d56c7/L8AlyjdwbRk.jpg"));
        parrots.add(new Parrot("https://pp.userapi.com/c830408/v830408310/d56ac/ZNOKJxkdbJo.jpg"));
        parrots.add(new Parrot("https://pp.userapi.com/c830408/v830408310/d56ac/ZNOKJxkdbJo.jpg"));
        parrots.add(new Parrot("https://pp.userapi.com/c830408/v830408310/d56ac/ZNOKJxkdbJo.jpg"));
        parrots.add(new Parrot("https://pp.userapi.com/c830408/v830408310/d56ac/ZNOKJxkdbJo.jpg"));
        parrots.add(new Parrot("https://pp.userapi.com/c830408/v830408310/d56ac/ZNOKJxkdbJo.jpg"));
        parrots.add(new Parrot("https://pp.userapi.com/c830408/v830408310/d56ac/ZNOKJxkdbJo.jpg"));
        return parrots;
    }
}
