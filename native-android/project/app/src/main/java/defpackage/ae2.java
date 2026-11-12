package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ae2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = null;
    public static final /* synthetic */ long b = 0;
    private volatile /* synthetic */ Object _cur$volatile;

    static {
        a = AtomicReferenceFieldUpdater.newUpdater(ae2.class, Object.class, "_cur$volatile");
        b = dz.a.objectFieldOffset(ae2.class.getDeclaredField("_cur$volatile"));
    }

    public ae2() {
        this._cur$volatile = new ce2(8, false);
    }

    public final boolean a(Runnable r10) {
    L2:
        a.getClass();
        Unsafe r0 = dz.a;
        long r1 = b;
        ce2 r7 = (ce2) r0.getObjectVolatile(this, r1);
        int r2 = r7.a(r10);
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L6;
        ce2 r8 = r7.d();
    L11:
        Unsafe r3 = dz.a;
        ae2 r4 = this;
        if (r3.compareAndSwapObject(r4, b, r7, r8) == true) goto L16;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L16;
        ae2 this = r4;
    L16:
        this = r4;
        goto L2
    L6:
        if (r2 == 2) goto L8;
        r4 = this;
        goto L16
    L8:
        return false;
    L18:
        return true;
    }

    public final void b() {
    L2:
        a.getClass();
        Unsafe r0 = dz.a;
        long r1 = b;
        ce2 r7 = (ce2) r0.getObjectVolatile(this, r1);
        if (r7.c() == true) goto L4;
        ce2 r8 = r7.d();
    L6:
        Unsafe r3 = dz.a;
        ae2 r4 = this;
        if (r3.compareAndSwapObject(r4, b, r7, r8) == true) goto L11;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L11;
        ae2 this = r4;
    L11:
        this = r4;
        goto L2
    }

    public final int c() {
        a.getClass();
        ce2 r4 = (ce2) dz.a.getObjectVolatile(this, b);
        r4.getClass();
        long r0 = ce2.f.get(r4);
        int r5 = (int) (1073741823 & r0);
        return 1073741823 & (((int) ((r0 & 1152921503533105152L) >> 30)) - r5);
    }

    public final Object d() {
    L2:
        a.getClass();
        Unsafe r0 = dz.a;
        long r1 = b;
        ce2 r7 = (ce2) r0.getObjectVolatile(this, r1);
        Object r2 = r7.e();
        if (r2 != ce2.g) goto L4;
        ce2 r8 = r7.d();
    L6:
        Unsafe r3 = dz.a;
        ae2 r4 = this;
        if (r3.compareAndSwapObject(r4, b, r7, r8) == true) goto L11;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L11;
        ae2 this = r4;
    L11:
        this = r4;
        goto L2
    L4:
        return r2;
    }
}
