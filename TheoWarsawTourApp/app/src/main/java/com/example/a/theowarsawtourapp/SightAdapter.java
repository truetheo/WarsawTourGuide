package com.example.a.theowarsawtourapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by a on 06-Jun-17.
 */

public class SightAdapter extends ArrayAdapter<Sight> {

    private int colorBackground;



    /**
     * Create a new {@link SightAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param sights is the list of {@link Sight}s to be displayed.
     * @param colorBackground is the resource ID for the background color for this list of words
     */

    public SightAdapter(@NonNull Context context, @NonNull ArrayList<Sight> sights, int colorBackground) {
        super(context, 0, sights);
        this.colorBackground = colorBackground;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Sight} object located at this position in the list
        Sight currentSight = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID of the attraction name.
        TextView sightNameView = (TextView) listItemView.findViewById(R.id.sight_name);
        // Get the attraction name from the currentSight object and set this text on
        // the SightName TextView.
        sightNameView.setText(currentSight.getSightName());

        // Find the TextView in the list_item.xml layout with the ID location_text_view.
        TextView sightLocationView = (TextView) listItemView.findViewById(R.id.sight_location);
        // Get the location from the currentSight object and set this text on
        // the location TextView.
        sightLocationView.setText(currentSight.getSightLocation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_picture);
        // Get the Image for the corresponding item
        imageView.setImageResource(currentSight.getSightImage());
        //I will replace the rating with the Info icon
        ImageView descIcon = (ImageView) listItemView.findViewById(R.id.desc_info);
        TextView ratingView = (TextView) listItemView.findViewById(R.id.sight_rating);
        //check if the rating is given if not the icon will be visible
        if (currentSight.hasRating()) {
            // If an image is available, display the provided image based on the resource ID
            ratingView.setText(currentSight.getSightRating());
            // Make sure the view is visible
            ratingView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            ratingView.setVisibility(View.GONE);
            descIcon.setVisibility(View.VISIBLE);
        }
        View textContainer = listItemView.findViewById(R.id.txt_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorBackground);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
