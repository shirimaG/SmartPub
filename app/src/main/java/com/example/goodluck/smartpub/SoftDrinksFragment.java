package com.example.goodluck.smartpub;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;



public class SoftDrinksFragment extends Fragment {

    private RecyclerView recyclerView;
    private  SoftDrinksAdapter mAdapter;
    private ArrayList<AbstractModel> itemList = new ArrayList<>();


    public SoftDrinksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_soft_drinks, container, false);
        // Populate initial sample data to models list
        setAdapter();

        // Initialize the adapter
        mAdapter = new SoftDrinksAdapter(getActivity(),itemList);

        // Create a LinearLayoutManager for vertical scrolling of the content
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        // Get the reference to recycler view as defined on your fragment layout
        recyclerView = rootView.findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setHasFixedSize(true);
        return rootView;
    }

    private void setAdapter(){
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));
        itemList.add(new AbstractModel("Coca cola",R.drawable.coca));

    }
}
