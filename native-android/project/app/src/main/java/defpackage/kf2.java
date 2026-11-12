package defpackage;

import android.os.SystemClock;
import com.google.gson.JsonIOException;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf2 implements qc2, eg1, px, ez, ks0 {
    public static final kf2 o = new kf2(0);
    public static final kf2 p = new kf2(1);
    public final /* synthetic */ int n;

    public /* synthetic */ kf2(int i) {
        this.n = i;
    }

    public static /* synthetic */ void c() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void g(Object obj, StringBuilder sb) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(String str, int i, int i2) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void k() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void o(String str) {
        throw new IllegalStateException(str);
    }

    public List a(boolean z, boolean z2, String str) {
        return jk2.e(z, z2, str);
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object obj) {
        switch (this.n) {
            case 14:
                k51 k51Var = (k51) obj;
                k51Var.getClass();
                return k51Var.getClass().getSimpleName();
            case 26:
                return Integer.valueOf(((ig0) obj).r);
            default:
                long j = ((lg0) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    @Override // defpackage.ks0
    public double b(double d) {
        switch (this.n) {
            case 19:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 20:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 21:
                float[] fArr = s50.a;
                return s50.b(s50.c, d);
            case 22:
                float[] fArr2 = s50.a;
                return s50.a(s50.c, d);
            case 23:
                float[] fArr3 = s50.a;
                return s50.d(s50.d, d);
            default:
                float[] fArr4 = s50.a;
                return s50.c(s50.d, d);
        }
    }

    @Override // defpackage.ez
    public void cancel() {
    }

    @Override // defpackage.px
    public String d(ii0 ii0Var) {
        String str = ii0Var.h;
        return str != null ? str : ii0Var.a.toString();
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        long jY;
        rm rmVar;
        switch (this.n) {
            case 5:
                pj0 pj0Var = (pj0) obj;
                tj0 tj0Var = pj0Var.b;
                if (pj0Var == tj0Var.j && tj0Var.n != null) {
                    qj0 qj0Var = tj0Var.p;
                    int i = qj0Var.b;
                    if (i != -1) {
                        long j = ((em) qj0Var.e).f / i;
                        an anVar = tj0Var.t;
                        anVar.getClass();
                        jY = f35.Y(anVar.a.getSampleRate(), j);
                    } else {
                        jY = -9223372036854775807L;
                    }
                    tj0Var.n.q(((em) tj0Var.p.e).f, f35.i0(jY), SystemClock.elapsedRealtime() - tj0Var.W);
                }
                break;
            case 6:
                pj0 pj0Var2 = (pj0) obj;
                pj0Var2.getClass();
                tj0.c0.getAndDecrement();
                rm rmVar2 = pj0Var2.b.n;
                if (rmVar2 != null) {
                    int i2 = pj0Var2.a.a;
                    rmVar2.f(new pa(15));
                }
                break;
            case 7:
                pj0 pj0Var3 = (pj0) obj;
                tj0 tj0Var2 = pj0Var3.b;
                if (pj0Var3 == tj0Var2.j && (rmVar = tj0Var2.n) != null && tj0Var2.O) {
                    rmVar.x();
                }
                break;
            case 8:
                pj0 pj0Var4 = (pj0) obj;
                tj0 tj0Var3 = pj0Var4.b;
                if (pj0Var4 == tj0Var3.j) {
                    tj0Var3.N = true;
                    break;
                }
                break;
            default:
                rm rmVar3 = ((oj0) obj).a.n;
                if (rmVar3 != null) {
                    rmVar3.s();
                }
                break;
        }
    }
}
