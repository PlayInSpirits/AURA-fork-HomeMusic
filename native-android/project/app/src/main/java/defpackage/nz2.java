package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.preference.Preference;
import com.eddyizm.tempus.subsonic.models.Child;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nz2 implements oz2, eg1, ks0, wc0, bp3, p5 {
    public final /* synthetic */ int n;

    public /* synthetic */ nz2(int r1) {
        this.n = r1;
    }

    public static /* synthetic */ void A(Object r2, Object r3, String r4) {
        throw new IllegalArgumentException(r4 + r2 + r3);
    }

    public static /* synthetic */ void c() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void d(int r1, int r2, Object r3, String r4) {
        throw new IllegalStateException(r4 + r1 + r3 + r2);
    }

    public static /* synthetic */ void e(int r1, String r2) {
        throw new IllegalStateException((r2 + r1).toString());
    }

    public static /* synthetic */ void f(Object r1) {
        throw new IllegalStateException(r1.toString());
    }

    public static /* synthetic */ void h(Object r1, Object r2) {
        StringBuilder r0 = new StringBuilder();
        r0.append(r1);
        r0.append(r2);
        throw new IllegalArgumentException(r0.toString().toString());
    }

    public static /* synthetic */ void j(Object r1, Object r2, Object r3, Throwable r4) {
        StringBuilder r0 = new StringBuilder();
        r0.append(r1);
        r0.append(r2);
        r0.append(r3);
        throw new IllegalStateException(r0.toString(), r4);
    }

    public static /* synthetic */ void k(Object r1, Object r2, String r3) {
        throw new IllegalArgumentException((r3 + r1 + r2).toString());
    }

    public static /* synthetic */ void l(Object r1, String r2) {
        throw new IllegalArgumentException((r2 + r1).toString());
    }

    public static /* synthetic */ void m(Object r0, StringBuilder r1) {
        r1.append(r0);
        throw new IllegalStateException(r1.toString());
    }

    public static /* synthetic */ void n(String r1) {
        throw new NullPointerException(r1);
    }

    public static /* synthetic */ void o(String r1, Object r2, Object r3, Object r4) {
        throw new IllegalStateException((r1 + r2 + r3 + r4).toString());
    }

    public static /* synthetic */ void p(String r1, Object r2, Object r3, Object r4, Object r5) {
        throw new IllegalStateException((r1 + r2 + r3 + r4 + r5).toString());
    }

    public static /* synthetic */ void q(String r1, Object r2, Object r3, Object r4, Object r5, Object r6) {
        throw new IllegalArgumentException((r1 + r2 + r3 + r4 + r5 + r6).toString());
    }

    public static /* synthetic */ void r(String r2, Object r3, Throwable r4) {
        throw new RuntimeException(r2 + r3, r4);
    }

    public static /* synthetic */ void s(String r1, Throwable r2) {
        throw new RuntimeException(r1, r2);
    }

    public static /* synthetic */ void t(Object r1, Object r2, String r3) {
        throw new IllegalArgumentException(r3 + r1 + r2);
    }

    public static /* synthetic */ void u(Object r1, String r2) {
        throw new IllegalStateException((r2 + r1).toString());
    }

    public static /* synthetic */ void v(String r1, Object r2, Object r3, Object r4) {
        throw new IllegalArgumentException((r1 + r2 + r3 + r4).toString());
    }

    public static /* synthetic */ void w(Object r2, Object r3, String r4) {
        throw new IllegalStateException(r4 + r2 + r3);
    }

    public static /* synthetic */ void x(Object r1, String r2) {
        throw new IllegalStateException(r2 + r1);
    }

    public static /* synthetic */ void y(String r1, Object r2, Object r3, Object r4) {
        throw new IllegalStateException(r1 + r2 + r3 + r4);
    }

    public static /* synthetic */ void z(Object r1, Object r2, String r3) {
        throw new IllegalStateException((r3 + r1 + r2).toString());
    }

    @Override // defpackage.oz2
    public void a(ValueAnimator r1, View r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r2.setAlpha(((Float) r1.getAnimatedValue()).floatValue());
        return;
    L6:
        Float r0 = (Float) r1.getAnimatedValue();
        r2.setScaleX(r0.floatValue());
        r2.setScaleY(r0.floatValue());
    }

    @Override // defpackage.wc0
    public void accept(Object r1) {
        ((n44) r1).b.a();
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object r1) {
        return ((Child) r1).getId();
    }

    @Override // defpackage.ks0
    public double b(double r1) {
        return r1;
    }

    @Override // defpackage.bp3
    public boolean g(Preference r1, Object r2) {
        if ((r2 instanceof Boolean) == false) goto L7;
        xa3.t("auto_download_lyrics", ((Boolean) r2).booleanValue());
        return true;
    L7:
        return true;
    }

    @Override // defpackage.p5
    public void i(Object r1) {
        o5 r2 = (o5) r1;
    }
}
