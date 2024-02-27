package com.wprotheus.pmd2a04atv01.ui.bird;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wprotheus.pmd2a04atv01.databinding.FragmentBirdBinding;

public class BirdFragment extends Fragment {
    private FragmentBirdBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        BirdViewModel birdViewModel = new ViewModelProvider(this).get(BirdViewModel.class);

        binding = FragmentBirdBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageView ivBird = binding.ivBird;
        birdViewModel.getmBirdImg().observe(getViewLifecycleOwner(), ivBird::setImageResource);
        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}