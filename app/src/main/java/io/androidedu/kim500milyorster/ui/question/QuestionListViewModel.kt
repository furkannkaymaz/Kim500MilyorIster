package io.androidedu.kim500milyorster.ui.question

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import io.androidedu.kim500milyorster.data.local.relation.QuestionAnswer
import io.androidedu.kim500milyorster.data.repository.QuestionAnswerRepository


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Gökhan ÖZTÜRK │
//│ ──────────────────────── │
//│ G.Ozturk@Papara.com      │            
//│ ──────────────────────── │
//│ 12.12.2021               │
//└──────────────────────────┘

class QuestionListViewModel(
     questionAnswerRepository: QuestionAnswerRepository
) : ViewModel() {

    val questionAnswerList: LiveData<List<QuestionAnswer>> =
        questionAnswerRepository.getAllQuestionAndAnswer()
}