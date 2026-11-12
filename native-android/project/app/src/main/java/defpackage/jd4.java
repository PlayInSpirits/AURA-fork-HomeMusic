package defpackage;

import android.content.res.TypedArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd4 extends rp {
    public final /* synthetic */ int b;

    public jd4(int r1) {
        this.b = r1;
        switch(r1) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super(3);
        ((kd4) this.a).p = true;
        return;
    L6:
        super(3);
    }

    @Override // defpackage.rp
    public rp g(TypedArray r5) {
        switch(this.b) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        kd4 r0 = (kd4) this.a;
        super.g(r5);
        if (r5.hasValue(2) == false) goto L10;
        int r1 = r5.getColor(2, r0.e);
        int r2 = r1 & 16777215;
        r0.e = r2 | (r0.e & (-16777216));
    L10:
        if (r5.hasValue(12) == false) goto L12;
        r0.d = r5.getColor(12, r0.d);
    L12:
        return this;
    L5:
        return super.g(r5);
    }

    @Override // defpackage.rp
    public final rp j() {
        int r0 = this.b;
        return this;
    }
}
