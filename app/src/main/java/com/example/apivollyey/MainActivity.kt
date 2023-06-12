package com.example.apivollyey

import android.content.ContentValues.TAG
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {

    var url = "https://jsonplaceholder.typicode.com/posts"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var request = StringRequest(Request.Method.GET,url,{
                  Log.e(TAG,"onCreate: =========="+it)
        },{

        })

        var que = Volley.newRequestQueue(this)
        que.add(request)
    }
}