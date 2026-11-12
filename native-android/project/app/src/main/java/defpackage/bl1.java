package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 implements mz0 {
    public final jv3 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public wv4 j;
    public al1 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final n41 d = new n41(7);
    public final n41 e = new n41(8);
    public final n41 f = new n41(6);
    public long m = -9223372036854775807L;
    public final be3 o = new be3();

    public bl1(jv3 jv3Var, boolean z, boolean z2) {
        this.a = jv3Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.mz0
    public final void a(be3 be3Var) {
        int i;
        this.j.getClass();
        String str = f35.a;
        int i2 = be3Var.b;
        int i3 = be3Var.c;
        byte[] bArr = be3Var.a;
        this.g += (long) be3Var.a();
        this.j.e(be3Var.a(), be3Var);
        while (true) {
            int iO = uc5.o(bArr, i2, i3, this.h);
            if (iO == i3) {
                this.g(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iO + 3] & 31;
            if (iO <= 0 || bArr[iO - 1] != 0) {
                i = 3;
            } else {
                iO--;
                i = 4;
            }
            int i5 = iO - i2;
            if (i5 > 0) {
                this.g(bArr, i2, iO);
            }
            int i6 = i3 - iO;
            long j = this.g - ((long) i6);
            bl1 bl1Var = this;
            bl1Var.b(i6, i5 < 0 ? -i5 : 0, j, this.m);
            bl1Var.h(i4, j, bl1Var.m);
            i2 = iO + i;
            this = bl1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x020b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0212  */
    /* JADX WARN: Code duplicated, block: B:92:0x024f  */
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
    public final void b(int i, int i2, long j, long j2) {
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        c6 c6Var = (c6) this.a.p;
        if (!this.l || this.k.c) {
            n41 n41Var = this.d;
            n41Var.d(i2);
            n41 n41Var2 = this.e;
            n41Var2.d(i2);
            boolean z4 = this.l;
            boolean z5 = n41Var.e;
            if (z4) {
                if (z5) {
                    u13 u13VarL = uc5.L((byte[]) n41Var.f, 3, n41Var.c);
                    c6Var.x(u13VarL.s);
                    this.k.d.append(u13VarL.d, u13VarL);
                    n41Var.f();
                } else if (n41Var2.e) {
                    h00 h00Var = new h00((byte[]) n41Var2.f, 4, n41Var2.c);
                    int iM = h00Var.m();
                    int iM2 = h00Var.m();
                    h00Var.s();
                    this.k.e.append(iM, new t13(iM, iM2, h00Var.h()));
                    n41Var2.f();
                }
            } else if (z5 && n41Var2.e) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) n41Var.f, n41Var.c));
                arrayList.add(Arrays.copyOf((byte[]) n41Var2.f, n41Var2.c));
                u13 u13VarL2 = uc5.L((byte[]) n41Var.f, 3, n41Var.c);
                int i8 = u13VarL2.s;
                h00 h00Var2 = new h00((byte[]) n41Var2.f, 4, n41Var2.c);
                int iM3 = h00Var2.m();
                int iM4 = h00Var2.m();
                h00Var2.s();
                t13 t13Var = new t13(iM3, iM4, h00Var2.h());
                int i9 = u13VarL2.a;
                int i10 = u13VarL2.b;
                int i11 = u13VarL2.c;
                byte[] bArr = i40.a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
                wv4 wv4Var = this.j;
                sb1 sb1Var = new sb1();
                sb1Var.a = this.i;
                sb1Var.l = lw2.m("video/mp2t");
                sb1Var.m = lw2.m("video/avc");
                sb1Var.j = str;
                sb1Var.t = u13VarL2.e;
                sb1Var.u = u13VarL2.f;
                sb1Var.C = new c50(u13VarL2.p, u13VarL2.q, u13VarL2.r, null, u13VarL2.h + 8, u13VarL2.i + 8);
                sb1Var.z = u13VarL2.g;
                sb1Var.p = arrayList;
                sb1Var.o = i8;
                f34.l(sb1Var, wv4Var);
                this.l = true;
                c6Var.x(i8);
                this.k.d.append(u13VarL2.d, u13VarL2);
                this.k.e.append(iM3, t13Var);
                n41Var.f();
                n41Var2.f();
            }
        }
        n41 n41Var3 = this.f;
        if (n41Var3.d(i2)) {
            int iB0 = uc5.b0(n41Var3.c, (byte[]) n41Var3.f);
            byte[] bArr2 = (byte[]) n41Var3.f;
            be3 be3Var = this.o;
            be3Var.L(iB0, bArr2);
            be3Var.N(4);
            c6Var.a(j2, be3Var);
        }
        al1 al1Var = this.k;
        boolean z6 = this.l;
        if (al1Var.i == 9) {
            if (z6 && al1Var.o) {
                j3 = al1Var.j;
                i3 = i + ((int) (j - j3));
                j4 = al1Var.q;
                if (j4 != -9223372036854775807L) {
                    j5 = al1Var.p;
                    if (j3 != j5) {
                        al1Var.a.a(j4, al1Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            al1Var.p = al1Var.j;
            al1Var.q = al1Var.l;
            al1Var.r = false;
            al1Var.o = true;
        } else if (al1Var.c) {
            zk1 zk1Var = al1Var.n;
            zk1 zk1Var2 = al1Var.m;
            if (zk1Var.a) {
                if (zk1Var2.a) {
                    u13 u13Var = zk1Var.c;
                    u13Var.getClass();
                    u13 u13Var2 = zk1Var2.c;
                    u13Var2.getClass();
                    int i12 = u13Var2.m;
                    if (zk1Var.f != zk1Var2.f || zk1Var.g != zk1Var2.g || zk1Var.h != zk1Var2.h || ((zk1Var.i && zk1Var2.i && zk1Var.j != zk1Var2.j) || (((i5 = zk1Var.d) != (i6 = zk1Var2.d) && (i5 == 0 || i6 == 0)) || (((i7 = u13Var.m) == 0 && i12 == 0 && (zk1Var.m != zk1Var2.m || zk1Var.n != zk1Var2.n)) || ((i7 == 1 && i12 == 1 && (zk1Var.o != zk1Var2.o || zk1Var.p != zk1Var2.p)) || (z3 = zk1Var.k) != zk1Var2.k || (z3 && zk1Var.l != zk1Var2.l)))))) {
                        if (z6) {
                            j3 = al1Var.j;
                            i3 = i + ((int) (j - j3));
                            j4 = al1Var.q;
                            if (j4 != -9223372036854775807L) {
                                j5 = al1Var.p;
                                if (j3 != j5) {
                                    al1Var.a.a(j4, al1Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                                }
                            }
                        }
                        al1Var.p = al1Var.j;
                        al1Var.q = al1Var.l;
                        al1Var.r = false;
                        al1Var.o = true;
                    }
                } else {
                    if (z6) {
                        j3 = al1Var.j;
                        i3 = i + ((int) (j - j3));
                        j4 = al1Var.q;
                        if (j4 != -9223372036854775807L) {
                            j5 = al1Var.p;
                            if (j3 != j5) {
                                al1Var.a.a(j4, al1Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                            }
                        }
                    }
                    al1Var.p = al1Var.j;
                    al1Var.q = al1Var.l;
                    al1Var.r = false;
                    al1Var.o = true;
                }
            }
        }
        if (al1Var.b) {
            zk1 zk1Var3 = al1Var.n;
            z = zk1Var3.b && ((i4 = zk1Var3.e) == 7 || i4 == 2);
        } else {
            z = al1Var.s;
        }
        boolean z7 = al1Var.r;
        int i13 = al1Var.i;
        if (i13 == 5) {
            z2 = true;
        } else if (z) {
            z2 = true;
            if (i13 != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z8 = z7 | z2;
        al1Var.r = z8;
        al1Var.i = 24;
        if (z8) {
            this.n = false;
        }
    }

    @Override // defpackage.mz0
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        uc5.i(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        ((c6) this.a.p).j(0);
        al1 al1Var = this.k;
        if (al1Var != null) {
            al1Var.k = false;
            al1Var.o = false;
            zk1 zk1Var = al1Var.n;
            zk1Var.b = false;
            zk1Var.a = false;
        }
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
        this.j.getClass();
        String str = f35.a;
        if (z) {
            ((c6) this.a.p).j(0);
            b(0, 0, this.g, this.m);
            h(9, this.g, this.m);
            b(0, 0, this.g, this.m);
        }
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        sy4Var.a();
        sy4Var.b();
        this.i = sy4Var.e;
        sy4Var.b();
        wv4 wv4VarT = m51Var.t(sy4Var.d, 2);
        this.j = wv4VarT;
        this.k = new al1(wv4VarT, this.b, this.c);
        this.a.a(m51Var, sy4Var);
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    public final void g(byte[] bArr, int i, int i2) {
        boolean zH;
        boolean zH2;
        boolean z;
        boolean z2;
        int iM;
        int i3;
        int i4;
        int i5;
        int iN;
        int iN2;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        al1 al1Var = this.k;
        SparseArray sparseArray = al1Var.e;
        h00 h00Var = al1Var.f;
        if (al1Var.k) {
            int i6 = i2 - i;
            byte[] bArr2 = al1Var.g;
            int length = bArr2.length;
            int i7 = al1Var.h + i6;
            if (length < i7) {
                al1Var.g = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i, al1Var.g, al1Var.h, i6);
            int i8 = al1Var.h + i6;
            al1Var.h = i8;
            h00Var.b = al1Var.g;
            h00Var.d = 0;
            h00Var.c = i8;
            h00Var.e = 0;
            h00Var.a();
            if (h00Var.d(8)) {
                h00Var.s();
                int i9 = h00Var.i(2);
                h00Var.t(5);
                if (h00Var.e()) {
                    h00Var.m();
                    if (h00Var.e()) {
                        int iM2 = h00Var.m();
                        if (!al1Var.c) {
                            al1Var.k = false;
                            zk1 zk1Var = al1Var.n;
                            zk1Var.e = iM2;
                            zk1Var.b = true;
                            return;
                        }
                        if (h00Var.e()) {
                            int iM3 = h00Var.m();
                            if (sparseArray.indexOfKey(iM3) < 0) {
                                al1Var.k = false;
                                return;
                            }
                            t13 t13Var = (t13) sparseArray.get(iM3);
                            SparseArray sparseArray2 = al1Var.d;
                            int i10 = t13Var.a;
                            boolean z3 = t13Var.b;
                            u13 u13Var = (u13) sparseArray2.get(i10);
                            boolean z4 = u13Var.j;
                            int i11 = u13Var.n;
                            int i12 = u13Var.l;
                            if (z4) {
                                if (!h00Var.d(2)) {
                                    return;
                                } else {
                                    h00Var.t(2);
                                }
                            }
                            if (h00Var.d(i12)) {
                                int i13 = h00Var.i(i12);
                                if (!u13Var.k) {
                                    if (h00Var.d(1)) {
                                        zH = h00Var.h();
                                        if (!zH) {
                                            zH2 = false;
                                        } else {
                                            if (!h00Var.d(1)) {
                                                return;
                                            }
                                            zH2 = h00Var.h();
                                            z = true;
                                        }
                                        if (al1Var.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iM = 0;
                                        } else if (!h00Var.e()) {
                                            return;
                                        } else {
                                            iM = h00Var.m();
                                        }
                                        i3 = u13Var.m;
                                        if (i3 != 0) {
                                            if (h00Var.d(i11)) {
                                                i4 = h00Var.i(i11);
                                                if (!z3 && !zH) {
                                                    if (!h00Var.e()) {
                                                        return;
                                                    }
                                                    iN2 = h00Var.n();
                                                    i5 = 0;
                                                }
                                                iN = 0;
                                                zk1 zk1Var2 = al1Var.n;
                                                zk1Var2.c = u13Var;
                                                zk1Var2.d = i9;
                                                zk1Var2.e = iM2;
                                                zk1Var2.f = i13;
                                                zk1Var2.g = iM3;
                                                zk1Var2.h = zH;
                                                zk1Var2.i = z;
                                                zk1Var2.j = zH2;
                                                zk1Var2.k = z2;
                                                zk1Var2.l = iM;
                                                zk1Var2.m = i4;
                                                zk1Var2.n = iN2;
                                                zk1Var2.o = i5;
                                                zk1Var2.p = iN;
                                                zk1Var2.a = true;
                                                zk1Var2.b = true;
                                                al1Var.k = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || u13Var.o) {
                                            i4 = 0;
                                        } else {
                                            if (!h00Var.e()) {
                                                return;
                                            }
                                            int iN3 = h00Var.n();
                                            if (!z3 || zH) {
                                                i5 = iN3;
                                                i4 = 0;
                                                iN2 = 0;
                                                iN = 0;
                                            } else {
                                                if (!h00Var.e()) {
                                                    return;
                                                }
                                                iN = h00Var.n();
                                                iN2 = 0;
                                                i5 = iN3;
                                                i4 = 0;
                                            }
                                        }
                                        zk1 zk1Var3 = al1Var.n;
                                        zk1Var3.c = u13Var;
                                        zk1Var3.d = i9;
                                        zk1Var3.e = iM2;
                                        zk1Var3.f = i13;
                                        zk1Var3.g = iM3;
                                        zk1Var3.h = zH;
                                        zk1Var3.i = z;
                                        zk1Var3.j = zH2;
                                        zk1Var3.k = z2;
                                        zk1Var3.l = iM;
                                        zk1Var3.m = i4;
                                        zk1Var3.n = iN2;
                                        zk1Var3.o = i5;
                                        zk1Var3.p = iN;
                                        zk1Var3.a = true;
                                        zk1Var3.b = true;
                                        al1Var.k = false;
                                        i5 = 0;
                                        iN2 = 0;
                                        iN = 0;
                                        zk1 zk1Var4 = al1Var.n;
                                        zk1Var4.c = u13Var;
                                        zk1Var4.d = i9;
                                        zk1Var4.e = iM2;
                                        zk1Var4.f = i13;
                                        zk1Var4.g = iM3;
                                        zk1Var4.h = zH;
                                        zk1Var4.i = z;
                                        zk1Var4.j = zH2;
                                        zk1Var4.k = z2;
                                        zk1Var4.l = iM;
                                        zk1Var4.m = i4;
                                        zk1Var4.n = iN2;
                                        zk1Var4.o = i5;
                                        zk1Var4.p = iN;
                                        zk1Var4.a = true;
                                        zk1Var4.b = true;
                                        al1Var.k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z = zH2;
                                if (al1Var.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iM = 0;
                                } else if (!h00Var.e()) {
                                    return;
                                } else {
                                    iM = h00Var.m();
                                }
                                i3 = u13Var.m;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    i4 = 0;
                                } else {
                                    if (h00Var.d(i11)) {
                                        return;
                                    }
                                    i4 = h00Var.i(i11);
                                    if (!z3) {
                                    }
                                }
                                i5 = 0;
                                iN2 = 0;
                                iN = 0;
                                zk1 zk1Var5 = al1Var.n;
                                zk1Var5.c = u13Var;
                                zk1Var5.d = i9;
                                zk1Var5.e = iM2;
                                zk1Var5.f = i13;
                                zk1Var5.g = iM3;
                                zk1Var5.h = zH;
                                zk1Var5.i = z;
                                zk1Var5.j = zH2;
                                zk1Var5.k = z2;
                                zk1Var5.l = iM;
                                zk1Var5.m = i4;
                                zk1Var5.n = iN2;
                                zk1Var5.o = i5;
                                zk1Var5.p = iN;
                                zk1Var5.a = true;
                                zk1Var5.b = true;
                                al1Var.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(int i, long j, long j2) {
        if (!this.l || this.k.c) {
            this.d.g(i);
            this.e.g(i);
        }
        this.f.g(i);
        al1 al1Var = this.k;
        boolean z = this.n;
        al1Var.i = i;
        al1Var.l = j2;
        al1Var.j = j;
        al1Var.s = z;
        if (!al1Var.b || i != 1) {
            if (!al1Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        zk1 zk1Var = al1Var.m;
        al1Var.m = al1Var.n;
        al1Var.n = zk1Var;
        zk1Var.b = false;
        zk1Var.a = false;
        al1Var.h = 0;
        al1Var.k = true;
    }
}
