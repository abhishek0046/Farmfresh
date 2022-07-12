package Buyers;


import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.farmfresh.R;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity
{
    private Button joinNowButton, loginButton;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinNowButton = findViewById(R.id.main_join_now_btn);
        loginButton = findViewById(R.id.main_login_btn);
        loadingBar = new ProgressDialog(this);

        Paper.init(this);

        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        joinNowButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

//        String UserPhoneKey = Paper.book().read(Prevalent.UserPhoneKey);
//        String UserPasswordKey = Paper.book().read(Prevalent.UserPasswordKey);
//
//        if (UserPhoneKey != "" && UserPasswordKey != "")
//        {
//            if (!TextUtils.isEmpty(UserPhoneKey)  &&  !TextUtils.isEmpty(UserPasswordKey))
//            {
//                AllowAccess(UserPhoneKey, UserPasswordKey);
//
//                loadingBar.setTitle("Already Logged in");
//                loadingBar.setMessage("Please wait.....");
//                loadingBar.setCanceledOnTouchOutside(false);
//                loadingBar.show();
//            }
//        }
    }

//    private void AllowAccess(final String phone, final String password)
//    {
//        final DatabaseReference RootRef;
//        RootRef = FirebaseDatabase.getInstance().getReference();
//
//
//        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
//            {
//                if (dataSnapshot.child("Users").child(phone).exists())
//                {
//                    Users usersData = dataSnapshot.child("Users").child(phone).getValue(Users.class);
//
//                    if (usersData.getPhone().equals(phone))
//                    {
//                        if (usersData.getPassword().equals(password))
//                        {
//                            //Toast.makeText(MainActivity.this, "Please wait, you are already logged in...", Toast.LENGTH_SHORT).show();
//                            //loadingBar.dismiss();
//
//                            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//                            Prevalent.currentOnlineUser = usersData;
//                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                            startActivity(intent);
//                            finish();
//
//                        }
//                        else
//                        {
//                            loadingBar.dismiss();
//                            Toast.makeText(MainActivity.this, "Password is incorrect.", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                }
//                else
//                {
//                    Admins usersData = dataSnapshot.child("Admins").child(phone).getValue(Admins.class);
//
//                    if (usersData.getPhone().equals(phone))
//                    {
//                        if (usersData.getPassword().equals(password))
//                        {
//                           //Toast.makeText(MainActivity.this, "Please wait, you are already logged in...", Toast.LENGTH_SHORT).show();
//                           //loadingBar.dismiss();
//
//                            Intent intent = new Intent(MainActivity.this, AdminCategoryActivity.class);
//                            Prevalent.currentOnlineUserAdmin = usersData;
//                            startActivity(intent);
//                        }
//                        else
//                        {
//                            loadingBar.dismiss();
//                            Toast.makeText(MainActivity.this, "Password is incorrect.", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//    }

}