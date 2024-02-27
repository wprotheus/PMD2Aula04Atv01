package com.wprotheus.pmd2a04atv01.ui.cat;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wprotheus.pmd2a04atv01.R;

public class CatViewModel extends ViewModel {
    private final MutableLiveData<Integer> mCatImg;

    public CatViewModel() {
        mCatImg = new MutableLiveData<>();
        mCatImg.setValue(R.drawable.egyptiansphynxcat);
    }

    public MutableLiveData<Integer> getmCatImg() {
        return mCatImg;
    }
}