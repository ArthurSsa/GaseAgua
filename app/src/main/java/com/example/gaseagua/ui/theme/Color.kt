package com.example.gaseagua.ui.theme

import android.text.Highlights
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Blue = Color(0xFF000F29)
val Blue2 = Color(0xFF00115F)
val Blue3 = Color(0xFF0024C5)
val Blue4 = Color(0xFF89AAE4)
val White = Color(0xFFFFFFFF)
val White2 = Color(0xFFF4F4F4)
val White3 = Color(0xFF74839D)
val Yellow = Color(0xFFEFE122)
val Black = Color(0xFF000000)

@Immutable
data class AppColors(
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val secondarySurface: Color,
    val onSecondarySurface: Color,
    val regularSurface: Color,
    val onRegularSurface: Color,
    val actionSurface: Color,
    val onActionSurface: Color,
    val highlightSurface: Color,
    val onHighlightSurface: Color,
)

val localAppColors = staticCompositionLocalOf {
    AppColors(
        background = Color.Unspecified,
        onBackground = Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        regularSurface = Color.Unspecified,
        onRegularSurface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighlightSurface = Color.Unspecified
    )
}

val extendedColor = AppColors(
    background = Color.Blue,
    onBackground = Black,
    surface = Color.White,
    onSurface = Black,
    secondarySurface = White2,
    onSecondarySurface = Color.White,
    regularSurface =  Color.Blue,
    onRegularSurface = Blue3,
    actionSurface = Yellow

)