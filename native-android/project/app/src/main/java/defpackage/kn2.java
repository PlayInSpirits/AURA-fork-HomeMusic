package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import com.eddyizm.tempus.service.MediaService;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn2 {
    public static final Object b = null;
    public static final HashMap c = null;
    public final tn2 a;

    static {
        b = new Object();
        c = new HashMap();
    }

    public kn2(MediaService r13, ExoPlayer r14, PendingIntent r15, yw1 r16, yw1 r17, yw1 r18, pq r19, Bundle r20, Bundle r21, x7 r22) {
        Object r2 = b;
        monitor-enter(r2);
        HashMap r3 = c;     // Catch: Throwable -> L10
        if (r3.containsKey("") == true) goto L13;
        r3.put("", this);     // Catch: Throwable -> L10
        monitor-exit(r2);     // Catch: Throwable -> L10
        this.a = new tn2(this, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        return;
    L13:
        throw new IllegalStateException("Session ID must be unique. ID=");     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public final qi3 a() {
        return this.a.s.b;
    }

    public final boolean b(fr2 r2) {
        this.a.getClass();
        ms2 r1 = r2.a;
        if (r1.a.a.equals("com.android.car.media") == false) goto L5;
        return true;
    L5:
        if (r1.a.a.equals("com.android.car.carlauncher") == true) goto L11;
        return false;
    L11:
        return true;
    }
}
