# ST10450884_Bogoshi_Manong_Masha
IMAD Practicum
GitHub repository:ST10450883/ST10450884_Bogoshi_Manong_Masha: IMAD Practicum (github.com) 

 
Purpose and explanation of the app: 

The app's purpose is to allow the user to preview the average temperature for the week and view the information in detailed form for each day. The app consists of three screens, the splash screen, main screen and detailed view screen. Each screen has its own purpose, the first screen is the splash screen. The purpose of the screen is to show the user my name, student number and the name of the app. The design view consists of a logo, three text views; one displays the name of the app the second text view displays my name, and the last one displays my student number and has two buttons that navigate to the main screen and allows you to exit the app which is determined by the user. The second screen which is the main screen of the app consists of three buttons; the first button allows you to navigate to the detailed view screen, the second button allows you to clear the input if the user entered it wrong by mistake and the other button allows you to exit the app. There is a text view that displays the average temperature for the week on the main screen. Lastly the third screen, which is the detailed view screen displays the detailed information of each day’s temperature including the minimum and maximum temperature following with the weather condition. It has one button which it allows you to navigate back to the main screen 

 

Pseudocode: 

For the first screen: 
val nextButton=findViewById<Button>(R.id.nextButton) 
val exitButton= findViewById<Button>(R.id.exitButton) 
 
nextButton.setOnClickListener { 
 val intent(this, MainActivity::class.java) 
 startActivity(intent) 
} 
exitButton.setOnClickListener { 
 finish() 

Second screen: 

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
 
temperatureAverage+=dailyTempratureAverage 
 
 displayText += "Day: ${day[i]}, Minimum: ${min[i]} min, Maximum: ${max[i]} min, Condition: ${weatherCondition[i]}\n\n" 
 
 }val averageScreenTime = if (day.isNotEmpty()) temperatureAverage / day.size else 0 
 
detailsTextView.text=displayText 
 
 temperatureAverageTextView.text = "Average temperature: $temperatureAverage celcuis 
} 
 

For the third screem: 

val day=intent.getStringArrayExtra("days")?:arrayListOf() 
val max = intent.getIntegerArrayListExtra("max") ?: arrayListOf() 
val min = intent.getIntegerArrayListExtra("min") ?: arrayListOf() 
val weatherCoNDITION= intent.getStringArrayListExtra("weatherCondition") ?: arrayListOf() 
val details = findViewById<TextView>(R.id.detailsTextView) 
val backButton=findViewById<Button>(R.id.backButton) 
 
backButton.setOnClickListener { 
 
 val intent = Intent(this,MainActivity::class.java) 
 
 startActivity(intent) 
} 

 

 


 
