package it.jaschke.alexandria;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by matthewmcgivney on 12/7/15.
 */
public class NetworkUtility {
    public static boolean isConnected(Context c) {
        ConnectivityManager conManager =
                (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = conManager
                .getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        } else {
            return false;
        }
    }

    public static void showPleaseConnectToast(Context c) {
        CharSequence text = c.getResources().getString(R.string.please_connect);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(c, text, duration);
        toast.show();
    }
}
