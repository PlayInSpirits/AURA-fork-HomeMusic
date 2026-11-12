package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xk1 {
    public final wv4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public xk1(wv4 r1) {
        this.a = r1;
    }

    public final void a(byte[] r3, int r4, int r5) {
        if (this.c == false) goto L14;
        int r1 = this.f;
        int r0 = (r4 + 1) - r1;
        if (r0 < r5) goto L7;
        this.f = (r5 - r4) + r1;
        return;
    L7:
        if (((r3[r0] & 192) >> 6) != 0) goto L9;
        boolean r6 = true;
    L10:
        this.d = r6;
        this.c = false;
        return;
    L9:
        r6 = false;
        goto L10
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
    public final void b(int r10, long r11, boolean r13) {
        if (this.h == (-9223372036854775807L)) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        if (this.e != 182) goto L13;
        if (r13 == false) goto L13;
        if (this.b == false) goto L13;
        int r6 = (int) (r11 - this.g);
        boolean r5 = this.d;
        long r3 = this.h;
        this.a.a(r3, r5 ? 1 : 0, r6, r10, null);
    L13:
        if (this.e == 179) goto L16;
        this.g = r11;
        return;
    L16:
        return;
    L5:
        r0 = false;
        goto L6
    }
}
