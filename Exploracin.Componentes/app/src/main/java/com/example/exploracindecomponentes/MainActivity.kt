package com.example.exploracindecomponentes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.example.exploracindecomponentes.ui.theme.ExploracióndecomponentesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExploracióndecomponentesTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Jetpack Compose Components") }) }
    ) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            LazyColumn {
                items(20) { index ->
                    Text("Item $index", modifier = Modifier.padding(8.dp))
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            LazyRow {
                items(10) { index ->
                    Text("Item $index", modifier = Modifier.padding(8.dp))
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Grid()
            Spacer(modifier = Modifier.height(16.dp))
            ConstraintLayoutExample()
            Spacer(modifier = Modifier.height(16.dp))
            SurfaceExample()
            Spacer(modifier = Modifier.height(16.dp))
            ChipExample()
            Spacer(modifier = Modifier.height(16.dp))
            BackdropScaffoldExample()
            Spacer(modifier = Modifier.height(16.dp))
            FlowRowExample()
            Spacer(modifier = Modifier.height(16.dp))
            FlowColumnExample()
            Spacer(modifier = Modifier.height(16.dp))
            AlertDialogExample()
            Spacer(modifier = Modifier.height(16.dp))
            CardExample()
            Spacer(modifier = Modifier.height(16.dp))
            CheckboxExample()
            Spacer(modifier = Modifier.height(16.dp))
            FloatingActionButtonExample()
            Spacer(modifier = Modifier.height(16.dp))
            IconExample()
            Spacer(modifier = Modifier.height(16.dp))
            ImageExample()
            Spacer(modifier = Modifier.height(16.dp))
            ProgressBarExample()
            Spacer(modifier = Modifier.height(16.dp))
            RadioButtonExample()
            Spacer(modifier = Modifier.height(16.dp))
            SliderExample()
            Spacer(modifier = Modifier.height(16.dp))
            SpacerExample()
            Spacer(modifier = Modifier.height(16.dp))
            SwitchExample()
            Spacer(modifier = Modifier.height(16.dp))
            TopAppBarExample()
            Spacer(modifier = Modifier.height(16.dp))
            BottomNavigationExample()
            Spacer(modifier = Modifier.height(16.dp))
            DialogExample()
            Spacer(modifier = Modifier.height(16.dp))
            DividerExample()
            Spacer(modifier = Modifier.height(16.dp))
            DropDownMenuExample()
            Spacer(modifier = Modifier.height(16.dp))
            LazyVerticalGridExample()
            Spacer(modifier = Modifier.height(16.dp))
            NavigationRailExample()
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextFieldExample()
            Spacer(modifier = Modifier.height(16.dp))
            PagerExample()
            Spacer(modifier = Modifier.height(16.dp))
            SnackbarExample()
            Spacer(modifier = Modifier.height(16.dp))
            TabRowExample()
            Spacer(modifier = Modifier.height(16.dp))
            TooltipExample()
        }
    }
}

// Implement each composable function below
@Composable
fun Grid() {
    // Your Grid implementation here
}

@Composable
fun ConstraintLayoutExample() {
    // Your ConstraintLayout implementation here
}

@Composable
fun SurfaceExample() {
    // Your Surface implementation here
}

@Composable
fun ChipExample() {
    // Your Chip implementation here
}

@Composable
fun BackdropScaffoldExample() {
    // Your BackdropScaffold implementation here
}

@Composable
fun FlowRowExample() {
    // Your FlowRow implementation here
}

@Composable
fun FlowColumnExample() {
    // Your FlowColumn implementation here
}

@Composable
fun AlertDialogExample() {
    // Your AlertDialog implementation here
}

@Composable
fun CardExample() {
    // Your Card implementation here
}

@Composable
fun CheckboxExample() {
    // Your Checkbox implementation here
}

@Composable
fun FloatingActionButtonExample() {
    // Your FloatingActionButton implementation here
}

@Composable
fun IconExample() {
    // Your Icon implementation here
}

@Composable
fun ImageExample() {
    // Your Image implementation here
}

@Composable
fun ProgressBarExample() {
    // Your ProgressBar implementation here
}

@Composable
fun RadioButtonExample() {
    // Your RadioButton implementation here
}

@Composable
fun SliderExample() {
    // Your Slider implementation here
}

@Composable
fun SpacerExample() {
    // Your Spacer implementation here
}

@Composable
fun SwitchExample() {
    // Your Switch implementation here
}

@Composable
fun TopAppBarExample() {
    // Your TopAppBar implementation here
}

@Composable
fun BottomNavigationExample() {
    // Your BottomNavigation implementation here
}

@Composable
fun DialogExample() {
    // Your Dialog implementation here
}

@Composable
fun DividerExample() {
    // Your Divider implementation here
}

@Composable
fun DropDownMenuExample() {
    // Your DropDownMenu implementation here
}

@Composable
fun LazyVerticalGridExample() {
    // Your LazyVerticalGrid implementation here
}

@Composable
fun NavigationRailExample() {
    // Your NavigationRail implementation here
}

@Composable
fun OutlinedTextFieldExample() {
    // Your OutlinedTextField implementation here
}

@Composable
fun PagerExample() {
    // Your Pager implementation here
}

@Composable
fun SnackbarExample() {
    // Your Snackbar implementation here
}

@Composable
fun TabRowExample() {
    // Your TabRow implementation here
}

@Composable
fun TooltipExample() {
    // Your Tooltip implementation here
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExploracióndecomponentesTheme {
        Greeting("Android")
    }
}