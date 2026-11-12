package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class us4 extends dx4 {
    @Override // defpackage.dx4
    public final void c(mx4 r2) {
        View r1 = r2.b;
        if ((r1 instanceof TextView) == false) goto L6;
        r2.a.put("android:textscale:scale", Float.valueOf(((TextView) r1).getScaleX()));
        return;
    }

    @Override // defpackage.dx4
    public final void f(mx4 r2) {
        View r1 = r2.b;
        if ((r1 instanceof TextView) == false) goto L6;
        r2.a.put("android:textscale:scale", Float.valueOf(((TextView) r1).getScaleX()));
        return;
    }

    @Override // defpackage.dx4
    public final Animator j(ViewGroup r3, mx4 r4, mx4 r5) {
        if (r4 == null) goto L21;
        if (r5 != null) goto L5;
        return null;
    L5:
        if ((r4.b instanceof TextView) == false) goto L24;
        View r2 = r5.b;
        if ((r2 instanceof TextView) == false) goto L25;
        TextView r6 = (TextView) r2;
        HashMap r7 = r4.a;
        HashMap r8 = r5.a;
        float r1 = 1.0f;
        if (r7.get("android:textscale:scale") == null) goto L12;
        float r9 = ((Float) r7.get("android:textscale:scale")).floatValue();
    L14:
        if (r8.get("android:textscale:scale") == null) goto L17;
        r1 = ((Float) r8.get("android:textscale:scale")).floatValue();
    L17:
        if (r9 == r1) goto L26;
        ValueAnimator r10 = ValueAnimator.ofFloat(new float[]{r9, r1});
        r10.addUpdateListener(new qq(8, r6));
        return r10;
    L26:
        return null;
    L12:
        r9 = 1.0f;
        goto L14
    L25:
        return null;
    L24:
        return null;
    L21:
        return null;
    }
}
