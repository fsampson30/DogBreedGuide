package com.sampson.dogbreedguide.networking

import com.google.gson.annotations.SerializedName
import com.sampson.dogbreedguide.questions.QuestionWithBody

data class SingleQuestionResponseSchema(@SerializedName("items") val questions: List<QuestionWithBody>) {
    val question: QuestionWithBody get() = questions[0]
}
