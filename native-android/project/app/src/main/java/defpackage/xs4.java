package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xs4 {
    public final String a;
    public String b;
    public boolean c = false;
    public rd3 d = null;

    public xs4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs4)) {
            return false;
        }
        xs4 xs4Var = (xs4) obj;
        return h12.c(this.a, xs4Var.a) && h12.c(this.b, xs4Var.b) && this.c == xs4Var.c && h12.c(this.d, xs4Var.d);
    }

    public final int hashCode() {
        int iC = xa3.c(f34.e(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        rd3 rd3Var = this.d;
        return iC + (rd3Var == null ? 0 : rd3Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
