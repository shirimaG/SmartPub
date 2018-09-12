package com.example.goodluck.smartpub.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.goodluck.smartpub.Adapter.SpiritsAdapter;
import com.example.goodluck.smartpub.Model.AbstractModel;
import com.example.goodluck.smartpub.R;

import java.util.ArrayList;

public class SpiritsFragment extends Fragment {

    private RecyclerView recyclerView;
    private SpiritsAdapter mAdapter;
    private ArrayList<AbstractModel> itemList = new ArrayList<>();

    public SpiritsFragment() {
        //Empty Constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_spirits, container, false);
        // Populate initial sample data to models list
        setAdapter();

        // Initialize the adapter
        mAdapter = new SpiritsAdapter(getActivity(),itemList);

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
        itemList.add(new AbstractModel("K_Vant",R.drawable.coca_cola_btle));
        itemList.add(new AbstractModel("Tequilla",R.drawable.sprite_btle));
        itemList.add(new AbstractModel("Kiroba",R.drawable.fanta_btle));
        itemList.add(new AbstractModel("Grants",R.drawable.coca_cola_btle));
        itemList.add(new AbstractModel("Konyagi",R.drawable.sprite_btle));
        itemList.add(new AbstractModel("Amarula",R.drawable.fanta_btle));
        itemList.add(new AbstractModel("Galaxy",R.drawable.coca_cola_btle));
        itemList.add(new AbstractModel("Whisky",R.drawable.sprite_btle));
        itemList.add(new AbstractModel("Chief",R.drawable.fanta_btle));

    }
}
