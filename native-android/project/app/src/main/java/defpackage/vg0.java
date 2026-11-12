package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vg0 extends h11 {
    public final /* synthetic */ int e;

    public /* synthetic */ vg0(g11 r1, int r2) {
        this.e = r2;
        super(r1);
    }

    @Override // defpackage.h11
    public void q() {
        switch(this.e) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        g11 r1 = this.b;
        r1.B = null;
        CheckableImageButton r2 = r1.t;
        r2.setOnLongClickListener(null);
        au0.R(r2, null);
    }
}
