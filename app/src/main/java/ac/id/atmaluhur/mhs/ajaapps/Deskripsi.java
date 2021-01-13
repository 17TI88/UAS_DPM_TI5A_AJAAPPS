package ac.id.atmaluhur.mhs.ajaapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class Deskripsi extends AppCompatActivity {
    private Button bback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deskripsi_produk);

        bback = findViewById(R.id.bback);

        bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Deskripsi.this, Halaman.class);
                startActivity(b);
            }
        });

    }
}
