package com.example.exploracindecontenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.exploracindecontenedores.ui.theme.ExploraciónDeContenedoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExploraciónDeContenedoresTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    // Llama aquí a las funciones para mostrar cada contenedor
                    LazyColumnExample()
                    LazyRowExample()
                    GridExample()
                    ConstraintLayoutExample()
                    ScaffoldExample()
                    SurfaceExample()
                    ChipExample()
                    FlowRowExample()
                    FlowColumnExample()
                   // 1 controles
                    AlertDialogExample()
                    CardExample()
                    CheckboxExample()
                    FloatingActionButtonExample()
                    IconExample()
                    ImageExample()
                    ProgressBarExample()
                    RadioButtonExample()
                    SliderExample()
                    SpacerExample()
                    SwitchExample()
                    TopAppBarExample()
                    // 2 controles
                    BottomNavigationExample()
                    DialogExample()
                    DividerExample()
                    DropDownMenuExample()
                    LazyVerticalGridExample()
                    NavigationRailExample()
                    OutlinedTextFieldExample()
                    PagerExample()
                    SnackbarExample()
                    TabRowExample()
                    TooltipExample()

                }
            }
        }
    }


    @Composable
    fun LazyColumnExample() {
        LazyColumn {
            items(100) { index ->
                Text(text = "Item $index", modifier = Modifier.padding(8.dp))
            }
        }
    }


    @Composable
    fun LazyRowExample() {
        LazyRow {
            items(100) { index ->
                Text(text = "Item $index", modifier = Modifier.padding(8.dp))
            }
        }
    }


    @Composable
    fun GridExample() {
        LazyVerticalGrid(
            columns = GridCells.Fixed(3)
        ) {
            items(100) { index ->
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(Color.Gray)
                        .size(100.dp)
                ) {
                    Text(text = "Item $index", color = Color.White, modifier = Modifier.align(Alignment.Center))
                }
            }
        }
    }


    @Composable
    fun ConstraintLayoutExample() {
        ConstraintLayout {
            val (button1, button2) = createRefs()

            Button(onClick = {}, modifier = Modifier.constrainAs(button1) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(parent.start, margin = 16.dp)
            }) {
                Text("Button 1")
            }

            Button(onClick = {}, modifier = Modifier.constrainAs(button2) {
                top.linkTo(button1.bottom, margin = 16.dp)
                start.linkTo(parent.start, margin = 16.dp)
            }) {
                Text("Button 2")
            }
        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ScaffoldExample() {
        Scaffold(
            topBar = {
                TopAppBar(title = { Text("Scaffold Example") })
            },
            content = {
                Box(modifier = Modifier.padding(it)) {
                    Text("Hello, World!", modifier = Modifier.align(Alignment.Center))
                }
            }
        )
    }


    @Composable
    fun SurfaceExample() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Blue,
            contentColor = Color.White
        ) {
            Text("This is a Surface", modifier = Modifier.padding(16.dp))
        }
    }


    @Composable
    fun ChipExample() {
        // Usa el Chip desde el material3
        AssistChip(
            onClick = {},
            label = { Text("Chip Example") },
            modifier = Modifier.padding(8.dp)
        )
    }



    @Composable
    fun FlowRowExample() {
        Column {
            repeat(10) { index ->
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(Color.Gray)
                        .fillMaxWidth()
                ) {
                    Text(text = "Item $index", color = Color.White, modifier = Modifier.padding(8.dp))
                }
            }
        }
    }

    @Composable
    fun FlowColumnExample() {
        Row {
            repeat(10) { index ->
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(Color.Gray)
                        .fillMaxHeight()
                ) {
                    Text(text = "Item $index", color = Color.White, modifier = Modifier.padding(8.dp))
                }
            }
        }
    }

}

// 1 Controles

@Composable
fun AlertDialogExample() {
    var showDialog by remember { mutableStateOf(false) }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text("Alert Dialog") },
            text = { Text("This is an alert dialog example.") },
            confirmButton = {
                Button(onClick = { showDialog = false }) {
                    Text("OK")
                }
            },
            dismissButton = {
                Button(onClick = { showDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }

    Button(onClick = { showDialog = true }) {
        Text("Show Alert Dialog")
    }
}


@Composable
fun CardExample() {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Card Title", style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "This is an example of a Card.")
        }
    }
}


@Composable
fun CheckboxExample() {
    var checked by remember { mutableStateOf(false) }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("Check me")
    }
}


@Composable
fun FloatingActionButtonExample() {
    FloatingActionButton(
        onClick = { /* Handle click */ },
        backgroundColor = MaterialTheme.colorScheme.primary
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Add")
    }
}



@Composable
fun IconExample() {
    Icon(
        imageVector = Icons.Filled.Favorite,
        contentDescription = "Favorite Icon",
        modifier = Modifier.size(24.dp),
        tint = MaterialTheme.colorScheme.primary
    )
}

@Composable
fun ImageExample() {
    Image(
        painter = painterResource(id = R.drawable.example_image),
        contentDescription = "Example Image",
        modifier = Modifier.size(100.dp)
    )
}

@Composable
fun ProgressBarExample() {
    var loading by remember { mutableStateOf(true) }

    if (loading) {
        CircularProgressIndicator(
            modifier = Modifier
                .size(50.dp)
                .padding(16.dp)
        )
    } else {
        Text("Loading completed!")
    }
}


