package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i01 extends hw {
    public final TextView j;
    public final c01 k;
    public boolean l;

    public i01(TextView r2) {
        this.j = r2;
        this.l = true;
        this.k = new c01(r2);
    }

    @Override // defpackage.hw
    public final void J(boolean r2) {
        if (r2 == false) goto L5;
        TextView r3 = this.j;
        r3.setTransformationMethod(R(r3.getTransformationMethod()));
        return;
    }

    @Override // defpackage.hw
    public final void K(boolean r2) {
        this.l = r2;
        TextView r3 = this.j;
        r3.setTransformationMethod(R(r3.getTransformationMethod()));
        r3.setFilters(k(r3.getFilters()));
    }

    @Override // defpackage.hw
    public final TransformationMethod R(TransformationMethod r1) {
        if (this.l == false) goto L13;
        if ((r1 instanceof m01) == false) goto L8;
        return r1;
    L8:
        if ((r1 instanceof PasswordTransformationMethod) == false) goto L11;
        return r1;
    L11:
        return new m01(r1);
    L13:
        if ((r1 instanceof m01) == true) goto L15;
        return r1;
    L15:
        return ((m01) r1).n;
    }

    @Override // defpackage.hw
    public final InputFilter[] k(InputFilter[] r7) {
        int r1 = 0;
        if (this.l == true) goto L21;
        SparseArray r6 = new SparseArray(1);
        int r0 = 0;
    L6:
        if (r0 >= r7.length) goto L12;
        InputFilter r2 = r7[r0];
        if ((r2 instanceof c01) == false) goto L10;
        r6.put(r0, r2);
    L10:
        r0 = r0 + 1;
        goto L6
    L12:
        if (r6.size() != 0) goto L14;
        return r7;
    L14:
        int r3 = r7.length;
        InputFilter[] r4 = new InputFilter[r7.length - r6.size()];
        int r5 = 0;
    L15:
        if (r1 >= r3) goto L20;
        if (r6.indexOfKey(r1) >= 0) goto L19;
        r4[r5] = r7[r1];
        r5 = r5 + 1;
    L19:
        r1 = r1 + 1;
        goto L15
    L20:
        return r4;
    L21:
        int r8 = r7.length;
        int r9 = 0;
    L22:
        c01 r10 = this.k;
        if (r9 >= r8) goto L28;
        if (r7[r9] == r10) goto L26;
        r9 = r9 + 1;
        goto L22
    L26:
        return r7;
    L28:
        InputFilter[] r11 = new InputFilter[r7.length + 1];
        System.arraycopy(r7, 0, r11, 0, r8);
        r11[r8] = r10;
        return r11;
    }

    @Override // defpackage.hw
    public final boolean r() {
        return this.l;
    }
}
