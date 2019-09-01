package com.example.user.tictactoerebuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    int count;
    boolean game;
    int turn;
    int level;
    int va[]=new int[11];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 1; i <= 10; i++)
            va[i] = 0;

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);

        b1.setOnClickListener(mCorkyListener);
        b2.setOnClickListener(mCorkyListener);
        b3.setOnClickListener(mCorkyListener);
        b4.setOnClickListener(mCorkyListener);
        b5.setOnClickListener(mCorkyListener);
        b6.setOnClickListener(mCorkyListener);
        b7.setOnClickListener(mCorkyListener);
        b8.setOnClickListener(mCorkyListener);
        b9.setOnClickListener(mCorkyListener);
        b10.setOnClickListener(mCorkyListener);
        b11.setOnClickListener(mCorkyListener);

        turn = 1;
        count = 0;
        level=2;
        game = true;
    }
    private View.OnClickListener mCorkyListener = new View.OnClickListener() {
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.b1:
                    if (va[1]==0) {
                        if (turn == 1) {
                            turn = 2;
                            b1.setText("X");
                            va[1]=1;
                            count++;
                        }
                    }
                    break;
                case R.id.b2:
                    if (va[2]==0) {
                        if (turn == 1) {
                            turn = 2;
                            b2.setText("X");
                            va[2]=1;
                            count++;
                        }
                    }
                    break;
                case R.id.b3:
                    if (va[3]==0) {
                        if (turn == 1) {
                            turn = 2;
                            b3.setText("X");
                            va[3]=1;
                            count++;
                        }
                    }
                    break;
                case R.id.b4:
                    if (va[4]==0) {
                        if (turn == 1) {
                            turn = 2;
                            b4.setText("X");
                            va[4]=1;
                            count++;
                        }
                    }
                    break;
                case R.id.b5:
                    if (va[5]==0) {
                        if (turn == 1) {
                            turn = 2;
                            b5.setText("X");
                            va[5]=1;
                            count++;
                        }
                    }
                    break;
                case R.id.b6:
                    if (va[6]==0) {
                        if (turn == 1) {
                            turn = 2;
                            b6.setText("X");
                            va[6]=1;
                            count++;
                        }
                    }
                    break;
                case R.id.b7:
                    if (va[7]==0) {
                        if (turn == 1) {
                            turn = 2;
                            b7.setText("X");
                            va[7]=1;
                            count++;
                        }
                    }
                    break;
                case R.id.b8:
                    if (va[8]==0) {
                        if (turn == 1) {
                            turn = 2;
                            b8.setText("X");
                            va[8]=1;
                            count++;
                        }
                    }
                    break;
                case R.id.b9:
                    if (va[9]==0) {
                        if (turn == 1) {
                            turn = 2;
                            b9.setText("X");
                            va[9]=1;
                            count++;
                        }
                    }
                    break;
                case R.id.b10: {
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    b11.setEnabled(true);

                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    b5.setText("");
                    b6.setText("");
                    b7.setText("");
                    b8.setText("");
                    b9.setText("");

                    turn = 1;
                    count = 0;
                    game=true;
                    for (int i = 1; i <= 10; i++)
                        va[i] = 0;
                }
                break;
                case R.id.b11:
                    if(level==2){
                        level=3;
                        b11.setText("Level: Hard");
                    }
                    else if(level==1){
                        level=2;
                        b11.setText("Level: Medium");
                    }
                    else if(level==3){
                        level=1;
                        b11.setText("Level: Easy");
                    }
                    break;
                default:
                    break;
            }

            check();
            if(game) {
                if (turn == 2) {
                    int z = ai();
                    switch (z) {
                        case 1:
                            b1.setText("O");
                            turn = 1;
                            va[1] = 2;
                            count++;
                            break;
                        case 2:
                            b2.setText("O");
                            turn = 1;
                            va[2] = 2;
                            count++;
                            break;
                        case 3:
                            b3.setText("O");
                            turn = 1;
                            va[3] = 2;
                            count++;
                            break;
                        case 4:
                            b4.setText("O");
                            turn = 1;
                            va[4] = 2;
                            count++;
                            break;
                        case 5:
                            b5.setText("O");
                            turn = 1;
                            va[5] = 2;
                            count++;
                            break;
                        case 6:
                            b6.setText("O");
                            turn = 1;
                            va[6] = 2;
                            count++;
                            break;
                        case 7:
                            b7.setText("O");
                            turn = 1;
                            va[7] = 2;
                            count++;
                            break;
                        case 8:
                            b8.setText("O");
                            turn = 1;
                            va[8] = 2;
                            count++;
                            break;
                        case 9:
                            b9.setText("O");
                            turn = 1;
                            va[9] = 2;
                            count++;
                            break;
                        default:
                            break;
                    }
                    check();

                }

            }
        }
    };

    public int ai(){
        if(va[5]==0)
            return 5;
        // Blocking double chance creating
        if(level==3&&count==3&&va[5]==2){
            if(va[1]==1&&va[9]==1){
                return 2;
            }
            if(va[3]==1&&va[7]==1){
                return 4;
            }
            if(va[6]==1&&va[8]==1){
                return 9;
            }
            if(va[6]==1&&va[7]==1){
                return 9;
            }
            if(va[3]==1&&va[8]==1){
                return 9;
            }
        }
        if(va[1]==2&&(va[2]==va[1] || va[3]==va[1])){
            if(va[2]==0)
                return 2;
            else if(va[3]==0)
                return 3;
        }
        if(va[1]==0&&va[2]==2&&va[3]==va[2]){
            return 1;
        }
        if(va[4]==2&&(va[5]==va[4] || va[6]==va[4])){
            if(va[5]==0)
                return 5;
            else if(va[6]==0)
                return 6;
        }
        if(va[4]==0&&va[5]==2&&va[6]==va[5]){
            return 4;
        }
        if(va[7]==2&&(va[8]==va[7] || va[9]==va[7])){
            if(va[8]==0)
                return 8;
            else if(va[9]==0)
                return 9;
        }
        if(va[7]==0&&va[8]==2&&va[9]==va[8]){
            return 7;
        }
        if(va[1]==2&&(va[4]==va[1] || va[7]==va[1])){
            if(va[4]==0)
                return 4;
            else if(va[7]==0)
                return 7;
        }
        if(va[1]==0&&va[4]==2&&va[7]==va[4]){
            return 1;
        }
        if(va[2]==2&&(va[5]==va[2] || va[8]==va[2])){
            if(va[5]==0)
                return 5;
            else if(va[8]==0)
                return 8;
        }
        if(va[2]==0&&va[5]==2&&va[8]==va[5]){
            return 2;
        }
        if(va[3]==2&&(va[6]==va[3] || va[9]==va[3])){
            if(va[6]==0)
                return 6;
            else if(va[9]==0)
                return 9;
        }
        if(va[3]==0&&va[6]==2&&va[9]==va[6]){
            return 3;
        }
        if(va[1]==2&&(va[5]==va[1] || va[9]==va[1])){
            if(va[5]==0)
                return 5;
            else if(va[9]==0)
                return 9;
        }
        if(va[1]==0&&va[5]==2&&va[9]==va[5]){
            return 1;
        }
        if(va[3]==2&&(va[5]==va[3] || va[7]==va[3])){
            if(va[5]==0)
                return 5;
            else if(va[7]==0)
                return 7;
        }
        if(va[3]==0&&va[5]==2&&va[7]==va[5]){
            return 3;
        }

        //for blocking
        if(va[1]==1&&(va[2]==va[1] || va[3]==va[1])){
            if(va[2]==0)
                return 2;
            else if(va[3]==0)
                return 3;
        }
        if(va[1]==0&&va[2]==1&&va[3]==va[2]){
            return 1;
        }
        if(va[4]==1&&(va[5]==va[4] || va[6]==va[4])){
            if(va[5]==0)
                return 5;
            else if(va[6]==0)
                return 6;
        }
        if(va[4]==0&&va[5]==1&&va[6]==va[5]){
            return 4;
        }
        if(va[7]==1&&(va[8]==va[7] || va[9]==va[7])){
            if(va[8]==0)
                return 8;
            else if(va[9]==0)
                return 9;
        }
        if(va[7]==0&&va[8]==1&&va[9]==va[8]){
            return 7;
        }
        if(va[1]==1&&(va[4]==va[1] || va[7]==va[1])){
            if(va[4]==0)
                return 4;
            else if(va[7]==0)
                return 7;
        }
        if(va[1]==0&&va[4]==1&&va[7]==va[4]){
            return 1;
        }
        if(va[2]==1&&(va[5]==va[2] || va[8]==va[2])){
            if(va[5]==0)
                return 5;
            else if(va[8]==0)
                return 8;
        }
        if(va[2]==0&&va[5]==1&&va[8]==va[5]){
            return 2;
        }
        if(va[3]==1&&(va[6]==va[3] || va[9]==va[3])){
            if(va[6]==0)
                return 6;
            else if(va[9]==0)
                return 9;
        }
        if(va[3]==0&&va[6]==1&&va[9]==va[6]){
            return 3;
        }
        if(va[1]==1&&(va[5]==va[1] || va[9]==va[1])){
            if(va[5]==0)
                return 5;
            else if(va[9]==0)
                return 9;
        }
        if(va[1]==0&&va[5]==1&&va[9]==va[5]){
            return 1;
        }
        if(va[3]==1&&(va[5]==va[3] || va[7]==va[3])){
            if(va[5]==0)
                return 5;
            else if(va[7]==0)
                return 7;
        }
        if(va[3]==0&&va[5]==1&&va[7]==va[5]){
            return 3;
        }


        // for chance creating
        if(level!=1) {
            if (va[1] == 2 && (va[2] == 0 && va[2] == va[3])) {
                return 3;
            }
            if (va[1] == 2 && (va[4] == 0 && va[4] == va[7])) {
                return 7;
            }

            if (va[2] == 2 && (va[1] == 0 && va[1] == va[3])) {
                return 1;
            }
            if (va[3] == 2 && (va[6] == 0 && va[6] == va[9])) {
                return 9;
            }
            if (va[3] == 2 && (va[1] == 0 && va[1] == va[2])) {
                return 1;
            }
            if (va[4] == 2 && (va[1] == 0 && va[1] == va[7])) {
                return 1;
            }
            if (va[6] == 2 && (va[3] == 0 && va[3] == va[9])) {
                return 3;
            }
            if (va[7] == 2 && (va[1] == 0 && va[1] == va[4])) {
                return 1;
            }
            if (va[7] == 2 && (va[8] == 0 && va[8] == va[9])) {
                return 9;
            }
            if (va[8] == 2 && (va[7] == 0 && va[7] == va[8])) {
                return 7;
            }
            if (va[9] == 2 && (va[3] == 0 && va[3] == va[6])) {
                return 3;
            }
            if (va[9] == 2 && (va[7] == 0 && va[7] == va[8])) {
                return 7;
            }
        }
        if(va[1]==0)
            return 1;
        else if(va[3]==0)
            return 3;
        else if(va[7]==0)
            return 7;
        else if(va[9]==0)
            return 9;
        else if(va[2]==0)
            return 2;
        else if(va[4]==0)
            return 4;
        else if(va[6]==0)
            return 6;
        else if(va[8]==0)
            return 8;
        else if(va[9]==0)
            return 9;
        return 0;
    }

    public void check(){
        if(count!=0){
            b11.setEnabled(false);
        }
        if((va[1]!=0&&va[1]==va[2]&&va[1]==va[3])||(va[1]!=0&&va[1]==va[4]&&va[1]==va[7])||(va[1]!=0&&va[1]==va[5]&&va[1]==va[9])||(va[2]!=0&&va[5]==va[2]&&va[2]==va[8])||(va[3]!=0&&va[3]==va[6]&&va[3]==va[9])||(va[4]!=0&&va[4]==va[5]&&va[4]==va[6])||(va[7]!=0&&va[7]==va[8]&&va[7]==va[9])||(va[3]!=0&&va[3]==va[5]&&va[3]==va[7])){
            game = false;
            if(turn==1)
                Toast.makeText(MainActivity.this, "Computer wins", Toast.LENGTH_LONG).show();
            else if(turn==2)
                Toast.makeText(MainActivity.this, "You win", Toast.LENGTH_LONG).show();

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if (count == 9) {
            Toast.makeText(MainActivity.this, "Match Draw", Toast.LENGTH_LONG).show();
        }
    }
}
