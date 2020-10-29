package com.emalindahk.chemshabongo

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What color is at the top of the rainbow?",
            R.drawable.ic_rainbow,
            "Violet", "Red",
            "Orange", "Indigo", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Who lives in a pineapple under the sea?",
            R.drawable.ic_sponge_bob,
            "Mr Krabs", "Elsa",
            "Sponge Bob", "Woody", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "How many legs does a spider have?",
            R.drawable.ic_spider,
            "4", "6",
            "10", "8", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Where does Santa Claus live?",
            R.drawable.ic_santa,
            "Madagascar", "North Pole",
            "Antarctica", "Hogwarts", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "How many teeth does a human have?",
            R.drawable.ic_teeth,
            "24", "18",
            "32", "30", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Who built the pyramids?",
            R.drawable.ic_pyramids,
            "Egyptians", "Titans",
            "Avenger", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What do you use to write on a blackboard?",
            R.drawable.ic_blackboard,
            "Crayon", "Marker Pen",
            "Chalk", "Pencil", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What do bees make?",
            R.drawable.ic_honey,
            "Nectar", "Peanut Butter",
            "Jam", "Honey", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "How many sides does a triangle have?",
            R.drawable.ic_triangle,
            "5", "3",
            "4", "7", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What color are Smurfs?",
            R.drawable.ic_smurfs,
            "Blue", "Black",
            "Yellow", "Green", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}