package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j75 extends m75 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ j75(ViewPager2 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.m75
    public void a(int r2) {
        switch(this.a) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        if (r2 != 0) goto L8;
        this.b.e();
        return;
    }

    @Override // defpackage.m75
    public final void c(int r2) {
        int r0 = this.a;
        ViewPager2 r1 = this.b;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        r1.clearFocus();
        if (r1.hasFocus() == false) goto L12;
        r1.w.requestFocus(2);
        return;
    L12:
        return;
    L9:
        if (r1.q == r2) goto L13;
        r1.q = r2;
        r1.G.H();
        return;
    }
}
