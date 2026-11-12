package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zy extends h12 {
    public final Typeface e;
    public final yy f;
    public boolean g;

    public zy(yy r1, Typeface r2) {
        this.e = r2;
        this.f = r1;
    }

    @Override // defpackage.h12
    public final void H(int r1) {
        if (this.g == true) goto L6;
        this.f.j(this.e);
        return;
    }

    @Override // defpackage.h12
    public final void I(Typeface r1, boolean r2) {
        if (this.g == true) goto L6;
        this.f.j(r1);
        return;
    }
}
