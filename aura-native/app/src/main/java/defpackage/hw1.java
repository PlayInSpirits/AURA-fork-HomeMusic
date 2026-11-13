package defpackage;

import android.content.res.Resources;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hw1 {
    public final Resources.Theme a;
    public final int b;

    public hw1(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw1)) {
            return false;
        }
        hw1 hw1Var = (hw1) obj;
        return h12.c(this.a, hw1Var.a) && this.b == hw1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ")";
    }
}
