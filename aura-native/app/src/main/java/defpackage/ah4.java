package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ah4 extends rw3 {
    public boolean a = false;
    public final /* synthetic */ xg0 b;

    public ah4(xg0 xg0Var) {
        this.b = xg0Var;
    }

    @Override // defpackage.rw3
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.l();
        }
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
