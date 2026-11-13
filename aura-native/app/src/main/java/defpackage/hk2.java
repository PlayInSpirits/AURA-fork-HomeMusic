package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hk2 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public hk2(boolean z, boolean z2, String str) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == hk2.class) {
            hk2 hk2Var = (hk2) obj;
            if (TextUtils.equals(this.a, hk2Var.a) && this.b == hk2Var.b && this.c == hk2Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((f34.e(this.a, 31, 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
