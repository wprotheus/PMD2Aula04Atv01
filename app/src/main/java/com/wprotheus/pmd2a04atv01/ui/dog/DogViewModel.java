package com.wprotheus.pmd2a04atv01.ui.dog;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wprotheus.pmd2a04atv01.R;

public class DogViewModel extends ViewModel {
    private final MutableLiveData<Integer> mDogImg;

    public DogViewModel() {
        mDogImg = new MutableLiveData<>();
        mDogImg.setValue(R.drawable.malinois);
    }

    public MutableLiveData<Integer> getmDogImg() {
        return mDogImg;
    }
}