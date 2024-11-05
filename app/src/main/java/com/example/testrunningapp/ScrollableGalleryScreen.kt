import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testrunningapp.R

@Composable
fun ScrollableGalleryScreen(){
    Column (modifier = Modifier.verticalScroll(rememberScrollState())){
        repeat(10, {
            Row (modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {
                repeat(2, {GalleryCell()})
            }
        })

    }
}

@Composable
fun GalleryCell(){
    Card(elevation = 16.dp, modifier= Modifier.padding(8.dp)) {
        Box(modifier = Modifier
            .height(180.dp)
            .width(180.dp)
            .padding(8.dp) ){
            Image(painter = painterResource(id = R .drawable.greeksalad), contentDescription = "Greek Salad")
            Text(text = "$12.99", style = TextStyle(color = Color.Black, fontSize = 18.sp),
                modifier = Modifier.align(Alignment.BottomEnd))
        }
    }
}