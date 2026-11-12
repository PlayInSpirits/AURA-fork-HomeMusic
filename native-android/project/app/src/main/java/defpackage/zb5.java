package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zb5 {
    public final hu a;
    public final float b;

    public zb5(Rect rect, float f) {
        this.a = new hu(rect);
        this.b = f;
    }

    public final Rect a() {
        hu huVar = this.a;
        huVar.getClass();
        return new Rect(huVar.a, huVar.b, huVar.c, huVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zb5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        zb5 zb5Var = (zb5) obj;
        return h12.c(this.a, zb5Var.a) && this.b == zb5Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public zb5(hu huVar, float f) {
        this.a = huVar;
        this.b = f;
    }
}
