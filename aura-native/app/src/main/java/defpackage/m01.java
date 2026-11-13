package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m01 implements TransformationMethod {
    public final TransformationMethod n;

    public m01(TransformationMethod transformationMethod) {
        this.n = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.n;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || tz0.a().b() != 1) {
            return charSequence;
        }
        tz0 a = tz0.a();
        a.getClass();
        return a.f(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.n;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
