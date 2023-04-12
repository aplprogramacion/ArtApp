package com.apl.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.apl.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceApp()

        }
    }
}


@Composable
fun ArtView(
    modifier: Modifier = Modifier,
    drawableResourceId: Int,
    contentDescriptionResourceId: Int,
    textLabelResourceId: Int,
    onNextClick: () -> Unit,
    onPreviousClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        //Image
        Image(
            painter = painterResource(drawableResourceId),
            contentDescription = stringResource(id = contentDescriptionResourceId),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(500.dp)
                .clip(RoundedCornerShape(16.dp))
                .border(
                    BorderStroke(
                        6.dp,
                        Color.DarkGray
                    )
                )
        )
        Spacer(modifier = Modifier.height(16.dp))
        //Text Description
        Surface(
            elevation = 4.dp,
            modifier = Modifier.padding(16.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
            ) {
                Text(
                    text = stringResource(
                        id = contentDescriptionResourceId,
                        contentDescriptionResourceId
                    ),
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier
                        .padding(16.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = stringResource(id = textLabelResourceId),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier
                )
                Spacer(modifier = Modifier.height(20.dp))

            }

        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxSize()
                .background(Color.Gray)
        ) {

            Button(onClick = { onPreviousClick() }) {
                Text(
                    text = "   Previous",
                    Modifier.width(100.dp)
                )
            }
            Button(onClick = {
                onNextClick()
            }) {
                Text(
                    text = "       Next",
                    Modifier.width(100.dp)
                )

            }

        }

    }

}



@Preview(showBackground = true)
@Composable
fun ArtSpaceApp() {
    var currentImage by remember { mutableStateOf(1) }

    Surface(
        Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        when (currentImage) {
            1 -> ArtView(
                drawableResourceId = R.drawable.calacalobra,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.calacalobra,
                onNextClick = { currentImage = 2 },
                onPreviousClick = { currentImage = 11 }
            )
            2 -> ArtView(
                drawableResourceId = R.drawable.ezaro,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.ezaro,
                onNextClick = { currentImage = 3 },
                onPreviousClick = { currentImage = 1 }
            )
            3 -> ArtView(
                drawableResourceId = R.drawable.islotegaztelugatxe,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.islotegaztelugatxe,
                onNextClick = { currentImage = 4 },
                onPreviousClick = { currentImage = 2 }
            )
            4 -> ArtView(
                drawableResourceId = R.drawable.lanzarote5lucviatour,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.lanzarote5lucviatour,
                onNextClick = { currentImage = 5 },
                onPreviousClick = { currentImage = 3 }
            )
            5 -> ArtView(
                drawableResourceId = R.drawable.monasteriodesanmigueldelfai,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.monasteriodesanmigueldelfai,
                onNextClick = { currentImage = 6 },
                onPreviousClick = { currentImage = 4 }
            )
            6 -> ArtView(
                drawableResourceId = R.drawable.monasteriomontserrat,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.monasteriomontserrat,
                onNextClick = { currentImage = 7 },
                onPreviousClick = { currentImage = 5 }
            )
            7 -> ArtView(
                drawableResourceId = R.drawable.murallachinadefinestresenhuesca,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.murallachinadefinestresenhuesca,
                onNextClick = { currentImage = 8 },
                onPreviousClick = { currentImage = 6 }
            )
            8 -> ArtView(
                drawableResourceId = R.drawable.playatierraadentro,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.playatierraadentro,
                onNextClick = { currentImage = 9 },
                onPreviousClick = { currentImage = 7 }
            )
            9 -> ArtView(
                drawableResourceId = R.drawable.riourederra,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.riourederra,
                onNextClick = { currentImage = 10 },
                onPreviousClick = { currentImage = 8 }
            )
            10 -> ArtView(
                drawableResourceId = R.drawable.somiedo,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.somiedo,
                onNextClick = { currentImage = 11 },
                onPreviousClick = { currentImage = 9 }
            )
            11 -> ArtView(
                drawableResourceId = R.drawable.valledeljerte,
                contentDescriptionResourceId = R.string.pais,
                textLabelResourceId = R.string.valledeljerte,
                onNextClick = { currentImage = 1 },
                onPreviousClick = { currentImage = 10 }
            )
        }
    }
}

