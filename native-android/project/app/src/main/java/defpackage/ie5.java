package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ie5 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ ke5 o;

    public ie5(ke5 r1, int r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        nh2 r5 = this.o.q;
        int r0 = r5.p0.o;
        ix2 r3 = ix2.b(this.n, r0);
        dy r1 = r5.o0;
        ix2 r2 = r1.o;
        ix2 r6 = r1.n;
        if (r3.a(r6) >= 0) goto L6;
        r3 = r6;
    L8:
        r5.i0(r3);
        r5.j0(1);
        return;
    L6:
        if (r3.a(r2) <= 0) goto L8;
        r3 = r2;
        goto L8
    }
}
