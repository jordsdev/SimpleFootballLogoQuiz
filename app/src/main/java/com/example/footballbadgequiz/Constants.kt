package com.example.footballbadgequiz

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What football team does this badge belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What football team does this badge belong to?",
            R.drawable.ic_flag_of_senegal,
            "Senegal", "Austria",
            "England", "Italy", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What team does this badge belong to?",
            R.drawable.ic_flag_of_gibralta,
            "Belgium", "Tunisia",
            "Scotland", "Gibralta", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What team does this badge belong to?",
            R.drawable.ic_flag_of_kazakhstan,
            "Bahamas", "Kazakhstan",
            "Germany", "France", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What team does this badge belong to?",
            R.drawable.ic_flag_of_morocco,
            "Gabon", "Austria",
            "Morocco", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What team does this badge belong to?",
            R.drawable.ic_flag_of_ukraine,
            "Ukraine", "England",
            "Greece", "Scotland", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What team does this badge belong to?",
            R.drawable.ic_flag_of_poland,
            "Dominica", "Egypt",
            "Poland", "Russia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What team does this badge belong to?",
            R.drawable.ic_flag_of_tunisia,
            "Ireland", "Iran",
            "Hungary", "Tunisia", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What team does this badge belong to?",
            R.drawable.ic_flag_of_ivorycoast,
            "Australia", "Ivory Coast",
            "Egypt", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What team does this badge belong to?",
            R.drawable.ic_flag_of_netherlands,
            "Netherlands", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "What team does this badge belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium", "Australia",
            "Denmark", "Egypt", 1
        )

        questionsList.add(que11)

        // 12
        val que12 = Question(
            12, "What team does this badge belong to?",
            R.drawable.ic_flag_of_montenegro,
            "France", "Austria",
            "Montenegro", "Italy", 3
        )

        questionsList.add(que12)

        // 13
        val que13 = Question(
            13, "What team does this badge belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que13)

        // 14
        val que14 = Question(
            14, "What team does this badge belong to?",
            R.drawable.ic_flag_of_bulgaria,
            "Bahamas", "Bulgaria",
            "Denmark", "Sweden", 2
        )

        questionsList.add(que14)

        // 15
        val que15 = Question(
            15, "What team does this badge belong to?",
            R.drawable.ic_flag_of_egypt,
            "Gabon", "France",
            "Egypt", "Poland", 3
        )

        questionsList.add(que15)

        // 16
        val que16 = Question(
            16, "What team does this badge belong to?",
            R.drawable.ic_flag_of_columbia,
            "Columbia", "Northern Ireland",
            "Greece", "Wales", 1
        )

        questionsList.add(que16)

        // 17
        val que17 = Question(
            17, "What team does this badge belong to?",
            R.drawable.ic_flag_of_england,
            "Dominica", "Egypt",
            "England", "Spain", 3
        )

        questionsList.add(que17)

        // 18
        val que18 = Question(
            18, "What team does this badge belong to?",
            R.drawable.ic_flag_of_germany,
            "Ireland", "Iran",
            "Hungary", "Germany", 4
        )

        questionsList.add(que18)

        // 19
        val que19 = Question(
            19, "What team does this badge belong to?",
            R.drawable.ic_flag_of_portugal,
            "Australia", "France",
            "Portugal", "Spain", 2
        )

        questionsList.add(que19)

        // 20
        val que20 = Question(
            20, "What team does this badge belong to?",
            R.drawable.ic_flag_of_uraguay,
            "Uraguay", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que20)

        // 21
        val que21 = Question(
            21, "What team does this badge belong to?",
            R.drawable.ic_flag_of_france,
            "France", "Australia",
            "England", "Egypt", 1
        )

        questionsList.add(que21)

        // 22
        val que22 = Question(
            22, "What team does this badge belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que22)

        // 23
        val que23 = Question(
            23, "What team does this badge belong to?",
            R.drawable.ic_flag_of_peru,
            "Belarus", "Morocco",
            "Uraguay", "Peru", 4
        )

        questionsList.add(que23)

        // 24
        val que24 = Question(
            24, "What team does this badge belong to?",
            R.drawable.ic_flag_of_japan,
            "Bahamas", "Japan",
            "Poland", "Senegal", 2
        )

        questionsList.add(que24)

        // 25
        val que25 = Question(
            25, "What team does this badge belong to?",
            R.drawable.ic_flag_of_wales,
            "Gabon", "France",
            "Wales", "Peru", 3
        )

        questionsList.add(que25)

        // 26
        val que26 = Question(
            26, "What team does this badge belong to?",
            R.drawable.ic_flag_of_scotland,
            "Scotland", "Georgia",
            "Greece", "Portugal", 1
        )

        questionsList.add(que26)

        // 27
        val que27 = Question(
            27, "What team does this badge belong to?",
            R.drawable.ic_flag_of_panama,
            "Dominica", "Egypt",
            "Panama", "Ethiopia", 3
        )

        questionsList.add(que27)

        // 28
        val que28 = Question(
            28, "What team does this badge belong to?",
            R.drawable.ic_flag_of_nigeria,
            "Ireland", "England",
            "Hungary", "Nigeria", 4
        )

        questionsList.add(que28)

        // 29
        val que29 = Question(
            29, "What team does this badge belong to?",
            R.drawable.ic_flag_of_italy,
            "Australia", "Italy",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que29)

        // 30
        val que30 = Question(
            30, "What team does this badge belong to?",
            R.drawable.ic_flag_of_mexico,
            "Mexico", "Jordan",
            "Wales", "Palestine", 1
        )

        questionsList.add(que30)

        return questionsList
    }
}