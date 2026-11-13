package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class i25 implements Callable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ q25 c;
    public final /* synthetic */ long d;

    public /* synthetic */ i25(long j, q25 q25Var, long j2) {
        this.b = j;
        this.c = q25Var;
        this.d = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        switch (this.a) {
            case 0:
                q25 q25Var = this.c;
                long j = this.b;
                long j2 = this.d;
                if (q25Var.r && !q25Var.J) {
                    z = q25Var.V1(j);
                } else if (q25Var.r) {
                    q25Var.H = null;
                    z = q25Var.W1(j);
                } else {
                    q25Var.H = Long.valueOf(j);
                    z = true;
                }
                if (z && j2 == q25Var.E) {
                    q25Var.Y1(j);
                    q25Var.A = j;
                }
                q25Var.F = j2;
                q25Var.O1();
                return j15.a;
            default:
                long j3 = this.b;
                q25 q25Var2 = this.c;
                long j4 = this.d;
                try {
                    if (j3 == q25Var2.E) {
                        q25Var2.P1(j4);
                        q25Var2.F = j3;
                    }
                    q25Var2.G.decrementAndGet();
                    return j15.a;
                } catch (Throwable th) {
                    q25Var2.G.decrementAndGet();
                    throw th;
                }
        }
    }

    public /* synthetic */ i25(q25 q25Var, long j, long j2) {
        this.c = q25Var;
        this.b = j;
        this.d = j2;
    }
}
