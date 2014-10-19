package com.example.hungrylonghorns;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EventsCardLayout extends LinearLayout {

	private TypefaceHungryLonghorns tfh;
	private TextView tvMonth, tvDates, tvEventsName, tvTime, tvPlaceName;
	private ImageView ivStar;

	public EventsCardLayout(Context context) {
		super(context);
	}

	public EventsCardLayout(Context context, TypefaceHungryLonghorns tfh) {
		super(context);
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		addView(inflater.inflate(R.layout.events_card, null));
		this.tfh = tfh;

		initializeViews();
	}

	private void initializeViews() {
		tvMonth = (TextView) findViewById(R.id.tvMonth);
		tfh.setTypeface(tvMonth, TypefaceHungryLonghorns.LEAGUE_GOTHIC);
		tvDates = (TextView) findViewById(R.id.tvDates);
		tvEventsName = (TextView) findViewById(R.id.tvEventsName);
		tfh.setTypeface(tvEventsName, TypefaceHungryLonghorns.QUATTROSENTO_BOLD);
		tvTime = (TextView) findViewById(R.id.tvTime);
		tvPlaceName = (TextView) findViewById(R.id.tvPlaceName);

		ivStar = (ImageView) findViewById(R.id.ivStar);
	}
}
