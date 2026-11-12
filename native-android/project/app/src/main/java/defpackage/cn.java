package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.AutoCompleteTextView;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.crash.CrashActivity;
import com.eddyizm.tempus.ui.fragment.LibraryFragment;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.internal.CheckableImageButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn implements st, qc2, mn0, g3, ns, gz3, p5, ep3, ne4, np4, zd1, r83, lm2, yr2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ cn(va4 va4Var) {
        this.n = 29;
        Bundle bundle = Bundle.EMPTY;
        this.o = va4Var;
    }

    @Override // defpackage.q33
    public boolean a(MenuItem menuItem) {
        CrashActivity crashActivity = (CrashActivity) this.o;
        int i = CrashActivity.T;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.crash_nav_info) {
            crashActivity.p(new if0(), "Crash Landing");
            return true;
        }
        if (itemId == R.id.crash_nav_logs) {
            crashActivity.p(new jf0(), "Crash Landing");
            return true;
        }
        if (itemId != R.id.crash_nav_export) {
            return false;
        }
        crashActivity.p(new gf0(), "Crash Landing");
        return true;
    }

    public boolean b(om1 om1Var, int i, Bundle bundle) {
        id0 d34Var;
        hg hgVar = (hg) this.o;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((nz1) om1Var.o).b();
                Parcelable parcelable = (Parcelable) ((nz1) om1Var.o).d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        nz1 nz1Var = (nz1) om1Var.o;
        ClipData clipData = new ClipData(nz1Var.getDescription(), new ClipData.Item(nz1Var.a()));
        if (i2 >= 31) {
            d34Var = new d34(clipData, 2);
        } else {
            jd0 jd0Var = new jd0();
            jd0Var.o = clipData;
            jd0Var.p = 2;
            d34Var = jd0Var;
        }
        d34Var.c(nz1Var.c());
        d34Var.setExtras(bundle);
        return j65.j(hgVar, d34Var.build()) == null;
    }

    @Override // defpackage.lm2
    public void c(bm2 bm2Var) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 25:
                oa0 oa0Var = (oa0) obj;
                cb4 cb4Var = bm2Var.e;
                if (bm2Var.D != null) {
                    l93.F("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    bm2Var.f1().Y0();
                } else {
                    pu1 pu1Var = oa0Var.c;
                    yw1 yw1Var = oa0Var.n;
                    Bundle bundle = oa0Var.i;
                    bm2Var.D = pu1Var;
                    bm2Var.r = oa0Var.d;
                    bm2Var.w = oa0Var.e;
                    mi3 mi3Var = oa0Var.f;
                    bm2Var.x = mi3Var;
                    mi3 mi3Var2 = oa0Var.g;
                    bm2Var.y = mi3Var2;
                    mi3 mi3VarY0 = bm2.Y0(mi3Var, mi3Var2);
                    bm2Var.z = mi3VarY0;
                    yw1 yw1Var2 = oa0Var.k;
                    bm2Var.s = yw1Var2;
                    yw1 yw1Var3 = oa0Var.l;
                    bm2Var.t = yw1Var3;
                    gy3 gy3VarU1 = bm2.u1(yw1Var3, yw1Var2, bm2Var.w, mi3VarY0, bundle);
                    bm2Var.u = gy3VarU1;
                    bm2Var.v = bm2.t1(gy3VarU1, bm2Var.s, bundle, bm2Var.w, bm2Var.z);
                    ue1 ue1Var = new ue1(4);
                    for (int i2 = 0; i2 < yw1Var.size(); i2++) {
                        j60 j60Var = (j60) yw1Var.get(i2);
                        va4 va4Var = j60Var.a;
                        if (va4Var != null && va4Var.a == 0) {
                            ue1Var.x(va4Var.b, j60Var);
                        }
                    }
                    ue1Var.d(true);
                    bm2Var.q = oa0Var.j;
                    MediaSession.Token tokenI = oa0Var.m;
                    if (tokenI == null) {
                        tokenI = cb4Var.a.i();
                    }
                    MediaSession.Token token = tokenI;
                    if (token != null) {
                        bm2Var.E = new MediaController(bm2Var.d, token);
                    }
                    try {
                        oa0Var.c.asBinder().linkToDeath(bm2Var.g, 0);
                        bm2Var.n = new cb4(cb4Var.a.a(), oa0Var.a, oa0Var.b, cb4Var.a.g(), oa0Var.c, oa0Var.h, token);
                        bm2Var.I = bundle;
                        bm2Var.f1().X0();
                    } catch (RemoteException unused) {
                        bm2Var.f1().Y0();
                        return;
                    }
                }
                break;
            case 26:
                za4 za4Var = (za4) obj;
                if (bm2Var.Y() && bm2Var.k.isEmpty()) {
                    za4 za4Var2 = bm2Var.q.c;
                    if (za4Var2.c < za4Var.c && ju2.a(za4Var, za4Var2)) {
                        bm2Var.q = bm2Var.q.j(za4Var);
                        break;
                    }
                }
                break;
            case 27:
                PendingIntent pendingIntent = (PendingIntent) obj;
                if (bm2Var.Y() && !Objects.equals(bm2Var.r, pendingIntent)) {
                    bm2Var.r = pendingIntent;
                    sk2 sk2VarF1 = bm2Var.f1();
                    sk2VarF1.getClass();
                    rr2.w(Looper.myLooper() == sk2VarF1.f.getLooper());
                    sk2VarF1.e.getClass();
                    break;
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                if (bm2Var.Y()) {
                    gy3 gy3Var = bm2Var.u;
                    gy3 gy3Var2 = bm2Var.v;
                    bm2Var.I = bundle2;
                    gy3 gy3VarU2 = bm2.u1(bm2Var.t, bm2Var.s, bm2Var.w, bm2Var.z, bundle2);
                    bm2Var.u = gy3VarU2;
                    bm2Var.v = bm2.t1(gy3VarU2, bm2Var.s, bm2Var.I, bm2Var.w, bm2Var.z);
                    boolean zEquals = bm2Var.u.equals(gy3Var);
                    bm2Var.v.equals(gy3Var2);
                    sk2 sk2VarF2 = bm2Var.f1();
                    sk2VarF2.getClass();
                    rr2.w(Looper.myLooper() == sk2VarF2.f.getLooper());
                    qk2 qk2Var = sk2VarF2.e;
                    qk2Var.getClass();
                    if (!zEquals) {
                        qk2Var.u();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zd1
    public void d(String str, Bundle bundle) {
        re2 re2Var = (re2) this.o;
        String string = bundle.getString("color_key");
        if (string != null) {
            re2Var.h0(string);
        }
        zc1 zc1Var = re2Var.l0;
        zc1Var.getClass();
        ((MaterialCardView) zc1Var.f).setCardBackgroundColor(string != null ? Color.parseColor(qm4.z0(string, "HEX:")) : Color.parseColor("#B5076B"));
    }

    @Override // defpackage.ns
    public long e(long j) {
        v71 v71Var = (v71) this.o;
        return f35.k((j * ((long) v71Var.e)) / 1000000, 0L, v71Var.j - 1);
    }

    @Override // defpackage.yr2
    public void f(er2 er2Var, int i) {
        va4 va4Var = (va4) this.o;
        Bundle bundle = Bundle.EMPTY;
        er2Var.l(i, va4Var);
    }

    @Override // defpackage.mn0
    public gy3 g(int i, sv4 sv4Var, int[] iArr) {
        jn0 jn0Var = (jn0) this.o;
        uw1 uw1VarJ = yw1.j();
        for (int i2 = 0; i2 < sv4Var.a; i2++) {
            uw1VarJ.c(new gn0(i, sv4Var, i2, jn0Var, iArr[i2]));
        }
        return uw1VarJ.f();
    }

    @Override // defpackage.ne4
    public long get() {
        return ((v52) this.o).b(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.p5
    public void i(Object obj) {
        Uri data;
        int i = this.n;
        Object obj2 = this.o;
        switch (i) {
            case WaveRetry.MAX_FAILURES /* 16 */:
                HubFragment hubFragment = (HubFragment) obj2;
                o5 o5Var = (o5) obj;
                List list = HubFragment.y0;
                o5Var.getClass();
                ValueCallback valueCallback = hubFragment.r0;
                if (valueCallback != null) {
                    hubFragment.r0 = null;
                    Intent intent = o5Var.o;
                    if (o5Var.n != -1 || intent == null) {
                        valueCallback.onReceiveValue(null);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        ClipData clipData = intent.getClipData();
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i2 = 0; i2 < itemCount; i2++) {
                                Uri uri = clipData.getItemAt(i2).getUri();
                                uri.getClass();
                                arrayList.add(uri);
                            }
                        }
                        if (arrayList.isEmpty() && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        valueCallback.onReceiveValue(arrayList.isEmpty() ? null : (Uri[]) arrayList.toArray(new Uri[0]));
                    }
                    break;
                }
                break;
            default:
                ((Boolean) obj).getClass();
                ((le2) obj2).h0();
                break;
        }
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        Object obj2 = this.o;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                bj0 bj0Var = (bj0) obj2;
                ho2 ho2Var = (ho2) obj;
                ho2Var.y += bj0Var.g;
                ho2Var.z += bj0Var.e;
                break;
            case 4:
                ho2 ho2Var2 = (ho2) obj;
                ho2Var2.getClass();
                ho2Var2.w = ((un2) obj2).a;
                break;
            case 5:
                ((ho2) obj).getClass();
                break;
            case 6:
            case 7:
            case 8:
            default:
                ((oi3) obj).h((qv2) obj2);
                break;
            case 9:
                ((oi3) obj).e((jg0) obj2);
                break;
            case 10:
                ((oi3) obj).F(((d41) obj2).n.S);
                break;
        }
    }

    @Override // defpackage.np4
    public void j() {
        LibraryFragment libraryFragment = (LibraryFragment) this.o;
        le1 le1VarV = libraryFragment.v();
        libraryFragment.o0.d(le1VarV);
        n92 n92Var = libraryFragment.o0;
        n92Var.f.getClass();
        k03 k03VarJ = y41.j(15, true);
        k03 k03Var = n92Var.l;
        Objects.requireNonNull(k03Var);
        k03VarJ.e(le1VarV, new g7(k03Var, 0));
        libraryFragment.o0.e(le1VarV);
        libraryFragment.o0.f(le1VarV);
        libraryFragment.l0.v.setRefreshing(false);
    }

    @Override // defpackage.gz3
    public void k(long j, be3 be3Var) {
        ji2.s(j, be3Var, ((oe1) this.o).J);
    }

    @Override // defpackage.g3
    public void onTouchExplorationStateChanged(boolean z) {
        ix0 ix0Var = (ix0) this.o;
        AutoCompleteTextView autoCompleteTextView = ix0Var.h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = ix0Var.d;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = j65.a;
        checkableImageButton.setImportantForAccessibility(i);
    }

    @Override // defpackage.ep3
    public CharSequence r(Preference preference) {
        return (CharSequence) ((gf1) this.o).invoke();
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        bb5 va5Var;
        View view2 = (View) this.o;
        int i = MainActivity.e0;
        mb5 mb5Var = pb5Var.a;
        vz1 vz1VarH = mb5Var.h(519);
        vz1 vz1VarH2 = mb5Var.h(128);
        int iMax = Math.max(vz1VarH.b, vz1VarH2.b);
        int i2 = vz1VarH.a;
        int i3 = vz1VarH.c;
        view2.setPadding(i2, iMax, i3, 0);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 36) {
            va5Var = new ab5(pb5Var);
        } else if (i4 >= 35) {
            va5Var = new za5(pb5Var);
        } else if (i4 >= 34) {
            va5Var = new ya5(pb5Var);
        } else if (i4 >= 31) {
            va5Var = new xa5(pb5Var);
        } else if (i4 >= 30) {
            va5Var = new wa5(pb5Var);
        } else {
            va5Var = i4 >= 29 ? new va5(pb5Var) : new ua5(pb5Var);
        }
        va5Var.d(519, vz1.b(i2, 0, i3, vz1VarH.d));
        va5Var.d(1, vz1.e);
        va5Var.d(128, vz1.b(vz1VarH2.a, 0, vz1VarH2.c, vz1VarH2.d));
        return va5Var.b();
    }

    public /* synthetic */ cn(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public /* synthetic */ cn(q9 q9Var, bj0 bj0Var) {
        this.n = 3;
        this.o = bj0Var;
    }

    public /* synthetic */ cn(q9 q9Var, ed2 ed2Var, un2 un2Var, IOException iOException, boolean z) {
        this.n = 4;
        this.o = un2Var;
    }

    public /* synthetic */ cn(q9 q9Var, Object obj, long j) {
        this.n = 5;
        this.o = obj;
    }

    public /* synthetic */ cn(int i, PendingIntent pendingIntent) {
        this.n = 27;
        this.o = pendingIntent;
    }
}
