package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s02 extends nv1 {
    public final String b;
    public final String c;
    public final String d;

    public s02(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s02.class != obj.getClass()) {
            return false;
        }
        s02 s02Var = (s02) obj;
        return this.c.equals(s02Var.c) && this.b.equals(s02Var.b) && this.d.equals(s02Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f34.e(this.c, f34.e(this.b, 527, 31), 31);
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
