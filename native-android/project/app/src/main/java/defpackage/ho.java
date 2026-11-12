package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ho extends cx2 {
    public ot4 B;
    public final /* synthetic */ io C;

    public ho(io r1) {
        this.C = r1;
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
    @Override // defpackage.cx2
    public final void i0() {
        io r0 = this.C;
        r0.a = this;
        if (r0.b == null) goto L19;
        o r1 = new o(1, this, r0);
        c72 r2 = j51.O(this);
        int r3 = r2.o;
        yv3 r4 = ((ra) h12.L(r2)).getRectManager();
        pt4 r5 = r4.d;
        r5.getClass();
        i03 r6 = r5.a;
        ot4 r7 = new ot4(r5, r3, this, r1);
        Object r8 = r6.b(r3);
        if (r8 != null) goto L7;
        r6.i(r3, r7);
        r8 = r7;
    L7:
        ot4 r9 = (ot4) r8;
        if (r9 == r7) goto L13;
    L9:
        ot4 r10 = r9.d;
        if (r10 == null) goto L12;
        r9 = r10;
        goto L9
    L12:
        r9.d = r7;
    L13:
        c72 r11 = j51.O(this.n);
        if (yv3.d(r11) == false) goto L16;
        ue1 r12 = r4.c;
        int r13 = r4.e(r11);
        long[] r14 = (long[]) r12.p;
        int r15 = r13 + 2;
        r14[r15] = (r14[r15] & 8070450532247928831L) | (-8070450532247928832L);
    L16:
        r4.f = true;
        r4.k();
        this.B = r7;
        return;
    }

    @Override // defpackage.cx2
    public final void j0() {
        io r0 = this.C;
        if (r0.a != this) goto L5;
        r0.a = null;
    L5:
        ot4 r1 = this.B;
        if (r1 == null) goto L8;
        r1.b();
    L8:
        this.B = null;
    }
}
