package crossingdeal.com.crossingdeal.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import crossingdeal.com.crossingdeal.R;

/**
 * Created by dhananjayk on 06-02-2017.
 */

public class Login extends Activity  implements View.OnClickListener {
    private static final String TAG = Login.class.getSimpleName() + ".";
    private Activity mActivity = Login.this;
    TextView create_account_tv;
    Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
         getid();
        create_account_tv.setOnClickListener(this);
        login_btn.setOnClickListener(this);

    }
     public void getid()
    {
        create_account_tv=(TextView)findViewById(R.id.create_account_tv);
        login_btn=(Button)findViewById(R.id.login_btn);
    }
    public void onClick(View v)
    {
       switch(v.getId())
       {
           case R.id.create_account_tv:
               startActivity(new Intent(this, Registration.class));
               break;
           case R.id.login_btn:
                startActivity(new Intent(this,DashBoard.class));
       }
    }
}