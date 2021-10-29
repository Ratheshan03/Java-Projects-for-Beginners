package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class area extends AppCompatActivity {
    Button convert;
    String[] convertarray;
    EditText editText;
    Spinner fromspinner;
    TextView result;
    Spinner tospinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
            editText = (EditText) findViewById(R.id.edittext);
            convert = (Button) findViewById(R.id.convert);
            result = (TextView) findViewById(R.id.result);
            fromspinner = (Spinner) findViewById(R.id.from);
            tospinner = (Spinner) findViewById(R.id.to);
            convertarray = new String[]{"km²", "inch²", "cm²", "m²"};
            ArrayAdapter from = new ArrayAdapter(this, (int) R.layout.support_simple_spinner_dropdown_item,    convertarray);
            fromspinner.setAdapter((SpinnerAdapter) from);
            ArrayAdapter to = new ArrayAdapter(this, (int) R.layout.support_simple_spinner_dropdown_item,    convertarray);
            tospinner.setAdapter((SpinnerAdapter) to);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            convert.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    if(fromspinner.getSelectedItem().toString()==tospinner.getSelectedItem().toString()){
                        result.setText(editText.getText().toString());
                    }
                    if (   fromspinner.getSelectedItem().toString() == "km²") {
                        if (   tospinner.getSelectedItem().toString() == "cm²") {
                            result.setText(String.valueOf(Double.parseDouble(   editText.getText().toString()) * 1.0E10));
                        } else if (   tospinner.getSelectedItem().toString() == "m²") {
                            result.setText(String.valueOf(Double.parseDouble(   editText.getText().toString()) * 1000000.0));
                        } else if (   tospinner.getSelectedItem().toString() == "inch²") {
                            result.setText(String.valueOf(Double.parseDouble(   editText.getText().toString()) * 1.55E9));
                        }
                    }
                    if (   fromspinner.getSelectedItem().toString() == "cm²") {
                        if (   tospinner.getSelectedItem().toString() == "km²") {
                            result.setText(String.valueOf(Double.parseDouble(   editText.getText().toString()) / 1.0E10));
                        } else if (   tospinner.getSelectedItem().toString() == "m²") {
                            result.setText(String.valueOf(Double.parseDouble(   editText.getText().toString()) / 10000.0));
                        } else if (   tospinner.getSelectedItem().toString() == "inch²") {
                            result.setText(String.valueOf(Double.parseDouble(   editText.getText().toString()) / 6.452));
                        }
                    }
                    if (   fromspinner.getSelectedItem().toString() == "m²") {
                        if (   tospinner.getSelectedItem().toString() == "km²") {
                            result.setText(String.valueOf(Double.parseDouble(   editText.getText().toString()) / 1000000.0));
                        } else if (   tospinner.getSelectedItem().toString() == "cm²") {
                            result.setText(String.valueOf(10000.0 * Double.parseDouble(   editText.getText().toString())));
                        } else if (   tospinner.getSelectedItem().toString() == "inch²") {
                            result.setText(String.valueOf(Double.parseDouble(   editText.getText().toString()) * 1550.0));
                        }
                    }
                    if (   fromspinner.getSelectedItem().toString() == "inch²") {
                        if (tospinner.getSelectedItem().toString() == "km²") {
                            result.setText(String.valueOf(Double.parseDouble(editText.getText().toString()) / 1.55E9));
                        } else if (tospinner.getSelectedItem().toString() == "m²") {
                            result.setText(String.valueOf(Double.parseDouble(editText.getText().toString()) / 1550.0));
                        } else if (tospinner.getSelectedItem().toString() == "cm²") {
                            result.setText(String.valueOf(6.452 * Double.parseDouble(editText.getText().toString())));
                        }
                    }
                }
            });
        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
    }