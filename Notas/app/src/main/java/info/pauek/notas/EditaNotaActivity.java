package info.pauek.notas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

public class EditaNotaActivity extends AppCompatActivity {

    private int pos = -1;
    private EditText edit_titulo;
    private EditText edit_texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edita_nota);

        edit_titulo = (EditText) findViewById(R.id.edit_titulo);
        edit_texto = (EditText) findViewById(R.id.edit_texto);

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", -1);
        if (pos != -1) {
            Nota nota = ListaNotas.getNota(pos);
            edit_titulo.setText(nota.getTitulo());
            edit_texto.setText(nota.getTexto());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.edita_nota_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.guardar:
                String titulo = edit_titulo.getText().toString();
                String texto  = edit_texto.getText().toString();
                if (pos != -1) {
                    ListaNotas.modifica(pos, titulo, texto);
                } else {
                    ListaNotas.nueva(titulo, texto);
                }
                setResult(RESULT_OK);
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
