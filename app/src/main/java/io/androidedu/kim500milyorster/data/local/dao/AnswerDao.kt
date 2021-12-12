package io.androidedu.kim500milyorster.data.local.dao

import androidx.room.*
import io.androidedu.kim500milyorster.model.Answer


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Gökhan ÖZTÜRK │
//│ ──────────────────────── │
//│ G.Ozturk@Papara.com      │            
//│ ──────────────────────── │
//│ 12.12.2021               │
//└──────────────────────────┘

@Dao
interface AnswerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAnswer(answer: Answer)

    @Delete
    suspend fun deleteAnswer(answer: Answer)

    @Update
    suspend fun updateAnswer(answer: Answer)
}