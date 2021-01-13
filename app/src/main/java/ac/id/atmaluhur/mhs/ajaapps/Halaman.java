package ac.id.atmaluhur.mhs.ajaapps;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman extends AppCompatActivity {
    private Button btnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_produk);

        btnd = findViewById(R.id.btnd);

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(Halaman.this, Deskripsi.class);
                startActivity(h);
            }
        });

    }
}
