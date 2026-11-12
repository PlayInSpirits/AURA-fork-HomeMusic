package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l60 extends nv1 {
    public final String b;
    public final String c;
    public final String d;

    public l60(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l60.class != obj.getClass()) {
            return false;
        }
        l60 l60Var = (l60) obj;
        return this.c.equals(l60Var.c) && this.b.equals(l60Var.b) && Objects.equals(this.d, l60Var.d);
    }

    public final int hashCode() {
        int iE = f34.e(this.c, f34.e(this.b, 527, 31), 31);
        String str = this.d;
        return iE + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
