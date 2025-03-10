package com.oneasad.vitalstracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.oneasad.vitalstracker.presentation.screens.VitalsApp
import com.oneasad.vitalstracker.presentation.screens.VitalsLogScreen
import com.oneasad.vitalstracker.presentation.viewmodel.VitalsViewModel
import com.oneasad.vitalstracker.ui.theme.VitalsTrackerTheme
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VitalsTrackerTheme {
                VitalsApp()
            }
        }
    }
}

