package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t65 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ t65(int r1) {
        this.a = r1;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r3, Outline r4) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        r3.getClass();
        throw new ClassCastException();
    L7:
        if ((r3 instanceof v65) == false) goto L17;
        v65 r5 = (v65) r3;
        Outline r2 = r5.r;
        if (r2 == null) goto L18;
        r4.set(r2);
        float r6 = r5.x;
        if (r6 == 0.0f) goto L13;
    L15:
        r4.offset((int) r6, (int) r5.y);
        return;
    L13:
        if (r5.y != 0.0f) goto L15;
        return;
    L18:
        return;
    }
}
