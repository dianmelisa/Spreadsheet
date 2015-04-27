package id.ac.unsyiah.jte.mobile.spreadsheet;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onClickBtnHitung(View view){
        EditText angka1 = (EditText) findViewById(R.id.spread_1_1);
        String angka1Str = String.valueOf(angka1.getText());
        int angka_1 = Integer.valueOf(angka1Str);

        EditText angka2 = (EditText) findViewById(R.id.spread_1_2);
        String angka2Str = String.valueOf(angka2.getText());
        int angka_2 = Integer.valueOf(angka2Str);

        EditText angka3 = (EditText) findViewById(R.id.spread_2_1);
        String angka3Str = String.valueOf(angka3.getText());
        int angka_3 = Integer.valueOf(angka3Str);

        EditText angka4 = (EditText) findViewById(R.id.spread_2_2);
        String angka4Str = String.valueOf(angka4.getText());
        int angka_4 = Integer.valueOf(angka4Str);

        EditText kolom31 = (EditText)findViewById(R.id.spread_1_3);
        int hasil31 = angka_1 + angka_2;
        kolom31.setText(String.valueOf(hasil31));

        EditText kolom32 = (EditText) findViewById(R.id.spread_2_3);
        int hasil32 = angka_3 + angka_4;
        kolom32.setText(String.valueOf(hasil32));

        EditText kolom13 = (EditText)findViewById(R.id.spread_3_1);
        int hasil13 = angka_1 + angka_3;
        kolom13.setText(String.valueOf(hasil13));

        EditText kolom23 = (EditText) findViewById(R.id.spread_3_2);
        int hasil23 = angka_2 + angka_4;
        kolom23.setText(String.valueOf(hasil23));

        EditText total = (EditText)findViewById(R.id.spread_3_3);
        int hasilTotal = hasil31 + hasil32;
        total.setText(String.valueOf(hasilTotal));

    }
}
