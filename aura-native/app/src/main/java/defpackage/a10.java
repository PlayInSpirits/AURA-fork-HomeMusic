package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class a10 extends z00 {
    public final p81 q;

    public a10(p81 p81Var, ne0 ne0Var, int i, wv wvVar) {
        super(ne0Var, i, wvVar);
        this.q = p81Var;
    }

    @Override // defpackage.z00, defpackage.p81
    public final Object a(q81 q81Var, vd0 vd0Var) {
        int i = this.o;
        xe0 xe0Var = xe0.n;
        if (i == -3) {
            ne0 context = vd0Var.getContext();
            Boolean bool = Boolean.FALSE;
            d60 d60Var = new d60(10, (byte) 0);
            ne0 ne0Var = this.n;
            ne0 J = !((Boolean) ne0Var.s(d60Var, bool)).booleanValue() ? context.J(ne0Var) : jz4.t(context, ne0Var, false);
            if (h12.c(J, context)) {
                Object f = f(q81Var, vd0Var);
                if (f == xe0Var) {
                    return f;
                }
            } else {
                fz0 fz0Var = fz0.R;
                if (h12.c(J.K(fz0Var), context.K(fz0Var))) {
                    ne0 context2 = vd0Var.getContext();
                    if (!(q81Var instanceof z94) && !(q81Var instanceof n63)) {
                        q81Var = new z81(q81Var, context2);
                    }
                    Object J0 = ud3.J0(J, q81Var, te5.O(J), new p(this, null, 5), vd0Var);
                    if (J0 == xe0Var) {
                        return J0;
                    }
                }
            }
            return j15.a;
        }
        Object a = super.a(q81Var, vd0Var);
        if (a == xe0Var) {
            return a;
        }
        return j15.a;
    }

    @Override // defpackage.z00
    public final Object b(rq3 rq3Var, vd0 vd0Var) {
        Object f = f(new z94(rq3Var), vd0Var);
        return f == xe0.n ? f : j15.a;
    }

    public abstract Object f(q81 q81Var, vd0 vd0Var);

    @Override // defpackage.z00
    public final String toString() {
        return this.q + " -> " + super.toString();
    }
}
