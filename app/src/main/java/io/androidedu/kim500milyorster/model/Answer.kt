package io.androidedu.kim500milyorster.model

import androidx.room.Entity
import androidx.room.PrimaryKey


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Gökhan ÖZTÜRK │
//│ ──────────────────────── │
//│ G.Ozturk@Papara.com      │            
//│ ──────────────────────── │
//│ 12.12.2021               │
//└──────────────────────────┘

@Entity
data class Answer(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val answer: String,
    val isRightAnswer: Boolean,

    val questionId: Long
)