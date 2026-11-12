package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hu2 {
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public hu2(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public static Charset a(hu2 hu2Var) {
        String str;
        String[] strArr = hu2Var.d;
        int i = 0;
        int iN = q05.n(0, strArr.length - 1, 2);
        if (iN < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!xm4.f0(strArr[i], "charset", true)) {
                if (i == iN) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hu2) && h12.c(((hu2) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
