package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oc2 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c;
    public boolean d;

    public oc2(Context r3, WorkerParameters r4) {
        this.c = new AtomicInteger(-256);
        this.a = r3;
        this.b = r4;
    }

    public abstract ry a();

    public final boolean b() {
        if (this.c.get() == (-256)) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract ry c();
}
