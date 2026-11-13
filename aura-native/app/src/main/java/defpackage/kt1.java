package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.util.Log;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.b;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class kt1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    public /* synthetic */ kt1(int i, String str) {
        this.n = i;
        this.o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = 1;
        String str = this.o;
        switch (i) {
            case 0:
                io1.a.execute(new kt1(i2, str));
                break;
            case 1:
                ConcurrentHashMap concurrentHashMap = ot1.b;
                Integer num = (Integer) concurrentHashMap.get(str);
                if ((num != null ? num.intValue() : 0) <= 0) {
                    concurrentHashMap.remove(str);
                    try {
                        au0.D(App.a()).m(str);
                        Log.d("HubTracks", "dropped the original stored as a light stream: " + str);
                        break;
                    } catch (Exception e) {
                        Log.w("HubTracks", "could not drop " + str, e);
                        return;
                    }
                }
                break;
            case 2:
                WaveSession waveSession = b.b;
                if (waveSession != null && waveSession.isWave(str)) {
                    b.c();
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                MutableContextWrapper mutableContextWrapper = hw.h;
                Context baseContext = mutableContextWrapper != null ? mutableContextWrapper.getBaseContext() : null;
                Activity activity = baseContext instanceof Activity ? (Activity) baseContext : null;
                if (activity != null) {
                    Intent putExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str);
                    putExtra.getClass();
                    activity.startActivity(Intent.createChooser(putExtra, activity.getString(R.string.homemusic_share_title)));
                    break;
                }
                break;
            default:
                File e2 = xt3.e(str);
                if (e2.exists()) {
                    e2.delete();
                    break;
                }
                break;
        }
    }
}
