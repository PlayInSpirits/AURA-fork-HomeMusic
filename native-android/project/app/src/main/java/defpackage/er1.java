package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import androidx.preference.Preference;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.lan.LanPlaybackActivity;
import com.eddyizm.tempus.ui.login.LoginActivity;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class er1 implements bp3, kv1, r83, gz0, md4, wc0, ik2, qc2, lm2, eg1, yr2 {
    public final /* synthetic */ int n;

    public /* synthetic */ er1(int i) {
        this.n = i;
    }

    public static /* synthetic */ void a() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void h(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalArgumentException((str + obj + '\"').toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void n() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static void p(int i, String str, boolean z, String str2, String str3, boolean z2) {
        String str4;
        String str5;
        k62 k62Var;
        k62 k62Var2;
        rs1 rs1Var = rs1.a;
        int i2 = i == 0 ? -1 : qs1.a[xa3.w(i)];
        if (i2 == 1) {
            str4 = "track";
        } else if (i2 == 2) {
            str4 = "album";
        } else {
            if (i2 != 3) {
                n();
                return;
            }
            str4 = "artist";
        }
        if (i == 1 && ot1.c(str)) {
            b00 b00Var = b00.a;
            String strA = b00.a();
            if (strA == null) {
                return;
            } else {
                str5 = strA;
            }
        } else {
            str5 = null;
        }
        ih3 ih3Var = PlayEvent.Companion;
        str.getClass();
        str2.getClass();
        String strF = rs1.f();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = i == 1 ? rs1.c(str) : str4;
        String str6 = (i != 1 || (k62Var2 = (k62) rs1.o.get(str)) == null) ? null : k62Var2.a;
        String str7 = (i != 1 || (k62Var = (k62) rs1.o.get(str)) == null) ? null : k62Var.b;
        ih3Var.getClass();
        boolean zK0 = xm4.k0(str, "hub:", false);
        rs1.j(new PlayEvent(str2, ih3.a(jCurrentTimeMillis), z ? PlayEvent.LIKE : PlayEvent.UNLIKE, zK0 ? qm4.z0(str, "hub:") : null, (zK0 || !str4.equals("track")) ? null : str, null, null, strC, strF, str4, (zK0 || !str4.equals("album")) ? null : str, (zK0 || !str4.equals("artist")) ? null : str, null, str3, z2, str5, null, null, null, null, null, str6, str7, 2031712, null));
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        switch (this.n) {
            case 14:
                ((ExecutorService) obj).shutdown();
                break;
            case 15:
            default:
                ((aj2) obj).getClass();
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                ((aj2) obj).getClass();
                break;
        }
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object obj) {
        switch (this.n) {
            case 24:
                fm4 fm4Var = (fm4) obj;
                fm4Var.getClass();
                Bundle bundle = new Bundle();
                int i = fm4Var.n;
                if (i != 0) {
                    bundle.putInt(fm4.q, i);
                }
                int i2 = fm4Var.o;
                if (i2 != 0) {
                    bundle.putInt(fm4.r, i2);
                }
                int i3 = fm4Var.p;
                if (i3 != 0) {
                    bundle.putInt(fm4.s, i3);
                }
                return bundle;
            case 25:
                fn2 fn2Var = (fn2) obj;
                fn2Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(fn2.h, fn2Var.a);
                String str = fn2Var.b;
                if (str != null) {
                    bundle2.putString(fn2.i, str);
                }
                String str2 = fn2Var.c;
                if (str2 != null) {
                    bundle2.putString(fn2.j, str2);
                }
                int i4 = fn2Var.d;
                if (i4 != 0) {
                    bundle2.putInt(fn2.k, i4);
                }
                int i5 = fn2Var.e;
                if (i5 != 0) {
                    bundle2.putInt(fn2.l, i5);
                }
                String str3 = fn2Var.f;
                if (str3 != null) {
                    bundle2.putString(fn2.m, str3);
                }
                String str4 = fn2Var.g;
                if (str4 != null) {
                    bundle2.putString(fn2.n, str4);
                }
                return bundle2;
            default:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(fn2.h);
                uri.getClass();
                String string = bundle3.getString(fn2.i);
                String string2 = bundle3.getString(fn2.j);
                int i6 = bundle3.getInt(fn2.k, 0);
                int i7 = bundle3.getInt(fn2.l, 0);
                String string3 = bundle3.getString(fn2.m);
                String string4 = bundle3.getString(fn2.n);
                en2 en2Var = new en2();
                en2Var.a = uri;
                en2Var.b = lw2.m(string);
                en2Var.c = string2;
                en2Var.d = i6;
                en2Var.e = i7;
                en2Var.f = string3;
                en2Var.g = string4;
                return new fn2(en2Var);
        }
    }

    @Override // defpackage.md4
    public boolean b() {
        return false;
    }

    @Override // defpackage.lm2
    public void c(bm2 bm2Var) {
        int i = 18;
        switch (this.n) {
            case 21:
                if (bm2Var.Y()) {
                    sk2 sk2VarF1 = bm2Var.f1();
                    sk2VarF1.getClass();
                    rr2.w(Looper.myLooper() == sk2VarF1.f.getLooper());
                    sk2VarF1.e.getClass();
                    break;
                }
                break;
            case 22:
                bm2Var.i.f(26, new mj0(i));
                break;
            default:
                sk2 sk2VarF2 = bm2Var.f1();
                sk2 sk2VarF3 = bm2Var.f1();
                Objects.requireNonNull(sk2VarF3);
                sk2VarF2.a1(new qa1(i, sk2VarF3));
                break;
        }
    }

    @Override // defpackage.kv1
    public boolean d(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.ik2
    public int e(Object obj) {
        String str = ((dk2) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // defpackage.yr2
    public void f(er2 er2Var, int i) {
        switch (this.n) {
            case 27:
                er2Var.getClass();
                break;
            case 28:
                er2Var.getClass();
                break;
            default:
                er2Var.e(i);
                break;
        }
    }

    @Override // defpackage.bp3
    public boolean g(Preference preference, Object obj) {
        rr1.m();
        hw.i = null;
        return true;
    }

    @Override // defpackage.gz0
    public void i(EditText editText) {
        editText.getClass();
        editText.setSingleLine(true);
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(40)});
        editText.setSelection(editText.getText().length());
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        switch (this.n) {
            case 19:
                ((oi3) obj).v(1);
                break;
            default:
                ((oi3) obj).s(0.0f);
                break;
        }
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        switch (this.n) {
            case 10:
                int i = LanPlaybackActivity.N;
                view.getClass();
                vz1 vz1VarH = pb5Var.a.h(519);
                vz1VarH.getClass();
                view.setPadding(vz1VarH.a, vz1VarH.b, vz1VarH.c, vz1VarH.d);
                break;
            default:
                int i2 = LoginActivity.R;
                view.getClass();
                vz1 vz1VarH2 = pb5Var.a.h(519);
                vz1VarH2.getClass();
                view.setPadding(vz1VarH2.a, vz1VarH2.b, vz1VarH2.c, vz1VarH2.d);
                break;
        }
        return pb5Var;
    }
}
