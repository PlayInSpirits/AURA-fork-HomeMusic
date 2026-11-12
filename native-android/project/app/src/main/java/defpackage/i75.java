package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i75 extends fw3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i75(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.fw3
    public final void a() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((ss0) r1).H();
        return;
    L6:
        ViewPager2 r2 = (ViewPager2) r1;
        r2.r = true;
        r2.y.l = true;
    }

    @Override // defpackage.fw3
    public final void b(int r1, int r2, Object r3) {
        a();
    }

    @Override // defpackage.fw3
    public final void c(int r1, int r2) {
        a();
    }

    @Override // defpackage.fw3
    public final void d(int r1, int r2) {
        a();
    }

    @Override // defpackage.fw3
    public final void e(int r1, int r2) {
        a();
    }
}
