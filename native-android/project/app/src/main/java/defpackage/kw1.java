package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
        String str;
        String str2 = "Invalid";
        int i = this.b;
        if (i == 0) {
            str = "Unspecified";
        } else if (i == 1) {
            str = "Text";
        } else if (i == 2) {
            str = "Ascii";
        } else if (i == 3) {
            str = "Number";
        } else if (i == 4) {
            str = "Phone";
        } else if (i == 5) {
            str = "Uri";
        } else if (i == 6) {
            str = "Email";
        } else if (i == 7) {
            str = "Password";
        } else if (i == 8) {
            str = "NumberPassword";
        } else if (i == 9) {
            str = "Decimal";
        } else if (i == 10) {
            str = "PasswordVisible";
        } else if (i == 11) {
            str = "PostalAddress";
        } else if (i == 12) {
            str = "PersonName";
        } else if (i == 13) {
            str = "EmailSubject";
        } else if (i == 14) {
            str = "ShortMessage";
        } else if (i == 15) {
            str = "LongMessage";
        } else if (i == 16) {
            str = "Filter";
        } else if (i == 17) {
            str = "Phonetic";
        } else if (i == 18) {
            str = "DateTime";
        } else if (i == 19) {
            str = "Date";
        } else if (i == 20) {
            str = "Time";
        } else if (i == 21) {
            str = "NumberSigned";
        } else if (i == 22) {
            str = "DecimalSigned";
        } else if (i == 23) {
            str = "DecimalPassword";
        } else if (i == 24) {
            str = "NumberPasswordSigned";
        } else {
            str = i == 25 ? "DecimalPasswordSigned" : "Invalid";
        }
        int i2 = this.c;
        if (i2 == -1) {
            str2 = "Unspecified";
        } else if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Default";
        } else if (i2 == 2) {
            str2 = "Go";
        } else if (i2 == 3) {
            str2 = "Search";
        } else if (i2 == 4) {
            str2 = "Send";
        } else if (i2 == 5) {
            str2 = "Previous";
        } else if (i2 == 6) {
            str2 = "Next";
        } else if (i2 == 7) {
            str2 = "Done";
        }
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        sb.append("None");
        sb.append(", autoCorrect=");
        sb.append(this.a);
        sb.append(", keyboardType=");
        f34.n(sb, str, ", imeAction=", str2, ", platformImeOptions=null, hintLocales=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
