package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jw4 {
    public static final jw4 b;
    public static final String c;
    public final yw1 a;

    static {
        vw1 vw1Var = yw1.o;
        b = new jw4(gy3.r);
        String str = f35.a;
        c = Integer.toString(0, 36);
    }

    public jw4(List list) {
        this.a = yw1.k(list);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            yw1 yw1Var = this.a;
            if (i2 >= yw1Var.size()) {
                return false;
            }
            iw4 iw4Var = (iw4) yw1Var.get(i2);
            for (boolean z : iw4Var.e) {
                if (z) {
                    if (iw4Var.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jw4.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((jw4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
