package dsd.escom.ipn.ficam.killinghuachicol;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DenunciaActivity extends AppCompatActivity {

    MapsActivity mapsActivity;

    Button btnDenuncia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        this.mapsActivity = (MapsActivity) getSupportFragmentManager().findFragmentById(R.id.fragmentGoogleMaps);


        btnDenuncia = findViewById(R.id.btnDenuncia);
        btnDenuncia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DenunciaActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
