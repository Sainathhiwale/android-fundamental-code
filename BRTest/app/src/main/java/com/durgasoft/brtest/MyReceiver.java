package com.durgasoft.brtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

/**
 * Created by maheshthippala on 18/04/16.
 */
public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        MainActivity activity=(MainActivity)context;

        TextView tv=(TextView)activity.findViewById(R.id.textView);

        if(intent.getAction()==Intent.ACTION_HEADSET_PLUG){

            tv.setText("Headset Plugin ...");

        }else if(intent.getAction()==Intent.ACTION_POWER_CONNECTED){


            tv.setText("Power Connected ...");

        }else if(intent.getAction()==Intent.ACTION_POWER_DISCONNECTED){


            tv.setText("Power Disconnected  ...");

        }else if(intent.getAction()==Intent.ACTION_SCREEN_ON){


            tv.setText("Screen ON  ...");

        }else if(intent.getAction()==Intent.ACTION_SCREEN_OFF){


            tv.setText("Screen  OFF ...");
        }


    }
}
