package com.spinkevich.wordkeeper

import androidx.test.espresso.DataInteraction
import com.agoda.kakao.chipgroup.KChipGroup
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.list.KAbsListView
import com.agoda.kakao.list.KAdapterItem
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView

class TranslateScreen : Screen<TranslateScreen>() {

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val lang_english = KTextView { withText("English") }
        val lang_german = KTextView { withText("German") }
        val lang_russian = KTextView { withText("Russian") }
        val lang_estonian = KTextView { withText("Estonian") }
        val lang_turkish = KTextView { withText("Turkish") }
        //TODO: find out how to replace it all with one KTextView
    }

    val languageFrom = KTextView { withId(R.id.from_language) }
    val languageTo = KTextView { withId(R.id.to_language) }
    val languageList = KAbsListView(
        builder = { withId(R.id.languages_list) },
        itemTypeBuilder = { itemType(::Item) })
    val textInput = KEditText { withId(R.id.text_for_translation) }
    val translations = KChipGroup { withId(R.id.translation_group) }
    val translateTab = KButton { withId(R.id.action_translate) }

    //TODO: find out how to pass params to functions to choose languages from an array or list
    fun changeFirstLanguageToEnglish() {
        onScreen<TranslateScreen> {
            languageFrom.click()
            languageList {
                childAt<Item>(0) {
                    lang_english.click()
                }
            }
        }
    }

    fun changeFirstLanguageToGerman() {
        onScreen<TranslateScreen> {
            languageFrom.click()
            languageList {
                childAt<Item>(0) {
                    lang_german.click()
                }
            }
        }
    }

    fun changeFirstLanguageToRussian() {
        onScreen<TranslateScreen> {
            languageFrom.click()
            languageList {
                childAt<Item>(0) {
                    lang_russian.click()
                }
            }
        }
    }

    fun changeFirstLanguageToEstonian() {
        onScreen<TranslateScreen> {
            languageFrom.click()
            languageList {
                childAt<Item>(0) {
                    lang_estonian.click()
                }
            }
        }
    }

    fun changeFirstLanguageToTurkish() {
        onScreen<TranslateScreen> {
            languageFrom.click()
            languageList {
                childAt<Item>(0) {
                    lang_turkish.click()
                }
            }
        }
    }

    fun changeSecondLanguageToEnglish() {
        onScreen<TranslateScreen> {
            languageTo.click()
            languageList {
                childAt<Item>(0) {
                    lang_english.click()
                }
            }
        }
    }

    fun changeSecondLanguageToGerman() {
        onScreen<TranslateScreen> {
            languageTo.click()
            languageList {
                childAt<Item>(0) {
                    lang_german.click()
                }
            }
        }
    }

    fun changeSecondLanguageToRussian() {
        onScreen<TranslateScreen> {
            languageTo.click()
            languageList {
                childAt<Item>(0) {
                    lang_russian.click()
                }
            }
        }
    }

    fun changeSecondLanguageToEstonian() {
        onScreen<TranslateScreen> {
            languageTo.click()
            languageList {
                childAt<Item>(0) {
                    lang_estonian.click()
                }
            }
        }
    }

    fun changeSecondLanguageToTurkish() {
        onScreen<TranslateScreen> {
            languageTo.click()
            languageList {
                childAt<Item>(0) {
                    lang_turkish.click()
                }
            }
        }
    }
}
