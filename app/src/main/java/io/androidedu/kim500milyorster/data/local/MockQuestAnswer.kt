package io.androidedu.kim500milyorster.data.local

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

object MockQuestAnswer {
    fun getQuestionList(): List<Pair<Question, List<Answer>>> {
        val tempList = arrayListOf<Pair<Question, List<Answer>>>()
        repeat(100) {
            val answer1 = Answer(
                it*it+1.toLong(),
                 "asda",
                false,
                it.toLong()
            )

            val answer2 = Answer(
                (it*it+2).toLong(),
                "asda",
                false,
                it.toLong()
            )

            val answer3 = Answer(
                (it*it+3).toLong(),
                "asda",
                false,
                it.toLong()
            )

            val answer4 = Answer(
                (it*it+4).toLong(),
                "asda",
                true,
                it.toLong()
            )

            val question = Question(
                it.toLong(),
                "aslşdifksgfl",
                 2
            )

            val pair = Pair(question, listOf(answer1, answer2, answer3, answer4))
            tempList.add(pair)
        }
        return tempList
    }
}