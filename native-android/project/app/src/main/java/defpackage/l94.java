package defpackage;

import android.view.autofill.AutofillValue;
import com.eddyizm.tempus.homemusic.SmartSession;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l94 {
    public final c72 a;
    public final x01 b;
    public final e02 c;
    public final q03 d = new q03(2);

    public l94(c72 c72Var, x01 x01Var, i03 i03Var) {
        this.a = c72Var;
        this.b = x01Var;
        this.c = i03Var;
    }

    public final i94 a() {
        return new i94(this.b, false, this.a, new e94());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
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
    public final void b(c72 c72Var, e94 e94Var) {
        mb mbVar;
        mb mbVar2;
        String str;
        String str2;
        qu4 qu4Var;
        qu4 qu4Var2;
        wb wbVar;
        wb wbVar2;
        CharSequence charSequenceI0;
        String str3;
        q03 q03Var = this.d;
        Object[] objArr = q03Var.a;
        int i = q03Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            y9 y9Var = (y9) objArr[i2];
            y9Var.getClass();
            e94 e94VarV = c72Var.v();
            int i3 = c72Var.o;
            qr2 qr2Var = y9Var.n;
            ra raVar = y9Var.p;
            if (e94Var != null) {
                Object objG = e94Var.n.g(n94.r);
                if (objG == null) {
                    objG = null;
                }
                mbVar = (mb) objG;
            } else {
                mbVar = null;
            }
            if (e94VarV != null) {
                Object objG2 = e94VarV.n.g(n94.r);
                if (objG2 == null) {
                    objG2 = null;
                }
                mbVar2 = (mb) objG2;
            } else {
                mbVar2 = null;
            }
            mb mbVar3 = fz0.O;
            if (!h12.c(mbVar2, mbVar3)) {
                if (h12.c(mbVar, mbVar3) && !h12.c(mbVar2, mbVar3)) {
                    qr2Var.p(raVar, i3, true);
                }
                if (e94Var != null) {
                    Object objG3 = e94Var.n.g(n94.C);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    he heVar = (he) objG3;
                    if (heVar != null) {
                        str = heVar.o;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (e94VarV != null) {
                    Object objG4 = e94VarV.n.g(n94.C);
                    if (objG4 == null) {
                        objG4 = null;
                    }
                    he heVar2 = (he) objG4;
                    if (heVar2 != null) {
                        str3 = heVar2.o;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        qr2Var.p(raVar, i3, true);
                    } else if (str2 == null) {
                        qr2Var.p(raVar, i3, false);
                    } else if (h12.c(mbVar2, fz0.P)) {
                        if (str2.length() > 5000) {
                            if (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(SmartSession.MAX_SONGS))) {
                                charSequenceI0 = str2;
                                charSequenceI0 = qm4.I0(4999, str2);
                            } else {
                                charSequenceI0 = str2;
                                charSequenceI0 = str2;
                                charSequenceI0 = qm4.I0(SmartSession.MAX_SONGS, str2);
                            }
                        }
                        charSequenceI0 = str2;
                        qr2Var.k().notifyValueChanged(raVar, i3, AutofillValue.forText(charSequenceI0));
                    }
                }
                if (e94Var != null) {
                    Object objG5 = e94Var.n.g(n94.H);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    qu4Var = (qu4) objG5;
                } else {
                    qu4Var = null;
                }
                if (e94VarV != null) {
                    Object objG6 = e94VarV.n.g(n94.H);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    qu4Var2 = (qu4) objG6;
                } else {
                    qu4Var2 = null;
                }
                if (qu4Var != qu4Var2) {
                    if (qu4Var == null) {
                        qr2Var.p(raVar, i3, true);
                    } else if (qu4Var2 == null) {
                        qr2Var.p(raVar, i3, false);
                    } else if (h12.c(mbVar2, fz0.Q)) {
                        int iOrdinal = qu4Var2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            qr2Var.k().notifyValueChanged(raVar, i3, AutofillValue.forToggle(bool.booleanValue()));
                        }
                    }
                }
                if (e94Var != null) {
                    Object objG7 = e94Var.n.g(n94.s);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    wbVar = (wb) objG7;
                } else {
                    wbVar = null;
                }
                if (e94VarV != null) {
                    Object objG8 = e94VarV.n.g(n94.s);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    wbVar2 = (wb) objG8;
                } else {
                    wbVar2 = null;
                }
                if (!h12.c(wbVar, wbVar2)) {
                    if (wbVar == null) {
                        qr2Var.p(raVar, i3, true);
                    } else if (wbVar2 == null) {
                        qr2Var.p(raVar, i3, false);
                    } else {
                        qr2Var.k().notifyValueChanged(raVar, i3, wbVar2.a);
                    }
                }
            } else if (!h12.c(mbVar, mbVar3)) {
                qr2Var.p(raVar, i3, false);
            }
            boolean z = e94Var != null && e94Var.n.b(n94.q);
            boolean z2 = e94VarV != null && e94VarV.n.b(n94.q);
            if (z != z2) {
                j03 j03Var = y9Var.t;
                if (z2) {
                    j03Var.a(i3);
                } else {
                    j03Var.f(i3);
                }
            }
        }
    }
}
