package com.example.composeinit.enuns

import androidx.compose.ui.Alignment

enum class BoxAlignmentOption (
    val label: String,
    val value: Alignment
)
{
    TOP_START("TopStart", Alignment.TopStart),
    CENTER("Center", Alignment.Center),
    BOTTOM_END("BottonEnd", Alignment.BottomEnd),
}