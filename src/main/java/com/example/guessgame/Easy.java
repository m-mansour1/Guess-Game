package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Easy extends AppCompatActivity {

    private Images imgs = new Images();
    private Bitmap mIcon_val;

    private ImageView imageview;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;
    private TextView message;

    private String Answer;
    private int imageNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        String[] array=MainActivity.imagesURLs;

        for(int i=0;i<99;i++){
            Log.i("element: ",array[i]);
        }

        imageview = (ImageView) findViewById(R.id.question);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        choice4 = (Button) findViewById(R.id.choice4);
        message = (TextView) findViewById(R.id.message);

        updateImage();

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice1.getText() == Answer){
                    Toast.makeText(Easy.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageview.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("GAME IS OVER\n");
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(50);

                    }else {
                        updateImage();
                    }

                }else{
                    Toast.makeText(Easy.this, "WRONG", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageview.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("GAME IS OVER\n");
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(50);

                    }else {
                        updateImage();
                    }

                }
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice2.getText() == Answer){

                    Toast.makeText(Easy.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageview.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("GAME IS OVER\n");
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(50);

                    }else {
                        updateImage();
                    }

                }else{
                    Toast.makeText(Easy.this, "WRONG", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageview.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("GAME IS OVER\n");
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(50);

                    }else {
                        updateImage();
                    }

                }
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice3.getText() == Answer){

                    Toast.makeText(Easy.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageview.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("GAME IS OVER\n");
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(50);

                    }else {
                        updateImage();
                    }

                }else{
                    Toast.makeText(Easy.this, "WRONG", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageview.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("GAME IS OVER\n");
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(50);

                    }else {
                        updateImage();
                    }

                }
            }
        });
        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(choice4.getText() == Answer){
                    Toast.makeText(Easy.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageview.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("GAME IS OVER\n");
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(50);

                    }else {
                        updateImage();
                    }

                }else{
                    Toast.makeText(Easy.this, "WRONG", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageview.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("GAME IS OVER\n");
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(50);

                    }else {
                        updateImage();
                    }

                }
            }
        });

    }

    private class DownloadImageFromInternet extends AsyncTask<String, Void, Bitmap> {
        protected Bitmap doInBackground(String... urls) {
            String imageURL=urls[0];
            Bitmap bimage=null;
            try {
                InputStream in=new java.net.URL(imageURL).openStream();
                bimage=BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bimage;
        }
    }
    private void updateImage(){
        try{
            String str= imgs.getImageUrl(imageNumber);
            DownloadImageFromInternet task = new DownloadImageFromInternet();
            Bitmap img = task.execute(str).get();
            imageview.setImageBitmap(img);
        }catch(Exception e){
            e.printStackTrace();
        }
        choice1.setText(imgs.getChoices1(imageNumber));
        choice2.setText(imgs.getChoices2(imageNumber));
        choice3.setText(imgs.getChoices3(imageNumber));
        choice4.setText(imgs.getChoices4(imageNumber));

        Answer = imgs.getCorrectAnswer(imageNumber);

            imageNumber++;


    }

}