package com.example.student.tdd_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText hesoa,hesob;
    TextView kq;
    Button btnTong,btnHieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hesoa= (EditText)findViewById(R.id.hesoa);
        hesob=(EditText)findViewById(R.id.hesob);
        kq=(TextView)findViewById(R.id.txtkq);
        btnTong=(Button)findViewById(R.id.btnTong);
        btnHieu=(Button)findViewById(R.id.btnhieu);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hsa = Integer.parseInt(hesoa.getText().toString());
                int hsb = Integer.parseInt(hesob.getText().toString());
                int tong=hsa+hsb;
                kq.setText("Tổng là:" +tong);
            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hsa = Integer.parseInt(hesoa.getText().toString());
                int hsb = Integer.parseInt(hesob.getText().toString());
                int hieu=hsa-hsb;
                kq.setText("Hiệu là:" +hieu);
            }
        });

    }
}
