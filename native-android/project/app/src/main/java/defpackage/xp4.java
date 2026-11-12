package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xp4 {
    public Message a;

    public final void a() {
        this.a = null;
        ArrayList r0 = yp4.b;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r0.size() >= 50) goto L9;
        r0.add(this);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    public final void b() {
        Message r0 = this.a;
        r0.getClass();
        r0.sendToTarget();
        a();
    }
}
