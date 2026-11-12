package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mq1 implements gf1 {
    public final uq1 n;
    public final /* synthetic */ rq1 o;

    public mq1(rq1 r1, uq1 r2) {
        this.o = r1;
        this.n = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gf1
    public final Object invoke() {
        rq1 r0 = this.o;
        uq1 r1 = this.n;
        b21 r2 = b21.r;
        IOException r4 = null;
    L12:
        Throwable th = th;
    L29:
        r0.b(this, r2, r4);
        xe5.b(r1);
        throw th;
    L18:
        e = move-exception;
        r4 = e;
    L25:
        b21 r5 = b21.q;     // Catch: Throwable -> L12
        r0.b(r5, r5, r4);
        b21 this = r5;
    L11:
        xe5.b(r1);
        return j15.a;
    L23:
        th = move-exception;
        th = th;
    L17:
        this = r2;
        goto L29
    L4:
        if (r1.b(true, this) == false) goto L21;
    L33:
    L16:
        th = th;
        goto L17
    L7:
        if (r1.b(false, this) == true) goto L33;
        b21 r6 = b21.p;     // Catch: Throwable -> L16 IOException -> L18
        r2 = b21.u;     // Catch: Throwable -> L12 IOException -> L14
        r0.b(r6, r2, null);
        this = r6;
    L14:
        e = move-exception;
        r4 = e;
        goto L25
    L21:
        throw new IOException("Required SETTINGS preface not received");     // Catch: IOException -> L18 Throwable -> L23
    }
}
