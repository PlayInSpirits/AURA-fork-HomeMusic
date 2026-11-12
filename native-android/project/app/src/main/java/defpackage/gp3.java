package defpackage;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import javax.net.ssl.SSLSocketFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gp3 implements Callback, kg1, ez, lm3, rh0, r83, b93 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;

    public gp3(pn4 pn4Var, int i) {
        String str;
        gr1 gr1Var;
        gr1 gr1VarB;
        dz4 dz4VarA;
        dz4 dz4VarA2;
        gr1 gr1VarB2;
        dz4 dz4VarA3;
        dz4 dz4VarA4;
        gr1 gr1VarB3;
        dz4 dz4VarA5;
        dz4 dz4VarA6;
        this.n = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        String str2 = "https://localhost/rest/";
        switch (i) {
            case 13:
                this.o = pn4Var;
                ok1 ok1Var = new ok1();
                ok1Var.a(Date.class, new r01());
                ok1Var.a(Bookmarks.class, new lt());
                ok1Var.j = true;
                ArrayList arrayList = ok1Var.e;
                int size = arrayList.size();
                ArrayList arrayList2 = ok1Var.f;
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
                arrayList3.addAll(arrayList);
                Collections.reverse(arrayList3);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                Collections.reverse(arrayList4);
                arrayList3.addAll(arrayList4);
                int i2 = ok1Var.g;
                int i3 = ok1Var.h;
                ak0 ak0Var = bk0.b;
                boolean z = gk4.a;
                if (i2 != 2 && i3 != 2) {
                    dz4 dz4VarA7 = ak0Var.a(i2, i3);
                    if (z) {
                        dz4VarA2 = gk4.c.a(i2, i3);
                        dz4VarA = gk4.b.a(i2, i3);
                    } else {
                        dz4VarA = null;
                        dz4VarA2 = null;
                    }
                    arrayList3.add(dz4VarA7);
                    if (z) {
                        arrayList3.add(dz4VarA2);
                        arrayList3.add(dz4VarA);
                    }
                }
                u21 u21Var = ok1Var.a;
                int i4 = ok1Var.c;
                HashMap map = new HashMap(ok1Var.d);
                boolean z2 = ok1Var.i;
                boolean z3 = ok1Var.j;
                boolean z4 = ok1Var.k;
                int i5 = ok1Var.b;
                new ArrayList(arrayList);
                new ArrayList(arrayList2);
                nk1 nk1Var = new nk1(u21Var, i4, map, z2, z3, z4, i5, arrayList3, ok1Var.l, ok1Var.m, new ArrayList(ok1Var.n));
                Retrofit.Builder builder = new Retrofit.Builder();
                String strJ = pn4Var.j();
                String string = strJ != null ? qm4.K0(strJ).toString() : null;
                str = string != null ? string : "";
                try {
                    fr1 fr1Var = new fr1();
                    gr1Var = null;
                    try {
                        fr1Var.e(null, str);
                        gr1VarB = fr1Var.b();
                    } catch (IllegalArgumentException unused) {
                        gr1VarB = gr1Var;
                    }
                } catch (IllegalArgumentException unused2) {
                    gr1Var = null;
                }
                if (gr1VarB != null && gr1VarB.d.length() > 0) {
                    str2 = str;
                }
                Retrofit.Builder builderAddConverterFactory = builder.baseUrl(str2).addConverterFactory(GsonConverterFactory.create(nk1Var));
                cx cxVar = new cx();
                rx rxVar = new rx(cxVar);
                cxVar.a = 2592000;
                n83 n83Var = new n83();
                n83Var.a(2L, timeUnit2);
                n83Var.b(20L, timeUnit);
                n83Var.z = ze5.b(30L, timeUnit);
                n83Var.A = ze5.b(30L, timeUnit);
                dr1 dr1Var = new dr1();
                dr1Var.b = cr1.n;
                n83Var.c.add(dr1Var);
                n83Var.c.add(rxVar);
                File cacheDir = App.a().getCacheDir();
                cacheDir.getClass();
                n83Var.l = new hx(cacheDir);
                SSLSocketFactory sSLSocketFactory = x30.b;
                if (sSLSocketFactory != null) {
                    n83Var.c(sSLSocketFactory, x30.a);
                }
                Retrofit retrofitBuild = builderAddConverterFactory.client(new o83(n83Var)).build();
                retrofitBuild.getClass();
                this.p = (zi2) retrofitBuild.create(zi2.class);
                break;
            case 21:
                this.o = pn4Var;
                ok1 ok1Var2 = new ok1();
                ok1Var2.a(Date.class, new r01());
                ok1Var2.a(Bookmarks.class, new lt());
                ok1Var2.j = true;
                ArrayList arrayList5 = ok1Var2.e;
                int size2 = arrayList5.size();
                ArrayList arrayList6 = ok1Var2.f;
                ArrayList arrayList7 = new ArrayList(arrayList6.size() + size2 + 3);
                arrayList7.addAll(arrayList5);
                Collections.reverse(arrayList7);
                ArrayList arrayList8 = new ArrayList(arrayList6);
                Collections.reverse(arrayList8);
                arrayList7.addAll(arrayList8);
                int i6 = ok1Var2.g;
                int i7 = ok1Var2.h;
                ak0 ak0Var2 = bk0.b;
                boolean z5 = gk4.a;
                if (i6 != 2 && i7 != 2) {
                    dz4 dz4VarA8 = ak0Var2.a(i6, i7);
                    if (z5) {
                        dz4VarA4 = gk4.c.a(i6, i7);
                        dz4VarA3 = gk4.b.a(i6, i7);
                    } else {
                        dz4VarA3 = null;
                        dz4VarA4 = null;
                    }
                    arrayList7.add(dz4VarA8);
                    if (z5) {
                        arrayList7.add(dz4VarA4);
                        arrayList7.add(dz4VarA3);
                    }
                }
                u21 u21Var2 = ok1Var2.a;
                int i8 = ok1Var2.c;
                HashMap map2 = new HashMap(ok1Var2.d);
                boolean z6 = ok1Var2.i;
                boolean z7 = ok1Var2.j;
                boolean z8 = ok1Var2.k;
                int i9 = ok1Var2.b;
                new ArrayList(arrayList5);
                new ArrayList(arrayList6);
                nk1 nk1Var2 = new nk1(u21Var2, i8, map2, z6, z7, z8, i9, arrayList7, ok1Var2.l, ok1Var2.m, new ArrayList(ok1Var2.n));
                Retrofit.Builder builder2 = new Retrofit.Builder();
                String strJ2 = pn4Var.j();
                String string2 = strJ2 != null ? qm4.K0(strJ2).toString() : null;
                str = string2 != null ? string2 : "";
                try {
                    fr1 fr1Var2 = new fr1();
                    fr1Var2.e(null, str);
                    gr1VarB2 = fr1Var2.b();
                } catch (IllegalArgumentException unused3) {
                    gr1VarB2 = null;
                }
                if (gr1VarB2 != null && gr1VarB2.d.length() > 0) {
                    str2 = str;
                }
                Retrofit.Builder builderAddConverterFactory2 = builder2.baseUrl(str2).addConverterFactory(GsonConverterFactory.create(nk1Var2));
                cx cxVar2 = new cx();
                rx rxVar2 = new rx(cxVar2);
                cxVar2.a = 2592000;
                n83 n83Var2 = new n83();
                n83Var2.a(2L, timeUnit2);
                n83Var2.b(20L, timeUnit);
                n83Var2.z = ze5.b(30L, timeUnit);
                n83Var2.A = ze5.b(30L, timeUnit);
                dr1 dr1Var2 = new dr1();
                dr1Var2.b = cr1.n;
                n83Var2.c.add(dr1Var2);
                n83Var2.c.add(rxVar2);
                File cacheDir2 = App.a().getCacheDir();
                cacheDir2.getClass();
                n83Var2.l = new hx(cacheDir2);
                SSLSocketFactory sSLSocketFactory2 = x30.b;
                if (sSLSocketFactory2 != null) {
                    n83Var2.c(sSLSocketFactory2, x30.a);
                }
                Retrofit retrofitBuild2 = builderAddConverterFactory2.client(new o83(n83Var2)).build();
                retrofitBuild2.getClass();
                this.p = (gq4) retrofitBuild2.create(gq4.class);
                break;
            default:
                this.o = pn4Var;
                ok1 ok1Var3 = new ok1();
                ok1Var3.a(Date.class, new r01());
                ok1Var3.a(Bookmarks.class, new lt());
                ok1Var3.j = true;
                ArrayList arrayList9 = ok1Var3.e;
                int size3 = arrayList9.size();
                ArrayList arrayList10 = ok1Var3.f;
                ArrayList arrayList11 = new ArrayList(arrayList10.size() + size3 + 3);
                arrayList11.addAll(arrayList9);
                Collections.reverse(arrayList11);
                ArrayList arrayList12 = new ArrayList(arrayList10);
                Collections.reverse(arrayList12);
                arrayList11.addAll(arrayList12);
                int i10 = ok1Var3.g;
                int i11 = ok1Var3.h;
                ak0 ak0Var3 = bk0.b;
                boolean z9 = gk4.a;
                if (i10 != 2 && i11 != 2) {
                    dz4 dz4VarA9 = ak0Var3.a(i10, i11);
                    if (z9) {
                        dz4VarA6 = gk4.c.a(i10, i11);
                        dz4VarA5 = gk4.b.a(i10, i11);
                    } else {
                        dz4VarA5 = null;
                        dz4VarA6 = null;
                    }
                    arrayList11.add(dz4VarA9);
                    if (z9) {
                        arrayList11.add(dz4VarA6);
                        arrayList11.add(dz4VarA5);
                    }
                }
                u21 u21Var3 = ok1Var3.a;
                int i12 = ok1Var3.c;
                HashMap map3 = new HashMap(ok1Var3.d);
                boolean z10 = ok1Var3.i;
                boolean z11 = ok1Var3.j;
                boolean z12 = ok1Var3.k;
                int i13 = ok1Var3.b;
                new ArrayList(arrayList9);
                new ArrayList(arrayList10);
                nk1 nk1Var3 = new nk1(u21Var3, i12, map3, z10, z11, z12, i13, arrayList11, ok1Var3.l, ok1Var3.m, new ArrayList(ok1Var3.n));
                Retrofit.Builder builder3 = new Retrofit.Builder();
                String strJ3 = pn4Var.j();
                String string3 = strJ3 != null ? qm4.K0(strJ3).toString() : null;
                str = string3 != null ? string3 : "";
                try {
                    fr1 fr1Var3 = new fr1();
                    fr1Var3.e(null, str);
                    gr1VarB3 = fr1Var3.b();
                } catch (IllegalArgumentException unused4) {
                    gr1VarB3 = null;
                }
                if (gr1VarB3 != null && gr1VarB3.d.length() > 0) {
                    str2 = str;
                }
                Retrofit.Builder builderAddConverterFactory3 = builder3.baseUrl(str2).addConverterFactory(GsonConverterFactory.create(nk1Var3));
                cx cxVar3 = new cx();
                rx rxVar3 = new rx(cxVar3);
                cxVar3.a = 2592000;
                n83 n83Var3 = new n83();
                n83Var3.a(2L, timeUnit2);
                n83Var3.b(20L, timeUnit);
                n83Var3.z = ze5.b(30L, timeUnit);
                n83Var3.A = ze5.b(30L, timeUnit);
                dr1 dr1Var3 = new dr1();
                dr1Var3.b = cr1.n;
                n83Var3.c.add(dr1Var3);
                n83Var3.c.add(rxVar3);
                File cacheDir3 = App.a().getCacheDir();
                cacheDir3.getClass();
                n83Var3.l = new hx(cacheDir3);
                SSLSocketFactory sSLSocketFactory3 = x30.b;
                if (sSLSocketFactory3 != null) {
                    n83Var3.c(sSLSocketFactory3, x30.a);
                }
                Retrofit retrofitBuild3 = builderAddConverterFactory3.client(new o83(n83Var3)).build();
                retrofitBuild3.getClass();
                this.p = (ov) retrofitBuild3.create(ov.class);
                break;
        }
    }

    @Override // defpackage.b93
    public void a(jw jwVar) {
        ((Map) ((xc5) this.p).p).remove((cr4) this.o);
    }

    @Override // defpackage.rh0
    public void b(Exception exc) {
        fj4 fj4Var = (fj4) this.p;
        tw2 tw2Var = (tw2) this.o;
        tw2 tw2Var2 = fj4Var.s;
        if (tw2Var2 == null || tw2Var2 != tw2Var) {
            return;
        }
        fj4 fj4Var2 = (fj4) this.p;
        tw2 tw2Var3 = (tw2) this.o;
        xi0 xi0Var = fj4Var2.o;
        qh0 qh0Var = fj4Var2.t;
        sh0 sh0Var = tw2Var3.c;
        xi0Var.b(qh0Var, exc, sh0Var, sh0Var.e());
    }

    public boolean c(long j) {
        Object obj;
        List list = (List) ((rf2) this.p).n;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (vr1.n(((qn3) obj).a, j)) {
                break;
            }
            i++;
        }
        qn3 qn3Var = (qn3) obj;
        if (qn3Var != null) {
            return qn3Var.h;
        }
        return false;
    }

    @Override // defpackage.ez
    public void cancel() {
        if (((fl) this.p).compareAndSet(1, 1)) {
            return;
        }
        ((jo) this.o).invoke();
    }

    public void d() {
        this.o = null;
        this.p = null;
    }

    public Call e(String str) {
        Log.d("BrowsingClient", "getAlbum()");
        return ((ov) this.p).f(((pn4) this.o).f(), str);
    }

    @Override // defpackage.rh0
    public void f(Object obj) {
        fj4 fj4Var = (fj4) this.p;
        tw2 tw2Var = (tw2) this.o;
        tw2 tw2Var2 = fj4Var.s;
        if (tw2Var2 == null || tw2Var2 != tw2Var) {
            return;
        }
        fj4 fj4Var2 = (fj4) this.p;
        tw2 tw2Var3 = (tw2) this.o;
        xq0 xq0Var = fj4Var2.n.p;
        if (obj == null || !xq0Var.a(tw2Var3.c.e())) {
            xi0 xi0Var = fj4Var2.o;
            f42 f42Var = tw2Var3.a;
            sh0 sh0Var = tw2Var3.c;
            xi0Var.a(f42Var, obj, sh0Var, sh0Var.e(), fj4Var2.t);
            return;
        }
        fj4Var2.r = obj;
        xi0 xi0Var2 = fj4Var2.o;
        xi0Var2.R = 2;
        m11 m11Var = xi0Var2.C;
        (m11Var.z ? m11Var.v : m11Var.u).execute(xi0Var2);
    }

    @Override // defpackage.lm3
    public void g() {
        gm3 gm3Var = (gm3) this.p;
        im3.c(gm3Var.f, gm3Var.e, true);
        gm3Var.b.g();
    }

    @Override // defpackage.kg1
    public void h(Object obj) {
        gr2 gr2Var = (gr2) obj;
        jn2 jn2Var = (jn2) this.p;
        lb4 lb4Var = (lb4) this.o;
        yw1 yw1Var = gr2Var.a;
        if (yw1Var.isEmpty()) {
            lb4Var.l(new m92(-2, SystemClock.elapsedRealtime(), jn2Var, new xa4("no error message provided", -2, Bundle.EMPTY), null, 4));
        } else {
            lb4Var.l(m92.c(yw1.o((gn2) yw1Var.get(Math.max(0, Math.min(gr2Var.b, yw1Var.size() - 1)))), jn2Var));
        }
    }

    public Call i(String str) {
        Log.d("BrowsingClient", "getArtist()");
        return ((ov) this.p).e(((pn4) this.o).f(), str);
    }

    public Call j() {
        Log.d("BrowsingClient", "getArtists()");
        return ((ov) this.p).k(((pn4) this.o).f(), ud3.k());
    }

    public KeyListener k(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((xc5) ((zg5) this.p).n).getClass();
        if (keyListener instanceof d01) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new d01(keyListener);
    }

    public Long l(String str) {
        w24 w24VarB = w24.b(1, "SELECT long_value FROM Preference where `key`=?");
        w24VarB.h(1, str);
        s24 s24Var = (s24) this.o;
        s24Var.b();
        Cursor cursorH = xl.H(s24Var, w24VarB);
        try {
            Long lValueOf = null;
            if (cursorH.moveToFirst() && !cursorH.isNull(0)) {
                lValueOf = Long.valueOf(cursorH.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorH.close();
            w24VarB.j();
        }
    }

    public Call m(String str) {
        Log.d("BrowsingClient", "getSong()");
        return ((ov) this.p).c(((pn4) this.o).f(), str);
    }

    public void n(fp3 fp3Var) {
        s24 s24Var = (s24) this.o;
        s24Var.b();
        s24Var.c();
        try {
            ((vo0) this.p).m(fp3Var);
            s24Var.t();
        } finally {
            s24Var.o();
        }
    }

    @Override // defpackage.kg1
    public void o(Throwable th) {
        ((lb4) this.o).l(new m92(-1, SystemClock.elapsedRealtime(), (jn2) this.p, new xa4("no error message provided", -1, Bundle.EMPTY), null, 4));
        l93.G("MediaSessionImpl", "Failed fetching recent media item at boot time: " + th.getMessage(), th);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((Consumer) this.o).accept(kb4.d((String) this.p, Collections.EMPTY_LIST));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        ArrayList arrayList = new ArrayList();
        if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbum() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbum().getSongs() != null) {
            arrayList.addAll(((ApiResponse) response.body()).getSubsonicResponse().getAlbum().getSongs());
        }
        ((Consumer) this.o).accept(kb4.d((String) this.p, arrayList));
    }

    @Override // defpackage.lm3
    public void onSuccess() {
        gm3 gm3Var = (gm3) this.p;
        im3 im3Var = gm3Var.f;
        im3Var.f = null;
        if (im3Var.e(gm3Var.e)) {
            im3Var.i = im3Var.h;
            im3Var.j.k((ArrayList) this.o);
        }
    }

    public void p(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.o).getContext().obtainStyledAttributes(attributeSet, st3.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            v(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public AutofillId q(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionD = kz.d(this.o);
        hg3 hg3VarL = bu.l((View) this.p);
        Objects.requireNonNull(hg3VarL);
        return yh.d(contentCaptureSessionD, tn.f(hg3VarL.o), j);
    }

    public a01 r(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        zg5 zg5Var = (zg5) this.p;
        if (inputConnection == null) {
            zg5Var.getClass();
            inputConnection2 = null;
        } else {
            xc5 xc5Var = (xc5) zg5Var.n;
            xc5Var.getClass();
            if (!(inputConnection instanceof a01)) {
                inputConnection = new a01(editorInfo, inputConnection, (EditText) xc5Var.o);
            }
            inputConnection2 = inputConnection;
        }
        return (a01) inputConnection2;
    }

    public void s(Bundle bundle) {
        xm2 xm2Var = (xm2) this.o;
        j54 j54Var = (j54) xm2Var.d;
        if (!xm2Var.a) {
            xm2Var.a();
        }
        if (j54Var.h().h.compareTo(r92.q) >= 0) {
            nz2.u(j54Var.h().h, "performRestore cannot be called when owner is ");
            return;
        }
        if (xm2Var.b) {
            kf2.o("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleW = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleW = jz4.w("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        xm2Var.h = bundleW;
        xm2Var.b = true;
    }

    public void t(Bundle bundle) {
        xm2 xm2Var = (xm2) this.o;
        Bundle bundleG = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
        Bundle bundle2 = (Bundle) xm2Var.h;
        if (bundle2 != null) {
            bundleG.putAll(bundle2);
        }
        synchronized (((xi4) xm2Var.f)) {
            for (Map.Entry entry : ((LinkedHashMap) xm2Var.g).entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((i54) entry.getValue()).a();
                str.getClass();
                bundleG.putBundle(str, bundleA);
            }
        }
        if (bundleG.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleG);
    }

    public String toString() {
        switch (this.n) {
            case 18:
                String string = "[ ";
                if (((ai4) this.o) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbI = xa3.i(string);
                        sbI.append(((ai4) this.o).u[i]);
                        sbI.append(" ");
                        string = sbI.toString();
                    }
                }
                StringBuilder sbS = b11.s(string, "] ");
                sbS.append((ai4) this.o);
                return sbS.toString();
            default:
                return super.toString();
        }
    }

    public Call u() {
        Log.d("SystemClient", "ping()");
        int iX = ud3.x();
        gq4 gq4Var = (gq4) this.p;
        pn4 pn4Var = (pn4) this.o;
        Call<ApiResponse> callB = gq4Var.b(pn4Var.f());
        String strJ = pn4Var.j();
        String strV = ud3.v();
        AtomicInteger atomicInteger = ra0.a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (strJ != null && strV != null && strV.length() != 0) {
            String strL0 = qm4.L0(strV, '/');
            if (strL0.length() != 0 && xm4.k0(strJ, strL0, false) && (strJ.length() == strL0.length() || strJ.charAt(strL0.length()) == '/')) {
                callB.timeout().g(iX, timeUnit);
                return callB;
            }
        }
        callB.timeout().g(Math.min(iX * 2, 10), timeUnit);
        return callB;
    }

    public void v(boolean z) {
        l01 l01Var = (l01) ((xc5) ((zg5) this.p).n).p;
        if (l01Var.p != z) {
            if (l01Var.o != null) {
                tz0 tz0VarA = tz0.a();
                k01 k01Var = l01Var.o;
                tz0VarA.getClass();
                l93.m(k01Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = tz0VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    tz0VarA.b.remove(k01Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            l01Var.p = z;
            if (z) {
                l01.a(l01Var.n, tz0.a().b());
            }
        }
    }

    public Call w(int i, String str) {
        Log.d("MediaAnnotationClient", "setRating()");
        return ((zi2) this.p).a(((pn4) this.o).f(), str, i);
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        b85 b85Var = (b85) this.o;
        c85 c85Var = (c85) this.p;
        c85 c85Var2 = new c85();
        c85Var2.a = c85Var.a;
        c85Var2.b = c85Var.b;
        c85Var2.c = c85Var.c;
        c85Var2.d = c85Var.d;
        return b85Var.m(view, pb5Var, c85Var2);
    }

    public el y() throws IOException {
        File file = (File) this.p;
        File file2 = (File) this.o;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                l93.q0("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new el(file2);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e);
            }
            try {
                return new el(file2);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file2, e2);
            }
        }
    }

    public /* synthetic */ gp3(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    public /* synthetic */ gp3(int i, boolean z) {
        this.n = i;
    }

    public /* synthetic */ gp3(Object obj, Object obj2, boolean z, int i) {
        this.n = i;
        this.p = obj;
        this.o = obj2;
    }

    public /* synthetic */ gp3(int i, Object obj) {
        this.n = i;
        this.p = obj;
    }

    public gp3(xm2 xm2Var) {
        this.n = 19;
        this.o = xm2Var;
        rm3 rm3Var = new rm3();
        rm3Var.n = xm2Var;
        this.p = rm3Var;
    }

    public gp3(WorkDatabase workDatabase) {
        this.n = 0;
        this.o = workDatabase;
        this.p = new vo0(workDatabase);
    }

    public gp3(jo joVar) {
        this.n = 16;
        this.o = joVar;
        this.p = new fl(0);
    }

    public gp3(EditText editText) {
        this.n = 2;
        this.o = editText;
        zg5 zg5Var = new zg5();
        zg5Var.n = new xc5(editText);
        this.p = zg5Var;
    }

    public gp3(File file) {
        this.n = 3;
        this.o = file;
        this.p = new File(file.getPath() + ".bak");
    }

    public gp3(int i) {
        this.n = i;
        switch (i) {
            case 12:
                this.o = new HashMap();
                this.p = new HashMap();
                break;
            default:
                this.o = qr2.q;
                break;
        }
    }

    public gp3(ArrayList arrayList, ArrayList arrayList2) {
        this.n = 10;
        int size = arrayList.size();
        this.o = new int[size];
        this.p = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.o)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.p)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public gp3(int i, int i2) {
        this.n = 10;
        this.o = new int[]{i, i2};
        this.p = new float[]{0.0f, 1.0f};
    }

    public gp3(int i, int i2, int i3) {
        this.n = 10;
        this.o = new int[]{i, i2, i3};
        this.p = new float[]{0.0f, 0.5f, 1.0f};
    }
}
