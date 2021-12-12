package io.androidedu.kim500milyorster.data.local.relation

import androidx.room.Embedded
import androidx.room.Relation
import io.androidedu.kim500milyorster.model.Answer
import io.androidedu.kim500milyorster.model.Question


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Gökhan ÖZTÜRK │
//│ ──────────────────────── │
//│ G.Ozturk@Papara.com      │            
//│ ──────────────────────── │
//│ 12.12.2021               │
//└──────────────────────────┘

data class QuestionAnswer(
    @Embedded
    val question: Question,
    @Relation(
        parentColumn = "id",
        entityColumn = "questionId"
    )
    val answerList: List<Answer>
)