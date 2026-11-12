package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rq4 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public rq4(String r1, Map r2, AbstractSet r3, AbstractSet r4) {
        r3.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public static final rq4 a(we1 r1, String r2) {
        return gi1.T(new po4(r1), r2);
    }

    public static final rq4 b(x34 r0, String r1) {
        return gi1.T(r0, r1);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof rq4) == false) goto L26;
        rq4 r4 = (rq4) r3;
        String r0 = r4.a;
        if (this.a.equals(r0) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L14;
        return false;
    L14:
        if (h12.c(this.c, r4.c) == true) goto L17;
        return false;
    L17:
        Set r2 = this.d;
        if (r2 == null) goto L24;
        Set r5 = r4.d;
        if (r5 != null) goto L23;
        return true;
    L23:
        return r2.equals(r5);
    L24:
        return true;
    L26:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = (this.b.hashCode() + r0) * 31;
        return this.c.hashCode() + r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        r0.append(this.a);
        r0.append("',\n            |    columns = {");
        r0.append(vr1.r(q40.K0(this.b.values(), new jb2(6))));
        r0.append("\n            |    foreignKeys = {");
        r0.append(vr1.r(this.c));
        r0.append("\n            |    indices = {");
        Set r4 = this.d;
        if (r4 == null) goto L5;
        Collection r5 = q40.K0(r4, new jb2(7));
    L6:
        r0.append(vr1.r(r5));
        r0.append("\n            |}\n        ");
        return rm4.d0(r0.toString());
    L5:
        r5 = u01.n;
        goto L6
    }
}
