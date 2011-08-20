
package com.adarshr.expensive;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.add);

        final Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Expensive", "Class is " + v.getClass());
                DatePicker date = (DatePicker) findViewById(R.id.date1);
                Log.d("Expenive", "Date is " + date.getDayOfMonth() + " "
                        + date.getMonth() + " " + date.getYear());

                EditText particulars = (EditText) findViewById(R.id.edit1);
                EditText amount = (EditText) findViewById(R.id.edit2);

                Toast.makeText(
                        AddActivity.this,
                        "Date is " + date.getDayOfMonth() + " "
                                + date.getMonth() + " " + date.getYear() + "\n\nParticulars: "
                                + particulars.getText() + " Amount: " + amount.getText(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
