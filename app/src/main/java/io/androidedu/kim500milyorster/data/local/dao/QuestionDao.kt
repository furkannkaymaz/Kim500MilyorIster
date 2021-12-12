package io.androidedu.kim500milyorster.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import io.androidedu.kim500milyorster.data.local.relation.QuestionAnswer
import io.androidedu.kim500milyorster.model.Question


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Gökhan ÖZTÜRK │
//│ ──────────────────────── │
//│ G.Ozturk@Papara.com      │            
//│ ──────────────────────── │
//│ 12.12.2021               │
//└──────────────────────────┘

@Dao
interface QuestionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuestion(question: Question)

    @Delete
    suspend fun deleteQuestion(question: Question)

    @Update
    suspend fun updateQuestion(question: Question)

    @Transaction
    @Query("SELECT * FROM Question")
    fun getAllQuestionAndAnswer(): LiveData<List<QuestionAnswer>>
}