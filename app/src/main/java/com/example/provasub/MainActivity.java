package com.example.provasub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.provasub.BancoDeDados.AbastecimentoDB;
import com.example.provasub.BancoDeDados.DBHelper;
import com.example.provasub.Entidades.Abastecimento;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper BancoDeDados = new DBHelper(this);
        AbastecimentoDB BancoAbastecer = new AbastecimentoDB(BancoDeDados);
        EditText Quilometragem_atual = findViewById(R.id.Quilo_atual);
        EditText Quantidade_abastecida = findViewById(R.id.Quant_abasteci);
        EditText Valor_pago = findViewById(R.id.V_pago);
        EditText Data = findViewById(R.id.Dia_abaste);
        Button Salvar = findViewById(R.id.buttonSalvar);



        Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Abastecimento abastecer = new Abastecimento();
                abastecer.setQuantidade_abastecida(Float.parseFloat(Quantidade_abastecida.getText().toString()));
                abastecer.setQuilometragem_atual(Float.parseFloat(Quilometragem_atual.getText().toString()));
                abastecer.setData(Data.getText().toString());
                abastecer.setValor_pago(Float.parseFloat(Valor_pago.getText().toString()));

                BancoAbastecer.inserir(abastecer);
                Toast.makeText(MainActivity.this,"Salvou", Toast.LENGTH_LONG).show();



            }
        });


    }
}