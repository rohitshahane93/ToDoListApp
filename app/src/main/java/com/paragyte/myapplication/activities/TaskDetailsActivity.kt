package com.paragyte.myapplication.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.paragyte.myapplication.R

class TaskDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_details)
        logMsg("ONCREATE CALLED")
    }

    private fun logMsg(msg: String){
        Log.d("TEST", msg);
    }
    override fun onStart() {
        super.onStart()
        logMsg("ONSTART")
    }

    override fun onRestart() {
        super.onRestart()
        logMsg("ONRESTART")
    }

    override fun onResume() {
        super.onResume()
        logMsg("ONRESUME")
    }

    override fun onPause() {
        super.onPause()
        logMsg("ONPAUSE")
    }

    override fun onStop() {
        super.onStop()
        logMsg("ONSTOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        logMsg("ONDESTROY")
    }
}
