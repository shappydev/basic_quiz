fun main() {
    val questions = listOf<String>(
        "What is the capital of France",
        "Which planet is known as the Red Planet?",
        "What is the largest mammal?",
        "Who painted the Mona , Lisa?",
        "What is the chemical symbol of water?"
    )

    val answers = listOf<String>(
        "paris",
        "mars",
        "blue whale",
        "leonardo da vinci",
        "h2o"
    )

    var score = 0

    println("Welcome to the Quiz!")
    println("Answer the following questions:")

    for((index, question) in questions.withIndex()) {
        print("${index + 1}.$question: ")
        val userAnswer = readLine() ?: ""
        if(userAnswer == answers[index]) {
            println("Correct!")
            score++
        } else {
            println("Incorrect. The correct answer is: ${answers[index]}")
        }
    }
    println("Quiz completed! Your score is: $score out of ${questions.size}.")
}