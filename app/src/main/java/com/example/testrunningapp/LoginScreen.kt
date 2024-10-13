import android.widget.MediaController
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.testrunningapp.Home
import com.example.testrunningapp.R

@Composable
fun LoginScreen(navController: NavController){
    val currentContext = LocalContext.current
    var userName by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.littlelemonlogo),
            contentDescription = "Logo Image",
            modifier= Modifier.padding(10.dp)
        )
        TextField(modifier= Modifier.padding(10.dp), value = userName, onValueChange = {
            userName = it
        }, label = { Text(text = "Username") })
        TextField(modifier= Modifier.padding(10.dp), value = password,
            onValueChange = {
                password = it
            },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation(),)
        Button(
            onClick = {
                if(userName.text == "darian"
                    && password.text=="littlelemon"
                ){
                    Toast.makeText(currentContext,
                        "Welcome to Little Lemon!",
                        Toast.LENGTH_LONG
                    ).show()
                    navController.navigate(Home.route)
                } else {
                    Toast.makeText(currentContext,
                        "Invalid credentials."
                                + "Please try again.",
                        Toast.LENGTH_LONG
                    ).show()
                }
            },
            colors = ButtonDefaults.buttonColors(
                Color(0xFF495E57)
            ),
            modifier = Modifier.padding(10.dp),
            content = { Text(text = "Login", color = Color(0xFFEDEFEE)) },

            )

    }

}