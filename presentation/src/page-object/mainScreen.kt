import com.spinkevich.wordkeeper.

open class mainScreen : Screen<mainScreen>() {
    val language1 = KTextView { withId(R.id.from_language) }
    val language2 = KTextView { withId(R.id.to_language) }
}