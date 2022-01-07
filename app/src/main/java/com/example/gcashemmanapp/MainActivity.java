package com.example.gcashemmanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView msendmoney = (ImageView) findViewById(R.id.cashin);
        ImageView mcashin = (ImageView) findViewById(R.id.sendmoney);
        ImageView mgsave = (ImageView) findViewById(R.id.gsave);
        ImageView mgbuyload = (ImageView) findViewById(R.id.buyload);
        ImageView mgarewards = (ImageView) findViewById(R.id.arewards);
        ImageView mcredit = (ImageView) findViewById(R.id.gcredit);
        ImageView mpaybills = (ImageView) findViewById(R.id.paybills);
        ImageView mgforest = (ImageView) findViewById(R.id.gforest);
        ImageView mglife = (ImageView) findViewById(R.id.glife);
        ImageView mbanktransfer = (ImageView) findViewById(R.id.banktransfer);
        ImageView mginsure = (ImageView) findViewById(R.id.ginsure);
        ImageView mpayqr = (ImageView) findViewById(R.id.payqr);


        TextView mviewwall = (TextView) findViewById(R.id.viewall);
        ImageView mqr = (ImageView) findViewById(R.id.qr);
        ImageView mbottom = (ImageView) findViewById(R.id.activitybottom);
        ImageView mprofile = (ImageView) findViewById(R.id.profile);


        msendmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SendMoneyActivity.class);
                startActivity(intent);
            }
        });


        mcashin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CashInActivity.class);
                startActivity(intent);
            }
        });

        mgsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GSaveActivity.class);
                startActivity(intent);
            }
        });

        mgbuyload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BuyLoadActivity.class);
                startActivity(intent);
            }
        });


        mgarewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ARewards.class);
                startActivity(intent);
            }
        });

        mcredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GCreditActivity.class);
                startActivity(intent);
            }
        });

        mpaybills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PayBillsActivity.class);
                startActivity(intent);
            }
        });

        mgforest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GForestActivity.class);
                startActivity(intent);
            }
        });


        mglife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GLifeActivity.class);
                startActivity(intent);
            }
        });

        mbanktransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BankTransferActivity.class);
                startActivity(intent);
            }
        });

        mginsure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GInsureActivity.class);
                startActivity(intent);
            }
        });


        mpayqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PayQRActivity.class);
                startActivity(intent);
            }
        });


        mviewwall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ViewAllGcashServicesActivity.class);
                startActivity(intent);
            }
        });

        mqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,QRActivity.class);
                startActivity(intent);
            }
        });

        mbottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BottomActivity.class);
                startActivity(intent);
            }
        });

        mprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });



    }
}