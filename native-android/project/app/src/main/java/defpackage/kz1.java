package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends InputConnectionWrapper {
    public final /* synthetic */ cn a;

    public kz1(InputConnection r1, cn r2) {
        this.a = r2;
        super(r1, false);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo r4, int r5, Bundle r6) {
        om1 r0 = null;
        if (r4 == null) goto L10;
        if (Build.VERSION.SDK_INT < 25) goto L10;
        int r2 = 2;
        r0 = new om1(r2, new mz1(r4));
    L10:
        if (this.a.b(r0, r5, r6) == false) goto L14;
        return true;
    L14:
        return super.commitContent(r4, r5, r6);
    }
}
