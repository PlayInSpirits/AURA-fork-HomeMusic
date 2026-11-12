package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l82 {
    public final Object a;
    public final n82 b;
    public int c;
    public int d;
    public l82 e;
    public boolean f;
    public final zd3 g;

    public l82(Object r1, n82 r2) {
        this.a = r1;
        this.b = r2;
        this.c = -1;
        this.g = uc5.B(null);
    }

    public final l82 a() {
        if (this.f == false) goto L6;
        fz1.c("Pin should not be called on an already disposed item ");
    L6:
        if (this.d != 0) goto L12;
        this.b.n.add(this);
        l82 r0 = (l82) this.g.getValue();
        if (r0 == null) goto L10;
        r0.a();
    L11:
        this.e = r0;
        goto L12
    L10:
        r0 = null;
    L12:
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f == false) goto L6;
        return;
    L6:
        if (this.d > 0) goto L9;
        fz1.c("Release should only be called once");
    L9:
        int r0 = this.d - 1;
        this.d = r0;
        if (r0 != 0) goto L13;
        c();
        return;
    }

    public final void c() {
        this.b.n.remove(this);
        l82 r0 = this.e;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        this.e = null;
    }
}
