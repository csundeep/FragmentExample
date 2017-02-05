package com.example.sandy.fragmentexample;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new BlankFragment())
                    .commit();
        }
    }

    public void onFragmentInteraction(Uri uri){
        Toast toast = Toast.makeText(this, "How you doing ????", Toast.LENGTH_SHORT);
        toast.show();
    }


}
