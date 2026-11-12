package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f95 extends q12 {
    public final s12 b;
    public final WeakReference c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f95(s12 s12Var, y24 y24Var) {
        super(y24Var.a);
        y24Var.getClass();
        this.b = s12Var;
        this.c = new WeakReference(y24Var);
    }

    @Override // defpackage.q12
    public final void a(Set set) {
        set.getClass();
        q12 q12Var = (q12) this.c.get();
        if (q12Var != null) {
            q12Var.a(set);
            return;
        }
        s12 s12Var = this.b;
        s12Var.getClass();
        ReentrantLock reentrantLock = s12Var.d;
        reentrantLock.lock();
        try {
            d83 d83Var = (d83) s12Var.c.remove(this);
            reentrantLock.unlock();
            if (d83Var != null) {
                jy4 jy4Var = s12Var.b;
                int[] iArr = d83Var.b;
                jy4Var.getClass();
                iArr.getClass();
                if (jy4Var.h.k(iArr)) {
                    g12.Q(new r12(s12Var, null, 1));
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
