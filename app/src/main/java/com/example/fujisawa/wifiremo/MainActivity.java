package com.example.fujisawa.wifiremo;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.os.Handler;

import java.nio.BufferUnderflowException;

public class MainActivity extends AppCompatActivity {

    Switch power;
    Button connect;
    TextView logView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // view取得
        power = (Switch) findViewById(R.id.switch1);
        connect = (Button) findViewById(R.id.button);   // coonectキー
        logView = (TextView) findViewById(R.id.logView);

    }
}

