package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ej0 {
    public final String a;
    public final tb1 b;
    public final tb1 c;
    public final int d;
    public final int e;

    public ej0(String str, tb1 tb1Var, tb1 tb1Var2, int i, int i2) {
        rr2.l(i == 0 || i2 == 0);
        rr2.l(true ^ TextUtils.isEmpty(str));
        this.a = str;
        tb1Var.getClass();
        this.b = tb1Var;
        tb1Var2.getClass();
        this.c = tb1Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ej0.class == obj.getClass()) {
            ej0 ej0Var = (ej0) obj;
            if (this.d == ej0Var.d && this.e == ej0Var.e && this.a.equals(ej0Var.a) && this.b.equals(ej0Var.b) && this.c.equals(ej0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + f34.e(this.a, (((527 + this.d) * 31) + this.e) * 31, 31)) * 31);
    }
}
