package com.example.goodluck.smartpub.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.goodluck.smartpub.Adapter.BeersAdapter;
import com.example.goodluck.smartpub.Model.AbstractModel;
import com.example.goodluck.smartpub.R;

import java.util.ArrayList;

public class BeersFragment extends Fragment {

    private RecyclerView recyclerView;
    private BeersAdapter mAdapter;
    private ArrayList<AbstractModel> itemList = new ArrayList<>();

    public BeersFragment() {
        //Constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_beers, container, false);
        // Populate initial sample data to models list
        setAdapter();

        // Initialize the adapter
        mAdapter = new BeersAdapter(getActivity(),itemList);

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
        itemList.add(new AbstractModel("Heinkein",R.drawable.coca_cola_can));
        itemList.add(new AbstractModel("Windhoek",R.drawable.fanta_can));
        itemList.add(new AbstractModel("Castle",R.drawable.sprite_can));
        itemList.add(new AbstractModel("Serengeti",R.drawable.coca_cola_can));
        itemList.add(new AbstractModel("Kilimanjaro",R.drawable.fanta_can));
        itemList.add(new AbstractModel("Castle_Light",R.drawable.sprite_can));
        itemList.add(new AbstractModel("Heinkein_Light",R.drawable.coca_cola_can));
        itemList.add(new AbstractModel("Chui",R.drawable.fanta_can));
        itemList.add(new AbstractModel("Serengeti_Light",R.drawable.sprite_can));

    }
}

