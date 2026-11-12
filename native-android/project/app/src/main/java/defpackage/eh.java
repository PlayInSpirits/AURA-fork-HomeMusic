package defpackage;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eh implements Runnable {
    public final /* synthetic */ int n;
    public final int o;
    public final Object p;
    public final Object q;

    public eh(v14 r2, int r3, Bundle r4) {
        this.n = 2;
        this.q = r2;
        this.o = r3;
        this.p = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = this.o;
        Object r2 = this.q;
        Object r3 = this.p;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((tp4) r3).a((Intent) r2, r1);
        return;
    L6:
        ((v14) r2).a(r1, (Bundle) r3);
        return;
    L8:
        ((BottomSheetBehavior) r2).M((View) r3, r1, false);
        return;
    L10:
        ((TextView) r3).setTypeface((Typeface) r2, r1);
    }

    public /* synthetic */ eh(Object r1, Object r2, int r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.q = r2;
        this.o = r3;
    }

    public eh(BottomSheetBehavior r2, View r3, int r4) {
        this.n = 1;
        this.q = r2;
        this.p = r3;
        this.o = r4;
    }
}
