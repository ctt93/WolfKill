package com.example.listviewtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class SeeallActivity extends Activity {
private TextView text;

private TextView seerole;

private String data;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.god_layout);
    
    Intent intent=getIntent();
    data=intent.getStringExtra("rolelist");
    
    text=(TextView)findViewById(R.id.text);
    text.setText("这局的身份是： ");
    seerole=(TextView)findViewById(R.id.seerole);
    
		
		seerole.setText(data);
	}
  
    


protected void onDestroy(){
	super.onDestroy();
	
}

@Override
public void onBackPressed(){
	
	finish();
}


}
