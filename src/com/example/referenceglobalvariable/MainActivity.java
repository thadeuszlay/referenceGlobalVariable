package com.example.referenceglobalvariable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button buttonAdd, buttonNext;
	TextView textViewMain;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textViewMain=(TextView)findViewById(R.id.tvMain);
		buttonAdd=(Button)findViewById(R.id.bAdd);
		buttonNext=(Button)findViewById(R.id.bNext);
		
		final GlobalVariable myVariable=(GlobalVariable)getApplicationContext();
		String newCounter=String.valueOf(myVariable.getCounter());
		textViewMain.setText(newCounter);

		addListenerOnButton();
	}

	private void addListenerOnButton() {
		buttonAdd.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View arg0) {
				final GlobalVariable myVariable=(GlobalVariable)getApplicationContext();
				myVariable.addCounter();

				String newCounter=String.valueOf(myVariable.getCounter());
				textViewMain.setText(newCounter);
			}			
		});
		
		buttonNext.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent=null;
				intent=new Intent(MainActivity.this, NextActivity.class);
				startActivity(intent);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}