package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lc0 {
    public final Uri a;
    public final boolean b;

    public lc0(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lc0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lc0 lc0Var = (lc0) obj;
        return this.a.equals(lc0Var.a) && this.b == lc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
