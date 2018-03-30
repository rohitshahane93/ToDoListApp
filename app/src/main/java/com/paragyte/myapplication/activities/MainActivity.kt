package com.paragyte.myapplication.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.paragyte.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logMsg("ONCREATE CALLED")
        var table : TableLayout = findViewById(R.id.activityMainTableLayout) as TableLayout
        table.addView(getTableRow("First task"))
        table.addView(getTableRow("Second task"))
        table.addView(getTableRow("Third task"))
        table.addView(getTableRow("Fourth task"))
        table.addView(getTableRow("Fifth task"))
    }

    private fun logMsg(msg: String){
        Log.d("TEST", msg);
    }

    private fun getTableRow(taskName : String): TableRow{
        var tableRow = TableRow(this@MainActivity)
        var lp : TableRow.LayoutParams = TableRow.LayoutParams()
        lp.width = TableRow.LayoutParams.MATCH_PARENT
        tableRow.layoutParams = lp

        var tvBullet: TextView = layoutInflater.inflate(R.layout.tv_bullet, null) as TextView
        var tvCell: TextView = layoutInflater.inflate(R.layout.textview_cell, null) as TextView

        tvCell.text = taskName
        tableRow.addView(tvBullet)
        tableRow.addView(tvCell)
        return tableRow
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
