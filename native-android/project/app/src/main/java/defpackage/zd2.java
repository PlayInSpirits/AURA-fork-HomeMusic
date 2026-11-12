package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zd2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = null;
    public static final /* synthetic */ long q = 0;
    public static final /* synthetic */ long r = 0;
    public static final /* synthetic */ long s = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        n = AtomicReferenceFieldUpdater.newUpdater(zd2.class, Object.class, "_next$volatile");
        Unsafe r3 = dz.a;
        q = r3.objectFieldOffset(zd2.class.getDeclaredField("_next$volatile"));
        o = AtomicReferenceFieldUpdater.newUpdater(zd2.class, Object.class, "_prev$volatile");
        r = r3.objectFieldOffset(zd2.class.getDeclaredField("_prev$volatile"));
        p = AtomicReferenceFieldUpdater.newUpdater(zd2.class, Object.class, "_removedRef$volatile");
        s = r3.objectFieldOffset(zd2.class.getDeclaredField("_removedRef$volatile"));
    }

    public zd2() {
        this._next$volatile = this;
        this._prev$volatile = this;
    }

    public static zd2 i(zd2 r3) {
    L3:
        if (r3.n() == false) goto L4;
        o.getClass();
        r3 = (zd2) dz.a.getObjectVolatile(r3, r);
        goto L3
    L4:
        return r3;
    }

    public final boolean e(zd2 r3, int r4) {
    L2:
        zd2 r0 = m();
        if ((r0 instanceof sb2) == true) goto L5;
        if (r0.f(r3, this) == false) goto L2;
        return true;
    L5:
        if ((((sb2) r0).t & r4) == 0) goto L7;
        return false;
    L7:
        if (r0.e(r3, r4) == false) goto L18;
        return true;
    L18:
        return false;
    }

    public final boolean f(zd2 r10, zd2 r11) {
        o.getClass();
        Unsafe r0 = dz.a;
        r0.putObjectVolatile(r10, r, this);
        n.getClass();
        long r1 = q;
        r0.putObjectVolatile(r10, r1, r11);
    L3:
        Unsafe r3 = dz.a;
        zd2 r4 = this;
        zd2 r8 = r10;
        zd2 r7 = r11;
        if (r3.compareAndSwapObject(r4, q, r7, r8) == true) goto L5;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L9;
        zd2 this = r4;
        r11 = r7;
        r10 = r8;
        goto L3
    L9:
        return false;
    L5:
        r8.j(r7);
        return true;
    }

    public final void g(h63 r10) {
        o.getClass();
        Unsafe r0 = dz.a;
        r0.putObjectVolatile(r10, r, this);
        n.getClass();
        long r1 = q;
        r0.putObjectVolatile(r10, r1, this);
    L4:
        if (this.k() != this) goto L5;
    L6:
        Unsafe r3 = dz.a;
        zd2 r4 = this;
        h63 r8 = r10;
        if (r3.compareAndSwapObject(r4, q, this, r8) == true) goto L8;
        if (r3.getObjectVolatile(r4, r1) != r4) goto L12;
        zd2 this = r4;
        r10 = r8;
        goto L6
    L12:
        this = r4;
        r10 = r8;
        goto L4
    L8:
        r8.j(r4);
        return;
    }

    public final zd2 h() {
    L2:
        o.getClass();
        Unsafe r0 = dz.a;
        long r1 = r;
        zd2 r7 = (zd2) r0.getObjectVolatile(this, r1);
        zd2 r9 = null;
        zd2 r8 = r7;
    L3:
        n.getClass();
        if (r8 == null) goto L35;
        Unsafe r3 = dz.a;
        long r4 = q;
        Object r6 = r3.getObjectVolatile(r8, r4);
        if (r6 == this) goto L7;
        r7 = r7;
        zd2 this = this;
        if (this.n() == true) goto L18;
        if ((r6 instanceof az3) == false) goto L34;
        if (r9 != null) goto L22;
        if (r8 == null) goto L32;
        r8 = (zd2) r3.getObjectVolatile(r8, r1);
        goto L3
    L32:
        kf2.k();
        return null;
    L22:
        zd2 r13 = ((az3) r6).a;
    L23:
        zd2 r12 = r8;
        Unsafe r10 = dz.a;
        boolean r15 = r10.compareAndSwapObject(r9, q, r12, r13);
        r8 = r12;
        if (r15 == true) goto L25;
        if (r10.getObjectVolatile(r9, r4) == r8) goto L23;
    L14:
        this = this;
        goto L2
    L25:
        r8 = r9;
        r9 = null;
        goto L3
    L34:
        r6.getClass();
        r9 = r8;
        r8 = (zd2) r6;
        goto L3
    L18:
        return null;
    L7:
        if (r7 == r8) goto L11;
    L9:
        Unsafe r5 = dz.a;
        zd2 r11 = this;
        boolean r16 = r5.compareAndSwapObject(r11, r, r7, r8);
        zd2 r14 = r7;
        this = r11;
        if (r16 == true) goto L11;
        if (r5.getObjectVolatile(this, r1) != r14) goto L14;
        this = this;
        r7 = r14;
    L11:
        return r8;
    L35:
        kf2.k();
        return null;
    }

    public final void j(zd2 r10) {
    L2:
        o.getClass();
        if (r10 == null) goto L23;
        Unsafe r0 = dz.a;
        long r1 = r;
        zd2 r7 = (zd2) r0.getObjectVolatile(r10, r1);
        if (this.k() != r10) goto L32;
    L7:
        if (r10 == null) goto L21;
        Unsafe r3 = dz.a;
        zd2 r8 = this;
        zd2 r4 = r10;
        if (r3.compareAndSwapObject(r4, r, r7, r8) == true) goto L11;
        if (r4 == null) goto L19;
        r10 = r4;
        if (r3.getObjectVolatile(r4, r1) != r7) goto L17;
        zd2 this = r8;
        goto L7
    L17:
        this = r8;
        goto L2
    L19:
        kf2.k();
        return;
    L11:
        if (r8.n() == false) goto L31;
        r4.h();
        return;
    L31:
        return;
    L21:
        kf2.k();
        return;
    L32:
        return;
    L23:
        kf2.k();
    }

    public final Object k() {
        n.getClass();
        return dz.a.getObjectVolatile(this, q);
    }

    public final zd2 l() {
        Object r1 = k();
        if ((r1 instanceof az3) == false) goto L5;
        az3 r0 = (az3) r1;
    L6:
        if (r0 != null) goto L8;
        r1.getClass();
        return (zd2) r1;
    L8:
        return r0.a;
    L5:
        r0 = null;
        goto L6
    }

    public final zd2 m() {
        zd2 r0 = h();
        if (r0 != null) goto L6;
        o.getClass();
        return i((zd2) dz.a.getObjectVolatile(this, r));
    L6:
        return r0;
    }

    public boolean n() {
        return k() instanceof az3;
    }

    public final zd2 o() {
    L2:
        Object r4 = this.k();
        if ((r4 instanceof az3) == true) goto L5;
        if (r4 == this) goto L8;
        r4.getClass();
        zd2 r6 = (zd2) r4;
        az3 r5 = r6.p();
    L10:
        n.getClass();
        Unsafe r0 = dz.a;
        long r2 = q;
        zd2 r1 = this;
        if (r0.compareAndSwapObject(r1, r2, r4, r5) == true) goto L12;
        if (r0.getObjectVolatile(r1, r2) != r4) goto L16;
        zd2 this = r1;
        goto L10
    L16:
        this = r1;
        goto L2
    L12:
        r6.h();
        return null;
    L8:
        return (zd2) r4;
    L5:
        return ((az3) r4).a;
    }

    public final az3 p() {
        p.getClass();
        Unsafe r0 = dz.a;
        long r1 = s;
        az3 r3 = (az3) r0.getObjectVolatile(this, r1);
        if (r3 != null) goto L6;
        az3 r4 = new az3(this);
        r0.putObjectVolatile(this, r1, r4);
        return r4;
    L6:
        return r3;
    }

    public String toString() {
        return new k82(1, 1, si0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + si0.x(this);
    }
}
