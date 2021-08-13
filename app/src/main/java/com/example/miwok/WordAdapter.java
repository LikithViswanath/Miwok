package com.example.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public final int mColorResourceId;
    public WordAdapter(Activity context, ArrayList<Word> Words,int ColorResourceId){
        super(context,0,Words);
        mColorResourceId=ColorResourceId;
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
       Word currentWord = getItem(position);

        TextView MiwokTextView = (TextView) listItemView.findViewById(R.id.Miwok_text_view);
        TextView EnglishTextView = (TextView) listItemView.findViewById(R.id.English_text_view);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        MiwokTextView.setText(currentWord.getMiwokTranslation());
        EnglishTextView.setText(currentWord.getEnglishTranslation());
        if(currentWord.getmImageResourceId()==0) {
            imageView.setVisibility(View.GONE);
        }
        else{
            imageView.setImageResource(currentWord.getmImageResourceId());
        }
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linear_layout_view);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        linearLayout.setBackgroundColor(color);
        return listItemView;
    }
}
