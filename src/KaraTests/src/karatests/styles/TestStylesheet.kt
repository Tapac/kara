package karatests.styles

import kara.styles.*

/** A test stylesheet builder.
 */
enum class StyleClasses : StyleClass { box }
class TestStylesheet() : Stylesheet() {
    override fun render() {
        body {
            fontFamily = "sans-serif"
            backgroundColor = c("#fa542e")
        }

        id("main") {
            clear = Clear.left
            width = 920.px
            h1 {
                lineHeight = 1.4.em
                margin = box(1.em, 0.em)
                color = c("#ff8822").lighten(0.1)
            }

            c(StyleClasses.box) {
                border = "1px solid #888"
            }
        }
    }

}
