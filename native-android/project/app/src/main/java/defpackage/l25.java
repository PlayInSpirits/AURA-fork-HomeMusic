package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l25 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q25 b;

    public /* synthetic */ l25(q25 q25Var, int i) {
        this.a = i;
        this.b = q25Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        q25 q25Var = this.b;
        switch (i) {
            case 0:
                q25Var.a2("on an emptied queue");
                q25Var.s = 4;
                q25Var.Z1();
                q25Var.O1();
                break;
            case 1:
                q25Var.X1();
                break;
            case 2:
                q25Var.a2("on stop");
                q25Var.r = false;
                q25Var.c2();
                q25Var.s = 1;
                q25Var.Z1();
                q25Var.O1();
                break;
            default:
                q25Var.a2("on release");
                q25Var.l.shutdown();
                break;
        }
        return j15.a;
    }
}
