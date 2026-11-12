package defpackage;

import android.view.ViewGroup;
import java.io.IOException;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o72 implements u70 {
    public int A;
    public int B;
    public final c72 n;
    public u80 o;
    public wo0 p;
    public int q;
    public int r;
    public final w03 s;
    public final w03 t;
    public final j72 u;
    public final g72 v;
    public final w03 w;
    public final mn4 x;
    public final w03 y;
    public final f13 z;

    public o72(c72 c72Var, wo0 wo0Var) {
        this.n = c72Var;
        this.p = wo0Var;
        long[] jArr = v54.a;
        this.s = new w03();
        this.t = new w03();
        this.u = new j72(this);
        this.v = new g72(this);
        this.w = new w03();
        this.x = new mn4();
        this.y = new w03();
        this.z = new f13(new Object[16]);
    }

    public static final void c(o72 o72Var, Object obj) {
        c72 c72Var = o72Var.n;
        o72Var.h();
        c72 c72Var2 = (c72) o72Var.w.j(obj);
        if (c72Var2 != null) {
            if (o72Var.B <= 0) {
                cz1.b("No pre-composed items to dispose");
            }
            int i = ((c13) c72Var.o()).n.i(c72Var2);
            if (i < ((c13) c72Var.o()).n.p - o72Var.B) {
                cz1.b("Item is not in pre-composed item range");
            }
            o72Var.A++;
            o72Var.B--;
            h72 h72Var = (h72) o72Var.s.g(c72Var2);
            if (h72Var != null) {
                e(h72Var);
            }
            int i2 = (((c13) c72Var.o()).n.p - o72Var.B) - o72Var.A;
            o72Var.j(i, i2);
            o72Var.g(i2);
        }
        if (o72Var.z.h(obj)) {
            c72.W(c72Var, true, 6);
        }
    }

    public static void e(h72 h72Var) {
        x03 x03Var;
        ef3 ef3Var = h72Var.f;
        if (ef3Var != null) {
            ef3Var.h.set(gf3.o);
            uy3 uy3Var = ef3Var.k;
            if (uy3Var.d.h()) {
                x03Var = uy3Var.d;
                x03 x03Var2 = w54.a;
                uy3Var.d = new x03();
                uy3Var.c.g();
            } else {
                x03Var = null;
            }
            uy3Var.b();
            z80 z80Var = ef3Var.a;
            z80Var.D = null;
            if (x03Var != null) {
                z80Var.H.k = x03Var;
                z80Var.J = 2;
            }
            h72Var.f = null;
            z80 z80Var2 = h72Var.c;
            if (z80Var2 != null) {
                z80Var2.m();
            }
            h72Var.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.u70
    public final void a() {
        z80 z80Var;
        c72 c72Var = this.n;
        c72Var.C = true;
        w03 w03Var = this.s;
        Object[] objArr = w03Var.c;
        long[] jArr = w03Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (z80Var = ((h72) objArr[(i << 3) + i3]).c) != null) {
                            z80Var.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c72Var.Q();
        c72Var.C = false;
        w03Var.a();
        this.t.a();
        this.B = 0;
        this.A = 0;
        this.w.a();
        h();
    }

    @Override // defpackage.u70
    public final void b() {
        i(true);
    }

    public final void d(h72 h72Var, boolean z) {
        ef3 ef3Var = h72Var.f;
        if (ef3Var != null) {
            ch4 ch4VarT = ya4.t();
            if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
            ch4 ch4VarZ = ya4.z(ch4VarT);
            try {
                c72 c72Var = this.n;
                c72Var.C = true;
                if (z) {
                    while (!ef3Var.c()) {
                        try {
                            ef3Var.e(new er1(12));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ef3Var.a();
                h72Var.f = null;
                c72Var.C = false;
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
            } catch (Throwable th2) {
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
                throw th2;
            }
        }
    }

    public final jn4 f(Object obj) {
        return !this.n.G() ? new m72() : new n72(this, obj);
    }

    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.A = 0;
        List listO = this.n.o();
        c13 c13Var = (c13) listO;
        int i2 = (c13Var.n.p - this.B) - 1;
        if (i <= i2) {
            this.x.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.s.g((c72) c13Var.get(i3));
                    objG.getClass();
                    ((r03) this.x.o).a(((h72) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            wo0 wo0Var = this.p;
            mn4 mn4Var = this.x;
            p03 p03Var = (p03) wo0Var.o;
            p03Var.a();
            r03 r03Var = (r03) mn4Var.o;
            Object[] objArr = r03Var.b;
            long[] jArr = r03Var.c;
            int i4 = r03Var.e;
            while (true) {
                if (i4 == Integer.MAX_VALUE) {
                    break;
                }
                int i5 = (int) ((jArr[i4] >> 31) & 2147483647L);
                Object obj = objArr[i4];
                ((c82) wo0Var.n).b(obj);
                int iD = p03Var.d(null);
                int i6 = iD >= 0 ? p03Var.c[iD] : 0;
                if (i6 == 7) {
                    mn4Var.remove(obj);
                } else {
                    p03Var.g(i6 + 1, null);
                }
                i4 = i5;
            }
            ch4 ch4VarT = ya4.t();
            if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
            ch4 ch4VarZ = ya4.z(ch4VarT);
            z = false;
            while (i2 >= i) {
                try {
                    c72 c72Var = (c72) ((c13) listO).get(i2);
                    Object objG2 = this.s.g(c72Var);
                    objG2.getClass();
                    h72 h72Var = (h72) objG2;
                    Object obj2 = h72Var.a;
                    if (((r03) this.x.o).c(obj2)) {
                        this.A++;
                        if (((Boolean) h72Var.g.getValue()).booleanValue()) {
                            f72 f72Var = c72Var.R;
                            ti2 ti2Var = f72Var.p;
                            a72 a72Var = a72.p;
                            ti2Var.y = a72Var;
                            if2 if2Var = f72Var.q;
                            if (if2Var != null) {
                                if2Var.w = a72Var;
                            }
                            l(h72Var, false);
                            if (h72Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        c72 c72Var2 = this.n;
                        c72Var2.C = true;
                        this.s.j(c72Var);
                        z80 z80Var = h72Var.c;
                        if (z80Var != null) {
                            z80Var.m();
                        }
                        this.n.R(i2, 1);
                        c72Var2.C = false;
                    }
                    this.t.j(obj2);
                    i2--;
                } catch (Throwable th) {
                    ya4.H(ch4VarT, ch4VarZ, if1VarE);
                    throw th;
                }
            }
            ya4.H(ch4VarT, ch4VarZ, if1VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (jh4.c) {
                x03 x03Var = jh4.j.h;
                if (x03Var != null && x03Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                jh4.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((c13) this.n.o()).n.p;
        int i2 = this.s.e;
        if (i2 != i) {
            cz1.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.A;
        int i4 = this.B;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbT = b11.t("Incorrect state. Total children ", ". Reusable children ", i, i3, ". Precomposed children ");
            sbT.append(i4);
            cz1.a(sbT.toString());
        }
        int i5 = this.w.e;
        int i6 = this.B;
        if (i5 == i6) {
            return;
        }
        cz1.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        this.B = 0;
        this.w.a();
        List listO = this.n.o();
        int i = ((c13) listO).n.p;
        if (this.A != i) {
            this.A = i;
            ch4 ch4VarT = ya4.t();
            if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
            ch4 ch4VarZ = ya4.z(ch4VarT);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    c72 c72Var = (c72) ((c13) listO).get(i2);
                    h72 h72Var = (h72) this.s.g(c72Var);
                    if (h72Var != null && ((Boolean) h72Var.g.getValue()).booleanValue()) {
                        f72 f72Var = c72Var.R;
                        ti2 ti2Var = f72Var.p;
                        a72 a72Var = a72.p;
                        ti2Var.y = a72Var;
                        if2 if2Var = f72Var.q;
                        if (if2Var != null) {
                            if2Var.w = a72Var;
                        }
                        l(h72Var, z);
                        h72Var.a = gn4.a;
                    }
                } catch (Throwable th) {
                    ya4.H(ch4VarT, ch4VarZ, if1VarE);
                    throw th;
                }
            }
            ya4.H(ch4VarT, ch4VarZ, if1VarE);
            this.t.a();
        }
        h();
    }

    public final void j(int i, int i2) throws IOException {
        c72 c72Var = this.n;
        c72Var.C = true;
        c72Var.K(i, i2, 1);
        c72Var.C = false;
    }

    public final void k(Object obj, wf1 wf1Var, boolean z) throws IOException {
        c72 c72Var = this.n;
        if (c72Var.G()) {
            h();
            if (this.t.c(obj)) {
                return;
            }
            this.y.j(obj);
            w03 w03Var = this.w;
            Object objG = w03Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((c13) c72Var.o()).n.i(objG), ((c13) c72Var.o()).n.p);
                    this.B++;
                } else {
                    int i = ((c13) c72Var.o()).n.p;
                    c72 c72Var2 = new c72(2);
                    c72Var.C = true;
                    c72Var.A(i, c72Var2);
                    c72Var.C = false;
                    this.B++;
                    objG = c72Var2;
                }
                w03Var.l(obj, objG);
            }
            m((c72) objG, obj, z, wf1Var);
        }
    }

    public final void l(h72 h72Var, boolean z) {
        z80 z80Var;
        if (z || !h72Var.h) {
            h72Var.g = uc5.B(Boolean.FALSE);
        } else {
            h72Var.g.setValue(Boolean.FALSE);
        }
        if (h72Var.f != null) {
            e(h72Var);
            return;
        }
        if (z) {
            z80 z80Var2 = h72Var.c;
            if (z80Var2 != null) {
                z80Var2.l();
                return;
            }
            return;
        }
        lb3 outOfFrameExecutor = ((ra) h12.L(this.n)).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            ((ra) outOfFrameExecutor).C(new wc(11, h72Var));
        } else {
            if (h72Var.h || (z80Var = h72Var.c) == null) {
                return;
            }
            z80Var.l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d4, B:66:0x00d8, B:78:0x011c, B:67:0x00e5, B:68:0x00f0, B:70:0x00f4, B:72:0x0109, B:76:0x0113, B:75:0x010e, B:77:0x0119, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:81:0x0126, B:82:0x0130), top: B:85:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d4, B:66:0x00d8, B:78:0x011c, B:67:0x00e5, B:68:0x00f0, B:70:0x00f4, B:72:0x0109, B:76:0x0113, B:75:0x010e, B:77:0x0119, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:81:0x0126, B:82:0x0130), top: B:85:0x0076 }] */
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
    public final void m(c72 c72Var, Object obj, boolean z, wf1 wf1Var) {
        boolean z2;
        z80 z80Var;
        w03 w03Var = this.s;
        Object objG = w03Var.g(c72Var);
        Object obj2 = objG;
        if (objG == null) {
            r70 r70Var = ji2.a;
            h72 h72Var = new h72();
            h72Var.a = obj;
            h72Var.b = r70Var;
            h72Var.c = null;
            h72Var.g = uc5.B(Boolean.TRUE);
            w03Var.l(c72Var, h72Var);
            obj2 = h72Var;
        }
        h72 h72Var2 = (h72) obj2;
        boolean z3 = h72Var2.b != wf1Var;
        if (h72Var2.f != null) {
            if (z3) {
                e(h72Var2);
            } else if (z) {
                return;
            } else {
                d(h72Var2, true);
            }
        }
        z80 z80Var2 = h72Var2.c;
        if (z80Var2 != null) {
            synchronized (z80Var2.q) {
                z2 = z80Var2.A.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || h72Var2.d) {
            h72Var2.b = wf1Var;
            if (h72Var2.f != null) {
                cz1.a("new subcompose call while paused composition is still active");
            }
            ch4 ch4VarT = ya4.t();
            if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
            ch4 ch4VarZ = ya4.z(ch4VarT);
            try {
                c72 c72Var2 = this.n;
                c72Var2.C = true;
                z80 z80Var3 = h72Var2.c;
                u80 u80Var = this.o;
                if (u80Var == null) {
                    cz1.c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (z80Var3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = zd5.a;
                        z80Var = new z80(u80Var, new d15(c72Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = zd5.a;
                        z80Var = new z80(u80Var, new d15(c72Var));
                    }
                    z80Var3 = z80Var;
                } else {
                    if (z80Var3.J == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = zd5.a;
                            z80Var = new z80(u80Var, new d15(c72Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = zd5.a;
                            z80Var = new z80(u80Var, new d15(c72Var));
                        }
                        z80Var3 = z80Var;
                    }
                }
                h72Var2.c = z80Var3;
                wf1 r70Var2 = h72Var2.b;
                if (((ra) h12.L(this.n)).getOutOfFrameExecutor() != null) {
                    h72Var2.h = false;
                } else {
                    h72Var2.h = true;
                    r70Var2 = new r70(1524156494, true, new ib(2, h72Var2, r70Var2));
                }
                if (z) {
                    if (h72Var2.e) {
                        z80Var3.i();
                        z80Var3.q();
                        h72Var2.f = z80Var3.k(true, r70Var2);
                    } else {
                        h72Var2.f = z80Var3.k(z80Var3.i(), r70Var2);
                    }
                } else if (h72Var2.e) {
                    z80Var3.i();
                    z80Var3.q();
                    rg1 rg1Var = z80Var3.I;
                    rg1Var.z = 0;
                    rg1Var.y = true;
                    z80Var3.n.a(z80Var3, r70Var2);
                    if (rg1Var.F || rg1Var.z != 0) {
                        oo3.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    rg1Var.z = -1;
                    rg1Var.y = false;
                } else {
                    z80Var3.A(r70Var2);
                }
                h72Var2.e = false;
                c72Var2.C = false;
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
                h72Var2.d = false;
            } catch (Throwable th) {
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
                throw th;
            }
        }
    }

    public final c72 n(Object obj) throws IOException {
        w03 w03Var;
        int i;
        if (this.A == 0) {
            return null;
        }
        c13 c13Var = (c13) this.n.o();
        int i2 = c13Var.n.p - this.B;
        int i3 = i2 - this.A;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            w03Var = this.s;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = w03Var.g((c72) c13Var.get(i5));
            objG.getClass();
            if (((h72) objG).a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i != -1) {
            i4 = i;
        } else if (i4 >= i3) {
            Object objG2 = w03Var.g((c72) c13Var.get(i4));
            objG2.getClass();
            h72 h72Var = (h72) objG2;
            Object obj2 = h72Var.a;
            if (obj2 != gn4.a) {
                c82 c82Var = (c82) this.p.n;
                c82Var.b(obj);
                c82Var.b(obj2);
            }
            h72Var.a = obj;
            i5 = i4;
        } else {
            i5 = i4;
            i4 = i;
        }
        if (i4 == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.A--;
        c72 c72Var = (c72) c13Var.get(i3);
        Object objG3 = w03Var.g(c72Var);
        objG3.getClass();
        h72 h72Var2 = (h72) objG3;
        h72Var2.g = uc5.B(Boolean.TRUE);
        h72Var2.e = true;
        h72Var2.d = true;
        return c72Var;
    }
}
