import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testrunningapp.Destinations
import com.example.testrunningapp.Home
import com.example.testrunningapp.HomeScreen
import com.example.testrunningapp.Location
import com.example.testrunningapp.MenuList
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableIntStateOf

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold (
        bottomBar = {
            MyBottomNavigation(navController)
        }
    ) {
        Box(Modifier.padding(it)) {
            NavHost(navController, startDestination = Home.route) {
                composable (MenuList.route) {
                    MenuContent()
                }
                composable(Home.route) {
                    HomeScreen()
                }
                composable(Location.route) {
                    LocationScreen()
                }
            }
        }
    }
}

@Composable
fun MyBottomNavigation (navController: NavController){
    val listOfDestinations: List<Destinations> = listOf(
        Home,
        MenuList,
        Location
    )
    val selectedIndex = rememberSaveable {
        mutableIntStateOf(1)
    }

    BottomNavigation {
        listOfDestinations.forEachIndexed { index, destination ->
            BottomNavigationItem (
                label = { Text(text = destination.title) },
                icon = {
                    if(destination.icon != null) Icon(
                        painter = painterResource(id = destination.icon!!),
                        contentDescription = destination.title
                    )
                },
                selected = index == selectedIndex.intValue,
                onClick = {
                    selectedIndex.intValue = index
                    navController.navigate(listOfDestinations[index].route) {
                        popUpTo(Home.route)
                        launchSingleTop = true
                    }
                })
        }
    }
}