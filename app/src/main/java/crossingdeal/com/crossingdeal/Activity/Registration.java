package crossingdeal.com.crossingdeal.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import crossingdeal.com.crossingdeal.R;

/**
 * Created by dhananjayk on 07-02-2017.
 */

public class Registration extends Activity implements View.OnClickListener{
    private static final String TAG = Registration.class.getSimpleName() + ".";

    private Activity mActivity = Registration.this;
    Button dob_btn,signup_btn;
   public static EditText dob_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        getid();
        dob_btn.setOnClickListener(this);
        signup_btn.setOnClickListener(this);

    }
    public void getid()
    {
        dob_btn=(Button)findViewById(R.id.dob_btn);
        signup_btn=(Button)findViewById(R.id.signup_btn);
        dob_edt=(EditText)findViewById(R.id.dob_edt);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.dob_btn:
               /* Helper.ShowCalender(Registration.this);*/
                break;
            case R.id.signup_btn:
               /* startActivity(new Intent(this,Eligibility.class));*/

        }
    }


}