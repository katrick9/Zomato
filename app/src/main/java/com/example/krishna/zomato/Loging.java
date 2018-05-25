package com.example.krishna.zomato;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Loging extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide action bar

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_loging);
        getSupportActionBar().hide();

        //

        //view pager

        viewPager = (ViewPager) findViewById(R.id.viewPager);

         viewpagerAdapter viewpagerAdapter = new viewpagerAdapter(this);

        viewPager.setAdapter(viewpagerAdapter);

        //


        TextView signup = (TextView) findViewById(R.id.signupme);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent up = new Intent(Loging.this,SignUp.class);
                startActivity(up);
            }
        });

        ImageView signin = (ImageView) findViewById(R.id.emailme);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Loging.this,SignIn.class);
                startActivity(in);
            }
        });

        TextView later = (TextView) findViewById(R.id.later);
        later.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent later = new Intent(Loging.this,DiningOut.class);
                startActivity(later);
            }
        });


    }


}
