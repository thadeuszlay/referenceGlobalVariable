package com.example.referenceglobalvariable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends Activity {

	Button buttonDelete;
	TextView textViewNext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next);
		
		buttonDelete=(Button)findViewById(R.id.bDelete);
		textViewNext=(TextView)findViewById(R.id.tvNext);

		final GlobalVariable myVariable=(GlobalVariable)getApplicationContext();
		String newCounter=String.valueOf(myVariable.getCounter());
		textViewNext.setText(newCounter);
		
		addListenerOnButton();
	}

	private void addListenerOnButton() {
		buttonDelete.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				final GlobalVariable myVariable=(GlobalVariable)getApplicationContext();

				myVariable.resetCounter();
				String newCounter=String.valueOf(myVariable.getCounter());
				textViewNext.setText(newCounter);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.next, menu);
		return true;
	}

}
