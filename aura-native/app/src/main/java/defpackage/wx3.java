package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wx3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ xx3 o;

    public /* synthetic */ wx3(xx3 xx3Var, int i) {
        this.n = i;
        this.o = xx3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        xx3 xx3Var = this.o;
        switch (i) {
            case 0:
                SparseArray sparseArray = xx3Var.h;
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((zx3) sparseArray.valueAt(i2)).getClass();
                    zx3.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                cy3 cy3Var = xx3Var.i;
                if (cy3Var.A == xx3Var) {
                    cy3Var.j();
                    break;
                }
                break;
        }
    }
}
