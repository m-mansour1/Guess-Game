package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Medium extends AppCompatActivity {
    private Images imgs = new Images();

    private TextView ScoreView;
    private ImageView imageView;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;
    private TextView message;

    private String Answer;
    private int Score = 0;
    private int imageNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);

        ScoreView= (TextView)findViewById(R.id.score);
        imageView = (ImageView)findViewById(R.id.image);
        choice1 = (Button)findViewById(R.id.choice1);
        choice2 = (Button)findViewById(R.id.choice2);
        choice3 = (Button)findViewById(R.id.choice3);
        choice4 = (Button)findViewById(R.id.choice4);
        message = (TextView)findViewById(R.id.message);

        updateImage();

        choice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (choice1.getText() == Answer){
                    Score = Score + 2;
                    updateScore(Score);
                    Toast.makeText(Medium.this, "CORRECT", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Medium.this, "WRONG", Toast.LENGTH_SHORT).show();
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
                if (choice2.getText() == Answer){
                    Score = Score + 2;
                    updateScore(Score);
                    Toast.makeText(Medium.this, "CORRECT", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Medium.this, "WRONG", Toast.LENGTH_SHORT).show();
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
                if (choice3.getText() == Answer){
                    Score = Score + 2;
                    updateScore(Score);
                    Toast.makeText(Medium.this, "CORRECT", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Medium.this, "WRONG", Toast.LENGTH_SHORT).show();
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
                if (choice4.getText() == Answer){
                    Score = Score + 2;
                    updateScore(Score);
                    Toast.makeText(Medium.this, "CORRECT", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Medium.this, "WRONG", Toast.LENGTH_SHORT).show();
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