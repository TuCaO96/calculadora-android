package br.com.cotemig.aula01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.textResultado)
    TextView resultado;
    @BindView(R.id.btnNove)
    Button btn9;
    @BindView(R.id.btnOito)
    Button btn8;
    @BindView(R.id.btnSete)
    Button btn7;
    @BindView(R.id.btnSeis)
    Button btn6;
    @BindView(R.id.btnCinco)
    Button btn5;
    @BindView(R.id.btnQuatro)
    Button btn4;
    @BindView(R.id.btnTres)
    Button btn3;
    @BindView(R.id.btnDois)
    Button btn2;
    @BindView(R.id.btnUm)
    Button btn1;
    @BindView(R.id.btnZero)
    Button btn0;
    @BindView(R.id.btnIgual)
    Button btnIgual;
    @BindView(R.id.btnSoma)
    Button btnSoma;
    @BindView(R.id.btnClear)
    Button btnClear;
    @BindView(R.id.btnSubtrai)
    Button btnSubtrai;
    @BindView(R.id.btnMultiplica)
    Button btnMultiplica;
    @BindView(R.id.btnMaisMenos)
    Button btnMaisMenos;
    @BindView(R.id.btnDecimal)
    Button btnDecimal;
    @BindView(R.id.btnDivisao)
    Button btnDivisao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ButterKnife.bind(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @OnClick(R.id.btnOito)
    public void btnOitoClick(){
        resultado.setText(resultado.getText() + "8");
    }

    @OnClick(R.id.btnSoma)
    public void btnSoma(){

    }

    @OnClick(R.id.btnIgual)
    public void btnIgual(){

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnNove) {
            if(resultado.getText() == "0"){
                resultado.setText("9");
            }
            else{
                resultado.setText(resultado.getText() + "9");
            }
        }
        else if (v.getId() == R.id.btnOito) {
            if(resultado.getText() == "0"){
                resultado.setText("8");
            }
            else{
                resultado.setText(resultado.getText() + "8");
            }
        }
        else if (v.getId() == R.id.btnSete) {
            if(resultado.getText() == "0"){
                resultado.setText("7");
            }
            else{
                resultado.setText(resultado.getText() + "7");
            }
        }
        else if (v.getId() == R.id.btnSeis) {
            if(resultado.getText() == "0"){
                resultado.setText("6");
            }
            else{
                resultado.setText(resultado.getText() + "6");
            }
        }
        else if (v.getId() == R.id.btnCinco) {
            if(resultado.getText() == "0"){
                resultado.setText("5");
            }
            else{
                resultado.setText(resultado.getText() + "5");
            }
        }
        else if (v.getId() == R.id.btnQuatro) {
            if(resultado.getText() == "0"){
                resultado.setText("4");
            }
            else{
                resultado.setText(resultado.getText() + "4");
            }
        }
        else if (v.getId() == R.id.btnTres) {
            if(resultado.getText() == "0"){
                resultado.setText("3");
            }
            else{
                resultado.setText(resultado.getText() + "3");
            }
        }
        else if (v.getId() == R.id.btnDois) {
            if(resultado.getText() == "0"){
                resultado.setText("2");
            }
            else{
                resultado.setText(resultado.getText() + "2");
            }
        }
        else if (v.getId() == R.id.btnUm) {
            if(resultado.getText() == "0"){
                resultado.setText("1");
            }
            else{
                resultado.setText(resultado.getText() + "1");
            }
        }
        else if (v.getId() == R.id.btnZero) {
            if(resultado.getText() == "0"){
                resultado.setText("0");
            }
            else{
                resultado.setText(resultado.getText() + "0");
            }
        }
        else if (v.getId() == R.id.btnIgual) {
            String result = resultado.getText().toString();
            String numero = "";
            double novoResultado = 0;
            ArrayList numeros = new ArrayList();
            int novoResultadoInteiro;
            //se contem soma, e nao é ultima posicao,
            //entao vai printar soma

            for(int i = 0; i < result.length(); i++){
                System.out.println("Index: " + i);
                char c = result.charAt(i);
                if(Character.isDigit(c)){
                    numero = new StringBuilder().append(numero).append(c).toString();
                }
                else {
                    if(c == '+') {
                        if (numero.length() > 0) {
                            numeros.add(numero);
                            novoResultado += Double.parseDouble(numero);
                            numero = "";
                        }
                    }
                }
            }

            if(novoResultado % 1 == 0){
                novoResultadoInteiro = (int)novoResultado;
                resultado.setText(Integer.toString(novoResultadoInteiro));
            }
            else{
                resultado.setText(Double.toString(novoResultado));
            }

        }
        else if (v.getId() == R.id.btnSoma) {
            resultado.setText(resultado.getText() + "+");
        }
        else if (v.getId() == R.id.btnClear) {
            resultado.setText("0");
        }
    }
}
