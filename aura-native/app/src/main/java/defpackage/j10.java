package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j10 {
    public static final i10 b = new i10();
    public final Object a;

    public /* synthetic */ j10(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j10) {
            return h12.c(this.a, ((j10) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof h10) {
            return ((h10) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
