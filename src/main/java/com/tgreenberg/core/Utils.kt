package com.tgreenberg.core

import android.content.ContentResolver
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.provider.MediaStore

fun Bitmap.resizeByHeight(height: Int): Bitmap {
    val ratio: Float = this.height.toFloat() / this.width.toFloat()
    val width: Int = Math.round(height / ratio)

    return Bitmap.createScaledBitmap(
        this,
        width,
        height,
        false
    )
}

fun Uri.bitmapFromUri(cr: ContentResolver): Bitmap{
    return if (Build.VERSION.SDK_INT < 29) {
        MediaStore.Images.Media.getBitmap(cr, this)
    } else {
        val source = ImageDecoder.createSource(cr, this)
        ImageDecoder.decodeBitmap(source)
    }
}