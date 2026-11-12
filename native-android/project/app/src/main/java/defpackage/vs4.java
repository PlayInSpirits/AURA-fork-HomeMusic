package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vs4 extends gx2 {
    public final String a;
    public final zs4 b;
    public final ha1 c;

    public vs4(String str, zs4 zs4Var, ha1 ha1Var) {
        this.a = str;
        this.b = zs4Var;
        this.c = ha1Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        ys4 ys4Var = new ys4();
        ys4Var.B = this.a;
        ys4Var.C = this.b;
        ys4Var.D = this.c;
        ys4Var.E = 1;
        ys4Var.F = true;
        ys4Var.G = Integer.MAX_VALUE;
        ys4Var.H = 1;
        return ys4Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        zs4 zs4Var;
        boolean z3;
        ha1 ha1Var;
        ha1 ha1Var2;
        ys4 ys4Var = (ys4) cx2Var;
        ys4Var.getClass();
        zs4 zs4Var2 = ys4Var.C;
        boolean z4 = false;
        boolean z5 = true;
        zs4 zs4Var3 = this.b;
        if (zs4Var3 != zs4Var2) {
            if (!zs4Var3.a.b(zs4Var2.a)) {
                z = true;
            }
            str = ys4Var.B;
            str2 = this.a;
            if (h12.c(str, str2)) {
                z2 = false;
            } else {
                ys4Var.B = str2;
                ys4Var.L = null;
                z2 = true;
            }
            zs4Var = ys4Var.C;
            if (zs4Var != zs4Var3) {
                if (h12.c(zs4Var.b, zs4Var3.b) && zs4Var.a.a(zs4Var3.a)) {
                }
                z3 = !z4;
                ys4Var.C = zs4Var3;
                if (ys4Var.H != 1) {
                    ys4Var.H = 1;
                    z3 = true;
                }
                if (ys4Var.G != Integer.MAX_VALUE) {
                    ys4Var.G = Integer.MAX_VALUE;
                    z3 = true;
                }
                if (!ys4Var.F) {
                    ys4Var.F = true;
                    z3 = true;
                }
                ha1Var = ys4Var.D;
                ha1Var2 = this.c;
                if (!h12.c(ha1Var, ha1Var2)) {
                    ys4Var.D = ha1Var2;
                    z3 = true;
                }
                if (ys4Var.E == 1) {
                    z5 = z3;
                } else {
                    ys4Var.E = 1;
                }
                if (z2 || z5) {
                    rd3 rd3VarQ0 = ys4Var.q0();
                    String str3 = ys4Var.B;
                    zs4 zs4Var4 = ys4Var.C;
                    ha1 ha1Var3 = ys4Var.D;
                    int i = ys4Var.E;
                    boolean z6 = ys4Var.F;
                    int i2 = ys4Var.G;
                    int i3 = ys4Var.H;
                    rd3VarQ0.a = str3;
                    rd3VarQ0.b = zs4Var4;
                    rd3VarQ0.c = ha1Var3;
                    rd3VarQ0.d = i;
                    rd3VarQ0.e = z6;
                    rd3VarQ0.f = i2;
                    rd3VarQ0.g = i3;
                    rd3VarQ0.q = (rd3VarQ0.q << 2) | 2;
                    rd3VarQ0.b();
                }
                if (ys4Var.A) {
                    if (z2 || (z && ys4Var.K != null)) {
                        fu.C(ys4Var);
                    }
                    if (z2 || z5) {
                        g12.A(ys4Var);
                        jz4.z(ys4Var);
                    }
                    if (z) {
                        jz4.z(ys4Var);
                    }
                }
                return;
            }
            zs4Var.getClass();
            z4 = true;
            z3 = !z4;
            ys4Var.C = zs4Var3;
            if (ys4Var.H != 1) {
                ys4Var.H = 1;
                z3 = true;
            }
            if (ys4Var.G != Integer.MAX_VALUE) {
                ys4Var.G = Integer.MAX_VALUE;
                z3 = true;
            }
            if (!ys4Var.F) {
                ys4Var.F = true;
                z3 = true;
            }
            ha1Var = ys4Var.D;
            ha1Var2 = this.c;
            if (!h12.c(ha1Var, ha1Var2)) {
                ys4Var.D = ha1Var2;
                z3 = true;
            }
            if (ys4Var.E == 1) {
                z5 = z3;
            } else {
                ys4Var.E = 1;
            }
            if (z2) {
                rd3 rd3VarQ1 = ys4Var.q0();
                String str4 = ys4Var.B;
                zs4 zs4Var5 = ys4Var.C;
                ha1 ha1Var4 = ys4Var.D;
                int i4 = ys4Var.E;
                boolean z7 = ys4Var.F;
                int i5 = ys4Var.G;
                int i6 = ys4Var.H;
                rd3VarQ1.a = str4;
                rd3VarQ1.b = zs4Var5;
                rd3VarQ1.c = ha1Var4;
                rd3VarQ1.d = i4;
                rd3VarQ1.e = z7;
                rd3VarQ1.f = i5;
                rd3VarQ1.g = i6;
                rd3VarQ1.q = (rd3VarQ1.q << 2) | 2;
                rd3VarQ1.b();
            } else {
                rd3 rd3VarQ2 = ys4Var.q0();
                String str5 = ys4Var.B;
                zs4 zs4Var6 = ys4Var.C;
                ha1 ha1Var5 = ys4Var.D;
                int i7 = ys4Var.E;
                boolean z8 = ys4Var.F;
                int i8 = ys4Var.G;
                int i9 = ys4Var.H;
                rd3VarQ2.a = str5;
                rd3VarQ2.b = zs4Var6;
                rd3VarQ2.c = ha1Var5;
                rd3VarQ2.d = i7;
                rd3VarQ2.e = z8;
                rd3VarQ2.f = i8;
                rd3VarQ2.g = i9;
                rd3VarQ2.q = (rd3VarQ2.q << 2) | 2;
                rd3VarQ2.b();
            }
            if (ys4Var.A) {
                return;
            }
            if (z2) {
                fu.C(ys4Var);
            } else {
                fu.C(ys4Var);
            }
            if (z2) {
                g12.A(ys4Var);
                jz4.z(ys4Var);
            } else {
                g12.A(ys4Var);
                jz4.z(ys4Var);
            }
            if (z) {
                jz4.z(ys4Var);
            }
        }
        zs4Var3.getClass();
        z = false;
        str = ys4Var.B;
        str2 = this.a;
        if (h12.c(str, str2)) {
            z2 = false;
        } else {
            ys4Var.B = str2;
            ys4Var.L = null;
            z2 = true;
        }
        zs4Var = ys4Var.C;
        if (zs4Var != zs4Var3) {
            if (h12.c(zs4Var.b, zs4Var3.b)) {
            }
            z3 = !z4;
            ys4Var.C = zs4Var3;
            if (ys4Var.H != 1) {
                ys4Var.H = 1;
                z3 = true;
            }
            if (ys4Var.G != Integer.MAX_VALUE) {
                ys4Var.G = Integer.MAX_VALUE;
                z3 = true;
            }
            if (!ys4Var.F) {
                ys4Var.F = true;
                z3 = true;
            }
            ha1Var = ys4Var.D;
            ha1Var2 = this.c;
            if (!h12.c(ha1Var, ha1Var2)) {
                ys4Var.D = ha1Var2;
                z3 = true;
            }
            if (ys4Var.E == 1) {
                z5 = z3;
            } else {
                ys4Var.E = 1;
            }
            if (z2) {
                rd3 rd3VarQ3 = ys4Var.q0();
                String str6 = ys4Var.B;
                zs4 zs4Var7 = ys4Var.C;
                ha1 ha1Var6 = ys4Var.D;
                int i10 = ys4Var.E;
                boolean z9 = ys4Var.F;
                int i11 = ys4Var.G;
                int i12 = ys4Var.H;
                rd3VarQ3.a = str6;
                rd3VarQ3.b = zs4Var7;
                rd3VarQ3.c = ha1Var6;
                rd3VarQ3.d = i10;
                rd3VarQ3.e = z9;
                rd3VarQ3.f = i11;
                rd3VarQ3.g = i12;
                rd3VarQ3.q = (rd3VarQ3.q << 2) | 2;
                rd3VarQ3.b();
            } else {
                rd3 rd3VarQ4 = ys4Var.q0();
                String str7 = ys4Var.B;
                zs4 zs4Var8 = ys4Var.C;
                ha1 ha1Var7 = ys4Var.D;
                int i13 = ys4Var.E;
                boolean z10 = ys4Var.F;
                int i14 = ys4Var.G;
                int i15 = ys4Var.H;
                rd3VarQ4.a = str7;
                rd3VarQ4.b = zs4Var8;
                rd3VarQ4.c = ha1Var7;
                rd3VarQ4.d = i13;
                rd3VarQ4.e = z10;
                rd3VarQ4.f = i14;
                rd3VarQ4.g = i15;
                rd3VarQ4.q = (rd3VarQ4.q << 2) | 2;
                rd3VarQ4.b();
            }
            if (ys4Var.A) {
                return;
            }
            if (z2) {
                fu.C(ys4Var);
            } else {
                fu.C(ys4Var);
            }
            if (z2) {
                g12.A(ys4Var);
                jz4.z(ys4Var);
            } else {
                g12.A(ys4Var);
                jz4.z(ys4Var);
            }
            if (z) {
                jz4.z(ys4Var);
            }
        }
        zs4Var.getClass();
        z4 = true;
        z3 = !z4;
        ys4Var.C = zs4Var3;
        if (ys4Var.H != 1) {
            ys4Var.H = 1;
            z3 = true;
        }
        if (ys4Var.G != Integer.MAX_VALUE) {
            ys4Var.G = Integer.MAX_VALUE;
            z3 = true;
        }
        if (!ys4Var.F) {
            ys4Var.F = true;
            z3 = true;
        }
        ha1Var = ys4Var.D;
        ha1Var2 = this.c;
        if (!h12.c(ha1Var, ha1Var2)) {
            ys4Var.D = ha1Var2;
            z3 = true;
        }
        if (ys4Var.E == 1) {
            z5 = z3;
        } else {
            ys4Var.E = 1;
        }
        if (z2) {
            rd3 rd3VarQ5 = ys4Var.q0();
            String str8 = ys4Var.B;
            zs4 zs4Var9 = ys4Var.C;
            ha1 ha1Var8 = ys4Var.D;
            int i16 = ys4Var.E;
            boolean z11 = ys4Var.F;
            int i17 = ys4Var.G;
            int i18 = ys4Var.H;
            rd3VarQ5.a = str8;
            rd3VarQ5.b = zs4Var9;
            rd3VarQ5.c = ha1Var8;
            rd3VarQ5.d = i16;
            rd3VarQ5.e = z11;
            rd3VarQ5.f = i17;
            rd3VarQ5.g = i18;
            rd3VarQ5.q = (rd3VarQ5.q << 2) | 2;
            rd3VarQ5.b();
        } else {
            rd3 rd3VarQ6 = ys4Var.q0();
            String str9 = ys4Var.B;
            zs4 zs4Var10 = ys4Var.C;
            ha1 ha1Var9 = ys4Var.D;
            int i19 = ys4Var.E;
            boolean z12 = ys4Var.F;
            int i110 = ys4Var.G;
            int i111 = ys4Var.H;
            rd3VarQ6.a = str9;
            rd3VarQ6.b = zs4Var10;
            rd3VarQ6.c = ha1Var9;
            rd3VarQ6.d = i19;
            rd3VarQ6.e = z12;
            rd3VarQ6.f = i110;
            rd3VarQ6.g = i111;
            rd3VarQ6.q = (rd3VarQ6.q << 2) | 2;
            rd3VarQ6.b();
        }
        if (ys4Var.A) {
            return;
        }
        if (z2) {
            fu.C(ys4Var);
        } else {
            fu.C(ys4Var);
        }
        if (z2) {
            g12.A(ys4Var);
            jz4.z(ys4Var);
        } else {
            g12.A(ys4Var);
            jz4.z(ys4Var);
        }
        if (z) {
            jz4.z(ys4Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs4)) {
            return false;
        }
        vs4 vs4Var = (vs4) obj;
        return h12.c(this.a, vs4Var.a) && h12.c(this.b, vs4Var.b) && h12.c(this.c, vs4Var.c);
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(true) + f34.d(1, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31) + Integer.MAX_VALUE) * 31) + 1) * 31;
    }
}
