package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val day= arrayListOf<String>()
    private val max= arrayListOf<Int>()
    private val min= arrayListOf<Int>()
    private val weatherCondition= arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dayEditText = findViewById<EditText>(R.id.dayEditText)

        val minEditText = findViewById<EditText>(R.id.minEditText)

        val maxEditText = findViewById<EditText>(R.id.maxEditText)

        val weatherConditionEditText = findViewById<EditText>(R.id.weatherConditionEditText)
        val temperatureAverageTextView = findViewById<TextView>(R.id.averageTextView)

        val exitButton = findViewById<Button>(R.id.exitButton2)

        val clearButton = findViewById<Button>(R.id.clearButton)

        val nextButton = findViewById<Button>(R.id.nextButton2)

 nextButton.setOnClickListener {
     val day= dayEditText.text.to.String()
     val min= minEditText.text.String()
     val max=maxEditText.text.string()
     val weatherCondition= weatherConditionEditText.text.String()

     if (day.isNotEmpty() && min != null &&
         max != null && weatherCondition.isNotEmpty()){
         day.add(dayEditText)
         min.add(minEditText)
         max.add(maxEditText)
         weatherCondition.add(weatherConditionEditText)
         Toast.makeText(this, "Data Added", Toast.LENGTH_SHORT).show()
         clearFields(dayEditText, maxEditText, minEditText, weatherConditionEditText)
     } else {
         Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
     }
 }
        nextButton.setOnClickListener {

            val intent = Intent(this, DetailedViewScreen::class.java).apply {

                putExtra("sc", ArrayList(screenTimeDataList))

            }

            startActivity(intent)

        }

    }

    private fun clearInputs() {

        findViewById<EditText>(R.id.dayEditText).text.clear()

        findViewById<EditText>(R.id.minEditText).text.clear()

        findViewById<EditText>(R.id.maxEditText).text.clear()

        findViewById<EditText>(R.id.weatherConditionEditText).text.clear()
        clearButton.setOnClickListener {
            //day.clear()
            //min.clear()
            //max.clear()
            //weatherConditionEditText.clear()
            clearFields(dayEditText, maxEditText, minEditText, weatherConditionEditText)
        }
        nextButton.setOnClickListener {
            val intent (this,DeatailedViewScreen::class.java)
            intent.putStringArrayListExtra("days", day)

            intent.putIntegerArrayListExtra("min", min)

            intent.putIntegerArrayListExtra("max", max)

            intent.putStringArrayListExtra("weatherCondition", weatherCondition)

            startActivity(intent)
        }

    }
    private fun clearFields(vararg fields: EditText) {

        for (field in fields) {

            field.text.clear()
        }
    }
    var temperatureAverage=0
    var displayText = ""

    for (i in day.indices) {

        val AveragePerDay = min[i] + max[i]

        temperatureAverage += dailyTempratureAverage

        displayText += "Day: ${day[i]}, Minimum: ${min[i]} min, Maximum: ${max[i]} min, Condition: ${weatherCondition[i]}\n\n"

    }

    val averageScreenTime = if (day.isNotEmpty()) temperatureAverage / day.size else 0

    detailsTextView.text = displayText

    temperatureAverageTextView.text = "Average temperature: $temperatureAverage celcuis
}
