package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r71 {
    public final ls a;
    public final ps b;
    public ms c;
    public final int d;

    public r71(ns nsVar, ps psVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = psVar;
        this.d = i;
        this.a = new ls(nsVar, j, j2, j3, j4, j5);
    }

    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(l51 l51Var, long j, t71 t71Var) {
        if (j == l51Var.getPosition()) {
            return 0;
        }
        t71Var.a = j;
        return 1;
    }

    public final int b(l51 l51Var, t71 t71Var) {
        while (true) {
            ms msVar = this.c;
            msVar.getClass();
            long j = msVar.f;
            long j2 = msVar.g;
            long j3 = msVar.h;
            long j4 = j2 - j;
            long j5 = this.d;
            ps psVar = this.b;
            if (j4 <= j5) {
                this.c = null;
                psVar.k();
                return c(l51Var, j, t71Var);
            }
            long position = j3 - l51Var.getPosition();
            if (position < 0 || position > 262144) {
                return c(l51Var, j3, t71Var);
            }
            l51Var.l((int) position);
            l51Var.k();
            os osVarC = psVar.c(l51Var, msVar.b);
            int i = osVarC.d;
            long j6 = osVarC.b;
            long j7 = osVarC.c;
            if (i == -3) {
                this.c = null;
                psVar.k();
                return c(l51Var, j3, t71Var);
            }
            if (i == -2) {
                msVar.d = j6;
                msVar.f = j7;
                msVar.h = ms.a(msVar.b, j6, msVar.e, j7, msVar.g, msVar.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        kf2.o("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - l51Var.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        l51Var.l((int) position2);
                    }
                    this.c = null;
                    psVar.k();
                    return c(l51Var, j7, t71Var);
                }
                msVar.e = j6;
                msVar.g = j7;
                msVar.h = ms.a(msVar.b, msVar.d, j6, msVar.f, j7, msVar.c);
            }
        }
    }

    public final void d(long j) {
        ms msVar = this.c;
        if (msVar == null || msVar.a != j) {
            ls lsVar = this.a;
            this.c = new ms(j, lsVar.a.e(j), lsVar.c, lsVar.d, lsVar.e, lsVar.f);
        }
    }
}
