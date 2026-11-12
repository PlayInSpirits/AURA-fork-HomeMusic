package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sf4 implements xn3 {
    public final mf2 a;
    public int b;
    public Bitmap.Config c;

    public sf4(mf2 mf2Var) {
        this.a = mf2Var;
    }

    @Override // defpackage.xn3
    public final void a() {
        this.a.k(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sf4) {
            sf4 sf4Var = (sf4) obj;
            if (this.b == sf4Var.b && e35.n(this.c, sf4Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return tf4.c(this.b, this.c);
    }
}
