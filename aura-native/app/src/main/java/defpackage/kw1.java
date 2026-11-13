package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kw1 {
    public static final /* synthetic */ int e = 0;
    public final boolean a;
    public final int b;
    public final int c;
    public final vd2 d;

    static {
        new kw1();
    }

    public kw1() {
        vd2 vd2Var = vd2.p;
        this.a = true;
        this.b = 1;
        this.c = 1;
        this.d = vd2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw1)) {
            return false;
        }
        kw1 kw1Var = (kw1) obj;
        return this.a == kw1Var.a && this.b == kw1Var.b && this.c == kw1Var.c && h12.c(this.d, kw1Var.d);
    }

    public final int hashCode() {
        return this.d.n.hashCode() + f34.d(this.c, f34.d(this.b, xa3.c(f34.d(0, Boolean.hashCode(false) * 31, 31), 31, this.a), 31), 961);
    }

    public final String toString() {
        String str = "Invalid";
        int i = this.b;
        String str2 = i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : i == 10 ? "PasswordVisible" : i == 11 ? "PostalAddress" : i == 12 ? "PersonName" : i == 13 ? "EmailSubject" : i == 14 ? "ShortMessage" : i == 15 ? "LongMessage" : i == 16 ? "Filter" : i == 17 ? "Phonetic" : i == 18 ? "DateTime" : i == 19 ? "Date" : i == 20 ? "Time" : i == 21 ? "NumberSigned" : i == 22 ? "DecimalSigned" : i == 23 ? "DecimalPassword" : i == 24 ? "NumberPasswordSigned" : i == 25 ? "DecimalPasswordSigned" : "Invalid";
        int i2 = this.c;
        if (i2 == -1) {
            str = "Unspecified";
        } else if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Default";
        } else if (i2 == 2) {
            str = "Go";
        } else if (i2 == 3) {
            str = "Search";
        } else if (i2 == 4) {
            str = "Send";
        } else if (i2 == 5) {
            str = "Previous";
        } else if (i2 == 6) {
            str = "Next";
        } else if (i2 == 7) {
            str = "Done";
        }
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        sb.append("None");
        sb.append(", autoCorrect=");
        sb.append(this.a);
        sb.append(", keyboardType=");
        f34.n(sb, str2, ", imeAction=", str, ", platformImeOptions=null, hintLocales=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
