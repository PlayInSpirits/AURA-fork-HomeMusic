package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f82 implements wi2 {
    public final c82 n;
    public final ln4 o;
    public final nc3 p;
    public final i03 q;

    public f82(c82 r1, ln4 r2) {
        this.n = r1;
        this.o = r2;
        this.p = (nc3) r1.b.invoke();
        f02.a();
        this.q = new i03();
    }

    @Override // defpackage.oo0
    public final float B(int r1) {
        throw null;
    }

    @Override // defpackage.oo0
    public final float D(float r1) {
        return this.o.D(r1);
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.o.J();
    }

    @Override // defpackage.wi2
    public final boolean K() {
        return this.o.K();
    }

    @Override // defpackage.oo0
    public final float M(float r1) {
        return this.o.M(r1);
    }

    @Override // defpackage.wi2
    public final vi2 T(int r1, int r2, Map r3, if1 r4, if1 r5) {
        return this.o.T(r1, r2, r3, r4, r5);
    }

    @Override // defpackage.oo0
    public final int V(float r1) {
        return this.o.V(r1);
    }

    @Override // defpackage.oo0
    public final long Y(long r1) {
        return this.o.Y(r1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List a(int r4) {
        i03 r0 = this.q;
        List r1 = (List) r0.b(r4);
        if (r1 == null) goto L5;
        return r1;
    L5:
        Object r2 = this.p.c(r4);
        wf1 r3 = this.n.a(r4, r2);
        List r5 = this.o.m(r3, r2);
        r0.i(r4, r5);
        return r5;
    }

    @Override // defpackage.oo0
    public final float a0(long r1) {
        return this.o.a0(r1);
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.o.g();
    }

    @Override // defpackage.wi2
    public final r62 getLayoutDirection() {
        return this.o.getLayoutDirection();
    }

    @Override // defpackage.oo0
    public final long h(float r1) {
        return this.o.h(r1);
    }

    @Override // defpackage.oo0
    public final long i(long r1) {
        return this.o.i(r1);
    }

    @Override // defpackage.oo0
    public final float o(long r1) {
        return this.o.o(r1);
    }

    @Override // defpackage.wi2
    public final vi2 v(int r1, int r2, Map r3, if1 r4) {
        return this.o.v(r1, r2, r3, r4);
    }

    @Override // defpackage.oo0
    public final long w(float r1) {
        return this.o.w(r1);
    }
}
