package com.example.MyAndroidDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by LeiChen on 6/24/2015.
 */
public class SpinnerActivity extends Activity {
    private TextView view2;
    private Spinner spinner2;
    private ArrayAdapter adapter2;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gird_layout);

        spinner2 = (Spinner)findViewById(R.id.Spinner01);
        view2 = (TextView) findViewById(R.id.spinnerText);
         //将可选内容与ArrayAadpter链接起来
        adapter2 = ArrayAdapter.createFromResource(this, R.array.citys,android.R.layout.simple_spinner_item);
        //设置下拉列表的风格
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //将adapter2 添加到spinner中
        spinner2.setAdapter(adapter2);
        //添加时间Spinner事件监听
        spinner2.setOnItemSelectedListener(new SpinnerXMLSelectedListener());
        //设置默认值



    }

    //使用XML形式操作
    class SpinnerXMLSelectedListener implements AdapterView.OnItemSelectedListener {
              public void onItemSelected(AdapterView<?> arg0,View arg1,int arg2,long arg3){
                  view2.setText("你在哪:"+adapter2.getItem(arg2));
              }
             public void onNothingSelected(AdapterView<?> arg0){}
    }
}
