package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tc4 extends cx3 {
    public final x12 u;
    public final /* synthetic */ uc4 v;

    public tc4(uc4 r4, x12 r5) {
        this.v = r4;
        ConstraintLayout r6 = r5.a;
        super(r6);
        this.u = r5;
        final int r1 = 1;
        r5.e.setSelected(true);
        r5.c.setSelected(true);
        final int r2 = 0;
        r6.setOnClickListener(new sc4(this, r2));
        r6.setOnLongClickListener(new q6(21, this));
        r5.d.setOnClickListener(new sc4(this, r1));
    }

    public final void s() {
        Bundle r0 = new Bundle();
        uc4 r1 = this.v;
        r0.putParcelable("share_object", (Parcelable) r1.s.get(c()));
        r1.r.onShareLongClick(r0);
    }
}
