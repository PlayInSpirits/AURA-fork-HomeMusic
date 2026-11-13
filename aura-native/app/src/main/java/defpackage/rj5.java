package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class rj5 implements Iterable, Serializable {
    public static final rj5 p = new rj5(tj5.a);
    public int n = 0;
    public final byte[] o;

    static {
        int i = oj5.a;
    }

    public rj5(byte[] bArr) {
        bArr.getClass();
        this.o = bArr;
    }

    public static int h(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            kf2.h(b11.j(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            kf2.h(xa3.e(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        kf2.h(xa3.e(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static rj5 i(int i, byte[] bArr) {
        h(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new rj5(bArr2);
    }

    public byte a(int i) {
        return this.o[i];
    }

    public byte b(int i) {
        return this.o[i];
    }

    public int d() {
        return 0;
    }

    public int e() {
        return this.o.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof rj5) && e() == ((rj5) obj).e()) {
            if (e() == 0) {
                return true;
            }
            if (!(obj instanceof rj5)) {
                return obj.equals(this);
            }
            rj5 rj5Var = (rj5) obj;
            int i = this.n;
            int i2 = rj5Var.n;
            if (i == 0 || i2 == 0 || i == i2) {
                int e = e();
                if (e > rj5Var.e()) {
                    throw new IllegalArgumentException("Length too large: " + e + e());
                }
                if (e > rj5Var.e()) {
                    kf2.n(xa3.e(e, rj5Var.e(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = rj5Var.o;
                int d = d() + e;
                int d2 = d();
                int d3 = rj5Var.d();
                while (d2 < d) {
                    if (this.o[d2] == bArr[d3]) {
                        d2++;
                        d3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void f(int i, byte[] bArr) {
        System.arraycopy(this.o, 0, bArr, 0, i);
    }

    public final ByteArrayInputStream g() {
        return new ByteArrayInputStream(this.o, d(), e());
    }

    public final int hashCode() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        int e = e();
        int d = d();
        byte[] bArr = tj5.a;
        int i2 = e;
        for (int i3 = d; i3 < d + e; i3++) {
            i2 = (i2 * 31) + this.o[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.n = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new pj5(this);
    }

    public final byte[] j() {
        int e = e();
        if (e == 0) {
            return tj5.a;
        }
        byte[] bArr = new byte[e];
        f(e, bArr);
        return bArr;
    }

    public final String toString() {
        rj5 qj5Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int e = e();
        if (e() <= 50) {
            concat = gi1.d0(this);
        } else {
            int h = h(0, 47, e());
            if (h == 0) {
                qj5Var = p;
            } else {
                qj5Var = new qj5(this.o, d(), h);
            }
            concat = gi1.d0(qj5Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(e);
        sb.append(" contents=\"");
        return b11.q(sb, concat, "\">");
    }
}
