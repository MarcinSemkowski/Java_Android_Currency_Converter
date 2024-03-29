package currency_app.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText euroAmount = findViewById(R.id.AmountEuro);
        Double euroDouble = Double.parseDouble(euroAmount.getText().toString());
        Double amountShow = euroDouble *  4.26549;
        Toast.makeText(MainActivity.this, amountShow + "PLN", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
