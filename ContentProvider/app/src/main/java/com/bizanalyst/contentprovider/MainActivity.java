package com.bizanalyst.contentprovider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    ContentResolver resolver;

    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.list_item);
        resolver= getContentResolver();

        cursor = resolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);

        String [] from = new String[]{ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER};

        int [] to = new int[]{R.id.textview1,R.id.textview2};

        SimpleCursorAdapter  adapter = new SimpleCursorAdapter(getApplicationContext(),R.layout.contact_item,cursor,from,to);
        listView.setAdapter(adapter);

    }
}
