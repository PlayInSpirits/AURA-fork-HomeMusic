package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ub {
    public final Context a;
    public final oo0 b;
    public final long c;
    public final ac3 d;

    public ub(Context context, oo0 oo0Var, long j, ac3 ac3Var) {
        this.a = context;
        this.b = oo0Var;
        this.c = j;
        this.d = ac3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ub.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ub ubVar = (ub) obj;
        return h12.c(this.a, ubVar.a) && h12.c(this.b, ubVar.b) && x40.c(this.c, ubVar.c) && h12.c(this.d, ubVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = x40.h;
        return this.d.hashCode() + xa3.b(hashCode, 31, this.c);
    }
}
