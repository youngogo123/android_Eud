package ko.co.company.a23_05_03_19110107;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingbar;
    TextView textview;
    Button button;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingbar = (RatingBar) findViewById(R.id.ratingbar);
        textview = (TextView) findViewById(R.id.textview);
        button = (Button)findViewById(R.id.botton);
        img1 = findViewById(R.id.img1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingbar.getRating();
                textview.setText(String.valueOf("SROCE = "+rating));

            }
        });



    }
}