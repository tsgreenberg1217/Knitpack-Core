package com.tgreenberg.core.models

import android.graphics.Bitmap
import android.net.Uri

data class ProjectTxt(
    val name: String, val steps: List<String>, val level: String
)

data class KnitUri(var res: Bitmap?)

data class UIKnittingProject(
    var name: String = "",
    var notes: String = "",
    var description: String = "",
    var pattern: String = "",
    var yarn: String = "",
    var needles: String = "",
    var images: List<KnitUri> = listOf()

)