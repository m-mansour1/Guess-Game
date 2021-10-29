package com.example.guessgame;

import android.os.AsyncTask;
import android.os.Bundle;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Images {

//    private String Choices[][] = new String[99][4];
//    for(int i =0;i<99;i++){
//        for(int j=0;j<4;j++){
//
//        }
//    }

    private String Choices[][] ={
            {MainActivity.alt[1],MainActivity.alt[13],MainActivity.alt[2],MainActivity.alt[0]},
            {MainActivity.alt[18],MainActivity.alt[4],MainActivity.alt[1],MainActivity.alt[3]},
            {MainActivity.alt[11],MainActivity.alt[2],MainActivity.alt[22],MainActivity.alt[23]},
            {MainActivity.alt[3],MainActivity.alt[0],MainActivity.alt[2],MainActivity.alt[32]},

            {MainActivity.alt[1],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[4]},
            {MainActivity.alt[2],MainActivity.alt[4],MainActivity.alt[5],MainActivity.alt[32]},
            {MainActivity.alt[3],MainActivity.alt[6],MainActivity.alt[2],MainActivity.alt[31]},
            {MainActivity.alt[7],MainActivity.alt[0],MainActivity.alt[9],MainActivity.alt[30]},

            {MainActivity.alt[1],MainActivity.alt[20],MainActivity.alt[2],MainActivity.alt[8]},
            {MainActivity.alt[17],MainActivity.alt[30],MainActivity.alt[9],MainActivity.alt[63]},
            {MainActivity.alt[18],MainActivity.alt[10],MainActivity.alt[52],MainActivity.alt[43]},
            {MainActivity.alt[11],MainActivity.alt[40],MainActivity.alt[2],MainActivity.alt[53]},

            {MainActivity.alt[1],MainActivity.alt[0],MainActivity.alt[2],MainActivity.alt[12]},
            {MainActivity.alt[1],MainActivity.alt[0],MainActivity.alt[13],MainActivity.alt[3]},
            {MainActivity.alt[1],MainActivity.alt[14],MainActivity.alt[2],MainActivity.alt[3]},
            {MainActivity.alt[15],MainActivity.alt[0],MainActivity.alt[2],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[18],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[19],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[42],MainActivity.alt[20]},
            {MainActivity.alt[31],MainActivity.alt[30],MainActivity.alt[21],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[22],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[23],MainActivity.alt[80],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[24]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[25],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[26],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[27],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[28]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[29],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[30],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[32]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[33],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[34],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[35],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[36]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[37],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[38],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[39],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[40]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[41],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[42],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[43],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[44]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[45],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[46],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[47],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[48]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[49],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[50],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[51],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[52]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[53],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[54],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[55],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[56]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[57],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[58],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[59],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[60]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[61],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[62],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[63],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[64]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[65],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[66],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[67],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[68]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[69],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[70],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[71],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[72]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[73],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[74],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[75],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[76]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[77],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[78],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[79],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[80]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[81],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[82],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[83],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[84]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[85],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[86],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[87],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[88]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[89],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[90],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[91],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[92]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[93],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[94],MainActivity.alt[2],MainActivity.alt[16]},
            {MainActivity.alt[95],MainActivity.alt[0],MainActivity.alt[17],MainActivity.alt[3]},

            {MainActivity.alt[21],MainActivity.alt[44],MainActivity.alt[2],MainActivity.alt[96]},
            {MainActivity.alt[31],MainActivity.alt[0],MainActivity.alt[97],MainActivity.alt[3]},
            {MainActivity.alt[16],MainActivity.alt[98],MainActivity.alt[2],MainActivity.alt[16]},

    };






    private String CorrectAnswers[] = MainActivity.alt;

    public String getImageUrl(int a){
        String image = MainActivity.imagesURLs[a];
        return image;
    }

    public String getChoices1(int a){
        String choice1 = Choices[a][0];
        return choice1;
    }
    public String getChoices2(int a){
        String choice2 = Choices[a][1];
        return choice2;
    }
    public String getChoices3(int a){
        String choice3 = Choices[a][2];
        return choice3;
    }
    public String getChoices4(int a){
        String choice4 = Choices[a][3];
        return choice4;
    }

    public String getCorrectAnswer(int a){
        String correctAns = CorrectAnswers[a];

        return correctAns;
    }


}
