package com.abhishekchoksi.togglebuttonapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toggleButtonClickEvent(View view){
        boolean isEnable = ((ToggleButton) view).isChecked();
        switch (view.getId()){
            case R.id.toggleButton:
                if(isEnable){
                    Toast.makeText(this, "Light On", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(this, "Light Off", Toast.LENGTH_SHORT).show();
                }
        }
    }
}