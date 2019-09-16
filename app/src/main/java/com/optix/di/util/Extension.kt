package com.optix.di.util

import android.content.SharedPreferences
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import androidx.annotation.IntegerRes
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.google.android.material.snackbar.Snackbar
import com.optix.di.R
import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by Vaibhav Barad on 20-Jul-19.
 */
fun Date.formatToTruncatedDateTime(): String {
    val sdf = SimpleDateFormat("dd MMM", Locale.getDefault())
    return sdf.format(this)
}


fun ImageView.load(url: String, onLoadingFinished: () -> Unit = {}) {
    val listener = object : RequestListener<Drawable> {
        override fun onLoadFailed(
            e: GlideException?,
            model: Any?,
            target: Target<Drawable>?,
            isFirstResource: Boolean
        ): Boolean {
            onLoadingFinished()
            return false
        }

        override fun onResourceReady(
            resource: Drawable?,
            model: Any?,
            target: Target<Drawable>?,
            dataSource: DataSource?,
            isFirstResource: Boolean
        ): Boolean {
            onLoadingFinished()
            return false
        }
    }
    GlideApp.with(this)
        .load(url)
        .apply(RequestOptions.placeholderOf(R.drawable.image_placeholder))
        .listener(listener)
        .into(this)
}

/**
 * @param isConnected
 * @param view        android.R.id.content content view needed
 */
fun View.ShowSnackBar(isConnected: Boolean, view: View): Snackbar {
    return Snackbar.make(view, "Please check your internet connection", Snackbar.LENGTH_INDEFINITE)
        .apply {
            if (!isConnected)
                show()
            else if (isShown)
                dismiss()
        }
}

fun Snackbar.action(@IntegerRes actionRes: Int, color: Int? = null, listener: (View) -> Unit) {
    action(view.resources.getString(actionRes), color, listener)
}

fun Snackbar.action(action: String, color: Int? = null, listener: (View) -> Unit) {
    setAction(action, listener)
    color?.let { setActionTextColor(color) }
}

inline fun SharedPreferences.edit(operation: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.operation()
    editor.apply()
}

fun SharedPreferences.Editor.set(pair: Pair<String, Any?>) {
    when (pair.second) {
        is String? -> putString(pair.first, pair.second as String?)
        is Int -> putInt(pair.first, pair.second as Int)
        is Boolean -> putBoolean(pair.first, pair.second as Boolean)
        is Float -> putFloat(pair.first, pair.second as Float)
        is Long -> putLong(pair.first, pair.second as Long)
        else -> throw UnsupportedOperationException("Not yet implemented")
    }
}

inline fun <reified T : Any> SharedPreferences.get(key: String, defaultValue: T? = null): T? {
    return when (T::class) {
        String::class -> getString(key, defaultValue as? String) as T?
        Int::class -> getInt(key, defaultValue as? Int ?: -1) as T?
        Boolean::class -> getBoolean(key, defaultValue as? Boolean ?: false) as T?
        Float::class -> getFloat(key, defaultValue as? Float ?: -1f) as T?
        Long::class -> getLong(key, defaultValue as? Long ?: -1) as T?
        else -> throw UnsupportedOperationException("Not yet implemented")
    }
}