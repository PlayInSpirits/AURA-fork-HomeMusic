package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qs3 {
    public final Uri a;
    public final long b;

    public qs3(Uri uri, long j) {
        this.a = uri;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs3)) {
            return false;
        }
        qs3 qs3Var = (qs3) obj;
        return this.a.equals(qs3Var.a) && this.b == qs3Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Head(uri=" + this.a + ", bytes=" + this.b + ")";
    }
}
