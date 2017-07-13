package treehut.togglebtn;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl = (RelativeLayout) findViewById(R.id.colorChange);

    }

    public void toggleClick(View view) {

        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            rl.setBackgroundColor(Color.WHITE);
            Toast.makeText(getBaseContext(), "YOU CAN DO ANY COD OTHER THAN TOAST", Toast.LENGTH_SHORT).show();
            //Change background color and show toast.
            //You can any code as per required.

        } else {
            rl.setBackgroundColor(Color.MAGENTA);
            Toast.makeText(getBaseContext(), "TOAST USED FOR EXAMPLE PURPOSES", Toast.LENGTH_SHORT).show();
        }

    }

    public void onHitButtonClicked(View view) {
        TextView textView =(TextView) findViewById(R.id.helloTextView);
        textView.setVisibility(view.VISIBLE);
    }
}