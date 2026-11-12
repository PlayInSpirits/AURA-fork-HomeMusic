package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cm1 {
    public final q62 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final q03 f = new q03();
    public final i63 g = new i63();
    public final m03 h = new m03(10);

    public cm1(q62 q62Var) {
        this.a = q62Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    public final void a(long j, List list, boolean z) {
        int i;
        m03 m03Var;
        long[] jArr;
        a63 a63Var;
        Object objD;
        Object obj;
        int size = list.size();
        i63 i63Var = this.g;
        i63 i63Var2 = i63Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            i = 7;
            m03Var = this.h;
            if (i2 >= size) {
                break;
            }
            cx2 cx2Var = (cx2) list.get(i2);
            if (cx2Var.A) {
                cx2Var.z = new fa(i, this, cx2Var);
                if (z2) {
                    f13 f13Var = i63Var2.a;
                    Object[] objArr = f13Var.n;
                    int i3 = f13Var.p;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i4];
                        if (h12.c(((a63) obj).c, cx2Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    a63Var = (a63) obj;
                    if (a63Var != null) {
                        a63Var.i = true;
                        a63Var.d.a(j);
                        if (z) {
                            Object objD2 = m03Var.d(j);
                            if (objD2 == null) {
                                objD2 = new q03();
                                m03Var.f(j, objD2);
                            }
                            ((q03) objD2).a(a63Var);
                        }
                    } else {
                        z2 = false;
                        a63Var = new a63(cx2Var);
                        a63Var.d.a(j);
                        if (z) {
                            objD = m03Var.d(j);
                            if (objD == null) {
                                objD = new q03();
                                m03Var.f(j, objD);
                            }
                            ((q03) objD).a(a63Var);
                        }
                        i63Var2.a.b(a63Var);
                    }
                } else {
                    a63Var = new a63(cx2Var);
                    a63Var.d.a(j);
                    if (z) {
                        objD = m03Var.d(j);
                        if (objD == null) {
                            objD = new q03();
                            m03Var.f(j, objD);
                        }
                        ((q03) objD).a(a63Var);
                    }
                    i63Var2.a.b(a63Var);
                }
                i63Var2 = a63Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr2 = m03Var.b;
            Object[] objArr2 = m03Var.c;
            long[] jArr3 = m03Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr3[i5];
                    if ((((~j2) << i) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr2[i9];
                                q03 q03Var = (q03) objArr2[i9];
                                f13 f13Var2 = i63Var.a;
                                Object[] objArr3 = f13Var2.n;
                                int i10 = f13Var2.p;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((a63) objArr3[i11]).f(j3, q03Var);
                                }
                            }
                            j2 >>= i6;
                            i8++;
                            i6 = i6;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr2 = jArr;
                    i = 7;
                }
            }
        }
        m03Var.a();
    }

    public final boolean b(gp3 gp3Var, boolean z) {
        xe2 xe2Var = (xe2) gp3Var.o;
        q62 q62Var = this.a;
        i63 i63Var = this.g;
        boolean zA = i63Var.a(xe2Var, q62Var, gp3Var, z);
        f13 f13Var = i63Var.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((a63) objArr[i2]).e(gp3Var, z) || z3;
        }
        Object[] objArr2 = f13Var.n;
        int i3 = f13Var.p;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((a63) objArr2[i4]).d(gp3Var) || z4;
        }
        i63Var.b(gp3Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            q03 q03Var = this.f;
            int i5 = q03Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((cx2) q03Var.f(i6));
            }
            q03Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            i63Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        i63 i63Var = this.g;
        f13 f13Var = i63Var.a;
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        for (int i2 = 0; i2 < i; i2++) {
            ((a63) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            i63Var.a.g();
        }
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
    public final void d(cx2 cx2Var) {
        if (this.b) {
            this.e = true;
            this.f.a(cx2Var);
            return;
        }
        i63 i63Var = this.g;
        q03 q03Var = i63Var.b;
        q03Var.d();
        q03Var.a(i63Var);
        while (q03Var.i()) {
            i63 i63Var2 = (i63) q03Var.k(q03Var.b - 1);
            int i = 0;
            while (true) {
                f13 f13Var = i63Var2.a;
                if (i < f13Var.p) {
                    a63 a63Var = (a63) f13Var.n[i];
                    if (h12.c(a63Var.c, cx2Var)) {
                        i63Var2.a.j(a63Var);
                        a63Var.c();
                    } else {
                        q03Var.a(a63Var);
                        i++;
                    }
                }
            }
        }
    }
}
