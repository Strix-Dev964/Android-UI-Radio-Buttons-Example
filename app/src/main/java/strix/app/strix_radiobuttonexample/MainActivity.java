package strix.app.strix_radiobuttonexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/*
Created by Strix - http://strixdev.co.uk
*/

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioNumbersGroup;
    private RadioButton radioNumbersButton;
    private Button btnCheckState;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        CreateButtonListener();

    }

    public void CreateButtonListener() {

        radioNumbersGroup = findViewById(R.id.radioNumbers);
        btnCheckState = findViewById(R.id.btnCheck);

        btnCheckState.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int selectedId = radioNumbersGroup.getCheckedRadioButtonId();

                radioNumbersButton = findViewById(selectedId);

                Toast.makeText(context,
                        radioNumbersButton.getText(), Toast.LENGTH_SHORT).show();

            }

        });

    }
}