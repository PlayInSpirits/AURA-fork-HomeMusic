package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zf4 extends ji2 {
    public final /* synthetic */ int c;

    public /* synthetic */ zf4(int r1) {
        this.c = r1;
    }

    @Override // defpackage.bg4
    public final float b(ViewGroup r2, View r3) {
        switch(this.c) {
            case 0: goto L17;
            case 1: goto L11;
            case 2: goto L10;
            default: goto L4;
        };
    L4:
        WeakHashMap r1 = j65.a;
        if (r2.getLayoutDirection() != 1) goto L8;
        return r3.getTranslationX() - r2.getWidth();
    L8:
        return r3.getTranslationX() + r2.getWidth();
    L11:
        WeakHashMap r4 = j65.a;
        if (r2.getLayoutDirection() != 1) goto L15;
        return r3.getTranslationX() + r2.getWidth();
    L15:
        return r3.getTranslationX() - r2.getWidth();
    L10:
        return r3.getTranslationX() + r2.getWidth();
    L17:
        return r3.getTranslationX() - r2.getWidth();
    }
}
