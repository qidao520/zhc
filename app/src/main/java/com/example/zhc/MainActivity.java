package com.example.zhc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView iv;
    boolean isChanged = false;
    EditText ed_get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_send=findViewById(R.id.button);
        iv= findViewById(R.id.imageView);
        ed_get=findViewById(R.id.editText);
        btn_send.setOnClickListener(this);
    }
    public void onClick(View v) {
        String text = ed_get.getText().toString();
        Log.i("zhc", text);
        if (text.equals("朱洪成")) {
            if (!isChanged) {
                iv.setImageDrawable(getResources().getDrawable(R.drawable.z));
            } else {
                iv.setImageDrawable(getResources().getDrawable(R.drawable.h2));
            }
            isChanged = !isChanged;
            Toast.makeText(this, "朱洪成的头像已切换", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "请输入自己的姓名", Toast.LENGTH_LONG).show();
        }
    }
}

