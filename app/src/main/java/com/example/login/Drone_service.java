package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.HashMap;

public class Drone_service extends AppCompatActivity {
    EditText dateText;
    Button estimate_btn,Kn_more,pay;
    int mYear;
    int mMonth;
    int mDay;

    //bill
    EditText acre,phone,date,address;
    TextView bill;
    RadioGroup radioGroup;
    RadioButton radioButton;
    int checkgroup;

    //Gpay
    String GOOGLE_PAY_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user";
    int GOOGLE_PAY_REQUEST_CODE = 123;


   //orders Datbase
    private FirebaseDatabase db=FirebaseDatabase.getInstance();
    private DatabaseReference root= db.getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drone_service);

        //bill
        bill=findViewById(R.id.result);
        acre=findViewById(R.id.acre);
        phone=findViewById(R.id.phone);
        date=findViewById(R.id.date);
        address=findViewById(R.id.address);
        radioGroup=findViewById(R.id.problem);
        pay=findViewById(R.id.pay_btn);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkgroup=checkedId;
            }
        });

        estimate_btn=findViewById(R.id.estimate_btn);
        estimate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String acre_in = acre.getText().toString();
                String add = address.getText().toString();
                String phone_in = phone.getText().toString();
                String date_in = date.getText().toString();


                if (acre_in.isEmpty()||acre_in.length()==0) {
                    acre.setError("Enter Land in Acre");
                }else if (add.isEmpty()||add.length()==0) {
                    address.setError("Enter your address");
                }  else if (date_in.isEmpty()||date_in.length()==0) {
                    date.setError("Select Date");
                } else if (checkgroup<=0) {
                    Toast.makeText(Drone_service.this,"select crop problem",Toast.LENGTH_SHORT).show();
               }
                else if (phone_in.length()==0||phone_in.length()!=10) {
                    phone.setError("Enter your phone number");
                } else {
                    double amt = Double.parseDouble(acre.getText().toString());
                    Double amount = amt * 480;
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    radioButton = findViewById(selectedId);
                    String prob = radioButton.getText().toString();

                    bill.setText("\t*******Agrigrow*********" + "\n\tAddress:\t" + add + "\n\tAcre:\t" + acre_in + "\n\tCrop problem:\t" + prob + "\n\tPhone:\t" + phone_in + "\n\tDate:\t" + date_in + "\n\tAmt:\t" + amount);
                    bill.setVisibility(View.VISIBLE);
                    pay.setVisibility(View.VISIBLE);
                }

            }
        });


        Kn_more=findViewById(R.id.know_btn);
        Kn_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(Drone_service.this,Know_more.class);
               startActivity(i);
            }
        });


        dateText=findViewById(R.id.date);
        dateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DatePickerDialog dateDialog;
                final Calendar c=Calendar.getInstance();

                mYear=c.get(Calendar.YEAR);
                mMonth=c.get(Calendar.MONTH);
                mDay=c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog.OnDateSetListener mDateSetListener=new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        mYear=year;
                        mMonth=month;
                        mDay=dayOfMonth;
                        dateText.setText(new StringBuilder().append(mDay).append("/").append(mMonth+1).append("/").append(mYear).append(""));

                    }
                };
                dateDialog=new DatePickerDialog(Drone_service.this,mDateSetListener,mYear,mMonth,mDay);
                dateDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                dateDialog.show();
            }
        });

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oders_store
                String add=address.getText().toString();
                String acre_in=acre.getText().toString();
                String phone_in=phone.getText().toString();
                String date_in=date.getText().toString();
                double amt=Double.parseDouble(acre.getText().toString());
                Double amount=amt*480;
                String bill_amt=Double.toString(amount);
                int selectedId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(selectedId);
                String prob=radioButton.getText().toString();
                HashMap<String,String>userMap=new HashMap<>();
                userMap.put("Address",add); userMap.put("Address",add);
                userMap.put("Acre",acre_in);
                userMap.put("Date",date_in);
                userMap.put("Phone",phone_in);
                userMap.put("Amount_Paid",bill_amt);
                root.push().setValue(userMap);


                 //Gpay
                double aamt=Double.parseDouble(acre.getText().toString());
                Double aamount=amt*480;
                String bbill_amt=Double.toString(amount);


                Uri uri =
                        new Uri.Builder()
                                .scheme("upi")
                                .authority("pay")
                                .appendQueryParameter("pa", "123456789@ybl")
                                .appendQueryParameter("pn", "AgriGrow")
                                .appendQueryParameter("mc", "")
                                .appendQueryParameter("tr", "23677")
                                .appendQueryParameter("tn", "Drone service payment ")
                                .appendQueryParameter("am",bbill_amt)
                                .appendQueryParameter("cu", "INR")
                            //   .appendQueryParameter("url", "your-transaction-url")
                                .build();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(uri);
                intent.setPackage(GOOGLE_PAY_PACKAGE_NAME);
                startActivityForResult(intent, GOOGLE_PAY_REQUEST_CODE);

            }
        });

    }
}