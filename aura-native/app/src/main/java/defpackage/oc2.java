package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class oc2 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public oc2(Context context, WorkerParameters workerParameters) {
        this.a = context;
        this.b = workerParameters;
    }

    public abstract ry a();

    public final boolean b() {
        return this.c.get() != -256;
    }

    public abstract ry c();
}
