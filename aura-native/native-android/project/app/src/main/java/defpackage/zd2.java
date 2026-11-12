package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zd2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(zd2.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    public static final /* synthetic */ AtomicReferenceFieldUpdater p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = dz.a;
        q = unsafe.objectFieldOffset(zd2.class.getDeclaredField("_next$volatile"));
        o = AtomicReferenceFieldUpdater.newUpdater(zd2.class, Object.class, "_prev$volatile");
        r = unsafe.objectFieldOffset(zd2.class.getDeclaredField("_prev$volatile"));
        p = AtomicReferenceFieldUpdater.newUpdater(zd2.class, Object.class, "_removedRef$volatile");
        s = unsafe.objectFieldOffset(zd2.class.getDeclaredField("_removedRef$volatile"));
    }

    public static zd2 i(zd2 zd2Var) {
        while (zd2Var.n()) {
            o.getClass();
            zd2Var = (zd2) dz.a.getObjectVolatile(zd2Var, r);
        }
        return zd2Var;
    }

    public final boolean e(zd2 zd2Var, int i) {
        zd2 zd2VarM;
        do {
            zd2VarM = m();
            if (zd2VarM instanceof sb2) {
                return (((sb2) zd2VarM).t & i) == 0 && zd2VarM.e(zd2Var, i);
            }
        } while (!zd2VarM.f(zd2Var, this));
        return true;
    }

    public final boolean f(zd2 zd2Var, zd2 zd2Var2) {
        o.getClass();
        Unsafe unsafe = dz.a;
        unsafe.putObjectVolatile(zd2Var, r, this);
        n.getClass();
        long j = q;
        unsafe.putObjectVolatile(zd2Var, j, zd2Var2);
        while (true) {
            Unsafe unsafe2 = dz.a;
            zd2 zd2Var3 = this;
            zd2 zd2Var4 = zd2Var;
            zd2 zd2Var5 = zd2Var2;
            if (unsafe2.compareAndSwapObject(zd2Var3, q, zd2Var5, zd2Var4)) {
                zd2Var4.j(zd2Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(zd2Var3, j) != zd2Var5) {
                return false;
            }
            this = zd2Var3;
            zd2Var2 = zd2Var5;
            zd2Var = zd2Var4;
        }
    }

    public final void g(h63 h63Var) {
        zd2 zd2Var;
        h63 h63Var2;
        o.getClass();
        Unsafe unsafe = dz.a;
        unsafe.putObjectVolatile(h63Var, r, this);
        n.getClass();
        long j = q;
        unsafe.putObjectVolatile(h63Var, j, this);
        while (this.k() == this) {
            while (true) {
                Unsafe unsafe2 = dz.a;
                zd2Var = this;
                h63Var2 = h63Var;
                if (unsafe2.compareAndSwapObject(zd2Var, q, this, h63Var2)) {
                    h63Var2.j(zd2Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(zd2Var, j) != zd2Var) {
                        break;
                    }
                    this = zd2Var;
                    h63Var = h63Var2;
                }
            }
            this = zd2Var;
            h63Var = h63Var2;
        }
    }

    public final zd2 h() {
        while (true) {
            o.getClass();
            Unsafe unsafe = dz.a;
            long j = r;
            zd2 zd2Var = (zd2) unsafe.getObjectVolatile(this, j);
            zd2 zd2Var2 = null;
            zd2 zd2Var3 = zd2Var;
            while (true) {
                n.getClass();
                if (zd2Var3 == null) {
                    kf2.k();
                    return null;
                }
                Unsafe unsafe2 = dz.a;
                long j2 = q;
                Object objectVolatile = unsafe2.getObjectVolatile(zd2Var3, j2);
                if (objectVolatile == this) {
                    if (zd2Var != zd2Var3) {
                        while (true) {
                            Unsafe unsafe3 = dz.a;
                            zd2 zd2Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(zd2Var4, r, zd2Var, zd2Var3);
                            zd2 zd2Var5 = zd2Var;
                            this = zd2Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != zd2Var5) {
                                    break;
                                }
                                this = this;
                                zd2Var = zd2Var5;
                            }
                        }
                    }
                    return zd2Var3;
                }
                zd2Var = zd2Var;
                this = this;
                if (this.n()) {
                    return null;
                }
                if (!(objectVolatile instanceof az3)) {
                    objectVolatile.getClass();
                    zd2Var2 = zd2Var3;
                    zd2Var3 = (zd2) objectVolatile;
                } else if (zd2Var2 != null) {
                    zd2 zd2Var6 = ((az3) objectVolatile).a;
                    while (true) {
                        zd2 zd2Var7 = zd2Var3;
                        Unsafe unsafe4 = dz.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(zd2Var2, q, zd2Var7, zd2Var6);
                        zd2Var3 = zd2Var7;
                        if (zCompareAndSwapObject2) {
                            zd2Var3 = zd2Var2;
                            zd2Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(zd2Var2, j2) != zd2Var3) {
                            break;
                        }
                    }
                } else {
                    if (zd2Var3 == null) {
                        kf2.k();
                        return null;
                    }
                    zd2Var3 = (zd2) unsafe2.getObjectVolatile(zd2Var3, j);
                }
            }
            this = this;
        }
    }

    public final void j(zd2 zd2Var) {
        zd2 zd2Var2;
        while (true) {
            o.getClass();
            if (zd2Var == null) {
                kf2.k();
                return;
            }
            Unsafe unsafe = dz.a;
            long j = r;
            zd2 zd2Var3 = (zd2) unsafe.getObjectVolatile(zd2Var, j);
            if (this.k() != zd2Var) {
                return;
            }
            while (true) {
                if (zd2Var == null) {
                    kf2.k();
                    return;
                }
                Unsafe unsafe2 = dz.a;
                zd2Var2 = this;
                zd2 zd2Var4 = zd2Var;
                if (unsafe2.compareAndSwapObject(zd2Var4, r, zd2Var3, zd2Var2)) {
                    if (zd2Var2.n()) {
                        zd2Var4.h();
                        return;
                    }
                    return;
                } else {
                    if (zd2Var4 == null) {
                        kf2.k();
                        return;
                    }
                    zd2Var = zd2Var4;
                    if (unsafe2.getObjectVolatile(zd2Var4, j) != zd2Var3) {
                        break;
                    } else {
                        this = zd2Var2;
                    }
                }
            }
            this = zd2Var2;
        }
    }

    public final Object k() {
        n.getClass();
        return dz.a.getObjectVolatile(this, q);
    }

    public final zd2 l() {
        Object objK = k();
        az3 az3Var = objK instanceof az3 ? (az3) objK : null;
        if (az3Var != null) {
            return az3Var.a;
        }
        objK.getClass();
        return (zd2) objK;
    }

    public final zd2 m() {
        zd2 zd2VarH = h();
        if (zd2VarH != null) {
            return zd2VarH;
        }
        o.getClass();
        return i((zd2) dz.a.getObjectVolatile(this, r));
    }

    public boolean n() {
        return k() instanceof az3;
    }

    public final zd2 o() {
        zd2 zd2Var;
        while (true) {
            Object objK = this.k();
            if (objK instanceof az3) {
                return ((az3) objK).a;
            }
            if (objK == this) {
                return (zd2) objK;
            }
            objK.getClass();
            zd2 zd2Var2 = (zd2) objK;
            az3 az3VarP = zd2Var2.p();
            while (true) {
                n.getClass();
                Unsafe unsafe = dz.a;
                long j = q;
                zd2Var = this;
                if (unsafe.compareAndSwapObject(zd2Var, j, objK, az3VarP)) {
                    zd2Var2.h();
                    return null;
                }
                if (unsafe.getObjectVolatile(zd2Var, j) != objK) {
                    break;
                }
                this = zd2Var;
            }
            this = zd2Var;
        }
    }

    public final az3 p() {
        p.getClass();
        Unsafe unsafe = dz.a;
        long j = s;
        az3 az3Var = (az3) unsafe.getObjectVolatile(this, j);
        if (az3Var != null) {
            return az3Var;
        }
        az3 az3Var2 = new az3(this);
        unsafe.putObjectVolatile(this, j, az3Var2);
        return az3Var2;
    }

    public String toString() {
        return new k82(1, 1, si0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + si0.x(this);
    }
}
