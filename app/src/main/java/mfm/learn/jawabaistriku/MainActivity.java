package mfm.learn.jawabaistriku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView hasil;
    private TextView textView;
    private Integer jumlah = 2;
    private Button jawabanIya;
    private Button jawabanTidak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        jawabanIya = (Button) findViewById(R.id.jawabanIya);
        jawabanTidak = (Button) findViewById(R.id.jawabanTidak);
        hasil =  (TextView) findViewById(R.id.hasil);
        textView = (TextView) findViewById(R.id.textView);
        hasil.setMovementMethod(new ScrollingMovementMethod());


        View.OnClickListener hasilIya = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah += 1;
                String answer = "\n"+jumlah+". Iya kamu boleh makan mie sekarang sayang";
                hasil.append(answer);
            }
        };

        View.OnClickListener hasilTidak = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah += 1;
                String answer = "\n"+jumlah+". Tidak, kamu boleh makan mie nya sekarang";
                hasil.append(answer);
            }
        };

        View.OnLongClickListener hasilIyaHold = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                jumlah += 1;
                String answer = "\n"+jumlah+". Tidak, kamu gak boleh makan mie";
                hasil.append(answer);
                return true;
            }
        };
        View.OnLongClickListener hasilTidakHold = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                jumlah += 1;
                String answer = "\n"+jumlah+". Tidak, kamu gak boleh makan mie";
                hasil.append(answer);
                return true;
            }
        };

        jawabanIya.setOnClickListener(hasilIya);
        jawabanTidak.setOnClickListener(hasilTidak);

        jawabanIya.setOnLongClickListener(hasilIyaHold);
        jawabanTidak.setOnLongClickListener(hasilTidakHold);

    }
}
