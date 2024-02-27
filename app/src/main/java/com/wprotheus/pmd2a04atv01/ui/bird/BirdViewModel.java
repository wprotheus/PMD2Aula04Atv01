package com.wprotheus.pmd2a04atv01.ui.bird;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wprotheus.pmd2a04atv01.R;

public class BirdViewModel extends ViewModel {
    private final MutableLiveData<Integer> mBirdImg;

    public BirdViewModel() {
        mBirdImg = new MutableLiveData<>();
        mBirdImg.setValue(R.drawable.peregrine);
    }

    public MutableLiveData<Integer> getmBirdImg() {
        return mBirdImg;
    }
}