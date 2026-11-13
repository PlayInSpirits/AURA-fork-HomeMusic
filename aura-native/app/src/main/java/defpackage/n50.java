package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class n50 {
    public n50() {
        super();
    }

    public int a;
    public int b;

    public /* synthetic */ n50(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        int i = this.b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(cx3 cx3Var) {
        View view = cx3Var.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
