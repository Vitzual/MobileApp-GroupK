package group.k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declare each members buttons
    private Button robsButton;
    private Button chloeButton;
    private Button bensButton;

    // OnCreate method, assigns buttons and creates OnClick listeners for the buttons
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        robsButton = findViewById(R.id.button_robert);
        robsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRobsActivity();
            }
        });

        chloeButton=findViewById(R.id.button_chloe);
        chloeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openchloeActivity();

            }
        });

        bensButton = findViewById(R.id.button_ben);
        bensButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBensActivity();
            }
        });
    }

    private void openRobsActivity() {
        Intent intent = new Intent(this, robsPage.class );
        startActivity(intent);
    }

    private void openchloeActivity() {
        Intent intent = new Intent(this, chloeActivity.class);
        startActivity(intent);
    }

    private void openBensActivity() {
        Intent intent = new Intent(this, BensPage.class);
        startActivity(intent);
    }
}