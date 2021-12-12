package io.androidedu.kim500milyorster.data.repository

import io.androidedu.kim500milyorster.data.local.dao.QuestionDao


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Gökhan ÖZTÜRK │
//│ ──────────────────────── │
//│ G.Ozturk@Papara.com      │            
//│ ──────────────────────── │
//│ 12.12.2021               │
//└──────────────────────────┘

class QuestionAnswerRepository(private val questionDao: QuestionDao){

    fun getAllQuestionAndAnswer() = questionDao.getAllQuestionAndAnswer()
}