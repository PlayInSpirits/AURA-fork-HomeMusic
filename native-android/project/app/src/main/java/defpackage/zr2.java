package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr2 implements wc0, it2, ht2, eg1, kv1, oz2 {
    public final /* synthetic */ int n;

    public /* synthetic */ zr2(String str) {
        this.n = 8;
    }

    public static /* synthetic */ void c(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    @Override // defpackage.oz2
    public void a(ValueAnimator valueAnimator, View view) {
        switch (this.n) {
            case 28:
                view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        al3 al3Var = (al3) obj;
        switch (this.n) {
            case 1:
                al3Var.A0();
                break;
            case 2:
                al3Var.c();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                al3Var.c0();
                break;
            case 4:
                al3Var.C0();
                break;
            case 5:
                al3Var.J0();
                break;
            case 6:
                al3Var.S();
                break;
            case 7:
                al3Var.A();
                break;
            case 8:
            case 12:
            case 13:
            default:
                al3Var.r();
                break;
            case 9:
                al3Var.I0();
                break;
            case 10:
                al3Var.H0();
                break;
            case 11:
                al3Var.G();
                break;
            case 14:
                al3Var.stop();
                break;
            case 15:
                al3Var.a0();
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                al3Var.C();
                break;
            case 17:
                al3Var.b();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object obj) {
        StringBuilder sb;
        char cCharAt;
        boolean z = true;
        switch (this.n) {
            case 21:
                String str = (String) obj;
                n10 n10Var = iu2.g;
                n10Var.getClass();
                for (int length = str.length() - 1; length >= 0; length--) {
                    if (!n10Var.c(str.charAt(length))) {
                        z = false;
                        if (!z && !str.isEmpty()) {
                            return str;
                        }
                        sb = new StringBuilder(str.length() + 16);
                        sb.append('\"');
                        for (int i = 0; i < str.length(); i++) {
                            cCharAt = str.charAt(i);
                            if (cCharAt != '\r' || cCharAt == '\\' || cCharAt == '\"') {
                                sb.append('\\');
                            }
                            sb.append(cCharAt);
                        }
                        sb.append('\"');
                        return sb.toString();
                    }
                }
                if (!z) {
                }
                sb = new StringBuilder(str.length() + 16);
                sb.append('\"');
                while (i < str.length()) {
                    cCharAt = str.charAt(i);
                    if (cCharAt != '\r') {
                        sb.append('\\');
                    } else {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append('\"');
                return sb.toString();
            case 22:
                Collection collection = (Collection) obj;
                int i2 = hx1.q;
                if (collection instanceof hx1) {
                    return (hx1) collection;
                }
                boolean z2 = collection instanceof hx1;
                int size = z2 ? ((gx1) ((my3) ((hx1) collection)).i()).size() : 11;
                fx1 fx1Var = new fx1();
                fx1Var.b = false;
                q73 q73Var = new q73();
                q73Var.d(size);
                fx1Var.a = q73Var;
                if (z2) {
                    hx1 hx1Var = (hx1) collection;
                    q73 q73Var2 = hx1Var instanceof my3 ? ((my3) hx1Var).r : null;
                    if (q73Var2 != null) {
                        q73Var.a(Math.max(q73Var.c, q73Var2.c));
                        i = q73Var2.c == 0 ? -1 : 0;
                        while (i >= 0) {
                            rr2.q(i, q73Var2.c);
                            Object obj2 = q73Var2.a[i];
                            rr2.q(i, q73Var2.c);
                            fx1Var.c(q73Var2.b[i], obj2);
                            i++;
                            if (i >= q73Var2.c) {
                                i = -1;
                            }
                        }
                    } else {
                        jx1 jx1VarJ = hx1Var.j();
                        q73 q73Var3 = fx1Var.a;
                        q73Var3.a(Math.max(q73Var3.c, jx1VarJ.size()));
                        for (p73 p73Var : hx1Var.j()) {
                            fx1Var.c(p73Var.a(), p73Var.a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        fx1Var.a(it.next());
                    }
                }
                Objects.requireNonNull(fx1Var.a);
                if (fx1Var.a.c == 0) {
                    return my3.u;
                }
                fx1Var.b = true;
                return new my3(fx1Var.a);
            case 23:
                return Long.valueOf(((lg0) obj).b);
            case 24:
                return Long.valueOf(((lg0) obj).c);
            case 25:
                return yw1.k(hw.P(new tb4(10), ((no2) obj).n().b));
            default:
                return (pv4) obj;
        }
    }

    @Override // defpackage.ht2
    public void b(al3 al3Var, fr2 fr2Var, List list) {
        switch (this.n) {
            case 12:
                al3Var.w0(list);
                break;
            default:
                al3Var.w0(list);
                break;
        }
    }

    @Override // defpackage.kv1
    public boolean d(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // defpackage.it2
    public Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        switch (this.n) {
            case 8:
                pq pqVar = tn2Var.D;
                tn2Var.B(fr2Var);
                pqVar.getClass();
                mw1 mw1Var = new mw1(m92.b(-6));
                mw1Var.f(new sn2(tn2Var, mw1Var, fr2Var, 0), new rn2(tn2Var, 0));
                return mw1Var;
            default:
                return tn2Var.w(fr2Var);
        }
    }

    public /* synthetic */ zr2(int i) {
        this.n = i;
    }

    public /* synthetic */ zr2(String str, jn2 jn2Var) {
        this.n = 19;
    }
}
