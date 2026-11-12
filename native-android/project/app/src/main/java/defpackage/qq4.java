package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qq4 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public qq4(String r1, boolean r2, List r3, List r4) {
        r1.getClass();
        r3.getClass();
        r4.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        if (r4.isEmpty() == false) goto L7;
        int r5 = r3.size();
        r4 = new ArrayList(r5);
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L7;
        r4.add("ASC");
        r6 = r6 + 1;
    L7:
        this.d = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof qq4) == false) goto L16;
        qq4 r6 = (qq4) r5;
        String r0 = r6.a;
        boolean r2 = r6.b;
        if (this.b != r2) goto L16;
        if (h12.c(this.c, r6.c) == false) goto L16;
        if (h12.c(this.d, r6.d) == false) goto L16;
        String r4 = this.a;
        if (xm4.k0(r4, "index_", false) == false) goto L22;
        return xm4.k0(r0, "index_", false);
    L22:
        return r4.equals(r0);
    L16:
        return false;
    }

    public final int hashCode() {
        String r2 = this.a;
        if (xm4.k0(r2, "index_", false) == false) goto L5;
        int r0 = -1184239155;
    L6:
        int r1 = ((r0 * 31) + (this.b ? 1 : 0)) * 31;
        int r3 = (this.c.hashCode() + r1) * 31;
        return this.d.hashCode() + r3;
    L5:
        r0 = r2.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("\n            |Index {\n            |   name = '");
        r0.append(this.a);
        r0.append("',\n            |   unique = '");
        r0.append(this.b);
        r0.append("',\n            |   columns = {");
        rm4.b0(q40.B0(this.c, ",", null, null, null, 62));
        rm4.b0("},");
        j15 r1 = j15.a;
        r0.append(r1);
        r0.append("\n            |   orders = {");
        rm4.b0(q40.B0(this.d, ",", null, null, null, 62));
        rm4.b0(" }");
        r0.append(r1);
        r0.append("\n            |}\n        ");
        return rm4.b0(rm4.d0(r0.toString()));
    }
}
