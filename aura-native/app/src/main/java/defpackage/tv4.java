package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tv4 {
    public static final tv4 d = new tv4(new sv4[0]);
    public static final String e;
    public final int a;
    public final gy3 b;
    public int c;

    static {
        String str = f35.a;
        e = Integer.toString(0, 36);
    }

    public tv4(sv4... sv4VarArr) {
        gy3 l = yw1.l(sv4VarArr);
        this.b = l;
        this.a = sv4VarArr.length;
        int i = 0;
        while (i < l.q) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < l.q; i3++) {
                if (((sv4) l.get(i)).equals(l.get(i3))) {
                    l93.G("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final sv4 a(int i) {
        return (sv4) this.b.get(i);
    }

    public final int b(sv4 sv4Var) {
        int indexOf = this.b.indexOf(sv4Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tv4.class != obj.getClass()) {
            return false;
        }
        tv4 tv4Var = (tv4) obj;
        return this.a == tv4Var.a && this.b.equals(tv4Var.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
