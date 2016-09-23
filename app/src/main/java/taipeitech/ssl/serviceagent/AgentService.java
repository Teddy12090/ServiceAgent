package taipeitech.ssl.serviceagent;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.Toast;

import java.io.FileDescriptor;
import java.net.UnknownServiceException;

public class AgentService extends IntentService {
    public AgentService() {
        super("AgentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        WifiService wifiService = new WifiService((WifiManager) getSystemService(Context.WIFI_SERVICE));
        switch (intent.getAction()) {
            case "setWifiEnabled":
                wifiService.setWifiEnabled(intent.getBooleanExtra("enabled", true));
                break;
            default:
                Toast.makeText(this, "Unknown action:" + intent.getAction(), Toast.LENGTH_SHORT).show();
                throw new UnknownError(intent.getAction());
        }
        return super.onStartCommand(intent, flags, startId);
    }
}
