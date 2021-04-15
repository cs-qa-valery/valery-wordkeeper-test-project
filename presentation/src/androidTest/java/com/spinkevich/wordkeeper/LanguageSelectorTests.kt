package com.spinkevich.wordkeeper

import androidx.test.rule.ActivityTestRule
import com.spinkevich.wordkeeper.feature.MainActivity
import org.junit.Rule
import org.junit.Test

class LanguageSelectorTests {

    @JvmField
    @Rule
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    private val translateScreen = TranslateScreen()

    @Test
    fun languageSelectorsAreDisplayed() {
        translateScreen {
            languageFrom.isDisplayed()
            languageTo.isDisplayed()
        }
    }

    @Test
    fun languageToListIsOpenedOnClick_AndListIsRendered() {
        translateScreen {
            languageTo.click()
            languageList.isDisplayed()
            languageList.hasSize(5)
        }
    }

    @Test
    fun languageFromListIsOpenedOnClick_AndListIsRendered() {
        translateScreen {
            languageFrom.click()
            languageList.isDisplayed()
            languageList.hasSize(5)
        }
    }

    //TODO: Find out how to run all tests below in two for-loops
    @Test
    fun languageFromChangesToGerman() {
        translateScreen {
            changeFirstLanguageToGerman()
            languageFrom.hasText("DE")
        }
    }

    @Test
    fun languageFromChangesToRussian() {
        translateScreen {
            changeFirstLanguageToRussian()
            languageFrom.hasText("RU")
        }
    }

    @Test
    fun languageFromChangesToEstonian() {
        translateScreen {
            changeFirstLanguageToEstonian()
            languageFrom.hasText("EE") //Bug. Expected: EE | Actual: FIN
        }
    }

    @Test
    fun languageFromChangesToTurkish() {
        translateScreen {
            changeFirstLanguageToTurkish()
            languageFrom.hasText("TR")
        }
    }

    @Test
    fun languageFromChangesToEnglish() {
        translateScreen {
            changeFirstLanguageToEnglish()
            languageFrom.hasText("EN")
        }
    }

    @Test
    fun languageToChangesToGerman() {
        translateScreen {
            changeSecondLanguageToGerman()
            languageTo.hasText("DE")
        }
    }

    @Test
    fun languageToChangesToRussian() {
        translateScreen {
            changeSecondLanguageToRussian()
            languageTo.hasText("RU")
        }
    }

    @Test
    fun languageToChangesToEstonian() {
        translateScreen {
            changeSecondLanguageToEstonian()
            languageTo.hasText("EE") //Bug. Expected: EE | Actual: FIN
        }
    }

    @Test
    fun languageToChangesToTurkish() {
        translateScreen {
            changeSecondLanguageToTurkish()
            languageTo.hasText("TR")
        }
    }

    @Test
    fun languageToChangesToEnglish() {
        translateScreen {
            changeSecondLanguageToEnglish()
            languageTo.hasText("EN")
        }
    }
}