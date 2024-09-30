package mthu.baitap.chuyenmanhinh_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnManHinh2 = findViewById(R.id.btnMH2);
        btnManHinh2.setOnClickListener(BoLNChuyenMH);
        Intent thuNhanDuoc = getIntent();
        String ten = thuNhanDuoc.getStringExtra("thuw");
        String tuoi = thuNhanDuoc.getStringExtra("Min");
        TextView tvTen = findViewById(R.id.tvHoten);
        TextView tvTuoi = findViewById(R.id.tvTuoi);
        tvTen.setText(ten);
        tvTuoi.setText("Tuổi:"+ tuoi);
    }
    View.OnClickListener BoLNChuyenMH = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent thuGuiKichHoatMH1 = new Intent(MainActivity2.this,MainActivity.class);
            startActivity(thuGuiKichHoatMH1);
        }
    };
}
