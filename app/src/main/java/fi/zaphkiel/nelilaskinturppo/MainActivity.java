package fi.zaphkiel.nelilaskinturppo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textInput1;
    private EditText textInput2;
    private TextView textOutput;
    private int number1, number2, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput1 = findViewById(R.id.giveNumber1);
        textInput2 = findViewById(R.id.giveNumber2);
        textOutput = findViewById(R.id.calculationAnwser);
    }

    public void addNumbers(View view) {
        number1 = Integer.parseInt(textInput1.getText().toString());
        number2 = Integer.parseInt(textInput2.getText().toString());
        answer = number1 + number2;

        textOutput.setText(String.valueOf(answer));
    }

    public void reduceNumbers(View view) {
        number1 = Integer.parseInt((textInput1.getText().toString()));
        number2 = Integer.parseInt((textInput2.getText().toString()));
        answer = number1 - number2;

        textOutput.setText(String.valueOf(answer));
    }

    public void multiplyNumbers(View view) {
        number1 = Integer.parseInt((textInput1.getText().toString()));
        number2 = Integer.parseInt((textInput2.getText().toString()));
        answer = number1 * number2;

        textOutput.setText(String.valueOf(answer));
    }

    public void divideNumbers(View view) {
        number1 = Integer.parseInt((textInput1.getText().toString()));
        number2 = Integer.parseInt((textInput2.getText().toString()));
        answer = number1 / number2;

        textOutput.setText(String.valueOf(answer));
    }
}
