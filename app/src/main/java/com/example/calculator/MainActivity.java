/*
 * Copyright (C) 2026 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /**
     * Overrides onCreate so it finds Buttons from
     * activity_main.xml and sets add, subtract, multiply,
     * and divide event listeners to them. Also reads user
     * inputs from EditTexts and writes on the editTextNumAns
     * EditText the final result.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Action when "Add" button is pressed
        Button buttonAdd = findViewById(R.id.b_Add);
        buttonAdd.setOnClickListener(v -> {
            Log.d("M01_Calculator ADD BUTTON", "User tapped the Add button");
            Log.d("M01_Calculator ADD BUTTON", "button =>"+buttonAdd);
            Log.d("M01_Calculator ADD BUTTON", "button =>"+buttonAdd.getText());
            Log.d("M01_Calculator ADD BUTTON", "button =>"+buttonAdd.getId());

            double d1 = 0.0;
            double d2 = 0.0;
            double answer = 0.0;

            EditText textN1 = findViewById(R.id.editTextNum1);
            EditText textN2 = findViewById(R.id.editTextNum2);
            EditText textANS = findViewById(R.id.editTextNumAns);

            try {
                d1 = Double.parseDouble(textN1.getText().toString());
                d2 = Double.parseDouble(textN2.getText().toString());
                answer = d1 + d2;
            }
            catch (Exception e) {
                Log.w("M01_Calculator ADD BUTTON", "Add Selected with no inputs ... "
                        + answer);
            }

            // Set the Answer into the answer field
            textANS.setText(String.format(Double.toString(answer)));

            // log what we are doing
            Log.w("M01_Calculator ADD BUTTON", "Add Selected with => "
                    + d1 + " + " + d2 + "=" + answer);
        });

        // Action when "Sub" button is pressed
        Button buttonSub = findViewById(R.id.b_Sub);
        buttonSub.setOnClickListener(v -> {
            Log.d("M01_Calculator SUBTRACT BUTTON", "User tapped the Subtract button");
            Log.d("M01_Calculator SUBTRACT BUTTON", "button =>"+buttonSub);
            Log.d("M01_Calculator SUBTRACT BUTTON", "button =>"+buttonSub.getText());
            Log.d("M01_Calculator SUBTRACT BUTTON", "button =>"+buttonSub.getId());

            double d1 = 0.0;
            double d2 = 0.0;
            double answer = 0.0;

            EditText textN1 = findViewById(R.id.editTextNum1);
            EditText textN2 = findViewById(R.id.editTextNum2);
            EditText textANS = findViewById(R.id.editTextNumAns);

            try {
                d1 = Double.parseDouble(textN1.getText().toString());
                d2 = Double.parseDouble(textN2.getText().toString());
                answer = d1 - d2;
            }
            catch (Exception e) {
                Log.w("M01_Calculator SUBTRACT BUTTON", "Subtract Selected with no" +
                        " inputs ... " + answer);
            }

            // Set the Answer into the answer field
            textANS.setText(String.format(Double.toString(answer)));

            // log what we are doing
            Log.w("M01_Calculator SUBTRACT BUTTON", "Subtract Selected with => "
                    + d1 + " - " + d2 + "=" + answer);
        });

        // Action when "Mul" button is pressed
        Button buttonMul = findViewById(R.id.b_Mul);
        buttonMul.setOnClickListener(v -> {
            Log.d("M01_Calculator MULTIPLY BUTTON", "User tapped the Multiply button");
            Log.d("M01_Calculator MULTIPLY BUTTON", "button =>"+buttonMul);
            Log.d("M01_Calculator MULTIPLY BUTTON", "button =>"+buttonMul.getText());
            Log.d("M01_Calculator MULTIPLY BUTTON", "button =>"+buttonMul.getId());

            double d1 = 0.0;
            double d2 = 0.0;
            double answer = 0.0;

            EditText textN1 = findViewById(R.id.editTextNum1);
            EditText textN2 = findViewById(R.id.editTextNum2);
            EditText textANS = findViewById(R.id.editTextNumAns);

            try {
                d1 = Double.parseDouble(textN1.getText().toString());
                d2 = Double.parseDouble(textN2.getText().toString());
                answer = d1 * d2;
            }
            catch (Exception e) {
                Log.w("M01_Calculator MULTIPLY BUTTON", "Multiply Selected with no" +
                        " inputs ... " + answer);
            }

            // Set the Answer into the answer field
            textANS.setText(String.format(Double.toString(answer)));

            // log what we are doing
            Log.w("M01_Calculator MULTIPLY BUTTON", "Multiply Selected with => "
                    + d1 + " * " + d2 + "=" + answer);
        });

        // Action when "Div" button is pressed
        Button buttonDiv = findViewById(R.id.b_Div);
        buttonDiv.setOnClickListener(v -> {
            Log.d("M01_Calculator DIVIDE BUTTON", "User tapped the Divide button");
            Log.d("M01_Calculator DIVIDE BUTTON", "button =>"+buttonDiv);
            Log.d("M01_Calculator DIVIDE BUTTON", "button =>"+buttonDiv.getText());
            Log.d("M01_Calculator DIVIDE BUTTON", "button =>"+buttonDiv.getId());

            double d1 = 0.0;
            double d2 = 0.0;
            double answer = 0.0;

            EditText textN1 = findViewById(R.id.editTextNum1);
            EditText textN2 = findViewById(R.id.editTextNum2);
            EditText textANS = findViewById(R.id.editTextNumAns);

            try {
                d1 = Double.parseDouble(textN1.getText().toString());
                d2 = Double.parseDouble(textN2.getText().toString());
                answer = d1 / d2;
            }
            catch (Exception e) {
                Log.w("M01_Calculator DIVIDE BUTTON", "Divide Selected with no inputs" +
                        " ... " + answer);
            }

            // Set the Answer into the answer field
            textANS.setText(String.format(Double.toString(answer)));

            // log what we are doing
            Log.w("M01_Calculator DIVIDE BUTTON", "Divide Selected with => "
                    + d1 + " / " + d2 + "=" + answer);
        });
    }
}
