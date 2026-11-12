package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ah4 extends rw3 {
    public boolean a;
    public final /* synthetic */ xg0 b;

    public ah4(xg0 r1) {
        this.b = r1;
        this.a = false;
    }

    @Override // defpackage.rw3
    public final void a(RecyclerView r1, int r2) {
        if (r2 == 0) goto L4;
        return;
    L4:
        if (this.a == false) goto L8;
        this.a = false;
        this.b.l();
        return;
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView r1, int r2, int r3) {
        if (r2 != 0) goto L6;
        if (r3 != 0) goto L6;
        return;
    L6:
        this.a = true;
    }
}
