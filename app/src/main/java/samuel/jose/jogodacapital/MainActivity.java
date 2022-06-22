package samuel.jose.jogodacapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] states = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Paraíba", "Piauí", "Roraima", "Rondônia"};
    String[] cities = {"Rio Branco", "Maceió", "Macapá", "Manaus", "Salvador", "Fortaleza", "Vitória", "Goiânia", "São Luís", "Cuiabá", "Campo Grande", "João Pessoa", "Teresina", "Boa Vista", "Porto Velho"};
    TextView score, state, output;
    EditText input;
    Button guessBtn, nextBtn;

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
        
//        Criar função que compara duas strings, removendo caracteres especiais e ignorando caixa alta
//        Sortear um número a cada rodada que representará o estado e cidade nos arrays states e cities
    }

    public void guess(View view) {
//        Verificar se acertou ou errou e alterar o output, habilitar botão de próximo e desabilitar botão de enviar
    }

    public void next(View view) {
//        Pŕoximo estado, limpar input, desabilitar botão de próximo
    }
}