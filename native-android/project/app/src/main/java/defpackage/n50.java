package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n50 {
    public int a;
    public int b;

    public /* synthetic */ n50(int r1, int r2) {
        this.a = r1;
        this.b = r2;
    }

    public int a() {
        int r1 = this.b;
        if (r1 != 2) goto L5;
        return 10;
    L5:
        if (r1 != 5) goto L7;
        return 11;
    L7:
        if (r1 != 29) goto L9;
        return 12;
    L9:
        if (r1 != 42) goto L11;
        return 16;
    L11:
        if (r1 != 22) goto L13;
        return 1073741824;
    L13:
        if (r1 == 23) goto L16;
        return 0;
    L16:
        return 15;
    }

    public void b(cx3 r2) {
        View r3 = r2.a;
        this.a = r3.getLeft();
        this.b = r3.getTop();
        r3.getRight();
        r3.getBottom();
    }
}
