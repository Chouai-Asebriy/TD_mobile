package com.example.td6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText)findViewById(R.id.editText);
        Button rollButton = (Button)findViewById(R.id.buttonValider);
        if(editText != null)
        {
            rollButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      String repoName = editText.getText().toString();

                      //  NewsListApplication app = (NewsListApplication) getApplicationContext();
                      //  app.setLogin(nom);

                      Intent intent = new Intent(MainActivity.this, RepoList.class);
                      intent.putExtra("repoName", repoName);
                      startActivity(intent);

                  }
            });

        }

    }


}
