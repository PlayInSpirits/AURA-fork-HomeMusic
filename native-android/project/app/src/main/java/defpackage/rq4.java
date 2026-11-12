package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rq4 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public rq4(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public static final rq4 a(we1 we1Var, String str) {
        return gi1.T(new po4(we1Var), str);
    }

    public static final rq4 b(x34 x34Var, String str) {
        return gi1.T(x34Var, str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq4)) {
            return false;
        }
        rq4 rq4Var = (rq4) obj;
        if (!this.a.equals(rq4Var.a) || !this.b.equals(rq4Var.b) || !h12.c(this.c, rq4Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = rq4Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(vr1.r(q40.K0(this.b.values(), new jb2(6))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(vr1.r(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(vr1.r(set != null ? q40.K0(set, new jb2(7)) : u01.n));
        sb.append("\n            |}\n        ");
        return rm4.d0(sb.toString());
    }
}
