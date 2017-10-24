package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge;
    private TextView textViewMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);
    }

    public void displayMessage(View view){
        String name;
        int age;

        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());
        age++;

        textViewMessage.setText("HI "+ name +", you will be "+ age +" years old in 2018");
    }

    public void reset(View view){
        editTextName.setText("");
        editTextAge.setText("");
        textViewMessage.setText("");

    }
}
