package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m01 implements TransformationMethod {
    public final TransformationMethod n;

    public m01(TransformationMethod r1) {
        this.n = r1;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence r2, View r3) {
        if (r3.isInEditMode() == false) goto L5;
        return r2;
    L5:
        TransformationMethod r1 = this.n;
        if (r1 == null) goto L8;
        r2 = r1.getTransformation(r2, r3);
    L8:
        if (r2 != null) goto L10;
    L14:
        return r2;
    L10:
        if (tz0.a().b() != 1) goto L14;
        tz0 r4 = tz0.a();
        r4.getClass();
        return r4.f(0, r2.length(), 0, r2);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View r1, CharSequence r2, boolean r3, int r4, Rect r5) {
        TransformationMethod r0 = this.n;
        if (r0 == null) goto L6;
        r0.onFocusChanged(r1, r2, r3, r4, r5);
        return;
    }
}
