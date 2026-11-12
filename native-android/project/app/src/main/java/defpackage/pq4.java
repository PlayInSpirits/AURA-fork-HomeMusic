package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pq4 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public pq4(String r1, String r2, String r3, List r4, List r5) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r4.getClass();
        r5.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L6;
        return true;
    L6:
        if ((r3 instanceof pq4) == false) goto L23;
        pq4 r4 = (pq4) r3;
        String r0 = r4.a;
        if (h12.c(this.a, r0) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.b, r4.b) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.c, r4.c) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.d, r4.d) == true) goto L22;
        return false;
    L22:
        return h12.c(this.e, r4.e);
    L23:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = f34.e(this.b, r0, 31);
        int r2 = f34.e(this.c, r1, 31);
        int r3 = (this.d.hashCode() + r2) * 31;
        return this.e.hashCode() + r3;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        r0.append(this.a);
        r0.append("',\n            |   onDelete = '");
        r0.append(this.b);
        r0.append("',\n            |   onUpdate = '");
        r0.append(this.c);
        r0.append("',\n            |   columnNames = {");
        rm4.b0(q40.B0(q40.J0(this.d), ",", null, null, null, 62));
        rm4.b0("},");
        j15 r1 = j15.a;
        r0.append(r1);
        r0.append("\n            |   referenceColumnNames = {");
        rm4.b0(q40.B0(q40.J0(this.e), ",", null, null, null, 62));
        rm4.b0(" }");
        r0.append(r1);
        r0.append("\n            |}\n        ");
        return rm4.b0(rm4.d0(r0.toString()));
    }
}
