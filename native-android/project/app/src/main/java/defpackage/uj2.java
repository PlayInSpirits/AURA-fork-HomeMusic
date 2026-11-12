package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uj2 {
    public final Object a;
    public boolean b;
    public boolean c;
    public boolean d;

    public uj2(Object r1) {
        this.a = r1;
    }

    public void a() {
        boolean r0 = this.b;
        Object r1 = this.a;
        if (r0 == false) goto L5;
        er1.o(r1, "detach() called when detach() had already been called for: ");
        return;
    L5:
        if (this.c == false) goto L7;
        er1.o(r1, "detach() called when sendResult() had already been called for: ");
        return;
    L7:
        if (this.d == true) goto L10;
        this.b = true;
        return;
    L10:
        er1.o(r1, "detach() called when sendError() had already been called for: ");
    }

    public final boolean b() {
        if (this.b == false) goto L5;
        return true;
    L5:
        if (this.c == false) goto L7;
        return true;
    L7:
        if (this.d == true) goto L14;
        return false;
    L14:
        return true;
    }

    public void c() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
    }

    public abstract void d(Object r1);

    public final void e() {
        if (this.c == false) goto L5;
    L8:
        nz2.x(this.a, "sendError() called when either sendResult() or sendError() had already been called for: ");
        return;
    L5:
        if (this.d == true) goto L8;
        this.d = true;
        c();
    }

    public final void f(Object r2) {
        if (this.c == false) goto L5;
    L8:
        nz2.x(this.a, "sendResult() called when either sendResult() or sendError() had already been called for: ");
        return;
    L5:
        if (this.d == true) goto L8;
        this.c = true;
        d(r2);
    }
}
