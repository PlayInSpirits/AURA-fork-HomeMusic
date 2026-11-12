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
    public qq4(String str, boolean z, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qq4) {
            qq4 qq4Var = (qq4) obj;
            String str = qq4Var.a;
            if (this.b == qq4Var.b && h12.c(this.c, qq4Var.c) && h12.c(this.d, qq4Var.d)) {
                String str2 = this.a;
                return xm4.k0(str2, "index_", false) ? xm4.k0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((((xm4.k0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        rm4.b0(q40.B0(this.c, ",", null, null, null, 62));
        rm4.b0("},");
        j15 j15Var = j15.a;
        sb.append(j15Var);
        sb.append("\n            |   orders = {");
        rm4.b0(q40.B0(this.d, ",", null, null, null, 62));
        rm4.b0(" }");
        sb.append(j15Var);
        sb.append("\n            |}\n        ");
        return rm4.b0(rm4.d0(sb.toString()));
    }
}
