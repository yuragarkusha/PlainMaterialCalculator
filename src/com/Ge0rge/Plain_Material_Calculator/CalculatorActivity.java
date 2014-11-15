package com.Ge0rge.Plain_Material_Calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private TextView calculatorTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        calculatorTextView = (TextView)findViewById(R.id.tvResult);
    }


    public void onOneButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.One));
    }
    public void onTwoButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Two));
    }
    public void onThreeButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Three));
    }

    public void onFourButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Four));
    }

    public void onFiveButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Five));
    }

    public void onSixButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Six));
    }

    public void onSevenButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Seven));
    }

    public void onEightButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Eight));
    }

    public void onNineButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Nine));
    }

    public void onZeroButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Zero));
    }
}
