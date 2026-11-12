package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class io1 {
    public static final ExecutorService a = null;
    public static final Handler b = null;
    public static String c;
    public static boolean d;

    static {
        ExecutorService r0 = Executors.newCachedThreadPool();
        r0.getClass();
        a = r0;
        b = new Handler(Looper.getMainLooper());
    }

    public static final void a(MainActivity r3) {
        qp4 r0 = r3.R;
        if (r0 == null) goto L8;
        TextView r1 = (TextView) r0.b;
        if (h12.c(r1.getText(), r3.getString(R.string.homemusic_server_offline)) == false) goto L8;
        r1.setText(R.string.activity_info_offline_mode);
        r1.setVisibility(8);
    L8:
        if (d == true) goto L21;
        d = true;
        Object r2 = r3.getSystemService("power");
        r2.getClass();
        if (((PowerManager) r2).isIgnoringBatteryOptimizations(r3.getPackageName()) == false) goto L13;
        return;
    L13:
        if (xa3.u("battery_optimization", true) == true) goto L16;
        return;
    L16:
        if (r3.k().N() == true) goto L23;
        new xr().m0(r3.k(), null);
        return;
    L23:
        return;
    }
}
