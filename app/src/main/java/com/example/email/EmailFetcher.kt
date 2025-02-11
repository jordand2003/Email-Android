package com.example.email

object EmailFetcher {
    private val senders = listOf(
        "Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes",
        "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval",
        "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould"
    )
    private const val title = "Welcome to Kotlin!"
    private const val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."

    fun getEmails(): List<Email> = senders.take(10).map { sender -> Email(sender, title, summary) }

    fun getNext5Emails(): List<Email> = senders.drop(10).take(5).map { sender -> Email(sender, title, summary) }
}