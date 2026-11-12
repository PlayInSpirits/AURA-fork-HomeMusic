package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class px1 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas r1, Paint r2, int r3, int r4, int r5, int r6, int r7, CharSequence r8, int r9, int r10, boolean r11, Layout r12) {
        if (r12 == null) goto L13;
        if (r2 == null) goto L14;
        int r0 = r12.getLineForOffset(r9);
        if (r0 != (r12.getLineCount() - 1)) goto L15;
        ThreadLocal r13 = ns4.a;
        if (r12.getEllipsisCount(r0) <= 0) goto L16;
        float r14 = vr1.u(r12, r0, r2) + vr1.t(r12, r0, r2);
        if (r14 != 0.0f) goto L11;
        return;
    L11:
        r1.getClass();
        r1.translate(r14, 0.0f);
        return;
    L16:
        return;
    L15:
        return;
    L14:
        return;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean r1) {
        return 0;
    }
}
