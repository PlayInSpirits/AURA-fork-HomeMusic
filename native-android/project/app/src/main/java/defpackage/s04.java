package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s04 implements f42 {
    public static final sj0 j = null;
    public final qj0 b;
    public final f42 c;
    public final f42 d;
    public final int e;
    public final int f;
    public final Class g;
    public final db3 h;
    public final uw4 i;

    static {
        j = new sj0(50);
    }

    public s04(qj0 r1, f42 r2, f42 r3, int r4, int r5, uw4 r6, Class r7, db3 r8) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.i = r6;
        this.g = r7;
        this.h = r8;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.f42
    public final void b(MessageDigest r6) {
        qj0 r0 = this.b;
        monitor-enter(r0);
        mf2 r2 = (mf2) r0.d;     // Catch: Throwable -> L17
        xn3 r3 = (xn3) ((ArrayDeque) r2.a).poll();     // Catch: Throwable -> L17
        if (r3 != null) goto L7;
        r3 = r2.u();     // Catch: Throwable -> L17
    L7:
        lf2 r4 = (lf2) r3;     // Catch: Throwable -> L17
        r4.b = 8;     // Catch: Throwable -> L17
        r4.c = byte[].class;     // Catch: Throwable -> L17
        Object r1 = r0.f(r4, byte[].class);     // Catch: Throwable -> L17
        monitor-exit(r0);
        byte[] r5 = (byte[]) r1;
        ByteBuffer.wrap(r5).putInt(this.e).putInt(this.f).array();
        this.d.b(r6);
        this.c.b(r6);
        r6.update(r5);
        uw4 r7 = this.i;
        if (r7 == null) goto L12;
        r7.b(r6);
    L12:
        this.h.b(r6);
        sj0 r8 = j;
        Class r9 = this.g;
        byte[] r10 = (byte[]) r8.a(r9);
        if (r10 != null) goto L15;
        r10 = r9.getName().getBytes(f42.a);
        r8.d(r9, r10);
    L15:
        r6.update(r10);
        this.b.h(r5);
        return;
    L17:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.f42
    public final boolean equals(Object r4) {
        if ((r4 instanceof s04) == false) goto L20;
        s04 r5 = (s04) r4;
        if (this.f != r5.f) goto L20;
        if (this.e != r5.e) goto L20;
        if (e35.n(this.i, r5.i) == false) goto L20;
        if (this.g.equals(r5.g) == false) goto L20;
        if (this.c.equals(r5.c) == false) goto L20;
        if (this.d.equals(r5.d) == false) goto L20;
        if (this.h.equals(r5.h) == false) goto L20;
        return true;
    L20:
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        int r0 = this.c.hashCode() * 31;
        int r1 = ((((this.d.hashCode() + r0) * 31) + this.e) * 31) + this.f;
        uw4 r2 = this.i;
        if (r2 == null) goto L5;
        r1 = (r1 * 31) + r2.hashCode();
    L5:
        int r3 = this.g.hashCode();
        int r4 = this.h.b.hashCode();
        return r4 + ((r3 + (r1 * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
