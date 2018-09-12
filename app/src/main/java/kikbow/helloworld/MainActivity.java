package kikbow.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TextView textview = new TextView(this);
        textview.setText("Hello World!");

        Button bt = new Button(this);
        bt.setText("Translate");
        bt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        count++;

                        textview.setText("Olá Mundo!" + count);
                    }
                }
        );
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(textview);
        linearLayout.addView(bt);

        setContentView(linearLayout);
    }
}