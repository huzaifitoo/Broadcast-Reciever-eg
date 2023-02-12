package com.example.broadcastrecievereg

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirPlaneMode: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneModeEnabled = intent?.getBooleanExtra("state",false)?: return

        if (isAirPlaneModeEnabled){
            Toast.makeText(context, "airplane mode enabled", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context, "airplane mode disabled", Toast.LENGTH_LONG).show()
        }
    }
}