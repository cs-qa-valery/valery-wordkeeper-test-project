package com.spinkevich.wordkeeper

import androidx.test.rule.ActivityTestRule
import com.spinkevich.wordkeeper.feature.MainActivity
import org.junit.Rule
import org.junit.Test

class TestSuite {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    private val translateScreen = TranslateScreen()
    private val studyScreen = StudyScreen()

    @Test
    fun studyTabIsOpened() {
        studyScreen {
            studyTab.click();
            studyRecycler.isDisplayed()
        }
    }

    @Test
    fun selectedChipIsAddedToStudyTab() {
        translateScreen {
            textInput.typeText("hello")
            translateScreen.closeSoftKeyboard()
            Thread.sleep(2000)
            translations.isDisplayed()
            translations {
                selectChipAt(0)
            }
            Thread.sleep(1000)
        }

        studyScreen {
            studyTab.click()
            studyRecycler {
                childAt<StudyScreen.Item>(0
                ) {
                    originalText.hasText("hello")
                    translatedText.hasText("привет")
                }
            }
        }
    }
}