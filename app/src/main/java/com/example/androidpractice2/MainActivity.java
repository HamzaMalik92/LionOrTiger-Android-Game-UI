package com.example.androidpractice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView textView;
  boolean isClicked = false;

  enum Player {
    ONE,
    TWO
  };

  Player currentPlayer = Player.ONE;


  Player [] PlayerChoices=new Player[9];

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //        textView=findViewById(R.id.helloWorld);
    //
    //        textView.setOnClickListener(view -> {
    //            if(!isClicked){
    //                textView.animate().rotation(360).alpha(0.5f);
    //                textView.animate().translationX(100).setDuration(1000);
    //
    //                isClicked=!isClicked;
    //            }else{
    //                textView.animate().rotation(0).alpha(1f);
    //                textView.animate().translationX(-100).setDuration(1000);
    //                isClicked=!isClicked;
    //            }
    //        });

  }

  public void imgViewIsClicked(View clickedImgView) {
    ImageView TappedImageView = (ImageView) clickedImgView;

    int imgTag=Integer.parseInt(clickedImgView.getTag().toString());
    PlayerChoices[imgTag]=currentPlayer;

    TappedImageView.setTranslationX(-2000);
    if (currentPlayer == Player.ONE) {
      TappedImageView.setImageResource(R.drawable.lion);
      currentPlayer = Player.TWO;
    } else {
      TappedImageView.setImageResource(R.drawable.tiger);
      currentPlayer = Player.ONE;
    }
    TappedImageView.animate().translationX(2000).alpha(1).rotation(3600).setDuration(500);


  }
}
