package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardReview()
                }
            }
        }
    }
}

@Composable
fun BusinessCardReview(){
      Column(
          modifier = Modifier
              .fillMaxSize()
              .background(Color.Blue)
              .padding(16.dp),
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Center
      ){
          val logo = painterResource(R.drawable.android_logo)
          Image(painter = logo, contentDescription = null, Modifier.size(100.dp))
          val fullName = stringResource(R.string.fullName)
          val title = stringResource(R.string.title)

          Text(
              text = fullName,
              fontSize =35.sp,
              modifier = Modifier.padding(top = 10.dp, bottom = 12.dp)
          )

          Text(
              text = title,
              fontSize = 24.sp,
              fontWeight = FontWeight.Medium,
              color = Color(0xFF3ddc84),

          )
      }
    CardBottom()
}

@Composable
private fun CardBottom(){
    val icon = painterResource(R.drawable.baseline_phone_black_24dp)
    val contact = stringResource(R.string.phoneNo)
    val profile = painterResource(R.drawable.baseline_share_black_24dp)
    val social = stringResource(R.string.socialMedia)
    val mail = painterResource(R.drawable.baseline_email_black_24dp)
    val email = stringResource(R.string.email)
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(top = 220.dp, start = 0.dp, end = 0.dp, bottom = 0.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom) {
        Divider(color = Color.White, modifier = Modifier.fillMaxWidth().width(1.dp))
        Row {
            Image(painter = icon, contentDescription = null,
                Modifier
                    .size(35.dp)
                    .padding())
            Text(
                text = "  "+contact
            )
        }
        Divider(color = Color.White, modifier = Modifier.fillMaxWidth().width(1.dp))
        Row (modifier = Modifier.padding(top = 17.dp)){
            Image(painter = profile, contentDescription = null,
                Modifier
                    .size(35.dp)
                    .padding())
            Text(
                text = "  "+social
            )
        }
        Divider(color = Color.White, modifier = Modifier.fillMaxWidth().width(1.dp))
        Row (modifier = Modifier.padding(top = 17.dp, bottom = 20.dp)){
            Image(painter = mail, contentDescription = null,
                Modifier
                    .size(35.dp)
                    .padding())
            Text(
                text = "   "+email
            )
        }
    }

}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        BusinessCardReview()
    }
}