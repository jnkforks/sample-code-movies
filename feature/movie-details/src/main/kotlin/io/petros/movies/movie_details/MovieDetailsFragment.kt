package io.petros.movies.movie_details

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import io.petros.movies.core.fragment.BaseFragment
import io.petros.movies.core.image.glide.displayImage
import io.petros.movies.core.view_binding.viewBinding
import io.petros.movies.domain.model.movie.Movie
import io.petros.movies.movie_details.databinding.MovieDetailsFragmentBinding

class MovieDetailsFragment : BaseFragment(R.layout.movie_details_fragment) {

    private val binding by viewBinding(MovieDetailsFragmentBinding::bind)
    private val safeArgs: MovieDetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        safeArgs.movie?.let { initMovie(it) }
    }

    private fun initMovie(movie: Movie) {
        binding.ivBackdrop.displayImage(movie.backdrop)
        binding.tvTitle.text = movie.title
        binding.tvReleaseDate.text = movie.releaseDate()
        binding.tvVote.text = movie.vote()
        binding.tvOverview.text = movie.overview
    }

}