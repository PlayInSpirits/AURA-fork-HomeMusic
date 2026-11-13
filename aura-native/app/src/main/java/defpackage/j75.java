package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j75 extends m75 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ j75(ViewPager2 viewPager2, int i) {
        this.a = i;
        this.b = viewPager2;
    }

    @Override // defpackage.m75
    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b.e();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.m75
    public final void c(int i) {
        int i2 = this.a;
        ViewPager2 viewPager2 = this.b;
        switch (i2) {
            case 0:
                if (viewPager2.q != i) {
                    viewPager2.q = i;
                    viewPager2.G.H();
                    break;
                }
                break;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.w.requestFocus(2);
                    break;
                }
                break;
        }
    }
}
