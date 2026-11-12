package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ki1 implements ThreadFactory {
    public final h5 a;
    public final String b;
    public final fz0 c;
    public final boolean d;
    public final AtomicInteger e;

    public ki1(h5 r3, String r4, boolean r5) {
        fz0 r0 = fz0.c0;
        this.e = new AtomicInteger();
        this.a = r3;
        this.b = r4;
        this.c = r0;
        this.d = r5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r4) {
        lg1 r0 = new lg1(this, r4, false, 14);
        this.a.getClass();
        rk r5 = new rk(r0);
        r5.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return r5;
    }
}
