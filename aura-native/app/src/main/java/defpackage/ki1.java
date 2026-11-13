package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ki1 implements ThreadFactory {
    public final h5 a;
    public final String b;
    public final fz0 c;
    public final boolean d;
    public final AtomicInteger e;

    public ki1(h5 h5Var, String str, boolean z) {
        fz0 fz0Var = fz0.c0;
        this.e = new AtomicInteger();
        this.a = h5Var;
        this.b = str;
        this.c = fz0Var;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        lg1 lg1Var = new lg1(this, runnable, false, 14);
        this.a.getClass();
        rk rkVar = new rk(lg1Var);
        rkVar.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return rkVar;
    }
}
