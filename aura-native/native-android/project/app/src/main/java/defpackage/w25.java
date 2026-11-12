package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w25 extends nv1 {
    public final String b;
    public final String c;

    public w25(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w25.class != obj.getClass()) {
            return false;
        }
        w25 w25Var = (w25) obj;
        return this.a.equals(w25Var.a) && Objects.equals(this.b, w25Var.b) && this.c.equals(w25Var.c);
    }

    public final int hashCode() {
        int iE = f34.e(this.a, 527, 31);
        String str = this.b;
        return this.c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
