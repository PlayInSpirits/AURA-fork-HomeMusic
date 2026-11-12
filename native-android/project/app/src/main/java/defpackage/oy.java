package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oy {
    public Object a;
    public ry b;
    public n04 c;
    public boolean d;

    public final void a(Object r4) {
        this.d = true;
        ry r0 = this.b;
        if (r0 == null) goto L11;
        qy r1 = r0.o;
        r1.getClass();
        if (r4 != null) goto L8;
        r4 = g2.t;
    L8:
        if (g2.s.e(r1, null, r4) == false) goto L12;
        g2.b(r1);
        this.a = null;
        this.b = null;
        this.c = null;
        return;
    L12:
        return;
    }

    public final void b(Throwable r2) {
        this.d = true;
        ry r0 = this.b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.o.i(r2) == false) goto L9;
        this.a = null;
        this.b = null;
        this.c = null;
        return;
    }

    public final void finalize() {
        ry r0 = this.b;
        if (r0 == null) goto L8;
        qy r1 = r0.o;
        if (r1.isDone() == true) goto L8;
        r1.i(new g0(2, "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
    L8:
        if (this.d == true) goto L13;
        n04 r4 = this.c;
        if (r4 == null) goto L14;
        r4.j(null);
        return;
    L14:
        return;
    }
}
