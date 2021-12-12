package io.androidedu.kim500milyorster.ui.question

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import io.androidedu.kim500milyorster.R
import io.androidedu.kim500milyorster.data.local.GameDatabase
import io.androidedu.kim500milyorster.data.repository.QuestionAnswerRepository


class QuestionListFragment : Fragment(R.layout.fragment_question_list) {

    private val gameDatabase by lazy {
        GameDatabase.getDatabase(requireContext())
    }
    private val questionDao by lazy {
        gameDatabase.questionDao()
    }
    private val questionAnswerRepository by lazy {
        QuestionAnswerRepository(questionDao)
    }
    private val questionListViewModel: QuestionListViewModel by viewModels {
        ViewModelFactory(questionAnswerRepository)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        questionListViewModel.questionAnswerList.observe(viewLifecycleOwner, {
            Log.e("asdsad", "${it.size}")
        })
    }
}