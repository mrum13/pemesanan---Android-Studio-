package com.example.drtravel.Dashboard.BerandaActivity;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drtravel.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView rvWisata;
    private RecyclerView rvSubmenu;
    private ArrayList<DataWisata> listData;
    private ArrayList<DataSubMenu> listSubMenu;
    private LinearLayoutManager linearLayout,linearLayoutsubmenu;
    private RecyclerView.Adapter adapter;
    private RecyclerView.Adapter adapter2;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        listSubMenu = new ArrayList<DataSubMenu>();


        listData = new ArrayList<DataWisata>();
        initDataset();
        initDatasetsubmenu();

        rvWisata = (RecyclerView)view.findViewById(R.id.rv_wisata_menarik);
        rvWisata.setHasFixedSize(true);

        rvSubmenu = (RecyclerView)view.findViewById(R.id.rv_subMenu);
        rvSubmenu.setHasFixedSize(true);

        linearLayout = new LinearLayoutManager(getActivity());
        linearLayoutsubmenu = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);

        rvSubmenu.setLayoutManager(linearLayoutsubmenu);
        rvWisata.setLayoutManager(linearLayout);

        rvSubmenu.setAdapter(adapter2);
        rvWisata.setAdapter(adapter);

        return view;
    }

    private void initDataset(){
        this.adapter = new RvAdapter(getContext(), getListData());
    }

    private void initDatasetsubmenu(){
        this.adapter2 = new RvAdapterSubMenu(getContext(), getListDatasubmenu());
    }

    private ArrayList<DataSubMenu> getListDatasubmenu(){

        listSubMenu.add(new DataSubMenu(R.drawable.ic_qr, "AR 3D"));
        listSubMenu.add(new DataSubMenu(R.drawable.ic_kuliner, "Kuliner"));
        listSubMenu.add(new DataSubMenu(R.drawable.ic_hotel, "Penginapan"));
        listSubMenu.add(new DataSubMenu(R.drawable.ic_masjid, "Masjid"));

        return  listSubMenu;
    }

    private ArrayList<DataWisata> getListData(){

        listData.add(new DataWisata(R.drawable.gambar_benteng, "Benteng Rotterdam"));
        listData.add(new DataWisata(R.drawable.gambar_panlos, "Pantai Losari"));

        return  listData;
    }

}
