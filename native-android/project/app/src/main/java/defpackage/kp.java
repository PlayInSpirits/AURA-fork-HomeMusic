package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kp implements ci0 {
    public final boolean n;
    public final ArrayList o;
    public int p;
    public ii0 q;

    public kp(boolean r2) {
        this.n = r2;
        this.o = new ArrayList(1);
    }

    @Override // defpackage.ci0
    public final void c(rw4 r3) {
        r3.getClass();
        ArrayList r0 = this.o;
        if (r0.contains(r3) == true) goto L6;
        r0.add(r3);
        this.p++;
        return;
    }

    public final void o(int r5) {
        ii0 r0 = this.q;
        String r1 = f35.a;
        int r2 = 0;
    L4:
        if (r2 >= this.p) goto L6;
        ((rw4) this.o.get(r2)).a(this, r0, this.n, r5);
        r2 = r2 + 1;
        goto L4
    }

    public final void p() {
        ii0 r0 = this.q;
        String r1 = f35.a;
        int r2 = 0;
    L4:
        if (r2 >= this.p) goto L6;
        ((rw4) this.o.get(r2)).c(this, r0, this.n);
        r2 = r2 + 1;
        goto L4
    L6:
        this.q = null;
    }

    public final void q(ii0 r3) {
        int r0 = 0;
    L4:
        if (r0 >= this.p) goto L6;
        ((rw4) this.o.get(r0)).d(this, r3);
        r0 = r0 + 1;
        goto L4
    }

    public final void r(ii0 r4) {
        this.q = r4;
        int r0 = 0;
    L4:
        if (r0 >= this.p) goto L6;
        ((rw4) this.o.get(r0)).b(this, r4, this.n);
        r0 = r0 + 1;
        goto L4
    }
}
