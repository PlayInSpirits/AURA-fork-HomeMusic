package defpackage;

import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i6 implements mz0 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public wv4 h;
    public wv4 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public wv4 v;
    public long w;
    public final h00 b = new h00(7, new byte[7]);
    public final be3 c = new be3(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public i6(String str, int i, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.mz0
    public final void a(be3 be3Var) throws ParserException {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.h.getClass();
        String str = f35.a;
        while (be3Var.a() > 0) {
            int i7 = this.j;
            byte b2 = -1;
            be3 be3Var2 = this.c;
            int i8 = 3;
            h00 h00Var = this.b;
            int i9 = 0;
            int i10 = 4;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = be3Var.a;
                int i12 = be3Var.b;
                int i13 = be3Var.c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = i8;
                        byte b3 = bArr[i12];
                        int i16 = b3 & 255;
                        if (this.l == 512 && ((65280 | (((byte) i16) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i17 = i12 - 1;
                                be3Var.N(i12);
                                byte[] bArr2 = h00Var.b;
                                if (be3Var.a() < i11) {
                                    b = -1;
                                } else {
                                    be3Var.k(bArr2, i9, i11);
                                    h00Var.q(i10);
                                    int i18 = h00Var.i(i11);
                                    int i19 = this.o;
                                    if (i19 == -1 || i18 == i19) {
                                        if (this.p != -1) {
                                            byte[] bArr3 = h00Var.b;
                                            if (be3Var.a() >= i11) {
                                                be3Var.k(bArr3, i9, i11);
                                                h00Var.q(2);
                                                i4 = 4;
                                                if (h00Var.i(4) != this.p) {
                                                    b = -1;
                                                } else {
                                                    be3Var.N(i14);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = h00Var.b;
                                        if (be3Var.a() >= i4) {
                                            be3Var.k(bArr4, i9, i4);
                                            h00Var.q(14);
                                            int i20 = h00Var.i(13);
                                            if (i20 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = be3Var.a;
                                                int i21 = be3Var.c;
                                                int i22 = i17 + i20;
                                                if (i22 < i21) {
                                                    byte b4 = bArr5[i22];
                                                    b = -1;
                                                    if (b4 == -1) {
                                                        int i23 = i22 + 1;
                                                        if (i23 != i21) {
                                                            byte b5 = bArr5[i23];
                                                            if (((65280 | (b5 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b5 & 8) >> 3) == i18) {
                                                            }
                                                        }
                                                    } else if (b4 == 73 && ((i5 = i22 + 1) == i21 || (bArr5[i5] == 68 && ((i6 = i22 + 2) == i21 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.q = (b3 & 8) >> 3;
                            this.m = (b3 & 1) == 0;
                            if (this.n) {
                                this.j = i15;
                                this.k = 0;
                            } else {
                                this.j = 1;
                                this.k = 0;
                            }
                            be3Var.N(i14);
                        } else {
                            b = b2;
                            i = i11;
                        }
                        int i24 = this.l;
                        int i25 = i16 | i24;
                        if (i25 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 768;
                        } else if (i25 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 512;
                        } else if (i25 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 1024;
                        } else if (i25 != 1075) {
                            c = 256;
                            if (i24 != 256) {
                                this.l = 256;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i11 = i;
                            b2 = b;
                            i10 = 4;
                            i9 = i3;
                            i8 = i2;
                        } else {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            be3Var2.N(0);
                            be3Var.N(i14);
                        }
                        i12 = i14;
                        i11 = i;
                        b2 = b;
                        i10 = 4;
                        i9 = i3;
                        i8 = i2;
                    } else {
                        be3Var.N(i12);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = be3Var2.a;
                    int iMin = Math.min(be3Var.a(), 10 - this.k);
                    be3Var.k(bArr6, this.k, iMin);
                    int i26 = this.k + iMin;
                    this.k = i26;
                    if (i26 == 10) {
                        this.i.e(10, be3Var2);
                        be3Var2.N(6);
                        wv4 wv4Var = this.i;
                        int iZ = be3Var2.z() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = wv4Var;
                        this.w = 0L;
                        this.t = iZ;
                    }
                } else if (i7 == 3) {
                    int i27 = this.m ? 7 : 5;
                    byte[] bArr7 = h00Var.b;
                    int iMin2 = Math.min(be3Var.a(), i27 - this.k);
                    be3Var.k(bArr7, this.k, iMin2);
                    int i28 = this.k + iMin2;
                    this.k = i28;
                    if (i28 == i27) {
                        h00Var.q(0);
                        if (this.r) {
                            h00Var.t(10);
                        } else {
                            int i29 = h00Var.i(2) + 1;
                            if (i29 != 2) {
                                l93.q0("AdtsReader", "Detected audio object type: " + i29 + ", but assuming AAC LC.");
                                i29 = 2;
                            }
                            h00Var.t(5);
                            int i30 = h00Var.i(3);
                            int i31 = this.p;
                            byte[] bArr8 = {(byte) (((i29 << 3) & 248) | ((i31 >> 1) & 7)), (byte) (((i30 << 3) & 120) | ((i31 << 7) & 128))};
                            g gVarD = xl.D(new h00(2, bArr8), false);
                            sb1 sb1Var = new sb1();
                            sb1Var.a = this.g;
                            sb1Var.l = lw2.m(this.f);
                            sb1Var.m = lw2.m("audio/mp4a-latm");
                            sb1Var.j = gVarD.a;
                            sb1Var.E = gVarD.c;
                            sb1Var.F = gVarD.b;
                            sb1Var.p = Collections.singletonList(bArr8);
                            sb1Var.d = this.d;
                            sb1Var.f = this.e;
                            tb1 tb1Var = new tb1(sb1Var);
                            this.s = 1024000000 / ((long) tb1Var.G);
                            this.h.g(tb1Var);
                            this.r = true;
                        }
                        h00Var.t(4);
                        int i32 = h00Var.i(13);
                        int i33 = i32 - 7;
                        if (this.m) {
                            i33 = i32 - 9;
                        }
                        wv4 wv4Var2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = wv4Var2;
                        this.w = j;
                        this.t = i33;
                    }
                } else {
                    if (i7 != 4) {
                        tb4.a();
                        return;
                    }
                    int iMin3 = Math.min(be3Var.a(), this.t - this.k);
                    this.v.e(iMin3, be3Var);
                    int i34 = this.k + iMin3;
                    this.k = i34;
                    if (i34 == this.t) {
                        rr2.w(this.u != -9223372036854775807L);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (be3Var.a() != 0) {
                h00Var.b[0] = be3Var.a[be3Var.b];
                h00Var.q(2);
                int i35 = h00Var.i(4);
                int i36 = this.p;
                if (i36 == -1 || i35 == i36) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = i35;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = 256;
                }
            }
        }
    }

    @Override // defpackage.mz0
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        sy4Var.a();
        sy4Var.b();
        this.g = sy4Var.e;
        sy4Var.b();
        wv4 wv4VarT = m51Var.t(sy4Var.d, 1);
        this.h = wv4VarT;
        this.v = wv4VarT;
        if (!this.a) {
            this.i = new tq0();
            return;
        }
        sy4Var.a();
        sy4Var.b();
        wv4 wv4VarT2 = m51Var.t(sy4Var.d, 5);
        this.i = wv4VarT2;
        sb1 sb1Var = new sb1();
        sy4Var.b();
        sb1Var.a = sy4Var.e;
        sb1Var.l = lw2.m(this.f);
        sb1Var.m = lw2.m("application/id3");
        f34.l(sb1Var, wv4VarT2);
    }
}
