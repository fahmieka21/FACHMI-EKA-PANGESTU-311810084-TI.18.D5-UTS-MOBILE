package com.example.uts_fachmi_eka_pangestu_311810084_ti18d5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentCaller2Activity extends Activity implements View.OnClickListener {
    public Button button2;
    public EditText editT;


    public String ACTION_CHECK ="com.example.uts_fachmi_eka_pangestu_311810084_ti18d5.ACTION_CHECK";

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_inten);
        button2=(Button)findViewById(R.id.button1);
        editT=(EditText)findViewById(R.id.editText1);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View agr0){
        int startSelection, andSelection;
        if (agr0==button2) {
            startSelection = editT.getSelectionStart();
            andSelection = editT.getSelectionEnd();
            String selectedText = editT.getText().toString().substring(startSelection, andSelection);
            Intent intent = new Intent();
            intent.setAction(ACTION_CHECK);
            intent.putExtra("input_data", selectedText);
            startActivity(intent);
        }
        }


             //INTEN CALL
        public void Telepon(View view) {
            Intent callInten = new Intent(Intent.ACTION_DIAL);
            callInten.setData(Uri.parse("tel:083875151600"));
            startActivity(callInten);
            }
            //INTEN CALL


            //INTEN Website
            public void Website(View view) {
                String url = "http://www.pelitabangsa.ac.id";
                Intent web = new Intent(Intent.ACTION_VIEW);
                web.setData(Uri.parse(url));
                startActivity(web);
            }
            //INTEN Website


            //INTEN goggle maps
            public void Maps(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.co.id/maps/place/Kec.+Tambun+Sel.,+Bekasi,+Jawa+Barat/@-6.2519581,106.9835144,12z/data=!3m1!4b1!4m5!3m4!1s0x2e698e5536a17187:0x5f258ff12caf8f2b!8m2!3d-6.2611984!4d107.0421324"));
                startActivity(intent);
                //INTEN goggle maps
            }


            //INTEN EMAIL
            public void Email(View view){
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:abc@xyz.com"));
            startActivity(Intent.createChooser(emailIntent, "Send feedback"));
            //INTEN EMAIL

    }
}
