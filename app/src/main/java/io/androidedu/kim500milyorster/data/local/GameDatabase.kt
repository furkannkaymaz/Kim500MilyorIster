package io.androidedu.kim500milyorster.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import io.androidedu.kim500milyorster.data.local.dao.AnswerDao
import io.androidedu.kim500milyorster.data.local.dao.QuestionDao
import io.androidedu.kim500milyorster.model.Answer
import io.androidedu.kim500milyorster.model.Question
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


// Code with ❤️
//┌──────────────────────────┐
//│ Created by Gökhan ÖZTÜRK │
//│ ──────────────────────── │
//│ G.Ozturk@Papara.com      │            
//│ ──────────────────────── │
//│ 12.12.2021               │
//└──────────────────────────┘

@Database(entities = [Question::class, Answer::class], version = 1, exportSchema = false)
abstract class GameDatabase : RoomDatabase() {

    abstract fun questionDao(): QuestionDao
    abstract fun answerDao(): AnswerDao

    companion object {
        @Volatile
        private var INSTANCE: GameDatabase? = null

        fun getDatabase(context: Context): GameDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    GameDatabase::class.java,
                    "game_database"
                )
                    .addCallback(createCallBack)
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private val createCallBack = object : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)

                GlobalScope.launch {
                    MockQuestAnswer.getQuestionList().forEach { _pair ->
                        INSTANCE?.let {
                            it.questionDao().insertQuestion(_pair.first)
                            it.answerDao().insertAnswer(_pair.second[0])
                            it.answerDao().insertAnswer(_pair.second[1])
                            it.answerDao().insertAnswer(_pair.second[2])
                            it.answerDao().insertAnswer(_pair.second[3])
                        }
                    }
                }
            }
        }
    }
}