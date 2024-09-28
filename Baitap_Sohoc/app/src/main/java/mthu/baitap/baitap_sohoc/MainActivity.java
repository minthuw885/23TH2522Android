package mthu.baitap.baitap_sohoc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        // Ánh xạ các thành phần trong giao diện
        EditText dieuKhienA = findViewById(R.id.edtA);
        EditText dieuKhienB = findViewById(R.id.edtB);
        Button nutTinhCong = findViewById(R.id.btnAdd);
        Button nutTinhTru = findViewById(R.id.btnSub);
        Button nutTinhNhan = findViewById(R.id.btnMul);
        Button nutTinhChia = findViewById(R.id.btnDiv);
        // TextView ketQua = findViewById(R.id.tvResult);
    }
        public void XuLy_Cong(View v) {
            EditText dieukhienA = findViewById(R.id.edtA);
            EditText dieukhienB = findViewById(R.id.edtB);
            TextView tvKetQua = findViewById(R.id.tvResult);
            String strSoThuNhat = dieukhienA.getText().toString();
            String strSoThuHai = dieukhienB.getText().toString();
            double soThuNhat = Double.parseDouble(strSoThuNhat);
            double soThuHai = Double.parseDouble(strSoThuHai);
            double ketQua = soThuNhat + soThuHai;
            String chuoiThongBao = String.valueOf(ketQua);
            tvKetQua.setText(chuoiThongBao);
        }
    public void XuLy_Tru(View v) {
        EditText dieukhienA = findViewById(R.id.edtA);
        EditText dieukhienB = findViewById(R.id.edtB);
        TextView tvKetQua = findViewById(R.id.tvResult);
        String strSoThuNhat = dieukhienA.getText().toString();
        String strSoThuHai = dieukhienB.getText().toString();
        double soThuNhat = Double.parseDouble(strSoThuNhat);
        double soThuHai = Double.parseDouble(strSoThuHai);
        double ketQua = soThuNhat - soThuHai;
        String chuoiThongBao = String.valueOf(ketQua);
        tvKetQua.setText(chuoiThongBao);
    }
    public void XuLy_Nhan(View v){
        EditText dieukhienA = findViewById(R.id.edtA);
        EditText dieukhienB = findViewById(R.id.edtB);
        TextView tvKetQua = findViewById(R.id.tvResult);
        String strSoThuNhat = dieukhienA.getText().toString();
        String strSoThuHai = dieukhienB.getText().toString();
        double soThuNhat = Double.parseDouble(strSoThuNhat);
        double soThuHai = Double.parseDouble(strSoThuHai);
        double ketQua = soThuNhat * soThuHai;
        String chuoiThongBao = String.valueOf(ketQua);
        tvKetQua.setText(chuoiThongBao);
    }
    public void XuLy_Chia(View v){
        EditText dieukhienA = findViewById(R.id.edtA);
        EditText dieukhienB = findViewById(R.id.edtB);
        TextView tvKetQua = findViewById(R.id.tvResult);
        String strSoThuNhat = dieukhienA.getText().toString();
        String strSoThuHai = dieukhienB.getText().toString();
        double soThuNhat = Double.parseDouble(strSoThuNhat);
        double soThuHai = Double.parseDouble(strSoThuHai);
        double ketQua = soThuNhat / soThuHai;
        String chuoiThongBao = String.valueOf(ketQua);
        tvKetQua.setText(chuoiThongBao);
    }
}
