
package projeto.projeto1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        final EditText editTextSobrenome = (EditText) findViewById(R.id.editTextSobrenome);
        final Button btnAcao = (Button) findViewById(R.id.buttonAcao);
        btnAcao.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String nome = editTextNome.getText().toString();
                String sobrenome = editTextSobrenome.getText().toString();
                Toast.makeText(MainActivity.this, "ol� " + nome + " " + sobrenome + " tudo bem?", Toast.LENGTH_LONG).show();
            }
        });
    }


}
