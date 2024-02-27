package com.wprotheus.pmd2a04atv01.ui.dog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wprotheus.pmd2a04atv01.databinding.FragmentDogBinding;

public class DogFragment extends Fragment {

    private FragmentDogBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        DogViewModel dogViewModel = new ViewModelProvider(this).get(DogViewModel.class);

        binding = FragmentDogBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageView ivDog = binding.ivDog;
        dogViewModel.getmDogImg().observe(getViewLifecycleOwner(), ivDog::setImageResource);
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}