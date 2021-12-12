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
data class Question(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val questionDesc: String,
    val questionLevel: Int
)