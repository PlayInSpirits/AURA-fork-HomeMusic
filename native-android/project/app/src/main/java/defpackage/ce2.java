package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ce2 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ce2.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = dz.a.objectFieldOffset(ce2.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(ce2.class, "_state$volatile");
    public static final f01 g = new f01(1, "REMOVE_FROZEN");

    public ce2(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            kf2.o("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        kf2.o("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                ce2 ce2Var = this;
                if (f.compareAndSet(ce2Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    ce2 ce2VarD = ce2Var;
                    while ((atomicLongFieldUpdater.get(ce2VarD) & 1152921504606846976L) != 0) {
                        ce2VarD = ce2VarD.d();
                        AtomicReferenceArray atomicReferenceArray2 = ce2VarD.d;
                        int i4 = ce2VarD.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof be2) && ((be2) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            ce2VarD = null;
                        }
                        if (ce2VarD == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = ce2Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final ce2 b(long j) {
        ce2 ce2Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = dz.a;
            long j2 = h;
            ce2 ce2Var2 = (ce2) unsafe.getObjectVolatile(this, j2);
            if (ce2Var2 != null) {
                return ce2Var2;
            }
            ce2 ce2Var3 = new ce2(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object be2Var = this.d.get(i4);
                if (be2Var == null) {
                    be2Var = new be2(i);
                }
                ce2Var3.d.set(ce2Var3.c & i, be2Var);
                i++;
            }
            f.set(ce2Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = dz.a;
                ce2Var = this;
                if (unsafe2.compareAndSwapObject(ce2Var, h, (Object) null, ce2Var3) || unsafe2.getObjectVolatile(ce2Var, j2) != null) {
                    break;
                }
                this = ce2Var;
            }
            this = ce2Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            ce2 ce2Var = this;
            if (atomicLongFieldUpdater.compareAndSet(ce2Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = ce2Var;
        }
    }

    public final ce2 d() {
        long j;
        ce2 ce2Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                ce2Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            ce2Var = this;
            if (atomicLongFieldUpdater.compareAndSet(ce2Var, j, j2)) {
                j = j2;
                break;
            }
            this = ce2Var;
        }
        return ce2Var.b(j);
    }

    public final Object e() {
        ce2 ce2VarD = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(ce2VarD);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = ce2VarD.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = ce2VarD.d;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = ce2VarD.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof be2)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f.compareAndSet(ce2VarD, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    ce2VarD = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(ce2VarD);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                ce2VarD = ce2VarD.d();
                            } else {
                                ce2 ce2Var = ce2VarD;
                                if (f.compareAndSet(ce2Var, j3, (j3 & (-1073741824)) | j2)) {
                                    ce2Var.d.set(i4 & ce2Var.c, null);
                                    ce2VarD = null;
                                } else {
                                    ce2VarD = ce2Var;
                                }
                            }
                            if (ce2VarD == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
