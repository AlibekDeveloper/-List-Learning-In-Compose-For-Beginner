package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Hero(
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val imageId: Int
)
