package defpackage;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fz2 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ gz2 a;

    public fz2(gz2 gz2Var) {
        this.a = gz2Var;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        gz2 gz2Var = this.a;
        HashSet hashSet = gz2Var.J0;
        boolean z2 = gz2Var.K0;
        if (z) {
            gz2Var.K0 = hashSet.add(gz2Var.M0[i].toString()) | z2;
        } else {
            gz2Var.K0 = hashSet.remove(gz2Var.M0[i].toString()) | z2;
        }
    }
}
