package sam.projects.eeguide.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF4F78FF),        // Bright blue for primary actions
    onPrimary = Color.White,
    secondary = Color(0xFF4FACFF),      // Lighter blue for secondary elements
    onSecondary = Color.White,
    tertiary = Color(0xFF4FDFFF),       // Cyan-ish for tertiary actions
    onTertiary = Color.Black,
    background = Color(0xFF121212),     // Very dark gray, almost black
    onBackground = Color.White,
    surface = Color(0xFF1E1E1E),        // Slightly lighter than background
    onSurface = Color.White,
    surfaceVariant = Color(0xFF252525), // For cards and elevated surfaces
    onSurfaceVariant = Color(0xFFE1E1E1),
    error = Color(0xFFFF5252),
    onError = Color.White
)

private val LightColorScheme = lightColorScheme(
    // We'll keep the light theme definition but focus on dark theme
    primary = Color(0xFF2196F3),
    onPrimary = Color.White,
    secondary = Color(0xFF03A9F4),
    onSecondary = Color.White,
    tertiary = Color(0xFF00BCD4),
    onTertiary = Color.Black,
    background = Color(0xFFFAFAFA),
    onBackground = Color(0xFF1A1A1A),
    surface = Color.White,
    onSurface = Color(0xFF1A1A1A)
)

@Composable
fun EEGuideTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}