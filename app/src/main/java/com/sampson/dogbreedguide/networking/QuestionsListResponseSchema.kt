package com.sampson.dogbreedguide.networking

import com.google.gson.annotations.SerializedName
import com.sampson.dogbreedguide.questions.Question

class QuestionsListResponseSchema(@SerializedName("items") val questions: List<Question>)
