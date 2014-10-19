package com.example.hungrylonghorns;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tvTodayText;
	private TextView tvAllText;
	private TypefaceHungryLonghorns tfh;
	private ListView lvEventsCard;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_page);

		tfh = new TypefaceHungryLonghorns(getApplicationContext());
		initializeViews();

	}

	private void initializeViews() {
		tvTodayText = (TextView) findViewById(R.id.tvTodayText);
		tfh.setTypeface(tvTodayText, TypefaceHungryLonghorns.QUATTROSENTO_BOLD);
		tvTodayText.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			}
		});

		tvAllText = (TextView) findViewById(R.id.tvAllText);
		tfh.setTypeface(tvAllText, TypefaceHungryLonghorns.QUATTROSENTO_BOLD);
		tvAllText.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			}
		});

		lvEventsCard = (ListView) findViewById(R.id.lvEventsCard);
		lvEventsCard.setAdapter(new EventsAdapter());
	}

	private class EventsAdapter extends BaseAdapter {

		public EventsAdapter() {

		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 10;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			return new EventsCardLayout(getApplicationContext(), tfh);
		}

	}
}
