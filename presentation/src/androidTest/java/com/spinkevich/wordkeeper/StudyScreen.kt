package com.spinkevich.wordkeeper

import android.view.View
import com.agoda.kakao.recycler.KRecyclerItem
import com.agoda.kakao.recycler.KRecyclerView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import org.hamcrest.Matcher

class StudyScreen : Screen<StudyScreen>() {
    class Item(parent: Matcher<View>) : KRecyclerItem<Item>(parent) {
        val originalText = KTextView(parent) { withId(R.id.original_text) }
        val translatedText = KTextView(parent) { withId(R.id.translation_text) }
    }

    val studyRecycler = KRecyclerView({
        withId(R.id.study_words_recycler)
    }, itemTypeBuilder = {
        itemType(::Item)
    })
    val studyTab = KButton { withId(R.id.action_study_list) }
}
