package com.dicoding.handchat.ui.sign

import android.graphics.RectF

data class DetectionResult(val boundingBox: RectF, val text: String)