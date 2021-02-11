package group.k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button robsButton;
    private Button chloeButton;

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
    }

    private void openRobsActivity() {
        Intent intent = new Intent(this, robsPage.class );
        startActivity(intent);
    }

    private void openchloeActivity()
    {
        Intent intent=new Intent(this, chloeActivity.class);
        startActivity(intent);
    }
}