package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f00 {
    public static final n7 c = null;
    public final ig0 a;
    public final int b;

    static {
        c = new n7(3);
    }

    public f00(SpannableStringBuilder r22, Layout.Alignment r23, float r24, int r25, float r26, int r27, boolean r28, int r29, int r30) {
        if (r28 == false) goto L5;
        int r17 = r29;
    L6:
        this.a = new ig0(r22, r23, null, null, r24, 0, r25, r26, r27, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, r28, r17, Integer.MIN_VALUE, 0.0f, 0);
        this.b = r30;
        return;
    L5:
        r17 = -16777216;
        goto L6
    }
}
