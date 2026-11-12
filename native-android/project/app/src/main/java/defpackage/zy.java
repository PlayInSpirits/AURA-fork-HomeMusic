package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zy extends h12 {
    public final Typeface e;
    public final yy f;
    public boolean g;

    public zy(yy yyVar, Typeface typeface) {
        this.e = typeface;
        this.f = yyVar;
    }

    @Override // defpackage.h12
    public final void H(int i) {
        if (this.g) {
            return;
        }
        this.f.j(this.e);
    }

    @Override // defpackage.h12
    public final void I(Typeface typeface, boolean z) {
        if (this.g) {
            return;
        }
        this.f.j(typeface);
    }
}
