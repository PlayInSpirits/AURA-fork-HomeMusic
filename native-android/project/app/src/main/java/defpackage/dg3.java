package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dg3 implements pv2 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public dg3(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static dg3 d(be3 be3Var) {
        int iM = be3Var.m();
        String strM = lw2.m(be3Var.y(be3Var.m(), StandardCharsets.US_ASCII));
        String strY = be3Var.y(be3Var.m(), StandardCharsets.UTF_8);
        int iM2 = be3Var.m();
        int iM3 = be3Var.m();
        int iM4 = be3Var.m();
        int iM5 = be3Var.m();
        int iM6 = be3Var.m();
        byte[] bArr = new byte[iM6];
        be3Var.k(bArr, 0, iM6);
        return new dg3(iM, strM, strY, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // defpackage.pv2
    public final void b(co2 co2Var) {
        co2Var.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dg3.class != obj.getClass()) {
            return false;
        }
        dg3 dg3Var = (dg3) obj;
        return this.a == dg3Var.a && this.b.equals(dg3Var.b) && this.c.equals(dg3Var.c) && this.d == dg3Var.d && this.e == dg3Var.e && this.f == dg3Var.f && this.g == dg3Var.g && Arrays.equals(this.h, dg3Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((f34.e(this.c, f34.e(this.b, (527 + this.a) * 31, 31), 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
