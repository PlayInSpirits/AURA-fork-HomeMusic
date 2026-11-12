package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class td3 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        ct4[] ct4VarArr = bt4.b;
        a = bt4.c;
    }

    public static final sd3 a(sd3 sd3Var, int i, int i2, long j, cs4 cs4Var, zg3 zg3Var, ra2 ra2Var, int i3, int i4, qs4 qs4Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        cs4 cs4Var2 = cs4Var;
        zg3 zg3Var2 = zg3Var;
        ra2 ra2Var2 = ra2Var;
        int i7 = i3;
        int i8 = i4;
        qs4 qs4Var2 = qs4Var;
        if (i5 == 0 || i5 == sd3Var.a) {
            ct4[] ct4VarArr = bt4.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (bt4.a(j3, sd3Var.c)) {
                }
            }
            if ((cs4Var2 == null || cs4Var2.equals(sd3Var.d)) && ((i6 == 0 || i6 == sd3Var.b) && ((zg3Var2 == null || zg3Var2.equals(sd3Var.e)) && ((ra2Var2 == null || ra2Var2.equals(sd3Var.f)) && ((i7 == 0 || i7 == sd3Var.g) && ((i8 == 0 || i8 == sd3Var.h) && (qs4Var2 == null || qs4Var2.equals(sd3Var.i)))))))) {
                return sd3Var;
            }
        } else {
            j2 = 0;
        }
        ct4[] ct4VarArr2 = bt4.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = sd3Var.c;
        }
        if (cs4Var2 == null) {
            cs4Var2 = sd3Var.d;
        }
        if (i5 == 0) {
            i5 = sd3Var.a;
        }
        if (i6 == 0) {
            i6 = sd3Var.b;
        }
        zg3 zg3Var3 = sd3Var.e;
        if (zg3Var3 != null && zg3Var2 == null) {
            zg3Var2 = zg3Var3;
        }
        if (ra2Var2 == null) {
            ra2Var2 = sd3Var.f;
        }
        if (i7 == 0) {
            i7 = sd3Var.g;
        }
        if (i8 == 0) {
            i8 = sd3Var.h;
        }
        if (qs4Var2 == null) {
            qs4Var2 = sd3Var.i;
        }
        return new sd3(i5, i6, j3, cs4Var2, zg3Var2, ra2Var2, i7, i8, qs4Var2);
    }
}
