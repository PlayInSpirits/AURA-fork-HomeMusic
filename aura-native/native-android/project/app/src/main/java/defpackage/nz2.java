package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.preference.Preference;
import com.eddyizm.tempus.subsonic.models.Child;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nz2 implements oz2, eg1, ks0, wc0, bp3, p5 {
    public final /* synthetic */ int n;

    public /* synthetic */ nz2(int i) {
        this.n = i;
    }

    public static /* synthetic */ void A(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void c() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void d(int i, int i2, Object obj, String str) {
        throw new IllegalStateException(str + i + obj + i2);
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void j(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void k(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void m(Object obj, StringBuilder sb) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void n(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void r(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void s(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void t(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void w(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void x(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void y(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void z(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    @Override // defpackage.oz2
    public void a(ValueAnimator valueAnimator, View view) {
        switch (this.n) {
            case 0:
                Float f = (Float) valueAnimator.getAnimatedValue();
                view.setScaleX(f.floatValue());
                view.setScaleY(f.floatValue());
                break;
            default:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        ((n44) obj).b.a();
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object obj) {
        return ((Child) obj).getId();
    }

    @Override // defpackage.ks0
    public double b(double d) {
        return d;
    }

    @Override // defpackage.bp3
    public boolean g(Preference preference, Object obj) {
        if (!(obj instanceof Boolean)) {
            return true;
        }
        xa3.t("auto_download_lyrics", ((Boolean) obj).booleanValue());
        return true;
    }

    @Override // defpackage.p5
    public void i(Object obj) {
    }
}
