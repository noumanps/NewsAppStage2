package com.example.nouman.newsappstage2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView headLine = convertView.findViewById(R.id.head_line);
        headLine.setText(currentNews.getHeadLine());

        TextView authorName = convertView.findViewById(R.id.auther);
        String author = currentNews.getAuthor();
        if(author.equals("")) author = getContext().getString(R.string.no_author);
        authorName.setText(author);

        TextView section = convertView.findViewById(R.id.section);
        section.setText(currentNews.getSection());

        TextView articalDate = convertView.findViewById(R.id.date);
        articalDate.setText(currentNews.getDate());

        return convertView;
    }


}

