package mcm.edu.ph.burgos_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Red_Pill = findViewById(R.id.Red_Pill);
        Button Blue_Pill = findViewById(R.id.Blue_Pill);

        TextView Question = findViewById(R.id.Question);
        Question.setText("The World is ending and only you can stop it...No-one else can, You can take one of the two pills...Which will it be?\nRed_Pill: Sends you back home (let the world burn as you sit there and watch\n Blue_Pill: You will gain 3 powers of your own choosing and use it to defend the world\n Choose Wisely!");

        Red_Pill.setOnClickListener(this::onClick);
        Blue_Pill.setOnClickListener(this::onClick);
    }
    public void onClick(View view){


        TextView Path = findViewById(R.id.Path);



        switch (view.getId()){
            case R.id.Red_Pill:
                Path.setText("Coward!!!");
                break;
            case R.id.Blue_Pill:
                Path.setText("You...Are going to be a Hero!!");
                break;
        }
    }
}