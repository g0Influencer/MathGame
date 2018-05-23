package com.example.user.mathgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.sql.Time;

public class ActivityTwo extends AppCompatActivity {
    private MediaPlayer yes,no;

    TextView textView;
    TimerProgress timer;
    int number = 0;
    int range1 = 1;
    int range2 = 10;
    int range3 = 100;
    int range4 = 50;
    int range5 = 25;
    int a, b, c, d;
    int i = 0;
    int count = 0;
    Button button2;
    Button button3;
    TextView example;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        textView = (TextView) findViewById(R.id.timer);
        Log.i("GAME", "CREATED");
        example = (TextView) findViewById(R.id.example);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        yes = MediaPlayer.create(this, R.raw.yes);
        no = MediaPlayer.create(this, R.raw.no);





        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                switch (view.getId()) {

                    case R.id.button2:

                        number++;
                        if (number == 1) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 2) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 3) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);

                        }
                        if (number == 4) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 5) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 6) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 7) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 8) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 9) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 10) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 11) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 12) {
                        count++;
                        Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                        toast.show();
                        soundPlay(yes);
                    }
                        if (number == 13) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 14) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }

                        if (number == 15) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 16) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 17) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 18) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 19) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 20) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 21) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 22) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 23) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 24) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 25) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 26) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 27) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 28) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 29) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 30) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 31) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }





                        i++;

                        if (i == 1) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            example.setText(b + " - " + a + " = " + (b + a) + "?");
                        }
                        if (i == 2) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            example.setText(b + " - " + a + " = " + (b - a) + "?");
                        }
                        if (i == 3) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            example.setText(b + " - " + a + " = " + (b + a - b) + "?");
                        }
                        if (i == 4) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " + " + a + " - " + d + " = " + (b + a - d) + "?");
                        }
                        if (i == 5) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " + " + a + " - " + d + " = " + (a - a + d) + "?");
                        }
                        if (i == 6) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " + " + a + " - " + d + " = " + (b + d - a) + "?");
                        }
                        if (i == 7) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " * " + a + " + " + d + " = " + (b * a + d) + "?");
                        }
                        if (i == 8) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " * " + a + " + " + d + " = " + (b / a + d) + "?");
                        }
                        if (i == 9) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " * " + a + " + " + d + " = " + (b * a + d) + "?");
                        }
                        if (i == 10) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " * " + a + " - " + d + " = " + (b - a * d) + "?");
                        }
                        if (i == 11) {
                            int a = (range1 + (int) (Math.random() * range4))*2;
                            int b = (range1 + (int) (Math.random() * range4))*2;
                            example.setText( "(" + a + " + " + b + ")" + " / " + 2 + " = " + ((a + b) / 2) + " ? ");

                        }
                        if (i == 12) {
                            int a = (range1 + (int) (Math.random() * range4)) * 2;
                            int b = (range1 + (int) (Math.random() * range4)) * 2;
                            example.setText("("+  a + " + " + b + ")" + " / " + 2 + " = " + ((a + b) / 2) + " ? ");
                        }
                        if (i == 13) {
                            int a = (range1 + (int) (Math.random() * range4)) * 2;
                            int b = (range1 + (int) (Math.random() * range4)) * 2;
                            example.setText("(" + a + " + " + b + ")" + " / " + 2 + " = " + ((a - b) / 2) + " ? ");
                        }


                        if (i == 14) {
                            int a = range1 + (int) (Math.random() * range3);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            int c = range1 + (int) (Math.random() * range2);
                            example.setText((a + " + " + b) + " - " + d + " * " + c + " = " + ((a + b) - d * c) + " ? ");
                        }
                        if (i == 15) {
                            int a = range1 + (int) (Math.random() * range3);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            int c = range1 + (int) (Math.random() * range2);
                            example.setText((a + " + " + b) + " - " + d + " * " + c + " = " + ((a + b) - d * c) + " ? ");
                        }  if (i == 16) {
                        int a = range1 + (int) (Math.random() * range3);
                        int b = range1 + (int) (Math.random() * range2);
                        int d = range1 + (int) (Math.random() * range2);
                        int c = range1 + (int) (Math.random() * range2);
                        example.setText((a + " + " + b) + " - " + d + " * " + c + " = " + ((a * b) - d * c) + " ? ");
                    }

                        if (i == 17) {
                            int a = range1 + (int) (Math.random() * range3);
                            example.setText(a + " * " + a + " = " + (a * a) + " ? ");
                        }
                        if (i == 18) {
                            int a = range1 + (int) (Math.random() * range3);
                            example.setText(a + " * " + a + " = " + (a * a) + " ? ");
                        }
                        if (i == 19) {
                            int a = range1 + (int) (Math.random() * range3);
                            example.setText(a + " * " + a + " = " + (a * a + 2) + " ? ");

                        }
                        if (i == 20){
                            int a = range1 + (int) (Math.random() * range4);
                            int b  = a * a;
                            example.setText("√" + b + " =  " + ((int)Math.sqrt(b)) + " ? ");

                        }
                        if (i == 21){
                            int a = range1 + (int) (Math.random() * range4);
                            int b  =  a * a;
                            example.setText("√" + b + " = " + ((int)Math.sqrt(b)) + " ? ");

                        }  if (i == 22){
                        int a = range1 + (int) (Math.random() * range4);
                        int b  =  a * a;
                        example.setText("√" + b + " = " + ((int)Math.sqrt(b) + a) + " ? ");

                    }
                        if (i == 23){
                            int a = range1 + (int) (Math.random() * range4);
                            int b  =  a * a;
                            example.setText("√" + b + " = " + ((int)Math.sqrt(b)) + " ? ");

                        }
                        if (i == 24){
                            int a = range1 + (int) (Math.random() * range2);
                            int b = a*a*a;
                            example.setText(a + "^" + 3 + " = "  + (b) + " ? ");
                        }
                        if (i == 25){
                            int a = range1 + (int) (Math.random() * range2);
                            int b = a*a*a;
                            example.setText(a + "^" + 3 + " = "  + (b + 5) + " ? ");
                        }
                        if (i == 26){
                            int a = range1 + (int) (Math.random() * range2);
                            int b = a*a*a;
                            example.setText(a + "^" + 3 + " = "  + (b) + " ? ");

                        }
                        if (i == 27){
                            int a = range1 + (int) (Math.random() * range5);
                            example.setText(a + "*" + 11 + " = " + (a * 12) + " ? ");
                        }
                        if (i == 28){
                            int a = range1 + (int) (Math.random() * range5);
                            example.setText(a + "*" + 11 + " = " + (a * 14) + " ? ");
                        }
                        if (i == 29){
                            int a = range1 + (int) (Math.random() * range5);
                            example.setText(a + "*" + 11 + " = " + (a * 11) + " ? ");
                        }
                        if (i == 30){
                            int a = range1 + (int) (Math.random() * range5);
                            example.setText(a + "*" + 11 + " = " + (a * 11) + " ? ");
                        }


                        break;


                    case R.id.button3:
                        number++;
                        if (number == 1) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 2) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 3) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }

                        if (number == 4) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 5) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 6) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 7) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 8) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 9) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 10) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 11) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 12) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 13) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 14) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 15) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 16) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 17) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 18) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 19) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 20) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 21) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 22) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 23) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 24) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 25) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 26) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 27) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 28) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 29) {
                            count++;
                            Toast toast = Toast.makeText(ActivityTwo.this, "Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(yes);
                        }
                        if (number == 30) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }
                        if (number == 31) {
                            Toast toast = Toast.makeText(ActivityTwo.this, "Неправильно! Ваши баллы: " + count, Toast.LENGTH_SHORT);
                            toast.show();
                            soundPlay(no);
                        }



                        i++;
                        if (i == 1) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            example.setText(b + " - " + a + " = " + (b + a) + "?");
                        }
                        if (i == 2) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            example.setText(b + " - " + a + " = " + (b - a) + "?");
                        }
                        if (i == 3) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            example.setText(b + " - " + a + " = " + (b + a - b) + "?");
                        }
                        if (i == 4) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " + " + a + " - " + d + " = " + (b + a - d) + "?");
                        }
                        if (i == 5) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " + " + a + " - " + d + " = " + (a - a + d) + "?");
                        }
                        if (i == 6) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " + " + a + " - " + d + " = " + (b + a - d) + "?");
                        }
                        if (i == 7) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " * " + a + " + " + d + " = " + (b * a + d) + "?");
                        }
                        if (i == 8) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " * " + a + " + " + d + " = " + (b / a + d) + "?");
                        }
                        if (i == 9) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " * " + a + " + " + d + " = " + (b * a + d) + "?");
                        }
                        if (i == 10) {
                            int a = range1 + (int) (Math.random() * range2);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            example.setText(b + " * " + a + " - " + d + " = " + (b - a * d) + "?");
                        }
                        if (i == 11) {
                            int a = (range1 + (int) (Math.random() * range4))*2;
                            int b = (range1 + (int) (Math.random() * range4))*2;
                            example.setText( "(" + a + " + " + b + ")" + " / " + 2 + " = " + ((a + b) / 2) + " ? ");

                        }
                        if (i == 12) {
                            int a = (range1 + (int) (Math.random() * range4)) * 2;
                            int b = (range1 + (int) (Math.random() * range4)) * 2;
                            example.setText("("+  a + " + " + b + ")" + " / " + 2 + " = " + ((a + b) / 2) + " ? ");
                        }
                        if (i == 13) {
                            int a = (range1 + (int) (Math.random() * range4)) * 2;
                            int b = (range1 + (int) (Math.random() * range4)) * 2;
                            example.setText("(" + a + " + " + b + ")" + " / " + 2 + " = " + ((a - b) / 2) + " ? ");
                        }


                        if (i == 14) {
                            int a = range1 + (int) (Math.random() * range3);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            int c = range1 + (int) (Math.random() * range2);
                            example.setText((a + " + " + b) + " - " + d + " * " + c + " = " + ((a + b) - d * c) + " ? ");
                        }
                        if (i == 15) {
                            int a = range1 + (int) (Math.random() * range3);
                            int b = range1 + (int) (Math.random() * range2);
                            int d = range1 + (int) (Math.random() * range2);
                            int c = range1 + (int) (Math.random() * range2);
                            example.setText((a + " + " + b) + " - " + d + " * " + c + " = " + ((a + b) - d * c) + " ? ");
                        }  if (i == 16) {
                        int a = range1 + (int) (Math.random() * range3);
                        int b = range1 + (int) (Math.random() * range2);
                        int d = range1 + (int) (Math.random() * range2);
                        int c = range1 + (int) (Math.random() * range2);
                        example.setText((a + " + " + b) + " - " + d + " * " + c + " = " + ((a * b) - d * c) + " ? ");
                    }

                        if (i == 17) {
                            int a = range1 + (int) (Math.random() * range3);
                            example.setText(a + " * " + a + " = " + (a * a) + " ? ");
                        }
                        if (i == 18) {
                            int a = range1 + (int) (Math.random() * range3);
                            example.setText(a + " * " + a + " = " + (a * a) + " ? ");
                        }
                        if (i == 19) {
                            int a = range1 + (int) (Math.random() * range3);
                            example.setText(a + " * " + a + " = " + (a * a + 2) + " ? ");

                        }
                        if (i == 20){
                            int a = range1 + (int) (Math.random() * range4);
                            int b  = a * a;
                            example.setText("√" + b + " =  " + ((int)Math.sqrt(b)) + " ? ");

                        }
                        if (i == 21){
                            int a = range1 + (int) (Math.random() * range4);
                            int b  =  a * a;
                            example.setText("√" + b + " = " + ((int)Math.sqrt(b)) + " ? ");

                        }  if (i == 22){
                        int a = range1 + (int) (Math.random() * range4);
                        int b  =  a * a;
                        example.setText("√" + b + " = " + ((int)Math.sqrt(b) + a) + " ? ");

                    }
                        if (i == 23){
                            int a = range1 + (int) (Math.random() * range4);
                            int b  =  a * a;
                            example.setText("√" + b + " = " + ((int)Math.sqrt(b)) + " ? ");

                        }
                        if (i == 24){
                            int a = range1 + (int) (Math.random() * range2);
                            int b = a*a*a;
                            example.setText(a + "^" + 3 + " = "  + (b) + " ? ");
                        }
                        if (i == 25){
                            int a = range1 + (int) (Math.random() * range2);
                            int b = a*a*a;
                            example.setText(a + "^" + 3 + " = "  + (b + 5) + " ? ");
                        }
                        if (i == 26){
                            int a = range1 + (int) (Math.random() * range2);
                            int b = a*a*a;
                            example.setText(a + "^" + 3 + " = "  + (b) + " ? ");
                        }
                        if (i == 27){
                            int a = range1 + (int) (Math.random() * range5);
                            example.setText(a + "*" + 11 + " = " + (a * 12) + " ? ");
                        }
                        if (i == 28){
                            int a = range1 + (int) (Math.random() * range5);
                            example.setText(a + "*" + 11 + " = " + (a * 14) + " ? ");
                        }
                        if (i == 29){
                            int a = range1 + (int) (Math.random() * range5);
                            example.setText(a + "*" + 11 + " = " + (a * 11) + " ? ");
                        }
                        if (i == 30){
                            int a = range1 + (int) (Math.random() * range5);
                            example.setText(a + "*" + 11 + " = " + (a * 11) + " ? ");
                        }



                        break;


                }

            }
        };

        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
    }

    private void soundPlay(MediaPlayer sound) {
        sound.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("GAME", "RESUMED");
        timer = new TimerProgress();
        timer.execute(60);
    }

    @Override
    public void onBackPressed() {
        timer.cancel(true);
        super.onBackPressed();

    }

    class TimerProgress extends AsyncTask<Integer, Integer, Void> {
        @Override
        protected Void doInBackground(Integer... integers) {
            for (int i = 0; i < integers[0]; i++) {
                try {
                    Thread.sleep(1000);
                    publishProgress(integers[0] - i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            textView.setText(" " + values[0]);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Intent intent = new Intent(ActivityTwo.this, LastActivity.class);
            intent.putExtra("count", count);
            startActivity(intent);
            super.onPostExecute(aVoid);
        }
    }


}






