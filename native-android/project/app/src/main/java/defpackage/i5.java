package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i5 extends WeakReference {
    public final f42 a;
    public final boolean b;
    public q04 c;

    public i5(f42 r1, o11 r2, ReferenceQueue r3) {
        super(r2, r3);
        h12.f(r1, "Argument must not be null");
        this.a = r1;
        boolean r4 = r2.n;
        this.c = null;
        this.b = r4;
    }
}
