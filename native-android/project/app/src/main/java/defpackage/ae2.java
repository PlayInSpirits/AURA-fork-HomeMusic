package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ae2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ae2.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = dz.a.objectFieldOffset(ae2.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new ce2(8, false);

    public final boolean a(Runnable runnable) {
        ae2 ae2Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = dz.a;
            long j = b;
            ce2 ce2Var = (ce2) unsafe.getObjectVolatile(this, j);
            int iA = ce2Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                ce2 ce2VarD = ce2Var.d();
                while (true) {
                    Unsafe unsafe2 = dz.a;
                    ae2Var = this;
                    if (unsafe2.compareAndSwapObject(ae2Var, b, ce2Var, ce2VarD) || unsafe2.getObjectVolatile(ae2Var, j) != ce2Var) {
                        break;
                    }
                    this = ae2Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                ae2Var = this;
            }
            this = ae2Var;
        }
    }

    public final void b() {
        ae2 ae2Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = dz.a;
            long j = b;
            ce2 ce2Var = (ce2) unsafe.getObjectVolatile(this, j);
            if (ce2Var.c()) {
                return;
            }
            ce2 ce2VarD = ce2Var.d();
            while (true) {
                Unsafe unsafe2 = dz.a;
                ae2Var = this;
                if (unsafe2.compareAndSwapObject(ae2Var, b, ce2Var, ce2VarD) || unsafe2.getObjectVolatile(ae2Var, j) != ce2Var) {
                    break;
                } else {
                    this = ae2Var;
                }
            }
            this = ae2Var;
        }
    }

    public final int c() {
        a.getClass();
        ce2 ce2Var = (ce2) dz.a.getObjectVolatile(this, b);
        ce2Var.getClass();
        long j = ce2.f.get(ce2Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        ae2 ae2Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = dz.a;
            long j = b;
            ce2 ce2Var = (ce2) unsafe.getObjectVolatile(this, j);
            Object objE = ce2Var.e();
            if (objE != ce2.g) {
                return objE;
            }
            ce2 ce2VarD = ce2Var.d();
            while (true) {
                Unsafe unsafe2 = dz.a;
                ae2Var = this;
                if (unsafe2.compareAndSwapObject(ae2Var, b, ce2Var, ce2VarD) || unsafe2.getObjectVolatile(ae2Var, j) != ce2Var) {
                    break;
                }
                this = ae2Var;
            }
            this = ae2Var;
        }
    }
}
