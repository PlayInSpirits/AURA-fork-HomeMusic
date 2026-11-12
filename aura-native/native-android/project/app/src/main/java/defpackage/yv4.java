package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yv4 {
    public static final String c;
    public static final String d;
    public final sv4 a;
    public final yw1 b;

    static {
        String str = f35.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public yv4(sv4 sv4Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= sv4Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = sv4Var;
        this.b = yw1.k(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yv4.class == obj.getClass()) {
            yv4 yv4Var = (yv4) obj;
            if (this.a.equals(yv4Var.a) && this.b.equals(yv4Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
