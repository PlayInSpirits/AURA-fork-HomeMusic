package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hk5 {
    public final Executor b;
    public final Object d;
    public final /* synthetic */ int a = 0;
    public final Object c = new Object();

    public hk5(Executor executor, cg0 cg0Var) {
        this.b = executor;
        this.d = cg0Var;
    }

    public final void a(jw jwVar) {
        switch (this.a) {
            case 0:
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new qf5(4, this, jwVar));
                return;
            case 1:
                if (jwVar.p()) {
                    return;
                }
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new qf5(5, this, jwVar));
                return;
            default:
                if (jwVar.p()) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new qf5(6, this, jwVar));
                    return;
                }
                return;
        }
    }

    public hk5(Executor executor, b93 b93Var) {
        this.b = executor;
        this.d = b93Var;
    }

    public hk5(Executor executor, e93 e93Var) {
        this.b = executor;
        this.d = e93Var;
    }
}
