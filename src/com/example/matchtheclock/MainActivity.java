package com.example.matchtheclock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void gamePlayFunc(View v)
    {
    	Intent i = new Intent(this,GamePlay.class);
    	startActivity(i);
    }
    
    public void highScoreFunc(View v)
    {
    	Intent i = new Intent(this,HighScore.class);
    	startActivity(i);
    }
    
    public void helpFunc(View v)
    {
    	Intent i = new Intent(this,Help.class);
    	startActivity(i);
    }
    

}
