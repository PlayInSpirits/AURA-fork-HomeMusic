package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class io1 {
    public static final ExecutorService a;
    public static final Handler b;
    public static String c;
    public static boolean d;

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        newCachedThreadPool.getClass();
        a = newCachedThreadPool;
        b = new Handler(Looper.getMainLooper());
    }

    public static final void a(MainActivity mainActivity) {
        qp4 qp4Var = mainActivity.R;
        if (qp4Var != null) {
            TextView textView = (TextView) qp4Var.b;
            if (h12.c(textView.getText(), mainActivity.getString(R.string.homemusic_server_offline))) {
                textView.setText(R.string.activity_info_offline_mode);
                textView.setVisibility(8);
            }
        }
        if (d) {
            return;
        }
        d = true;
        Object systemService = mainActivity.getSystemService("power");
        systemService.getClass();
        if (((PowerManager) systemService).isIgnoringBatteryOptimizations(mainActivity.getPackageName()) || !xa3.u("battery_optimization", true) || mainActivity.k().N()) {
            return;
        }
        new xr().m0(mainActivity.k(), null);
    }
}
