package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;

public class Hard extends AppCompatActivity {

    private Images imgs = new Images();

    private TextView ScoreView;
    private ImageView imageView;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;

    private TextView ntimer;
    private TextView message;

    private String Answer;
    private int Score = 0;
    private int imageNumber = 0;
    int secondsRemaining = 30;

    CountDownTimer timer = new CountDownTimer(30000,1000) {
        @Override
        public void onTick(long l) {
            secondsRemaining--;
            String secondsView;
            if(secondsRemaining >= 10) {
                secondsView = Integer.toString(secondsRemaining);
            }else{
                secondsView = "0" + Integer.toString(secondsRemaining);
            }
            ntimer.setText("00:"+secondsView);
        }

        @Override
        public void onFinish() {
            choice1.setEnabled(false);
            choice2.setEnabled(false);
            choice3.setEnabled(false);
            choice4.setEnabled(false);
            message.setTextColor(Color.RED);
            message.setTextSize(20);
            message.setText("Times is up! "
                    +"\nYour Score is "+ Score);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);

        timer.start();
        message = (TextView)findViewById(R.id.message);
        ntimer = (TextView)findViewById(R.id.ntimer);

        ScoreView= (TextView)findViewById(R.id.score);
        imageView = (ImageView)findViewById(R.id.image);
        choice1 = (Button)findViewById(R.id.choice1);
        choice2 = (Button)findViewById(R.id.choice2);
        choice3 = (Button)findViewById(R.id.choice3);
        choice4 = (Button)findViewById(R.id.choice4);

        updateImage();
        choice1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                CheckNumber(imageNumber);
                if (choice1.getText() == Answer){
                    Score = Score + 2;
                    updateScore(Score);
                    Toast.makeText(Hard.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageView.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("          GAME IS OVER\n" +
                                "          Your Score is "+ Score);
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(30);

                    }else{
                        updateImage();
                    }

                }else {
                    Score = Score -1;
                    updateScore(Score);
                    Toast.makeText(Hard.this, "WRONG", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageView.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("          GAME IS OVER\n" +
                                "          Your Score is "+ Score);
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(30);

                    }else{
                        updateImage();
                    }
                }
            }

        });
        choice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                CheckNumber(imageNumber);
                if (choice2.getText() == Answer){
                    Score = Score + 2;
                    updateScore(Score);
                    Toast.makeText(Hard.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageView.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("          GAME IS OVER\n" +
                                "          Your Score is "+ Score);
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(30);

                    }else{
                        updateImage();
                    }

                }else {
                    Score = Score -1;
                    updateScore(Score);
                    Toast.makeText(Hard.this, "WRONG", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageView.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("          GAME IS OVER\n" +
                                "          Your Score is "+ Score);
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(30);

                    }else{
                        updateImage();
                    }
                }
            }
        });
        choice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                CheckNumber(imageNumber);
                if (choice3.getText() == Answer){
                    Score = Score + 2;
                    updateScore(Score);
                    Toast.makeText(Hard.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageView.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("          GAME IS OVER\n" +
                                "          Your Score is "+ Score);
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(30);

                    }else{
                        updateImage();
                    }
                }else {
                    Score = Score -1;
                    updateScore(Score);
                    Toast.makeText(Hard.this, "WRONG", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageView.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("          GAME IS OVER\n" +
                                "          Your Score is "+ Score);
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(30);

                    }else{
                        updateImage();
                    }
                }
            }
        });
        choice4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                CheckNumber(imageNumber);
                if (choice4.getText() == Answer){
                    Score = Score + 2;
                    updateScore(Score);
                    Toast.makeText(Hard.this, "CORRECT", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageView.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("          GAME IS OVER\n" +
                                "          Your Score is "+ Score);
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(30);

                    }else{
                        updateImage();
                    }
                }else {
                    Score = Score -1;
                    updateScore(Score);
                    Toast.makeText(Hard.this, "WRONG", Toast.LENGTH_SHORT).show();
                    if(imageNumber == 99) {
                        choice1.setEnabled(false);
                        choice2.setEnabled(false);
                        choice3.setEnabled(false);
                        choice4.setEnabled(false);
                        imageView.setVisibility(View.GONE);
                        choice1.setVisibility(View.GONE);
                        choice2.setVisibility(View.GONE);
                        choice3.setVisibility(View.GONE);
                        choice4.setVisibility(View.GONE);
                        message.setText("          GAME IS OVER\n" +
                                "          Your Score is "+ Score);
                        message.setTextColor(Color.BLACK);
                        message.setTextSize(30);

                    }else{
                        updateImage();
                    }
                }
            }
        });
    }



    private void CheckNumber(int imageNumber){
        if(imageNumber == 99){
            if(timer != null) {
                timer.cancel();
                timer = null;
            }
        }
    }

    public class ImageDownloader extends AsyncTask<String, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String...urls){

            try{
                URL url = new URL(urls[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

                InputStream in = urlConnection.getInputStream();
                Bitmap downloadedImage = BitmapFactory.decodeStream(in);

                return downloadedImage;
            }catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
    }
    private void updateImage(){
        ImageDownloader task = new ImageDownloader();
        Bitmap downloadedImage;

        try{
            downloadedImage = task.execute(imgs.getImageUrl(imageNumber)).get();
            imageView.setImageBitmap(downloadedImage);
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


    private void updateScore(int point) {
        ScoreView.setText("" + Score);

    }


}