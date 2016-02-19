package com.example.catalyst.interactivestory.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.catalyst.interactivestory.R;
import com.example.catalyst.interactivestory.model.Page;

public class StoryActivity extends Activity {

    private Page[] mPages;

    public static final String TAG = StoryActivity.class.getSimpleName();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if (name == null) {
            name = "Friend";
        }
        Log.d(TAG, name);

    }

}
