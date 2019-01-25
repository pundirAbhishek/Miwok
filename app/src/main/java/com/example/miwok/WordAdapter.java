package com.example.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorBck;

    public WordAdapter(Context context, ArrayList<Word> word,int colorBck)
    {
        super(context,0,word);
        this.colorBck = colorBck;

    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent)
    {
        View listView = convertView;

        if(listView == null)
        {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultWordText = listView.findViewById(R.id.englishWord);
        defaultWordText.setText(currentWord.getDefaultWord());

        TextView miwokWordText = listView.findViewById(R.id.miwokWord);
        miwokWordText.setText(currentWord.getMiwokWord());

        ImageView image = listView.findViewById(R.id.image);

        if(currentWord.hasImage())
        {
            image.setImageResource(currentWord.getImage());
            image.setVisibility(View.VISIBLE);
        }
        else
        {
            image.setVisibility(View.GONE);
        }

        View textContainer = listView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),colorBck);
        textContainer.setBackgroundColor(color);


        return listView;

    }

}
