package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z22 implements mx1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater q = null;
    public static final /* synthetic */ long r = 0;
    public static final /* synthetic */ long s = 0;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final h63 n;

    static {
        o = AtomicIntegerFieldUpdater.newUpdater(z22.class, "_isCompleting$volatile");
        p = AtomicReferenceFieldUpdater.newUpdater(z22.class, Object.class, "_rootCause$volatile");
        Unsafe r3 = dz.a;
        s = r3.objectFieldOffset(z22.class.getDeclaredField("_rootCause$volatile"));
        q = AtomicReferenceFieldUpdater.newUpdater(z22.class, Object.class, "_exceptionsHolder$volatile");
        r = r3.objectFieldOffset(z22.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public z22(h63 r1, Throwable r2) {
        this.n = r1;
        this._isCompleting$volatile = 0;
        this._rootCause$volatile = r2;
    }

    public final void a(Throwable r4) {
        Throwable r0 = e();
        if (r0 != null) goto L6;
        i(r4);
        return;
    L6:
        if (r4 == r0) goto L24;
        Object r1 = c();
        if (r1 != null) goto L13;
        h(r4);
        return;
    L13:
        if ((r1 instanceof Throwable) == false) goto L19;
        if (r4 != r1) goto L16;
        return;
    L16:
        ArrayList r2 = new ArrayList(4);
        r2.add(r1);
        r2.add(r4);
        h(r2);
        return;
    L19:
        if ((r1 instanceof ArrayList) == false) goto L22;
        ((ArrayList) r1).add(r4);
        return;
    L22:
        mj0.g(r1, "State is ");
        return;
    }

    @Override // defpackage.mx1
    public final boolean b() {
        if (e() != null) goto L6;
        return true;
    L6:
        return false;
    }

    public final Object c() {
        q.getClass();
        return dz.a.getObjectVolatile(this, r);
    }

    @Override // defpackage.mx1
    public final h63 d() {
        return this.n;
    }

    public final Throwable e() {
        p.getClass();
        return (Throwable) dz.a.getObjectVolatile(this, s);
    }

    public final boolean f() {
        if (e() == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final ArrayList g(Throwable r4) {
        Object r0 = c();
        if (r0 != null) goto L6;
        ArrayList r1 = new ArrayList(4);
    L11:
        Throwable r2 = e();
        if (r2 == null) goto L14;
        r1.add(0, r2);
    L14:
        if (r4 != null) goto L16;
    L18:
        h(zz1.h);
        return r1;
    L16:
        if (r4.equals(r2) == true) goto L18;
        r1.add(r4);
        goto L18
    L6:
        if ((r0 instanceof Throwable) == false) goto L9;
        ArrayList r3 = new ArrayList(4);
        r3.add(r0);
        r1 = r3;
        goto L11
    L9:
        if ((r0 instanceof ArrayList) == false) goto L20;
        r1 = (ArrayList) r0;
        goto L11
    L20:
        mj0.g(r0, "State is ");
        return null;
    }

    public final void h(Object r4) {
        q.getClass();
        dz.a.putObjectVolatile(this, r, r4);
    }

    public final void i(Throwable r4) {
        p.getClass();
        dz.a.putObjectVolatile(this, s, r4);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Finishing[cancelling=");
        r0.append(f());
        r0.append(", completing=");
        if (o.get(this) == 0) goto L5;
        boolean r1 = true;
    L6:
        r0.append(r1);
        r0.append(", rootCause=");
        r0.append(e());
        r0.append(", exceptions=");
        r0.append(c());
        r0.append(", list=");
        r0.append(this.n);
        r0.append(']');
        return r0.toString();
    L5:
        r1 = false;
        goto L6
    }
}
