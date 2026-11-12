package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import com.eddyizm.tempus.service.MediaService;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn2 {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final tn2 a;

    public kn2(MediaService mediaService, ExoPlayer exoPlayer, PendingIntent pendingIntent, yw1 yw1Var, yw1 yw1Var2, yw1 yw1Var3, pq pqVar, Bundle bundle, Bundle bundle2, x7 x7Var) {
        synchronized (b) {
            HashMap map = c;
            if (map.containsKey("")) {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
            map.put("", this);
        }
        this.a = new tn2(this, mediaService, exoPlayer, pendingIntent, yw1Var, yw1Var2, yw1Var3, pqVar, bundle, bundle2, x7Var);
    }

    public final qi3 a() {
        return this.a.s.b;
    }

    public final boolean b(fr2 fr2Var) {
        this.a.getClass();
        ms2 ms2Var = fr2Var.a;
        return ms2Var.a.a.equals("com.android.car.media") || ms2Var.a.a.equals("com.android.car.carlauncher");
    }
}
