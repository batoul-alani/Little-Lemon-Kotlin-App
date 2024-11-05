import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun LazyGrid(){
    LazyVerticalGrid(columns = GridCells.Adaptive(140.dp)) {
        items(1000){
            GalleryCell()
        }
    }
}