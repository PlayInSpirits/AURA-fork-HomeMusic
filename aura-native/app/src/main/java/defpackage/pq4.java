package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pq4 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public pq4(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq4)) {
            return false;
        }
        pq4 pq4Var = (pq4) obj;
        if (h12.c(this.a, pq4Var.a) && h12.c(this.b, pq4Var.b) && h12.c(this.c, pq4Var.c) && h12.c(this.d, pq4Var.d)) {
            return h12.c(this.e, pq4Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + f34.e(this.c, f34.e(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        rm4.b0(q40.B0(q40.J0(this.d), ",", null, null, null, 62));
        rm4.b0("},");
        j15 j15Var = j15.a;
        sb.append(j15Var);
        sb.append("\n            |   referenceColumnNames = {");
        rm4.b0(q40.B0(q40.J0(this.e), ",", null, null, null, 62));
        rm4.b0(" }");
        sb.append(j15Var);
        sb.append("\n            |}\n        ");
        return rm4.b0(rm4.d0(sb.toString()));
    }
}
