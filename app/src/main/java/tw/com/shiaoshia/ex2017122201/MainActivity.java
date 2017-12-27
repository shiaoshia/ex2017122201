package tw.com.shiaoshia.ex2017122201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TV;
    EditText ET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV=(TextView)findViewById(R.id.textView);
        ET=(EditText)findViewById(R.id.editText);

        TV.setText("Hello World!!");
    }

    public void onClick1(View v){

        String str=ET.getText().toString();
        TV.setText("Good-"+str);
    }
}
