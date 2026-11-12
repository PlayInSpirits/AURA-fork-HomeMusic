package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hq {
    public jd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ hq(View r1, int r2) {
        this.b = r2;
        this.c = r1;
    }

    public final void a(Drawable r2) {
        int r0 = this.b;
        View r1 = this.c;
        switch(r0) {
            case 0: goto L12;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        ColorStateList r3 = ((sh2) r1).B;
        if (r3 == null) goto L14;
        r2.setTintList(r3);
        return;
    L14:
        return;
    L8:
        iq r4 = (iq) r1;
        if (r4.t == true) goto L15;
        r4.setVisibility(r4.u);
        return;
    L15:
        return;
    L12:
        iq r5 = (iq) r1;
        r5.setIndeterminate(false);
        r5.b(r5.o, r5.p);
    }

    public void b(Drawable r3) {
        switch(this.b) {
            case 2: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        sh2 r2 = (sh2) this.c;
        ColorStateList r0 = r2.B;
        if (r0 == null) goto L9;
        r3.setTint(r0.getColorForState(r2.F, r0.getDefaultColor()));
        return;
    }

    public final void c(Drawable r1) {
    }
}
