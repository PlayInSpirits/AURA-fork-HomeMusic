package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h20 extends h12 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h20(int r1, Object r2) {
        this.e = r1;
        this.f = r2;
    }

    private final void S(int r1) {
    }

    @Override // defpackage.h12
    public final void H(int r1) {
        switch(this.e) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        xr4 r0 = (xr4) this.f;
        r0.e = true;
        wr4 r2 = (wr4) r0.f.get();
        if (r2 == null) goto L9;
        r2.a();
        return;
    L9:
        return;
    }

    @Override // defpackage.h12
    public final void I(Typeface r1, boolean r2) {
        int r3 = this.e;
        Object r0 = this.f;
        switch(r3) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        if (r2 == true) goto L17;
        xr4 r4 = (xr4) r0;
        r4.e = true;
        wr4 r5 = (wr4) r4.f.get();
        if (r5 == null) goto L16;
        r5.a();
        return;
    L16:
        return;
    L17:
        return;
    L10:
        Chip r6 = (Chip) r0;
        k20 r7 = r6.r;
        if (r7.P0 == false) goto L13;
        CharSequence r8 = r7.R;
    L14:
        r6.setText(r8);
        r6.requestLayout();
        r6.invalidate();
        return;
    L13:
        r8 = r6.getText();
        goto L14
    }
}
