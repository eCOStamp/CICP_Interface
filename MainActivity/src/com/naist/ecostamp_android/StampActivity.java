package com.naist.ecostamp_android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class StampActivity extends Activity {
	TextView tvIsConnected,etReply;
	EditText etName,etCountry,etTwitter;
	Button btnPost;
	
	Person person;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_stamp);
		ListView lv = (ListView) findViewById(R.id.my_stamp_lv);
		lv.setAdapter(new StampAdapter());
	}
	
	public class StampAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return 10;
		}

		@Override
		public Object getItem(int position) {
			return new String();
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View v = (View)getLayoutInflater().inflate(R.layout.item_stamp, null);
			return v;
		}
	}
}
	