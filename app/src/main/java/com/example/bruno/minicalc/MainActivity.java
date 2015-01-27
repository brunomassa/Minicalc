package com.example.bruno.minicalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    //variavéis
    RadioGroup radgp;
    View btn;
    int verrdp;
    EditText n1;
    EditText n2;
    Double num1;
    Double num2;
    Double res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radgp=(RadioGroup) findViewById(R.id.rgp);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(this);
        n1=(EditText)findViewById(R.id.editText);
        n2=(EditText)findViewById(R.id.editText2);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        // codigo do botao calcular
        try {
        num1=Double.parseDouble(n1.getText().toString());
        num2=Double.parseDouble(n2.getText().toString());
        verrdp=radgp.getCheckedRadioButtonId();

            switch (verrdp) {

                case R.id.somar:
                    res = num1 + num2;
                    Toast.makeText(this,"O resultado é" + " " + res, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.subtrair:
                    res = num1 - num2;
                    Toast.makeText(this, "O resultado é" + " " + res, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.multiplicar:
                    res = num1 * num2;
                    Toast.makeText(this, "O resultado é" + " " + res, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.dividir:
                    res = num1 / num2;
                    Toast.makeText(this ,"O resultado é"+" "+res, Toast.LENGTH_SHORT).show();
                    break;

            }
        }
        catch (Exception ex){
            Toast.makeText(this,R.string.verifica_erro,Toast.LENGTH_SHORT).show();
        }
    }
}
