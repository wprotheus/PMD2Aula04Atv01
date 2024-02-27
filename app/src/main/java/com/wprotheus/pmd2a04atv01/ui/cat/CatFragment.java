package com.wprotheus.pmd2a04atv01.ui.cat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wprotheus.pmd2a04atv01.databinding.FragmentCatBinding;

public class CatFragment extends Fragment {

    private FragmentCatBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        CatViewModel catViewModel = new ViewModelProvider(this).get(CatViewModel.class);

        binding = FragmentCatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageView ivCat = binding.ivCat;
        catViewModel.getmCatImg().observe(getViewLifecycleOwner(), ivCat::setImageResource);
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}