package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j01 extends hw {
    public final i01 j;

    public j01(TextView r2) {
        this.j = new i01(r2);
    }

    @Override // defpackage.hw
    public final void J(boolean r2) {
        if (tz0.c() == true) goto L5;
        return;
    L5:
        this.j.J(r2);
    }

    @Override // defpackage.hw
    public final void K(boolean r2) {
        boolean r0 = tz0.c();
        i01 r1 = this.j;
        if (r0 == true) goto L6;
        r1.l = r2;
        return;
    L6:
        r1.K(r2);
    }

    @Override // defpackage.hw
    public final TransformationMethod R(TransformationMethod r2) {
        if (tz0.c() == true) goto L6;
        return r2;
    L6:
        return this.j.R(r2);
    }

    @Override // defpackage.hw
    public final InputFilter[] k(InputFilter[] r2) {
        if (tz0.c() == true) goto L6;
        return r2;
    L6:
        return this.j.k(r2);
    }

    @Override // defpackage.hw
    public final boolean r() {
        return this.j.l;
    }
}
