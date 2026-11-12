package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jq {
    public int a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public jq(Context r9, AttributeSet r10, int r11, int r12) {
        this.c = new int[0];
        int r1 = r9.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        uc5.c(r9, r10, r11, r12);
        int[] r4 = ht3.d;
        uc5.g(r9, r10, r4, r11, r12, new int[0]);
        TypedArray r13 = r9.obtainStyledAttributes(r10, r4, r11, r12);
        this.a = h12.u(r9, r13, 8, r1);
        this.b = Math.min(h12.u(r9, r13, 7, 0), this.a / 2);
        this.e = r13.getInt(4, 0);
        this.f = r13.getInt(1, 0);
        if (r13.hasValue(2) == true) goto L6;
        this.c = new int[]{g12.s(r9, R.attr.colorPrimary, -1)};
    L11:
        if (r13.hasValue(6) == false) goto L13;
        this.d = r13.getColor(6, -1);
    L14:
        r13.recycle();
        return;
    L13:
        this.d = this.c[0];
        TypedArray r14 = r9.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
        float r15 = r14.getFloat(0, 0.2f);
        r14.recycle();
        int r16 = (int) (r15 * 255.0f);
        this.d = g12.l(this.d, r16);
        goto L14
    L6:
        if (r13.peekValue(2).type == 1) goto L8;
        this.c = new int[]{r13.getColor(2, -1)};
        goto L11
    L8:
        int[] r17 = r9.getResources().getIntArray(r13.getResourceId(2, -1));
        this.c = r17;
        if (r17.length != 0) goto L11;
        kf2.n("indicatorColors cannot be empty when indicatorColor is not used.");
        throw null;
    }

    public abstract void a();
}
