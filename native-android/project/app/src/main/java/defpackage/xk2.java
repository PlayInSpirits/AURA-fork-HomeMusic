package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xk2 {
    public final MediaController a;
    public final Object b;
    public final ArrayList c;
    public final HashMap d;
    public final pr2 e;

    public xk2(Context r3, pr2 r4) {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = r4;
        MediaController r0 = new MediaController(r3, r4.o);
        this.a = r0;
        if (r4.a() != null) goto L6;
        r0.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new wk2(this));
        return;
    }

    public final void a() {
        qu1 r0 = this.e.a();
        if (r0 != null) goto L5;
        return;
    L5:
        ArrayList r1 = this.c;
        int r2 = r1.size();
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L14;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        gm2 r5 = (gm2) r4;
        tk2 r6 = new tk2(r5);
        this.d.put(r5, r6);
        r5.c = r6;
        r0.l0(r6);     // Catch: SecurityException -> L10 Throwable -> L12
        r5.c(13, null);
    L12:
        e = move-exception;
        l93.G("MediaControllerCompat", "Dead object in registerCallback.", e);
    L14:
        r1.clear();
    }

    public final void b(gm2 r4) {
        MediaController r0 = this.a;
        uk2 r1 = r4.a;
        r1.getClass();
        r0.unregisterCallback(r1);
        Object r2 = this.b;
        monitor-enter(r2);
        qu1 r3 = this.e.a();     // Catch: Throwable -> L10
        if (r3 != null) goto L23;
        this.c.remove(r4);     // Catch: Throwable -> L10
    L17:
        monitor-exit(r2);     // Catch: Throwable -> L10
        return;
    L23:
        tk2 r5 = (tk2) this.d.remove(r4);     // Catch: Throwable -> L10 Throwable -> L12 RemoteException -> L14
        if (r5 == null) goto L17;
        r4.c = null;     // Catch: Throwable -> L10 Throwable -> L12 RemoteException -> L14
        r3.b0(r5);     // Catch: Throwable -> L10 Throwable -> L12 RemoteException -> L14
    L12:
        e = move-exception;
        l93.G("MediaControllerCompat", "Dead object in unregisterCallback.", e);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }
}
