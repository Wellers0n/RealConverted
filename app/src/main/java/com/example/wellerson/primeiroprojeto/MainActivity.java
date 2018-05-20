package com.example.wellerson.primeiroprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private viewHolder nViewHolder = new viewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nViewHolder.editValue = (EditText) findViewById(R.id.edit_value);
        this.nViewHolder.textDollar = (TextView) findViewById(R.id.text_dollar);
        this.nViewHolder.textEuro = (TextView) findViewById(R.id.text_euro);
        this.nViewHolder.buttonCalculale = (Button) findViewById(R.id.button_calculate);

        this.nViewHolder.buttonCalculale.setOnClickListener(this);

        this.clearValues();
    }

    @Override
    //click end calculate
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_calculate){
            double value = Double.valueOf(this.nViewHolder.editValue.getText().toString());
            this.nViewHolder.textDollar.setText(String.format("%.2f", value * 3.66));
            this.nViewHolder.textEuro.setText(String.format("%.2f", value * 4.33));
        }

    }


    private void clearValues(){
        this.nViewHolder.textDollar.setText("");
        this.nViewHolder.textEuro.setText("");

    }



    private static class viewHolder{
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalculale;
    }
}
