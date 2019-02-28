package com.example.kadir.instagramclonefirebase;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PostClass extends ArrayAdapter<String> {
    private final ArrayList<String> useremail;
    private final ArrayList<String> usercomment;
    private final ArrayList<String> userImage;
    private final Activity context;

    public PostClass(ArrayList<String> useremail, ArrayList<String> usercomment, ArrayList<String> userImage, Activity context) {
       super(context,R.layout.custom_view,useremail);
        this.useremail = useremail;
        this.usercomment = usercomment;
        this.userImage = userImage;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view,null,true);
        TextView userEmailText = customView.findViewById(R.id.userEmailTextViewCustomView);
        TextView commentText = customView.findViewById(R.id.commentViewCustomView);
        ImageView imageView = customView.findViewById(R.id.imageViewCustomView);
        userEmailText.setText(useremail.get(position));
        commentText.setText(usercomment.get(position));
        Picasso.get().load(userImage.get(position)).into(imageView);
        return customView;



    }
}
