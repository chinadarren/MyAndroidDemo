package com.example.MyAndroidDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnGridLayout:
                setContentView(R.layout.gird_layout);
                break;
            case R.id.btnReturn:
                setContentView(R.layout.main);
            break;
        }
    }

}
