package group.k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button_chloe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openchloeActivity();
            }
        });
    }

    public void openchloeActivity()
    {
        Intent intent=new Intent(this, chloeActivity.class);
        startActivity(intent);
    }
}