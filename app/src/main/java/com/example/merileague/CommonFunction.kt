package com.example.merileague

import java.text.SimpleDateFormat
import java.util.*

class CommonFunction {

    companion object{
        fun dateFormat(dateTime: String): String {

            val dateFormat = "MMMMM yyyy"
            val formatter = SimpleDateFormat(dateFormat, Locale.getDefault())
            val calendar = Calendar.getInstance()

            calendar.timeInMillis = dateTime.toLong()
            return formatter.format(calendar.time).toString()
          /*    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
              val formatter = SimpleDateFormat("dd-MM-yyyy hh:mm a")
              return formatter.format(parser.parse(dateTime))*/
        }
    }
}