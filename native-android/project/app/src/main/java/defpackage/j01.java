package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j01 extends hw {
    public final i01 j;

    public j01(TextView textView) {
        this.j = new i01(textView);
    }

    @Override // defpackage.hw
    public final void J(boolean z) {
        if (tz0.c()) {
            this.j.J(z);
        }
    }

    @Override // defpackage.hw
    public final void K(boolean z) {
        boolean zC = tz0.c();
        i01 i01Var = this.j;
        if (zC) {
            i01Var.K(z);
        } else {
            i01Var.l = z;
        }
    }

    @Override // defpackage.hw
    public final TransformationMethod R(TransformationMethod transformationMethod) {
        return !tz0.c() ? transformationMethod : this.j.R(transformationMethod);
    }

    @Override // defpackage.hw
    public final InputFilter[] k(InputFilter[] inputFilterArr) {
        return !tz0.c() ? inputFilterArr : this.j.k(inputFilterArr);
    }

    @Override // defpackage.hw
    public final boolean r() {
        return this.j.l;
    }
}
