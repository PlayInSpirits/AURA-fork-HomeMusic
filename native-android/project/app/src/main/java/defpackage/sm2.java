package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sm2 {
    public static final String b;
    public final Uri a;

    static {
        String str = f35.a;
        b = Integer.toString(0, 36);
    }

    public sm2(rm2 rm2Var) {
        this.a = (Uri) rm2Var.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm2) && this.a.equals(((sm2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
