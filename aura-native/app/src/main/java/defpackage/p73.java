package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class p73 {
    public final Object a;
    public int b;
    public final /* synthetic */ q73 c;

    public p73(q73 q73Var, int i) {
        this.c = q73Var;
        this.a = q73Var.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        q73 q73Var = this.c;
        if (i == -1 || i >= q73Var.c || !si0.s(obj, q73Var.a[i])) {
            this.b = q73Var.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return q73Var.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p73) {
            p73 p73Var = (p73) obj;
            if (a() == p73Var.a() && si0.s(this.a, p73Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return a() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }
}
