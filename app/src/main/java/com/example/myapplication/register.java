package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class register extends AppCompatActivity {

    Button mBtnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //create account button OnClickListener
        Button mBtnSignup = (Button) findViewById(R.id.btnSignUp);
        mBtnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });


    }
    public void signUp(){
        User potentialUser = new User();
        Button btnSignUp = (Button) findViewById(R.id.btnLogin);
        String fileName = "Terimakaphudda2.txt";
        File fileOfUsers = new File(getFilesDir(),fileName);
        EditText txtFullName = (EditText) findViewById(R.id.txtFullName);
        EditText txtEmail = (EditText) findViewById(R.id.txtEmail);


        try {
            fileOfUsers.createNewFile();
            FileInputStream fis = openFileInput(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            FileOutputStream fos = openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            User user = new User("Aun Haider","aunhaider@gmail.com","aunFker121","12345678");
            oos.writeObject(user);
            ArrayList<User> listOfRegisteredUsers = new ArrayList<>();
            potentialUser.setEmail(String.valueOf(txtEmail.getText()));
            while (ois.readObject() !=null){
            listOfRegisteredUsers.add((User) ois.readObject());
            }
            for (User current : listOfRegisteredUsers){
                System.out.println(current);
                if (current.getEmail().equals(potentialUser.getEmail()))
                        System.out.println("EMAIL ALREADY REGISTERED");
            }
            potentialUser.setFullName(String.valueOf(txtFullName.getText()));

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}