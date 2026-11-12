package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a44 extends wd0 implements q81 {
    public final q81 n;
    public final ne0 o;
    public final int p;
    public ne0 q;
    public vd0 r;

    public a44(q81 q81Var, ne0 ne0Var) {
        super(z60.p, q01.n);
        this.n = q81Var;
        this.o = ne0Var;
        this.p = ((Number) ne0Var.s(new d60(16, (byte) 0), 0)).intValue();
    }

    @Override // defpackage.q81
    public final Object b(Object obj, vd0 vd0Var) {
        try {
            Object objE = e(vd0Var, obj);
            return objE == xe0.n ? objE : j15.a;
        } catch (Throwable th) {
            this.q = new ju0(vd0Var.getContext(), th);
            throw th;
        }
    }

    public final Object e(vd0 vd0Var, Object obj) {
        ne0 context = vd0Var.getContext();
        gb.u(context);
        ne0 ne0Var = this.q;
        if (ne0Var != context) {
            if (ne0Var instanceof ju0) {
                throw new IllegalStateException(rm4.c0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ju0) ne0Var).o + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.s(new z(11, this), 0)).intValue() != this.p) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.o + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.q = context;
        }
        this.r = vd0Var;
        xf1 xf1Var = c44.a;
        q81 q81Var = this.n;
        q81Var.getClass();
        Object objA = xf1Var.a(q81Var, obj, this);
        if (!h12.c(objA, xe0.n)) {
            this.r = null;
        }
        return objA;
    }

    @Override // defpackage.jp, defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 vd0Var = this.r;
        if (vd0Var instanceof ye0) {
            return (ye0) vd0Var;
        }
        return null;
    }

    @Override // defpackage.wd0, defpackage.vd0
    public final ne0 getContext() {
        ne0 ne0Var = this.q;
        return ne0Var == null ? q01.n : ne0Var;
    }

    @Override // defpackage.jp
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        Throwable thA = bb3.a(obj);
        if (thA != null) {
            this.q = new ju0(getContext(), thA);
        }
        vd0 vd0Var = this.r;
        if (vd0Var != null) {
            vd0Var.resumeWith(obj);
        }
        return xe0.n;
    }
}
