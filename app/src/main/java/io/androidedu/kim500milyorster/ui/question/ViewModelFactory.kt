package io.androidedu.kim500milyorster.ui.question

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.androidedu.kim500milyorster.data.repository.QuestionAnswerRepository


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Gökhan ÖZTÜRK │
//│ ──────────────────────── │
//│ G.Ozturk@Papara.com      │            
//│ ──────────────────────── │
//│ 12.12.2021                │
//└──────────────────────────┘

class ViewModelFactory(
    private val questionAnswerRepository: QuestionAnswerRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuestionListViewModel::class.java)) {
            @Suppress("UNCHECK_CAST")
            return QuestionListViewModel(questionAnswerRepository) as T
        }

        throw IllegalArgumentException("dsljdfkl")
    }
}