package io.petros.movies.core.list

import android.view.View
import io.petros.movies.android_test.context.TestContextProvider.context
import io.petros.movies.android_test.runner.CustomRobolectricTestRunner
import org.junit.Test
import org.junit.runner.RunWith
import strikt.api.expect
import strikt.assertions.isTrue

@RunWith(CustomRobolectricTestRunner::class)
class ErrorViewHolderRobolectricTest {

    @Test
    fun `when the error view holder is instantiated, then a click listener is set on the item view`() {
        val itemView = View(context())

        ErrorViewHolder(itemView) { }

        expect { that(itemView.hasOnClickListeners()).isTrue() }
    }

}
