package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class oq4 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public oq4(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = qm4.o0(upperCase, "INT") ? 3 : (qm4.o0(upperCase, "CHAR") || qm4.o0(upperCase, "CLOB") || qm4.o0(upperCase, "TEXT")) ? 2 : qm4.o0(upperCase, "BLOB") ? 5 : (qm4.o0(upperCase, "REAL") || qm4.o0(upperCase, "FLOA") || qm4.o0(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oq4) {
                boolean z = this.d > 0;
                oq4 oq4Var = (oq4) obj;
                int i = oq4Var.f;
                if (z == (oq4Var.d > 0) && h12.c(this.a, oq4Var.a) && this.c == oq4Var.c) {
                    String str = oq4Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || vr1.j(str2, str)) && ((i2 != 2 || i != 1 || str == null || vr1.j(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : vr1.j(str2, str))) && this.g == oq4Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return rm4.b0(rm4.d0(sb.toString()));
    }
}
