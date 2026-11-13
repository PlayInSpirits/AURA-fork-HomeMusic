package defpackage;

import android.view.DisplayCutout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tr0 {
    public final DisplayCutout a;

    public tr0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tr0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tr0) obj).a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
