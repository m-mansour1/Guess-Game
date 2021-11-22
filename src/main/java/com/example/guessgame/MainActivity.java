package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    public String result = "";
    Button easy, medium, hard;
    public static String[] imagesURLs = new String[99];
    public static String[] alt = new String[99];

    public class DownloadTask extends AsyncTask<String, Void, String> {


        @Override
        protected String doInBackground(String... strings) {

            URL url;
            HttpURLConnection urlConnection = null;
            try {
                url = new URL(strings[0]);
               // url = new URL();

                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream is = urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(is);
                int data = reader.read();
                while (data != -1) {
                    char current = (char) data;
                    result += current;
                    data = reader.read();

                }
                return result;
            } catch (Exception e) {
                e.printStackTrace();
                return "Failed";
            }
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        easy = findViewById(R.id.easy);
        medium = findViewById(R.id.medium);
        hard = findViewById(R.id.hard);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Easy.class);
                startActivity(intent);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Medium.class);
                startActivity(intent);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Hard.class);
                startActivity(intent);
            }
        });

        DownloadTask task = new DownloadTask();
        try{
            result = task.execute("https://www.pcmag.com/picks/best-android-apps").get();
        }catch(Exception e){
            e.printStackTrace();
        }

        Pattern p = Pattern.compile("data-image-loader=\"(.*?)\"");
        Matcher m = p.matcher(result);
        int i = 0;
        while (m.find()) {
            if(i<99) {
                imagesURLs[i] = m.group(1);
                i++;
            }
        }

        p = Pattern.compile("alt=\"(.*?)Image\"");
        m = p.matcher(result);
        i=0;

        while (m.find()) {
            if(i<99) {
                alt[i] = m.group(1);
                i++;
            }
        }

    }
}