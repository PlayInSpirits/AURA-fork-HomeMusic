package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l9 implements TransformationMethod {
    public Locale n;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence r1, View r2) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return r1.toString().toUpperCase(this.n);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View r1, CharSequence r2, boolean r3, int r4, Rect r5) {
    }
}
