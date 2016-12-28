package co.ronit.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import co.ronit.toggleswitch.ToggleSwitchButton;

public class MainActivity extends AppCompatActivity {

    private ToggleSwitchButton toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggle = (ToggleSwitchButton) findViewById(R.id.toggle);
        toggle.setOnTriggerListener(new ToggleSwitchButton.OnTriggerListener() {
            @Override
            public void acceptCall() {
                Toast.makeText(MainActivity.this, "acceptCall", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void declineCall() {
                Toast.makeText(MainActivity.this, "declineCall", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
