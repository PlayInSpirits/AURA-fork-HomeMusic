package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ho extends cx2 {
    public ot4 B;
    public final /* synthetic */ io C;

    public ho(io ioVar) {
        this.C = ioVar;
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
        io ioVar = this.C;
        ioVar.a = this;
        if (ioVar.b != null) {
            o oVar = new o(1, this, ioVar);
            c72 c72VarO = j51.O(this);
            int i = c72VarO.o;
            yv3 rectManager = ((ra) h12.L(c72VarO)).getRectManager();
            pt4 pt4Var = rectManager.d;
            pt4Var.getClass();
            i03 i03Var = pt4Var.a;
            ot4 ot4Var = new ot4(pt4Var, i, this, oVar);
            Object objB = i03Var.b(i);
            if (objB == null) {
                i03Var.i(i, ot4Var);
                objB = ot4Var;
            }
            ot4 ot4Var2 = (ot4) objB;
            if (ot4Var2 != ot4Var) {
                while (true) {
                    ot4 ot4Var3 = ot4Var2.d;
                    if (ot4Var3 == null) {
                        break;
                    } else {
                        ot4Var2 = ot4Var3;
                    }
                }
                ot4Var2.d = ot4Var;
            }
            c72 c72VarO2 = j51.O(this.n);
            if (yv3.d(c72VarO2)) {
                ue1 ue1Var = rectManager.c;
                int iE = rectManager.e(c72VarO2);
                long[] jArr = (long[]) ue1Var.p;
                int i2 = iE + 2;
                jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
            }
            rectManager.f = true;
            rectManager.k();
            this.B = ot4Var;
        }
    }

    @Override // defpackage.cx2
    public final void j0() {
        io ioVar = this.C;
        if (ioVar.a == this) {
            ioVar.a = null;
        }
        ot4 ot4Var = this.B;
        if (ot4Var != null) {
            ot4Var.b();
        }
        this.B = null;
    }
}
