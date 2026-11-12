package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z51 extends ar4 {
    public final /* synthetic */ q34 e;
    public final /* synthetic */ lr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(String str, q34 q34Var, lr0 lr0Var) {
        super(str);
        this.e = q34Var;
        this.f = lr0Var;
    }

    @Override // defpackage.ar4
    public final long a() throws InterruptedException {
        p34 p34Var;
        q34 q34Var = this.e;
        try {
            p34Var = q34Var.f();
        } catch (Throwable th) {
            p34Var = new p34(q34Var, th, 2);
        }
        lr0 lr0Var = this.f;
        if (!((CopyOnWriteArrayList) lr0Var.q).contains(q34Var)) {
            return -1L;
        }
        ((LinkedBlockingDeque) lr0Var.r).put(p34Var);
        return -1L;
    }
}
