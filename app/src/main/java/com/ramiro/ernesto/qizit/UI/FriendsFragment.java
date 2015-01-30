package com.ramiro.ernesto.qizit.UI;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


import com.ramiro.ernesto.qizit.R;

/**
 * Created by ernesto on 27/01/15.
 */
public class FriendsFragment extends Fragment {
    protected GridView mGridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_friends, container, false);
        mGridView = (GridView)rootView.findViewById(R.id.friendsGrid);
        return rootView;
    }
}
