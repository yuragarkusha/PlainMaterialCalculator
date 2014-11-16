package com.Ge0rge.Plain_Material_Calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.Ge0rge.Plain_Material_Calculator.Calculator.Calculation;

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
        Calculation.listOfCalculationsAdd("1");
    }
    public void onTwoButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Two));
        Calculation.listOfCalculationsAdd("2");
    }
    public void onThreeButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Three));
        Calculation.listOfCalculationsAdd("3");
    }

    public void onFourButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Four));
        Calculation.listOfCalculationsAdd("4");
    }

    public void onFiveButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Five));
        Calculation.listOfCalculationsAdd("5");
    }

    public void onSixButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Six));
        Calculation.listOfCalculationsAdd("6");
    }

    public void onSevenButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Seven));
        Calculation.listOfCalculationsAdd("7");
    }

    public void onEightButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Eight));
        Calculation.listOfCalculationsAdd("8");
    }

    public void onNineButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Nine));
        Calculation.listOfCalculationsAdd("9");
    }

    public void onZeroButtonClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Zero));
        Calculation.listOfCalculationsAdd("0");
    }

    public void onBtnDivisionClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Division));
        Calculation.listOfCalculationsAdd(getString(R.string.Division));
    }

    public void onEqualsButtonClick(View view) {
        double result;
        result = Calculation.calculation();
        calculatorTextView.setText(calculatorTextView.getText() + " = " + Double.toString(result));
    }

    public void onBtnMultiplicationClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Multiplication));
        Calculation.listOfCalculationsAdd(getString(R.string.MultiplicationOperation));
    }

    public void onBtnAddClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Add));
        Calculation.listOfCalculationsAdd(getString(R.string.Add));
    }

    public void onBtnSubtractionClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Subtraction));
        Calculation.listOfCalculationsAdd(getString(R.string.Subtraction));
    }

    public void onBtnOpeningParenthesisClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.OpeningParenthesis));
        Calculation.listOfCalculationsAdd(getString(R.string.OpeningParenthesis));
    }

    public void onBtnClosingParenthesisClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.ClosingParenthesis));
        Calculation.listOfCalculationsAdd(getString(R.string.ClosingParenthesis));
    }

    public void onBtnDotClick(View view) {
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Dot));
        Calculation.listOfCalculationsAdd(getString(R.string.Dot));
    }
}
