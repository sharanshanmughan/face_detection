package com.example.facedetection.ui.main

import android.view.MenuItem
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import github.hongbeomi.macgyver.mlkit.vision.VisionType
import com.example.facedetection.R

class MainViewModel:ViewModel() {

    val onItemSelectedEvent: MutableLiveData<VisionType> = MutableLiveData()
    val onFabButtonEvent: MutableLiveData<Unit?> = MutableLiveData()
    val onShutterButtonEvent: MutableLiveData<Unit?> = MutableLiveData()

    init {
        onItemSelectedEvent.postValue(VisionType.Face)
    }

//    fun onBottomMenuClicked(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.action_barcode_scan -> postVisionType(VisionType.Barcode)
//            R.id.action_face_detect -> postVisionType(VisionType.Face)
//            R.id.action_object_detect -> postVisionType(VisionType.Object)
//            R.id.action_ocr -> postVisionType(VisionType.OCR)
//        }
//        item.isChecked = true
//        return false
//    }

    fun onClickFabButton(view: View) {
        onFabButtonEvent.postValue(Unit)
    }

    fun onClickShutter(view: View) {
        onShutterButtonEvent.postValue(Unit)
    }

    private fun postVisionType() {

    }


}