package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ag4 extends rr2 {
    public final /* synthetic */ int c;

    public /* synthetic */ ag4(int r1) {
        this.c = r1;
    }

    @Override // defpackage.bg4
    public final float a(ViewGroup r1, View r2) {
        switch(this.c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getTranslationY() + r1.getHeight();
    L7:
        return r2.getTranslationY() - r1.getHeight();
    }
}
