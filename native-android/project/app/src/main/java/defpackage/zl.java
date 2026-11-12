package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zl {
    public static final zl d = new yl().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public zl(yl ylVar) {
        this.a = ylVar.a;
        this.b = ylVar.b;
        this.c = ylVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zl.class != obj.getClass()) {
            return false;
        }
        zl zlVar = (zl) obj;
        return this.a == zlVar.a && this.b == zlVar.b && this.c == zlVar.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
