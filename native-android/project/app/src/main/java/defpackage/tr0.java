package defpackage;

import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tr0 {
    public final DisplayCutout a;

    public tr0(DisplayCutout r1) {
        this.a = r1;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (tr0.class == r3.getClass()) goto L10;
        return false;
    L10:
        return this.a.equals(((tr0) r3).a);
    }

    public final int hashCode() {
        return sr0.D(this.a);
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
