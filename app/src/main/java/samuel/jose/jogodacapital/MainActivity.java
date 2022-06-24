package samuel.jose.jogodacapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String[] states = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Paraíba", "Piauí", "Roraima", "Rondônia"};
    String[] cities = {"Rio Branco", "Maceió", "Macapá", "Manaus", "Salvador", "Fortaleza", "Vitória", "Goiânia", "São Luís", "Cuiabá", "Campo Grande", "João Pessoa", "Teresina", "Boa Vista", "Porto Velho"};
    TextView score, state, output;
    EditText input;
    Button guessBtn, nextBtn;
    Random random = new Random();
    int actual, count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score = findViewById(R.id.score);
        state = findViewById(R.id.state);
        output = findViewById(R.id.output);
        input = findViewById(R.id.capital);
        guessBtn = findViewById(R.id.guessBtn);
        nextBtn = findViewById(R.id.nextBtn);

        nextBtn.setEnabled(false);

        draw(); //sorteia um estado inicial
        score.setText("0"); //seto o score inicial pra zero

        nextBtn.setEnabled(false);//desabilito o botao de proximo

        count = 1;//inicio o contador de perguntas pra primeira
    }

    public void guess(View view)
    {
        String res = (input.getText().toString()).toLowerCase(Locale.ROOT);//pego o valor respondido
        String capital = cities[actual].toLowerCase(Locale.ROOT);//pego a resposta correta

        if(res.equals(capital)) {
            output.setText("Correto!");
            int scoreAtual = Integer.parseInt(score.getText().toString()); // aumento o score
            score.setText(scoreAtual++);
        } else
            output.setText("Erro, resposta correta: " + capital);

        nextBtn.setEnabled(count < 5); // se for a quinta resposta ele termina o jogo e nao deixa dar next
        guessBtn.setEnabled(false);
    }

    public void next(View view) {
        draw();
        output.setText("");
        nextBtn.setEnabled(false);
        guessBtn.setEnabled(true);
        count++;
    }

    private void draw() {
        actual = random.nextInt(14);
        state.setText(states[actual]);
    }
}