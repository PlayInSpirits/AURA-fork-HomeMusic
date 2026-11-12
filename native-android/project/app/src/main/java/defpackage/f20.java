package defpackage;

import android.util.Property;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f20 extends Property {
    public static final f20 a = null;

    static {
        a = new f20(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public final Object get(Object r1) {
        Float r0 = (Float) ((ViewGroup) r1).getTag(R.id.mtrl_internal_children_alpha_tag);
        if (r0 == null) goto L6;
        return r0;
    L6:
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object r3, Object r4) {
        ViewGroup r5 = (ViewGroup) r3;
        Float r6 = (Float) r4;
        float r2 = r6.floatValue();
        r5.setTag(R.id.mtrl_internal_children_alpha_tag, r6);
        int r7 = r5.getChildCount();
        int r0 = 0;
    L3:
        if (r0 >= r7) goto L5;
        r5.getChildAt(r0).setAlpha(r2);
        r0 = r0 + 1;
        goto L3
    }
}
