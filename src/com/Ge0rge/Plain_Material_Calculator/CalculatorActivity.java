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
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.One));
        Calculation.listOfCalculationsAdd("1");
    }
    public void onTwoButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Two));
        Calculation.listOfCalculationsAdd("2");
    }
    public void onThreeButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Three));
        Calculation.listOfCalculationsAdd("3");
    }

    public void onFourButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Four));
        Calculation.listOfCalculationsAdd("4");
    }

    public void onFiveButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Five));
        Calculation.listOfCalculationsAdd("5");
    }

    public void onSixButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Six));
        Calculation.listOfCalculationsAdd("6");
    }

    public void onSevenButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Seven));
        Calculation.listOfCalculationsAdd("7");
    }

    public void onEightButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Eight));
        Calculation.listOfCalculationsAdd("8");
    }

    public void onNineButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Nine));
        Calculation.listOfCalculationsAdd("9");
    }

    public void onZeroButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Zero));
        Calculation.listOfCalculationsAdd("0");
    }

    public void onBtnDivisionClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();

            calculatorTextView.setText(Double.toString(Calculation.LastResultOfCalculations));
            Calculation.listOfCalculationsAdd(Double.toString(Calculation.LastResultOfCalculations));
        }
        calculatorTextView.setText(calculatorTextView.getText() + " " + getString(R.string.Division) + " ");
        Calculation.listOfCalculationsAdd(getString(R.string.Division));
    }

    public void onBtnMultiplicationClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();

            calculatorTextView.setText(Double.toString(Calculation.LastResultOfCalculations));
            Calculation.listOfCalculationsAdd(Double.toString(Calculation.LastResultOfCalculations));
        }
        calculatorTextView.setText(calculatorTextView.getText() + " " + getString(R.string.Multiplication ) + " ");
        Calculation.listOfCalculationsAdd(getString(R.string.MultiplicationOperation));
    }

    public void onBtnAddClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();

            calculatorTextView.setText(Double.toString(Calculation.LastResultOfCalculations));
            Calculation.listOfCalculationsAdd(Double.toString(Calculation.LastResultOfCalculations));
        }
        calculatorTextView.setText(calculatorTextView.getText() + " " + getString(R.string.Add) + " ");
        Calculation.listOfCalculationsAdd(getString(R.string.Add));
    }

    public void onBtnSubtractionClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();

            calculatorTextView.setText(Double.toString(Calculation.LastResultOfCalculations));
            Calculation.listOfCalculationsAdd(Double.toString(Calculation.LastResultOfCalculations));
        }
        calculatorTextView.setText(calculatorTextView.getText() + " " + getString(R.string.Subtraction) + " ");
        Calculation.listOfCalculationsAdd(getString(R.string.Subtraction));
    }

    public void onBtnOpeningParenthesisClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.OpeningParenthesis));
        Calculation.listOfCalculationsAdd(getString(R.string.OpeningParenthesis));
        Calculation.OpenParenthesis++;
    }

    public void onBtnClosingParenthesisClick(View view) {
        if (Calculation.EndComputing == true) {
            cleaningCalculatorTextView();
        }

        if (Calculation.OpenParenthesis>0) {
            calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.ClosingParenthesis));
            Calculation.listOfCalculationsAdd(getString(R.string.ClosingParenthesis));
            Calculation.OpenParenthesis--;
        }

    }

    public void onBtnDotClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
        }
        calculatorTextView.setText(calculatorTextView.getText() + getString(R.string.Dot));
        Calculation.listOfCalculationsAdd(getString(R.string.Dot));
    }

    public void onEqualsButtonClick(View view) {
        if(Calculation.EndComputing)
        {
            cleaningCalculatorTextView();
            calculatorTextView.setText(calculatorTextView.getText() + Double.toString(Calculation.LastResultOfCalculations));
            Calculation.listOfCalculationsAdd(Double.toString(Calculation.LastResultOfCalculations));
        }
        double result;
        result = Calculation.calculation();
        int intResult = (int)result;
        double intToDoubleResult = (double)intResult;
        if (result==intToDoubleResult)
        {
            calculatorTextView.setText(calculatorTextView.getText() + " = " + Integer.toString(intResult));
        }
        else
        {
            calculatorTextView.setText(calculatorTextView.getText() + " = " + Double.toString(result));
        }
        Calculation.LastResultOfCalculations = result;
        Calculation.EndComputing = true;
    }

    public void cleaningCalculatorTextView()
    {
        calculatorTextView.setText("");
        Calculation.ListOfCalculations.clear();
        Calculation.EndComputing=false;
        Calculation.OpenParenthesis=0;
    }

    public void onBtnCleanClick(View view) {
        cleaningCalculatorTextView();
    }
}
