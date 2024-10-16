package com.benedicte.youtubeclone


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun VideoItem(modifier: Modifier = Modifier) {
    Card(onClick = { /*TODO*/ }) {
        Column(modifier= Modifier
            .height(360.dp)
            .fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.a), contentDescription = "",
             contentScale = ContentScale.Crop,
            modifier= Modifier
                .height(280.dp)
                .fillMaxWidth()

            )
            Spacer(modifier=Modifier.height(10.dp))
            Row{
                Spacer(modifier=Modifier.width(16.dp))
                Image(painter = painterResource(R.drawable.a), contentDescription = "",
                    modifier= Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .clip(CircleShape))
                Spacer(modifier=Modifier.width(10.dp))
                Column {
                    Text(text = "Video Title")
                    Text(text = "Channel Name")
                }
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.MoreVert,"")
                }
            }
        }
    }
}