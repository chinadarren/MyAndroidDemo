package com.example.MyAndroidDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MyActivity extends Activity {
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;

    /**
     * Called when the activity is first created.
     */


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGridLayout:
                setContentView(R.layout.gird_layout);
                break;
            case R.id.btnReturn:
                setContentView(R.layout.main);
                break;
            case R.id.btnLinearLayout:
                setContentView(R.layout.linear_layout);
                break;
            case R.id.linearReturn:
                setContentView(R.layout.main);
                break;
            case R.id.btnTableLayout:
                setContentView(R.layout.table_layout);
                break;
            case R.id.tableReturn:
                setContentView(R.layout.main);
                break;
            case R.id.Table01:

                break;
        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}