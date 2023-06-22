package com.example.facedetection.util

import android.os.Environment
import java.io.File

//val downloadFolder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
//val destinationFile = File(downloadFolder.absolutePath, "file_${filePostfix}.jpg")

val rootFolder =
    File(
        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES)
            .absolutePath,
        "Macgyver${File.separator}"
    ).apply {
        if (!exists())
            mkdirs()
    }

fun makeTempFile(): File {
    val downloadFolder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
    return File(downloadFolder.absolutePath, "file_${System.currentTimeMillis()}.jpg")

}