package com.example.eliasabulail.x_o;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int p = 1;
    int x=0;
    int c=0;
    TextView text ;
    Button [] buttons= new Button[9];

    public void press(View v){
        c++;
        Button b = (Button)findViewById(v.getId());
        text = (TextView) findViewById(R.id.textView);
        if(p==1){
            b.setText("X");
            p=2;
            text.setText("Secand Player !");
        }
        else {
            text.setText("First Player !");
            b.setText("O");
            p = 1;
        }
        check();

        b.setEnabled(false);
    }


    private void check() {
        String s;
        if (p == 1)
            s = "Secand Player ";
        else
            s = "First Player ";
        text = (TextView) findViewById(R.id.textView);
        buttons[0] = (Button) findViewById(R.id.button1);
        buttons[1] = (Button) findViewById(R.id.button2);
        buttons[2] = (Button) findViewById(R.id.button3);
        buttons[3] = (Button) findViewById(R.id.button4);
        buttons[4] = (Button) findViewById(R.id.button5);
        buttons[5] = (Button) findViewById(R.id.button6);
        buttons[6] = (Button) findViewById(R.id.button7);
        buttons[7] = (Button) findViewById(R.id.button8);
        buttons[8] = (Button) findViewById(R.id.button9);

        if (buttons[0].getText() != "" && buttons[0].getText() == buttons[1].getText() && buttons[1].getText() == buttons[2].getText()) {
            text.setText(s + "Winner !");
            x = 1;
        } else if (buttons[3].getText() != "" && buttons[3].getText() == buttons[4].getText() && buttons[4].getText() == buttons[5].getText()) {
            text.setText(s + "Winner !");
            x = 1;
        } else if (buttons[6].getText() != "" && buttons[6].getText() == buttons[7].getText() && buttons[7].getText() == buttons[8].getText()) {
            text.setText(s + "Winner !");
            x = 1;
        } else if (buttons[0].getText() != "" && buttons[0].getText() == buttons[3].getText() && buttons[3].getText() == buttons[6].getText()) {
            text.setText(s + "Winner !");
            x = 1;
        } else if (buttons[1].getText() != "" && buttons[1].getText() == buttons[4].getText() && buttons[4].getText() == buttons[7].getText()) {
            text.setText(s + "Winner !");
            x = 1;
        } else if (buttons[2].getText() != "" && buttons[2].getText() == buttons[5].getText() && buttons[5].getText() == buttons[8].getText()) {
            text.setText(s + "Winner !");
            x = 1;
        } else if (buttons[0].getText() != "" && buttons[0].getText() == buttons[4].getText() && buttons[4].getText() == buttons[8].getText()) {
            text.setText(s + "Winner !");
            x = 1;
        } else if (buttons[2].getText() != "" && buttons[2].getText() == buttons[4].getText() && buttons[4].getText() == buttons[6].getText()) {
            text.setText(s + "Winner !");
            x = 1;
        }
        if (x == 1) {
            for (int i = 0; i < buttons.length; i++)
                buttons[i].setEnabled(false);

            Button l = (Button) findViewById(R.id.Play);
            l.setVisibility((int)View.VISIBLE);

        }

            if(c>8){
                Button l = (Button) findViewById(R.id.Play);
                l.setVisibility((int)View.VISIBLE);
            }


    }
    public void Play(View v){

        p=1;
        x=0;
        c=0;
        for(int i = 0 ;i < buttons.length;i++) {    
            buttons[i].setEnabled(true);
            buttons[i].setText("");
        }
        text.setText("First Player !");
        Button l = (Button) findViewById(R.id.Play);
        l.setVisibility((int)View.INVISIBLE);
    }

}
