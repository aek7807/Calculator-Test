package newgame.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Modifier;

public class MainActivity extends AppCompatActivity {

    private EditText etNumberOne;
    private EditText etNumberTwo;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumberOne = findViewById(R.id.etNumberOne);
        etNumberTwo = findViewById(R.id.etNumberTwo);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                Toast.makeText(MainActivity.this, String.valueOf(Plus(numberOne,numberTwo)), Toast.LENGTH_SHORT).show();

            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                Toast.makeText(MainActivity.this, String.valueOf(Minus(numberOne,numberTwo)), Toast.LENGTH_SHORT).show();

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                Toast.makeText(MainActivity.this, String.valueOf(Multiply(numberOne,numberTwo)), Toast.LENGTH_SHORT).show();

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                Toast.makeText(MainActivity.this, String.valueOf(Divide(numberOne,numberTwo)), Toast.LENGTH_SHORT).show();

            }
        });

    }

    private int Plus(int NumberOne,int NumberTwo){
        return NumberOne+NumberTwo;
    }

    private int Minus(int NumberOne,int NumberTwo){
        return NumberOne-NumberTwo;
    }

    private int Multiply(int NumberOne,int NumberTwo){
        return NumberOne*NumberTwo;
    }

    private int Divide(int NumberOne,int NumberTwo){
        if(NumberTwo == 0)
            return 0;
        else
            return NumberOne/NumberTwo;
    }
}
