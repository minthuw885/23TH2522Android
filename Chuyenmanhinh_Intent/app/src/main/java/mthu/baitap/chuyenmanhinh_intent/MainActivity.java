package mthu.baitap.chuyenmanhinh_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void ChuyensangManHinh2(View v) {
        Intent thuGuiKichHoatMH2;
        thuGuiKichHoatMH2 = new Intent(MainActivity.this, MainActivity2.class);
        EditText edthoTen = findViewById(R.id.edtName);
        EditText edtTuoi = findViewById(R.id.edtTuoi1);
        String strhoten = edthoTen.getText().toString();
        String strTuoi = edtTuoi.getText().toString();
        thuGuiKichHoatMH2.putExtra("Thuw",strhoten);
        thuGuiKichHoatMH2.putExtra("Min",strTuoi);


        startActivity(thuGuiKichHoatMH2);
    }
}