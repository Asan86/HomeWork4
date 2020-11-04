package asan.example.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private java.util.List<TitleMode> list;
    private MainAdapter adapter;
    EditText mEditText;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
    }

    private void setupUI() {
        recyclerView = findViewById(R.id.recyclerView);
        list = new ArrayList<>();
        adapter =new MainAdapter(list);
        recyclerView.setAdapter(adapter);

        mEditText = findViewById(R.id.edText);
        btn = findViewById(R.id.buttonB);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(new TitleMode(mEditText.getText().toString(), ""));
            }
        });


    }
}