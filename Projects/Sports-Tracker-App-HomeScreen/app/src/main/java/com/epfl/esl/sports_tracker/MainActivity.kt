package com.epfl.esl.sports_tracker
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.epfl.esl.sports_tracker.ui.theme.Sports_TrackerTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    private val TAG= "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        demoLogcat()

        setContent {
            Sports_TrackerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)

                    )
                }
                HomeScreen()
            }
        }

        }
    private fun demoLogcat(){
        Log.v(TAG,"Verbose")
        Log.d(TAG, "Debug")
        Log.i(TAG, "Information")
        Log.w(TAG, "Warning")
        Log.e(TAG, "Error")
    }
    }


@Composable
fun HomeScreen(modifier: Modifier= Modifier){
    Surface(
        modifier=modifier.fillMaxSize(),
        color= MaterialTheme.colorScheme.background



    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter= painterResource(id=R.drawable.ic_logo),
                contentDescription="Logo Sports Tracker"
            )
            Text(
                text="This is my first app!",
                style= TextStyle(fontSize = 36.sp))
        }


    }


}
@Preview
@Composable
fun HomeScreenPreview(){
    Sports_TrackerTheme() {
        HomeScreen()
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "This is my first app in $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Sports_TrackerTheme {
        Greeting("Android")
    }
}