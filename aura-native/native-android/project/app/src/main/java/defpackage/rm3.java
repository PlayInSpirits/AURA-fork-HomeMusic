package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.eddyizm.tempus.ui.fragment.AlbumListPageFragment;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class rm3 implements u74, f51, eg1, ak2 {
    public Object n;
    public Object o;

    public rm3(pn4 pn4Var, int i) {
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
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        String str2 = "https://localhost/rest/";
        switch (i) {
            case 14:
                this.n = pn4Var;
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
                this.o = (in2) retrofitBuild.create(in2.class);
                break;
            case 17:
                this.n = pn4Var;
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
                this.o = (qm3) retrofitBuild2.create(qm3.class);
                break;
            default:
                this.n = pn4Var;
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
                this.o = (mt) retrofitBuild3.create(mt.class);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void D(c72 c72Var) {
        if (c72Var.Y > 0) {
            if (c72Var.R.d == y62.r && !c72Var.p() && !c72Var.q() && !c72Var.Z && c72Var.H()) {
                cx2 cx2Var = (cx2) c72Var.Q.g;
                if ((cx2Var.q & 256) != 0) {
                    while (cx2Var != null) {
                        if ((cx2Var.p & 256) != 0) {
                            cx2 C = cx2Var;
                            f13 f13Var = null;
                            while (C != null) {
                                if (C instanceof vi1) {
                                    vi1 vi1Var = (vi1) C;
                                    vi1Var.L(j51.M(vi1Var, 256));
                                } else if ((C.p & 256) != 0 && (C instanceof fo0)) {
                                    cx2 cx2Var2 = ((fo0) C).C;
                                    int i = 0;
                                    C = C;
                                    f13Var = f13Var;
                                    while (cx2Var2 != null) {
                                        if ((cx2Var2.p & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                f13Var = f13Var;
                                                C = cx2Var2;
                                            } else {
                                                if (f13Var == null) {
                                                    f13Var = new f13(new cx2[16]);
                                                }
                                                if (C != null) {
                                                    f13Var.b(C);
                                                    C = null;
                                                }
                                                f13Var.b(cx2Var2);
                                            }
                                        }
                                        cx2Var2 = cx2Var2.s;
                                        C = C;
                                        f13Var = f13Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                C = j51.c(f13Var);
                            }
                        }
                        if ((cx2Var.q & 256) == 0) {
                            break;
                        } else {
                            cx2Var = cx2Var.s;
                        }
                    }
                }
            }
            c72Var.X = false;
            f13 f13VarY = c72Var.y();
            Object[] objArr = f13VarY.n;
            int i2 = f13VarY.p;
            for (int i3 = 0; i3 < i2; i3++) {
                D((c72) objArr[i3]);
            }
        }
    }

    public Bundle A(String str) {
        xm2 xm2Var = (xm2) this.n;
        if (!xm2Var.b) {
            kf2.o("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = (Bundle) xm2Var.h;
        if (bundle == null) {
            return null;
        }
        Bundle bundleW = bundle.containsKey(str) ? jz4.w(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            xm2Var.h = null;
        }
        return bundleW;
    }

    public void B(String str) {
        xl.E((s24) this.n, false, true, new rs0(16, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C() {
        Object[] objArr;
        f13 f13Var = (f13) this.n;
        Arrays.sort(f13Var.n, 0, f13Var.p, ca1.t);
        int i = f13Var.p;
        c72[] c72VarArr = (c72[]) this.o;
        if (c72VarArr == null || c72VarArr.length < i) {
            objArr = c72VarArr;
            objArr = new c72[Math.max(16, i)];
        }
        objArr = c72VarArr;
        this.o = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = f13Var.n[i2];
        }
        f13Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.o = objArr;
                return;
            }
            c72 c72Var = objArr[i];
            c72Var.getClass();
            if (c72Var.X) {
                D(c72Var);
            }
            objArr[i] = 0;
        }
    }

    public k51 E(Object... objArr) {
        Constructor constructorD;
        synchronized (((AtomicBoolean) this.o)) {
            try {
                if (!((AtomicBoolean) this.o).get()) {
                    try {
                        constructorD = ((mj0) this.n).d();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.o).set(true);
                        constructorD = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorD = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorD == null) {
            return null;
        }
        try {
            return (k51) constructorD.newInstance(objArr);
        } catch (Exception e2) {
            mj0.j("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public Call F(String str) {
        Log.d("BrowsingClient", "getPlaylist()");
        return ((qm3) this.o).c(((pn4) this.n).f(), str);
    }

    public i54 G(String str) {
        i54 i54Var;
        xm2 xm2Var = (xm2) this.n;
        synchronized (((xi4) xm2Var.f)) {
            Iterator it = ((LinkedHashMap) xm2Var.g).entrySet().iterator();
            do {
                i54Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                i54 i54Var2 = (i54) entry.getValue();
                if (h12.c(str2, str)) {
                    i54Var = i54Var2;
                }
            } while (i54Var == null);
        }
        return i54Var;
    }

    public void H(d5 d5Var) {
        bq4 bq4Var = (bq4) this.n;
        ((ActionMode.Callback) bq4Var.n).onDestroyActionMode(bq4Var.i(d5Var));
        bg bgVar = (bg) this.o;
        if (bgVar.I != null) {
            bgVar.y.getDecorView().removeCallbacks(bgVar.J);
        }
        if (bgVar.H != null) {
            s75 s75Var = bgVar.K;
            if (s75Var != null) {
                s75Var.b();
            }
            s75 s75VarA = j65.a(bgVar.H);
            s75VarA.a(0.0f);
            bgVar.K = s75VarA;
            s75VarA.d(new sf(2, this));
        }
        bgVar.G = null;
        ViewGroup viewGroup = bgVar.N;
        WeakHashMap weakHashMap = j65.a;
        viewGroup.requestApplyInsets();
        bgVar.O();
    }

    public boolean I(d5 d5Var, Menu menu) {
        ViewGroup viewGroup = ((bg) this.o).N;
        WeakHashMap weakHashMap = j65.a;
        viewGroup.requestApplyInsets();
        bq4 bq4Var = (bq4) this.n;
        ActionMode.Callback callback = (ActionMode.Callback) bq4Var.n;
        jo4 jo4VarI = bq4Var.i(d5Var);
        yd4 yd4Var = (yd4) bq4Var.q;
        Menu jv2Var = (Menu) yd4Var.get(menu);
        if (jv2Var == null) {
            jv2Var = new jv2((Context) bq4Var.o, (qu2) menu);
            yd4Var.put(menu, jv2Var);
        }
        return callback.onPrepareActionMode(jo4VarI, jv2Var);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void J(Context context, XmlResourceParser xmlResourceParser) {
        wb0 wb0Var = new wb0();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    rb0 rb0VarE = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (rb0VarE == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        rb0VarE.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (rb0VarE == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        rb0VarE.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        rb0VarE = wb0.e(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (rb0VarE == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        rb0VarE.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (rb0VarE == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        rb0VarE.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        rb0VarE = wb0.e(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        rb0VarE.d.a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (rb0VarE != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        ib0.a(context, xmlResourceParser, rb0VarE.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        rb0VarE = wb0.e(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        rb0VarE.d.h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (rb0VarE != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        ib0.a(context, xmlResourceParser, rb0VarE.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        rb0VarE = wb0.e(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        wb0Var.c.put(Integer.valueOf(rb0VarE.a), rb0VarE);
                                        rb0VarE = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        wb0Var.c.put(Integer.valueOf(rb0VarE.a), rb0VarE);
                                        rb0VarE = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        wb0Var.c.put(Integer.valueOf(rb0VarE.a), rb0VarE);
                                        rb0VarE = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.o).put(identifier, wb0Var);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                ((SparseArray) this.o).put(identifier, wb0Var);
                return;
            }
        }
    }

    public n50 K(cx3 cx3Var, int i) {
        r65 r65Var;
        n50 n50Var;
        yd4 yd4Var = (yd4) this.n;
        int iD = yd4Var.d(cx3Var);
        if (iD >= 0 && (r65Var = (r65) yd4Var.j(iD)) != null) {
            int i2 = r65Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                r65Var.a = i3;
                if (i == 4) {
                    n50Var = r65Var.b;
                } else if (i == 8) {
                    n50Var = r65Var.c;
                } else {
                    kf2.n("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    yd4Var.h(iD);
                    r65Var.a = 0;
                    r65Var.b = null;
                    r65Var.c = null;
                    r65.d.a(r65Var);
                }
                return n50Var;
            }
        }
        return null;
    }

    public void L(String str, i54 i54Var) {
        i54Var.getClass();
        xm2 xm2Var = (xm2) this.n;
        synchronized (((xi4) xm2Var.f)) {
            if (((LinkedHashMap) xm2Var.g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) xm2Var.g).put(str, i54Var);
        }
    }

    public void M(String str) {
        yq0 yq0Var;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.n).get(str);
                h12.f(obj, "Argument must not be null");
                yq0Var = (yq0) obj;
                int i = yq0Var.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + yq0Var.b);
                }
                int i2 = i - 1;
                yq0Var.b = i2;
                if (i2 == 0) {
                    yq0 yq0Var2 = (yq0) ((HashMap) this.n).remove(str);
                    if (!yq0Var2.equals(yq0Var)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + yq0Var + ", but actually removed: " + yq0Var2 + ", safeKey: " + str);
                    }
                    zg5 zg5Var = (zg5) this.o;
                    synchronized (((ArrayDeque) zg5Var.n)) {
                        try {
                            if (((ArrayDeque) zg5Var.n).size() < 10) {
                                ((ArrayDeque) zg5Var.n).offer(yq0Var2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        yq0Var.a.unlock();
    }

    public void N(cx3 cx3Var) {
        r65 r65Var = (r65) ((yd4) this.n).get(cx3Var);
        if (r65Var == null) {
            return;
        }
        r65Var.a &= -2;
    }

    public void O(cx3 cx3Var) {
        xe2 xe2Var = (xe2) this.o;
        for (int iH = xe2Var.h() - 1; iH >= 0; iH--) {
            if (cx3Var == xe2Var.i(iH)) {
                Object[] objArr = xe2Var.p;
                Object obj = objArr[iH];
                Object obj2 = ud3.b;
                if (obj == obj2) {
                    break;
                }
                objArr[iH] = obj2;
                xe2Var.n = true;
                break;
            }
        }
        r65 r65Var = (r65) ((yd4) this.n).remove(cx3Var);
        if (r65Var != null) {
            r65Var.a = 0;
            r65Var.b = null;
            r65Var.c = null;
            r65.d.a(r65Var);
        }
    }

    public void P() {
        if (!((xm2) this.n).c) {
            kf2.o("Can not perform this action after onSaveInstanceState");
            return;
        }
        bf bfVar = (bf) this.o;
        if (bfVar == null) {
            bfVar = new bf(this);
        }
        this.o = bfVar;
        try {
            g92.class.getDeclaredConstructor(null);
            bf bfVar2 = (bf) this.o;
            if (bfVar2 != null) {
                ((LinkedHashSet) bfVar2.b).add(g92.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + g92.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void Q(gl4 gl4Var, z45 z45Var) {
        gl4Var.getClass();
        ((bq4) this.o).h(new qo2(this, gl4Var, z45Var, 21));
    }

    public void R(gl4 gl4Var, int i) {
        gl4Var.getClass();
        ((bq4) this.o).h(new am4((pq3) this.n, gl4Var, false, i));
    }

    public Call S(String str, String str2, Boolean bool, ArrayList arrayList, ArrayList arrayList2) {
        Log.d("BrowsingClient", "updatePlaylist()");
        return ((qm3) this.o).b(((pn4) this.n).f(), str, str2, bool, arrayList, arrayList2);
    }

    @Override // defpackage.ak2
    public void a() {
        ns3 ns3Var = (ns3) this.o;
        MediaCodec mediaCodec = (MediaCodec) this.n;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && ns3Var != null) {
                ns3Var.e(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object obj) {
        return ((eg1) ((hg3) this.n).o).mo77apply(obj);
    }

    @Override // defpackage.f51
    public int b() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((hg3) this.n).o;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.o;
        int i = extendedFloatingActionButton2.U;
        if (i != -1) {
            return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.ak2
    public void c(Bundle bundle) {
        ((MediaCodec) this.n).setParameters(bundle);
    }

    @Override // defpackage.f51
    public int d() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        hg3 hg3Var = (hg3) this.n;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.o;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return hg3Var.d();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return hg3Var.d();
    }

    @Override // defpackage.ak2
    public void e(int i, fg0 fg0Var, long j, int i2) {
        ((MediaCodec) this.n).queueSecureInputBuffer(i, 0, fg0Var.i, j, i2);
    }

    @Override // defpackage.ak2
    public void f(int i, int i2, int i3, long j) {
        ((MediaCodec) this.n).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.ak2
    public void flush() {
        ((MediaCodec) this.n).flush();
    }

    @Override // defpackage.ak2
    public void g(int i) {
        ((MediaCodec) this.n).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.ak2
    public MediaFormat h() {
        return ((MediaCodec) this.n).getOutputFormat();
    }

    @Override // defpackage.ak2
    public void i() {
        ((MediaCodec) this.n).detachOutputSurface();
    }

    @Override // defpackage.f51
    public int j() {
        return ((ExtendedFloatingActionButton) this.o).N;
    }

    @Override // defpackage.ak2
    public void l(int i, long j) {
        ((MediaCodec) this.n).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.ak2
    public int m() {
        return ((MediaCodec) this.n).dequeueInputBuffer(0L);
    }

    @Override // defpackage.ak2
    public int n(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.n).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.f51
    public ViewGroup.LayoutParams o() {
        int i = ((ExtendedFloatingActionButton) this.o).U;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    @Override // defpackage.u74
    public boolean onQueryTextChange(String str) {
        ((o7) ((AlbumListPageFragment) this.o).o0.v).filter(str);
        return false;
    }

    @Override // defpackage.u74
    public boolean onQueryTextSubmit(String str) {
        ((SearchView) this.n).clearFocus();
        return false;
    }

    @Override // defpackage.ak2
    public void p(int i) {
        ((MediaCodec) this.n).setVideoScalingMode(i);
    }

    @Override // defpackage.ak2
    public ByteBuffer q(int i) {
        return ((MediaCodec) this.n).getInputBuffer(i);
    }

    @Override // defpackage.ak2
    public void r(Surface surface) {
        ((MediaCodec) this.n).setOutputSurface(surface);
    }

    @Override // defpackage.f51
    public int s() {
        return ((ExtendedFloatingActionButton) this.o).M;
    }

    @Override // defpackage.ak2
    public ByteBuffer t(int i) {
        return ((MediaCodec) this.n).getOutputBuffer(i);
    }

    @Override // defpackage.ak2
    public void u(ArrayList arrayList) {
        ((MediaCodec) this.n).subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.ak2
    public void v(nk2 nk2Var, Handler handler) {
        ((MediaCodec) this.n).setOnFrameRenderedListener(new wk(this, nk2Var, 1), handler);
    }

    @Override // defpackage.ak2
    public void x(ArrayList arrayList) {
        ((MediaCodec) this.n).unsubscribeFromVendorParameters(arrayList);
    }

    public void y(cx3 cx3Var, n50 n50Var) {
        yd4 yd4Var = (yd4) this.n;
        r65 r65VarA = (r65) yd4Var.get(cx3Var);
        if (r65VarA == null) {
            r65VarA = r65.a();
            yd4Var.put(cx3Var, r65VarA);
        }
        r65VarA.c = n50Var;
        r65VarA.a |= 8;
    }

    public void z() {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.n;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        linkedHashSet.clear();
        vo1 vo1Var = (vo1) this.o;
        if (vo1Var != null) {
            vo1Var.invoke();
        }
    }

    public /* synthetic */ rm3(Object obj, Object obj2, boolean z) {
        this.n = obj;
        this.o = obj2;
    }

    public /* synthetic */ rm3(Object obj, Object obj2) {
        this.o = obj;
        this.n = obj2;
    }

    public rm3(int i) {
        switch (i) {
            case WaveRetry.MAX_FAILURES /* 16 */:
                this.n = new f13(new c72[16]);
                break;
            case 17:
            case 19:
            case 21:
            default:
                this.n = new HashMap();
                this.o = new zg5(21);
                break;
            case 18:
                long[] jArr = v54.a;
                this.n = new w03();
                break;
            case 20:
                this.n = new LinkedHashSet();
                break;
            case 22:
                this.n = new yd4(0);
                this.o = new xe2((Object) null);
                break;
        }
    }

    public rm3(pq3 pq3Var, bq4 bq4Var) {
        pq3Var.getClass();
        bq4Var.getClass();
        this.n = pq3Var;
        this.o = bq4Var;
    }

    public rm3(MediaCodec mediaCodec, ns3 ns3Var) {
        this.n = mediaCodec;
        this.o = ns3Var;
        if (Build.VERSION.SDK_INT < 35 || ns3Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) ns3Var.q;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            rr2.w(((HashSet) ns3Var.o).add(mediaCodec));
        }
    }

    public rm3(mj0 mj0Var) {
        this.n = mj0Var;
        this.o = new AtomicBoolean(false);
    }
}