@Composable
fun RadioButtonExample() {
    var selectedOption by remember { mutableStateOf("Option 1") }

    Column {
        listOf("Option 1", "Option 2", "Option 3").forEach { option ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = selectedOption == option,
                    onClick = { selectedOption = option }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(option)
            }
        }
    }
}

@Composable
fun SliderExample() {
    var sliderPosition by remember { mutableStateOf(0.5f) }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            valueRange = 0f..1f
        )
        Text("Slider Value: ${sliderPosition * 100}")
    }
}

@Composable
fun SpacerExample() {
    Column {
        Text("First item")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Second item")
    }
}

@Composable
fun SwitchExample() {
    var isChecked by remember { mutableStateOf(false) }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Switch(
            checked = isChecked,
            onCheckedChange = { isChecked = it }
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(if (isChecked) "Switched On" else "Switched Off")
    }
}

@Composable
fun TopAppBarExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Top App Bar Example") },
                backgroundColor = MaterialTheme.colorScheme.primary
            )
        },
        content = { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                Text("Content goes here", modifier = Modifier.align(Alignment.Center))
            }
        }
    )
}

// 2 controles

@Composable
fun BottomNavigationExample() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation() {
                BottomNavigationItem(
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = false,
                    onClick = { /* Handle navigation */ }
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Filled.Search, contentDescription = "Search") },
                    label = { Text("Search") },
                    selected = false,
                    onClick = { /* Handle navigation */ }
                )
            }
        },
        content = { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                // Your screen content here
            }
        }
    )
}


@Composable
fun DialogExample() {
    var showDialog by remember { mutableStateOf(false) }

    if (showDialog) {
        Dialog(onDismissRequest = { showDialog = false }) {
            Surface(
                modifier = Modifier.padding(16.dp),
                shape = MaterialTheme.shapes.medium,
                elevation = 4.dp
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "This is a Dialog")
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = { showDialog = false }) {
                        Text("Close")
                    }
                }
            }
        }
    }

    Button(onClick = { showDialog = true }) {
        Text("Show Dialog")
    }
}


@Composable
fun DividerExample() {
    Column {
        Text("Item 1")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        Text("Item 2")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        Text("Item 3")
    }
}

@Composable
fun DropDownMenuExample() {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("Option 1") }

    Column {
        Text("Selected: $selectedOption", modifier = Modifier.padding(16.dp))
        Box {
            IconButton(onClick = { expanded = !expanded }) {
                Icon(Icons.Filled.ArrowDropDown, contentDescription = "Dropdown")
            }
            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                DropdownMenuItem(onClick = {
                    selectedOption = "Option 1"
                    expanded = false
                }) {
                    Text("Option 1")
                }
                DropdownMenuItem(onClick = {
                    selectedOption = "Option 2"
                    expanded = false
                }) {
                    Text("Option 2")
                }
            }
        }
    }
}


@Composable
fun LazyVerticalGridExample() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3)
    ) {
        items(20) { index ->
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .background(Color.Gray)
                    .size(100.dp)
            ) {
                Text(text = "Item $index", color = Color.White, modifier = Modifier.align(Alignment.Center))
            }
        }
    }
}


@Composable
fun NavigationRailExample() {
    Row {
        NavigationRail {
            NavigationRailItem(
                icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                label = { Text("Home") },
                selected = false,
                onClick = { /* Handle navigation */ }
            )
            NavigationRailItem(
                icon = { Icon(Icons.Filled.Search, contentDescription = "Search") },
                label = { Text("Search") },
                selected = false,
                onClick = { /* Handle navigation */ }
            )
        }
        Box(modifier = Modifier.fillMaxSize()) {
            // Your screen content here
        }
    }
}


@Composable
fun OutlinedTextFieldExample() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Enter text") },
        modifier = Modifier.padding(16.dp)
    )
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun PagerExample() {
    val pagerState = rememberPagerState()

    HorizontalPager(
        count = 3,
        state = pagerState
    ) { page ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("Page $page", color = Color.White)
        }
    }
}


@Composable
fun SnackbarExample() {
    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        content = { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                Button(onClick = {
                    snackbarHostState.showSnackbar("This is a Snackbar")
                }) {
                    Text("Show Snackbar")
                }
            }
        }
    )
}


@Composable
fun TabRowExample() {
    val pagerState = rememberPagerState()

    Column {
        TabRow(selectedTabIndex = pagerState.currentPage) {
            Tab(text = { Text("Tab 1") }, selected = pagerState.currentPage == 0, onClick = { pagerState.scrollToPage(0) })
            Tab(text = { Text("Tab 2") }, selected = pagerState.currentPage == 1, onClick = { pagerState.scrollToPage(1) })
        }
        HorizontalPager(count = 2, state = pagerState) { page ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray)
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("Tab $page content", color = Color.White)
            }
        }
    }
}

@Composable
fun TooltipExample() {
    var showTooltip by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.Gray)
            .size(100.dp)
            .pointerInput(Unit) {
                detectTapGestures(onPress = {
                    showTooltip = !showTooltip
                    tryAwaitRelease()
                    showTooltip = false
                })
            }
    ) {
        if (showTooltip) {
            Tooltip(
                text = "This is a tooltip",
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(8.dp)
            )
        }
        Text("Hover over me", modifier = Modifier.align(Alignment.Center))
    }
}


