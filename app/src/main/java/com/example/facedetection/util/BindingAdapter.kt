package com.example.facedetection.util

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton



@BindingAdapter("onFabClick")
fun setOnFabButtonClickListener(
    view: FloatingActionButton,
    listener: View.OnClickListener?
) {
    listener ?: return
    view.setOnClickListener(listener)
}