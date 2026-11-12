package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mq1 implements gf1 {
    public final uq1 n;
    public final /* synthetic */ rq1 o;

    public mq1(rq1 rq1Var, uq1 uq1Var) {
        this.o = rq1Var;
        this.n = uq1Var;
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
    public final Object invoke() throws Throwable {
        Throwable th;
        rq1 rq1Var = this.o;
        uq1 uq1Var = this.n;
        b21 b21Var = b21.INTERNAL_ERROR;
        IOException iOException = null;
        try {
            try {
                try {
                    if (!uq1Var.b(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } while (uq1Var.b(false, this));
                    b21 b21Var2 = b21.NO_ERROR;
                    try {
                        b21Var = b21.CANCEL;
                        rq1Var.b(b21Var2, b21Var, null);
                        this = b21Var2;
                    } catch (IOException e) {
                        iOException = e;
                        b21 b21Var3 = b21.PROTOCOL_ERROR;
                        rq1Var.b(b21Var3, b21Var3, iOException);
                        this = b21Var3;
                    }
                    xe5.b(uq1Var);
                    return j15.a;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e2) {
                iOException = e2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        this = b21Var;
        rq1Var.b(this, b21Var, iOException);
        xe5.b(uq1Var);
        throw th;
    }
}
