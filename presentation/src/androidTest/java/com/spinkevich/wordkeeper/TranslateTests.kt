package com.spinkevich.wordkeeper

import androidx.test.espresso.action.ViewActions
import androidx.test.rule.ActivityTestRule
import com.spinkevich.wordkeeper.feature.MainActivity
import org.junit.Rule
import org.junit.Test

class TranslationTests {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    private val translateScreen = TranslateScreen()

    @Test
    fun textIsTranslatedToGerman() {
        translateScreen {
            changeSecondLanguageToGerman()
            textInput.typeText("hello")
            Thread.sleep(2000)
            translations {
                hasChip("Hallo")
            }
        }
    }

    @Test
    fun textIsTranslatedToRussian() {
        translateScreen {
            changeSecondLanguageToRussian()
            textInput.typeText("hello")
            Thread.sleep(2000)
            translateScreen.closeSoftKeyboard()
            translations.isDisplayed()
            translations {
                hasChip("привет")
            }
        }
    }

    @Test
    //BUG. Expected: "Tere", Actual: Translation error
    fun textIsTranslatedToEstonian() {
        translateScreen {
            changeSecondLanguageToEstonian()
            textInput.typeText("hello")
            Thread.sleep(2000)
            translations.isDisplayed()
            translations {
                hasChip("Tere")
            }
        }
    }

    @Test
    fun textIsTranslatedToTurkish() {
        translateScreen {
            changeSecondLanguageToTurkish()
            textInput.typeText("hello")
            Thread.sleep(2000)
            translateScreen.closeSoftKeyboard()
            translations.isDisplayed()
            translations {
                hasChip("merhaba")
            }
            ViewActions.pressBack()
        }
    }
}