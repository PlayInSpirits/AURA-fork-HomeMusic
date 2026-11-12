package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sc2 {
    public final Object a;
    public xk0 b = new xk0(2);
    public boolean c;
    public boolean d;

    public sc2(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sc2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((sc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
