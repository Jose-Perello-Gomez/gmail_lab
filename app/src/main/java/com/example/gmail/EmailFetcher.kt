package com.example.gmail

class EmailFetcher {
    companion object {
        val senders = listOf("Dahlia Cline", "Jose Perello", "Justin Alexander", "Kaya Austin", "Mark Three", "Maxis Schom", "Rafeala Garcia", "NJIT", "Bank", "Another")
        val title = "Welcome to Kotlin"
        val summary = "Welcome to this app. With Kotlin you can learn how to make android apps easily"
        fun getEmails(): MutableList<Email> {
            var emails: MutableList<Email> = ArrayList()
            for(i in 0..9) {
                val email = Email(senders[i], title, summary)
                emails.add(email)
            }
            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            var newEmails : MutableList<Email> = ArrayList()
            for (i in 10..14) {
                val email = Email(senders[i], title, summary)
                newEmails.add(email)
            }

            return newEmails
        }
    }
}