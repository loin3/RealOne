package com.example.firstweek;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment2 extends Fragment
{
    private View view;
    private static Fragment2 _instance;

    public static Fragment2 newInstance(){
        if(_instance == null)
            _instance = new Fragment2();

        return _instance;
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment2, container, false);
        return view;
    }
}