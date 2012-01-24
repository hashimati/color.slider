package com.ahmed.colorSliderDemo;
//Ahmed Al Hashmi project 
//Mustafa Al-Mulla
//Mustafa Ezzzzzzzzzat 2




/**
 * I have done this change at 1:12am
 */
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class ColorSliderDemoActivity extends Activity {
	/** Called when the activity is first created. */
	SeekBar redBar;
	SeekBar blueBar;
	SeekBar greenBar;
	SeekBar alphaBar;

	EditText redText;
	EditText blueText;
	EditText greenText;
	EditText alphaText;
	View canvas ; //=(View)findViewById(R.id.ColorCanvas); 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		redBar = (SeekBar) findViewById(R.id.redseekBar);
		blueBar = (SeekBar) findViewById(R.id.blueseekBar);
		greenBar = (SeekBar) findViewById(R.id.greenseekBar);
		alphaBar = (SeekBar) findViewById(R.id.alphaseekBar);

		redText = (EditText) findViewById(R.id.redText);
		blueText = (EditText) findViewById(R.id.blueText);
		greenText = (EditText) findViewById(R.id.greenText);
		alphaText = (EditText) findViewById(R.id.alphaText);

		canvas =(View)findViewById(R.id.ColorCanvas); 
		canvas.setBackgroundColor(Color.argb(Integer.parseInt(""+alphaText.getText()),
				Integer.parseInt(""+redText.getText()),
				Integer.parseInt(""+blueText.getText()),
				Integer.parseInt(""+greenText.getText()))); 
		redBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				redText.setText("" + arg1);
				//arg0.setBackgroundColor(Color.BLUE); 
				canvas.setBackgroundColor(Color.argb(Integer.parseInt(""+alphaText.getText()),
						Integer.parseInt(""+redText.getText()),
						Integer.parseInt(""+blueText.getText()),
						Integer.parseInt(""+greenText.getText()))); 
		
			}
		});
		blueBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				blueText.setText("" + arg1);
				canvas.setBackgroundColor(Color.argb(Integer.parseInt(""+alphaText.getText()),
						Integer.parseInt(""+redText.getText()),
						Integer.parseInt(""+blueText.getText()),
						Integer.parseInt(""+greenText.getText()))); 

			}
		});
		greenBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				greenText.setText("" + arg1);
				canvas.setBackgroundColor(Color.argb(Integer.parseInt(""+alphaText.getText()),
						Integer.parseInt(""+redText.getText()),
						Integer.parseInt(""+blueText.getText()),
						Integer.parseInt(""+greenText.getText()))); 
				
			}
		});
		alphaBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				// TODO Auto-generated method stub
				alphaText.setText("" + arg1);
				canvas.setBackgroundColor(Color.argb(Integer.parseInt(""+alphaText.getText()),
						Integer.parseInt(""+redText.getText()),
						Integer.parseInt(""+blueText.getText()),
						Integer.parseInt(""+greenText.getText()))); 
			}
		});
	}
}