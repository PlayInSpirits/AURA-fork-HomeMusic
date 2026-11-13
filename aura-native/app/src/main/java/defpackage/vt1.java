package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class vt1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ List o;
    public final /* synthetic */ int p;

    public /* synthetic */ vt1(int i, int i2, List list) {
        this.n = i2;
        this.o = list;
        this.p = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                List list = this.o;
                int i = this.p;
                es1 es1Var = xt1.c;
                if (es1Var != null) {
                    es1Var.invoke(list, Integer.valueOf(i));
                    break;
                }
                break;
            default:
                List list2 = this.o;
                int i2 = this.p;
                es1 es1Var2 = xt1.d;
                if (es1Var2 != null) {
                    es1Var2.invoke(list2, Integer.valueOf(i2));
                    break;
                }
                break;
        }
    }
}
