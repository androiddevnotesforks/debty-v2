package com.fabirt.debty.util

import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat

fun View.clearFocusAndCloseKeyboard() {
    val inputMethodManager = ContextCompat.getSystemService(
        this.context, InputMethodManager::class.java
    )
    this.clearFocus()
    inputMethodManager?.hideSoftInputFromWindow(this.windowToken, 0)
}