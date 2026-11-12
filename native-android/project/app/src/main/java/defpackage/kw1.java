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
        vd2 r0 = vd2.p;
        this.a = true;
        this.b = 1;
        this.c = 1;
        this.d = r0;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof kw1) == false) goto L23;
        kw1 r4 = (kw1) r3;
        if (this.a == r4.a) goto L11;
        return false;
    L11:
        if (this.b == r4.b) goto L13;
        return false;
    L13:
        if (this.c == r4.c) goto L15;
        return false;
    L15:
        if (h12.c(this.d, r4.d) == false) goto L25;
        return true;
    L25:
        return false;
    L23:
        return false;
    }

    public final int hashCode() {
        int r0 = xa3.c(f34.d(0, Boolean.hashCode(false) * 31, 31), 31, this.a);
        int r1 = f34.d(this.b, r0, 31);
        int r2 = f34.d(this.c, r1, 961);
        return this.d.n.hashCode() + r2;
    }

    public final String toString() {
        String r4 = "Invalid";
        int r9 = this.b;
        if (r9 != 0) goto L5;
        String r10 = "Unspecified";
    L74:
        int r12 = this.c;
        if (r12 != (-1)) goto L77;
        r4 = "Unspecified";
    L93:
        StringBuilder r0 = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        r0.append("None");
        r0.append(", autoCorrect=");
        r0.append(this.a);
        r0.append(", keyboardType=");
        f34.n(r0, r10, ", imeAction=", r4, ", platformImeOptions=null, hintLocales=");
        r0.append(this.d);
        r0.append(")");
        return r0.toString();
    L77:
        if (r12 != 0) goto L79;
        r4 = "None";
        goto L93
    L79:
        if (r12 != 1) goto L81;
        r4 = "Default";
        goto L93
    L81:
        if (r12 != 2) goto L83;
        r4 = "Go";
        goto L93
    L83:
        if (r12 != 3) goto L85;
        r4 = "Search";
        goto L93
    L85:
        if (r12 != 4) goto L87;
        r4 = "Send";
        goto L93
    L87:
        if (r12 != 5) goto L89;
        r4 = "Previous";
        goto L93
    L89:
        if (r12 != 6) goto L91;
        r4 = "Next";
        goto L93
    L91:
        if (r12 != 7) goto L93;
        r4 = "Done";
        goto L93
    L5:
        if (r9 != 1) goto L7;
        r10 = "Text";
        goto L74
    L7:
        if (r9 != 2) goto L9;
        r10 = "Ascii";
        goto L74
    L9:
        if (r9 != 3) goto L11;
        r10 = "Number";
        goto L74
    L11:
        if (r9 != 4) goto L13;
        r10 = "Phone";
        goto L74
    L13:
        if (r9 != 5) goto L15;
        r10 = "Uri";
        goto L74
    L15:
        if (r9 != 6) goto L17;
        r10 = "Email";
        goto L74
    L17:
        if (r9 != 7) goto L20;
        r10 = "Password";
        goto L74
    L20:
        if (r9 != 8) goto L23;
        r10 = "NumberPassword";
        goto L74
    L23:
        if (r9 != 9) goto L26;
        r10 = "Decimal";
        goto L74
    L26:
        if (r9 != 10) goto L29;
        r10 = "PasswordVisible";
        goto L74
    L29:
        if (r9 != 11) goto L32;
        r10 = "PostalAddress";
        goto L74
    L32:
        if (r9 != 12) goto L35;
        r10 = "PersonName";
        goto L74
    L35:
        if (r9 != 13) goto L38;
        r10 = "EmailSubject";
        goto L74
    L38:
        if (r9 != 14) goto L41;
        r10 = "ShortMessage";
        goto L74
    L41:
        if (r9 != 15) goto L44;
        r10 = "LongMessage";
        goto L74
    L44:
        if (r9 != 16) goto L47;
        r10 = "Filter";
        goto L74
    L47:
        if (r9 != 17) goto L50;
        r10 = "Phonetic";
        goto L74
    L50:
        if (r9 != 18) goto L53;
        r10 = "DateTime";
        goto L74
    L53:
        if (r9 != 19) goto L56;
        r10 = "Date";
        goto L74
    L56:
        if (r9 != 20) goto L59;
        r10 = "Time";
        goto L74
    L59:
        if (r9 != 21) goto L62;
        r10 = "NumberSigned";
        goto L74
    L62:
        if (r9 != 22) goto L65;
        r10 = "DecimalSigned";
        goto L74
    L65:
        if (r9 != 23) goto L68;
        r10 = "DecimalPassword";
        goto L74
    L68:
        if (r9 != 24) goto L71;
        r10 = "NumberPasswordSigned";
        goto L74
    L71:
        if (r9 != 25) goto L73;
        r10 = "DecimalPasswordSigned";
        goto L74
    L73:
        r10 = "Invalid";
        goto L74
    }
}
