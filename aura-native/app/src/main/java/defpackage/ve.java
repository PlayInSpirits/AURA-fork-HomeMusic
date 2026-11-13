package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ve {
    public final int a;
    public final rf2 b;
    public final le c;
    public final String d;

    public ve(rf2 rf2Var, le leVar, String str) {
        this.b = rf2Var;
        this.c = leVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{rf2Var, leVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return au0.n(this.b, veVar.b) && au0.n(this.c, veVar.c) && au0.n(this.d, veVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
