package com.example.lab_7

import androidx.compose.ui.test.junit4.v2.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// Note to self:
// For UI Testing- kotlin class created bc class needed
// But in lab Unit testing - file made bc only composables used

@RunWith(AndroidJUnit4::class)
class FormulaZeroTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>() // access MainActivity

    @Test
    fun navigate_to_races_add_race_and_return_home() {
        // navigate to race screen
        composeTestRule
            .onNodeWithTag("raceButton")
            .performClick()

        // verify race screen
        composeTestRule
            .onNodeWithText("Upcoming Races")
            .assertExists()

        // enter race location
        composeTestRule
            .onNodeWithTag("locationInput")
            .performTextInput("Canada")

        // add race location
        composeTestRule
            .onNodeWithTag("addRaceButton")
            .performClick()

        // verify race appears
        composeTestRule
            .onNodeWithText("Canada")
            .assertExists()

        // return to home screen
        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()

        // verify return to home screen
        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertExists()
    }

    // Will test nav from home screen to driversScreen and more
    @Test
    fun navigate_to_drivers_add_drive_and_return_home() {
        // navigate to drivers screen
        composeTestRule
            .onNodeWithTag("driverButton")
            .performClick()

        // verify driver's screen exists
        composeTestRule
            .onNodeWithText("Drivers Screen")
            .assertExists()

        // enter driver input
        composeTestRule
            .onNodeWithTag("driverInput")
            .performTextInput("Piastri")

        // add driver
        composeTestRule
            .onNodeWithTag("addDriverButton")
            .performClick()

        // verify driver exists
        composeTestRule
            .onNodeWithText("Piastri")
            .assertExists()

        // return to home screen
        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()

        // verify return to home screen
        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertExists()
    }

}