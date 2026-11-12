package defpackage;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fz2 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ gz2 a;

    public fz2(gz2 r1) {
        this.a = r1;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface r2, int r3, boolean r4) {
        gz2 r1 = this.a;
        HashSet r5 = r1.J0;
        boolean r0 = r1.K0;
        if (r4 == false) goto L6;
        r1.K0 = r5.add(r1.M0[r3].toString()) | r0;
        return;
    L6:
        r1.K0 = r5.remove(r1.M0[r3].toString()) | r0;
    }
}
