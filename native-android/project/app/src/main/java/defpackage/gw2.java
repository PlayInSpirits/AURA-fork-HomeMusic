package defpackage;

import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gw2 {
    public static final AtomicInteger d = null;
    public final ArrayDeque a;
    public HandlerThread b;
    public int c;

    static {
        d = new AtomicInteger(5);
    }

    public gw2() {
        this.a = new ArrayDeque();
    }

    public final void a() {
        ArrayDeque r0 = this.a;
        if (r0.isEmpty() == false) goto L6;
        return;
    L6:
        if ((this.c - r0.size()) >= d.get()) goto L9;
        fw2 r2 = (fw2) r0.removeFirst();
        r2.c.b(1, r2.b).b();
        return;
    }
}
