package crossingdeal.com.crossingdeal.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import crossingdeal.com.crossingdeal.R;

/**
 * Created by dhananjayk on 17-02-2017.
 */

public class DashBoard extends AppCompatActivity {
    private static final String TAG = SplashScreen.class.getSimpleName() + ".";
    private Activity mActivity = DashBoard.this;
    Spinner cat_spinner,sub_cat_spinner;
    ArrayList<String> cat=new ArrayList<>();
    HashMap<String,String> data;
    ArrayList<HashMap<String,String>> sub= new ArrayList<HashMap<String,String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        getid();
        cat.add("travel");
        cat.add("fun");
        cat.add("swing");
        data=new HashMap<String,String>();
        for(int i=0;i<3;i++)
        {
            data.put("value"+i,"support"+cat.get(0));
        }
        sub.add(data);
        data=new HashMap<String,String>();
        for(int i=0;i<3;i++)
        {
            data.put("value"+i,"support"+cat.get(1));
        }
        sub.add(data);
        data=new HashMap<String,String>();
        for(int i=0;i<3;i++)
        {
            data.put("value"+i,"support"+cat.get(2));
        }
        sub.add(data);
        data=new HashMap<String,String>();
    }
    public void getid()
    {
        cat_spinner=(Spinner)findViewById(R.id.cat_spinner);
        sub_cat_spinner=(Spinner)findViewById(R.id.sub_cat_spinner);
    }
}