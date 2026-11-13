package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class uj2 {
    public final Object a;
    public boolean b;
    public boolean c;
    public boolean d;

    public uj2(Object obj) {
        this.a = obj;
    }

    public void a() {
        boolean z = this.b;
        Object obj = this.a;
        if (z) {
            er1.o(obj, "detach() called when detach() had already been called for: ");
            return;
        }
        if (this.c) {
            er1.o(obj, "detach() called when sendResult() had already been called for: ");
        } else if (this.d) {
            er1.o(obj, "detach() called when sendError() had already been called for: ");
        } else {
            this.b = true;
        }
    }

    public final boolean b() {
        return this.b || this.c || this.d;
    }

    public void c() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
    }

    public abstract void d(Object obj);

    public final void e() {
        if (this.c || this.d) {
            nz2.x(this.a, "sendError() called when either sendResult() or sendError() had already been called for: ");
        } else {
            this.d = true;
            c();
        }
    }

    public final void f(Object obj) {
        if (this.c || this.d) {
            nz2.x(this.a, "sendResult() called when either sendResult() or sendError() had already been called for: ");
        } else {
            this.c = true;
            d(obj);
        }
    }
}
