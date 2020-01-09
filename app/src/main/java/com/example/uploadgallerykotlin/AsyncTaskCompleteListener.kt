package com.example.uploadgallerykotlin

interface AsyncTaskCompleteListener {
    fun onTaskCompleted(response: String, serviceCode: Int)
}