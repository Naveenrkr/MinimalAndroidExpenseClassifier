package com.expense.classifier.utils

import android.content.Context
import android.content.Intent
import androidx.activity.result.ActivityResultLauncher

class FilePicker(private val context: Context) {

    fun pickFile(launcher: ActivityResultLauncher<Intent>) {
        val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
            type = "*/*"
            addCategory(Intent.CATEGORY_OPENABLE)
        }
        launcher.launch(intent)
    }
}
