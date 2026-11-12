package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y60 {
    public final Object a;
    public final wy b;
    public final xf1 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ y60(Object obj, wy wyVar, xf1 xf1Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : wyVar, (i & 4) != 0 ? null : xf1Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static y60 a(y60 y60Var, wy wyVar, Throwable th, int i) {
        Object obj = y60Var.a;
        if ((i & 2) != 0) {
            wyVar = y60Var.b;
        }
        wy wyVar2 = wyVar;
        xf1 xf1Var = y60Var.c;
        Object obj2 = y60Var.d;
        if ((i & 16) != 0) {
            th = y60Var.e;
        }
        return new y60(obj, wyVar2, xf1Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y60)) {
            return false;
        }
        y60 y60Var = (y60) obj;
        return h12.c(this.a, y60Var.a) && h12.c(this.b, y60Var.b) && h12.c(this.c, y60Var.c) && h12.c(this.d, y60Var.d) && h12.c(this.e, y60Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        wy wyVar = this.b;
        int iHashCode2 = (iHashCode + (wyVar == null ? 0 : wyVar.hashCode())) * 31;
        xf1 xf1Var = this.c;
        int iHashCode3 = (iHashCode2 + (xf1Var == null ? 0 : xf1Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public y60(Object obj, wy wyVar, xf1 xf1Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = wyVar;
        this.c = xf1Var;
        this.d = obj2;
        this.e = th;
    }
}
