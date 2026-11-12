package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.work.impl.WorkDatabase_Impl;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.models.Bookmarks;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xc5 implements xs, Callback, in4, ps, m54, g84 {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;

    public xc5(pn4 pn4Var, int i) {
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
        gr1 gr1VarB4;
        dz4 dz4VarA7;
        dz4 dz4VarA8;
        this.n = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        String str2 = "https://localhost/rest/";
        switch (i) {
            case 11:
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
                    dz4 dz4VarA9 = ak0Var.a(i2, i3);
                    if (z) {
                        dz4VarA2 = gk4.c.a(i2, i3);
                        dz4VarA = gk4.b.a(i2, i3);
                    } else {
                        dz4VarA = null;
                        dz4VarA2 = null;
                    }
                    arrayList3.add(dz4VarA9);
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
                this.p = (x02) retrofitBuild.create(x02.class);
                break;
            case 14:
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
                    dz4 dz4VarA10 = ak0Var2.a(i6, i7);
                    if (z5) {
                        dz4VarA4 = gk4.c.a(i6, i7);
                        dz4VarA3 = gk4.b.a(i6, i7);
                    } else {
                        dz4VarA3 = null;
                        dz4VarA4 = null;
                    }
                    arrayList7.add(dz4VarA10);
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
                this.p = (so2) retrofitBuild2.create(so2.class);
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
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
                    dz4 dz4VarA11 = ak0Var3.a(i10, i11);
                    if (z9) {
                        dz4VarA6 = gk4.c.a(i10, i11);
                        dz4VarA5 = gk4.b.a(i10, i11);
                    } else {
                        dz4VarA5 = null;
                        dz4VarA6 = null;
                    }
                    arrayList11.add(dz4VarA11);
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
                this.p = (n93) retrofitBuild3.create(n93.class);
                break;
            default:
                this.o = pn4Var;
                ok1 ok1Var4 = new ok1();
                ok1Var4.a(Date.class, new r01());
                ok1Var4.a(Bookmarks.class, new lt());
                ok1Var4.j = true;
                ArrayList arrayList13 = ok1Var4.e;
                int size4 = arrayList13.size();
                ArrayList arrayList14 = ok1Var4.f;
                ArrayList arrayList15 = new ArrayList(arrayList14.size() + size4 + 3);
                arrayList15.addAll(arrayList13);
                Collections.reverse(arrayList15);
                ArrayList arrayList16 = new ArrayList(arrayList14);
                Collections.reverse(arrayList16);
                arrayList15.addAll(arrayList16);
                int i14 = ok1Var4.g;
                int i15 = ok1Var4.h;
                ak0 ak0Var4 = bk0.b;
                boolean z13 = gk4.a;
                if (i14 != 2 && i15 != 2) {
                    dz4 dz4VarA12 = ak0Var4.a(i14, i15);
                    if (z13) {
                        dz4VarA8 = gk4.c.a(i14, i15);
                        dz4VarA7 = gk4.b.a(i14, i15);
                    } else {
                        dz4VarA7 = null;
                        dz4VarA8 = null;
                    }
                    arrayList15.add(dz4VarA12);
                    if (z13) {
                        arrayList15.add(dz4VarA8);
                        arrayList15.add(dz4VarA7);
                    }
                }
                u21 u21Var4 = ok1Var4.a;
                int i16 = ok1Var4.c;
                HashMap map4 = new HashMap(ok1Var4.d);
                boolean z14 = ok1Var4.i;
                boolean z15 = ok1Var4.j;
                boolean z16 = ok1Var4.k;
                int i17 = ok1Var4.b;
                new ArrayList(arrayList13);
                new ArrayList(arrayList14);
                nk1 nk1Var4 = new nk1(u21Var4, i16, map4, z14, z15, z16, i17, arrayList15, ok1Var4.l, ok1Var4.m, new ArrayList(ok1Var4.n));
                Retrofit.Builder builder4 = new Retrofit.Builder();
                String strJ4 = pn4Var.j();
                String string4 = strJ4 != null ? qm4.K0(strJ4).toString() : null;
                str = string4 != null ? string4 : "";
                try {
                    fr1 fr1Var4 = new fr1();
                    fr1Var4.e(null, str);
                    gr1VarB4 = fr1Var4.b();
                } catch (IllegalArgumentException unused5) {
                    gr1VarB4 = null;
                }
                if (gr1VarB4 != null && gr1VarB4.d.length() > 0) {
                    str2 = str;
                }
                Retrofit.Builder builderAddConverterFactory4 = builder4.baseUrl(str2).addConverterFactory(GsonConverterFactory.create(nk1Var4));
                cx cxVar4 = new cx();
                rx rxVar4 = new rx(cxVar4);
                cxVar4.a = 2592000;
                n83 n83Var4 = new n83();
                n83Var4.a(2L, timeUnit2);
                n83Var4.b(20L, timeUnit);
                n83Var4.z = ze5.b(30L, timeUnit);
                n83Var4.A = ze5.b(30L, timeUnit);
                dr1 dr1Var4 = new dr1();
                dr1Var4.b = cr1.n;
                n83Var4.c.add(dr1Var4);
                n83Var4.c.add(rxVar4);
                File cacheDir4 = App.a().getCacheDir();
                cacheDir4.getClass();
                n83Var4.l = new hx(cacheDir4);
                SSLSocketFactory sSLSocketFactory4 = x30.b;
                if (sSLSocketFactory4 != null) {
                    n83Var4.c(sSLSocketFactory4, x30.a);
                }
                Retrofit retrofitBuild4 = builderAddConverterFactory4.client(new o83(n83Var4)).build();
                retrofitBuild4.getClass();
                this.p = (w8) retrofitBuild4.create(w8.class);
                break;
        }
    }

    public static void l(xc5 xc5Var, boolean z, boolean z2) {
        synchronized (xc5Var) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) xc5Var.p) == null) {
                    if (((Context) xc5Var.o).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        l93.q0("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) xc5Var.o).getSystemService("power");
                    if (powerManager == null) {
                        l93.q0("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        xc5Var.p = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) xc5Var.p;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static int r(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    @Override // defpackage.g84
    public void a(be3 be3Var) {
        qy4 qy4Var = (qy4) this.p;
        SparseArray sparseArray = qy4Var.h;
        h00 h00Var = (h00) this.o;
        if (be3Var.A() == 0 && (be3Var.A() & 128) != 0) {
            be3Var.O(6);
            int iA = be3Var.a() / 4;
            for (int i = 0; i < iA; i++) {
                be3Var.k(h00Var.b, 0, 4);
                h00Var.q(0);
                int i2 = h00Var.i(16);
                h00Var.t(3);
                if (i2 == 0) {
                    h00Var.t(13);
                } else {
                    int i3 = h00Var.i(13);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new h84(new ew4(qy4Var, i3)));
                        qy4Var.n++;
                    }
                }
            }
            if (qy4Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.in4
    public jn4 apply() {
        return ((o72) this.o).f(this.p);
    }

    @Override // defpackage.g84
    public void b(iu4 iu4Var, m51 m51Var, sy4 sy4Var) {
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    @Override // defpackage.ps
    public os c(l51 l51Var, long j) {
        int iA;
        long position = l51Var.getPosition();
        int iMin = (int) Math.min(20000L, l51Var.getLength() - position);
        be3 be3Var = (be3) this.p;
        be3Var.K(iMin);
        l51Var.n(be3Var.a, 0, iMin);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (be3Var.a() >= 4) {
            if (r71.a(be3Var.b, be3Var.a) != 442) {
                be3Var.O(1);
            } else {
                be3Var.O(4);
                long jC = sr3.c(be3Var);
                if (jC != -9223372036854775807L) {
                    long jB = ((iu4) this.o).b(jC);
                    if (jB > j) {
                        return j2 == -9223372036854775807L ? new os(-1, jB, position) : new os(0, -9223372036854775807L, position + ((long) i2));
                    }
                    j2 = jB;
                    long j3 = 100000 + j2;
                    i2 = be3Var.b;
                    if (j3 > j) {
                        return new os(0, -9223372036854775807L, position + ((long) i2));
                    }
                }
                int i3 = be3Var.c;
                if (be3Var.a() >= 10) {
                    be3Var.O(9);
                    int iA2 = be3Var.A() & 7;
                    if (be3Var.a() >= iA2) {
                        be3Var.O(iA2);
                        if (be3Var.a() >= 4) {
                            if (r71.a(be3Var.b, be3Var.a) != 443) {
                                while (be3Var.a() >= 4) {
                                    iA = r71.a(be3Var.b, be3Var.a);
                                    if (iA == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            be3Var.O(4);
                            int iH = be3Var.H();
                            if (be3Var.a() < iH) {
                                be3Var.N(i3);
                            } else {
                                be3Var.O(iH);
                                while (be3Var.a() >= 4) {
                                    iA = r71.a(be3Var.b, be3Var.a);
                                    if (iA == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    be3Var.O(4);
                                    if (be3Var.a() < 2) {
                                        be3Var.N(i3);
                                        break;
                                    }
                                    be3Var.N(Math.min(be3Var.c, be3Var.b + be3Var.H()));
                                }
                            }
                        } else {
                            be3Var.N(i3);
                        }
                    } else {
                        be3Var.N(i3);
                    }
                } else {
                    be3Var.N(i3);
                }
                i = be3Var.b;
            }
        }
        return j2 != -9223372036854775807L ? new os(-2, j2, position + ((long) i)) : os.e;
    }

    @Override // defpackage.in4
    public void cancel() {
    }

    @Override // defpackage.in4
    public boolean d() {
        return true;
    }

    @Override // defpackage.in4
    public boolean e(bt2 bt2Var) {
        return true;
    }

    @Override // defpackage.m54
    public Object f(Object obj) {
        return ((if1) this.p).invoke(obj);
    }

    @Override // defpackage.xs
    public ic2 g(Uri uri) {
        Uri uri2;
        r20 r20Var = (r20) this.p;
        if (r20Var == null || (uri2 = (Uri) r20Var.p) == null || !uri2.equals(uri)) {
            ic2 ic2VarG = ((xs) this.o).g(uri);
            this.p = new r20(uri, ic2VarG);
            return ic2VarG;
        }
        ic2 ic2Var = (ic2) ((r20) this.p).q;
        ic2Var.getClass();
        return ic2Var;
    }

    @Override // defpackage.m54
    public Object h(t44 t44Var, Object obj) {
        return ((wf1) this.o).invoke(t44Var, obj);
    }

    @Override // defpackage.xs
    public ic2 i(do2 do2Var) {
        Uri uri;
        byte[] bArr;
        r20 r20Var = (r20) this.p;
        if (r20Var != null && (((uri = (Uri) r20Var.p) != null && uri.equals(do2Var.m)) || ((bArr = (byte[]) r20Var.o) != null && Arrays.equals(bArr, do2Var.k)))) {
            ic2 ic2Var = (ic2) ((r20) this.p).q;
            ic2Var.getClass();
            return ic2Var;
        }
        ic2 ic2VarI = ((xs) this.o).i(do2Var);
        if (ic2VarI == null) {
            return null;
        }
        this.p = new r20(do2Var, ic2VarI);
        return ic2VarI;
    }

    @Override // defpackage.xs
    public ic2 j(byte[] bArr) {
        byte[] bArr2;
        r20 r20Var = (r20) this.p;
        if (r20Var == null || (bArr2 = (byte[]) r20Var.o) == null || !Arrays.equals(bArr2, bArr)) {
            ic2 ic2VarJ = ((xs) this.o).j(bArr);
            this.p = new r20(bArr, ic2VarJ);
            return ic2VarJ;
        }
        ic2 ic2Var = (ic2) ((r20) this.p).q;
        ic2Var.getClass();
        return ic2Var;
    }

    @Override // defpackage.ps
    public void k() {
        be3 be3Var = (be3) this.p;
        byte[] bArr = f35.b;
        be3Var.getClass();
        be3Var.L(bArr.length, bArr);
    }

    public void m(Object obj, String str) {
        HashMap map = (HashMap) this.o;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.p).remove(str);
    }

    public void n() {
        int[] iArr = (int[]) this.o;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.p = null;
    }

    public void o(bj0 bj0Var) {
        synchronized (bj0Var) {
        }
        Handler handler = (Handler) this.o;
        if (handler != null) {
            handler.post(new km(this, bj0Var, 0));
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 8:
                d34.r((l61) this.o, (StarCallback) this.p);
                break;
            default:
                ((hq1) this.o).l();
                break;
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        Playlist playlist;
        switch (this.n) {
            case 8:
                l61 l61Var = (l61) this.o;
                StarCallback starCallback = (StarCallback) this.p;
                if (response.isSuccessful() && !d34.w(response)) {
                    n61.a(l61Var);
                    starCallback.onSuccess();
                } else if (!d34.w(response)) {
                    d34.r(l61Var, starCallback);
                } else {
                    n61.j(l61Var);
                    starCallback.onRefused();
                }
                break;
            default:
                hq1 hq1Var = (hq1) this.o;
                if (mm3.f(response)) {
                    ((mm3) this.p).g();
                }
                if (!mm3.f(response)) {
                    hq1Var.l();
                    break;
                } else {
                    String str = (String) hq1Var.c;
                    im3 im3Var = (im3) hq1Var.g;
                    k03 k03Var = im3Var.j;
                    List list = (List) k03Var.d();
                    if (list == ((ArrayList) hq1Var.b) || (playlist = im3Var.e) == null || !playlist.getId().equals(str)) {
                        im3Var.f = null;
                    } else {
                        List list2 = (List) hq1Var.d;
                        if (list == null || list.size() != list2.size()) {
                            im3.c(im3Var, str, true);
                        } else {
                            int i = 0;
                            while (true) {
                                if (i >= list.size()) {
                                    im3Var.f = null;
                                    int i2 = im3Var.h + 1;
                                    im3Var.h = i2;
                                    im3Var.i = i2;
                                    ArrayList arrayList = new ArrayList(list);
                                    arrayList.remove(hq1Var.a);
                                    k03Var.k(arrayList);
                                } else if (((Child) list.get(i)).getId().equals(((Child) list2.get(i)).getId())) {
                                    i++;
                                } else {
                                    im3.c(im3Var, str, true);
                                }
                            }
                        }
                    }
                    final ew4 ew4Var = (ew4) hq1Var.e;
                    final MainActivity mainActivity = (MainActivity) ew4Var.p;
                    qp4 qp4Var = mainActivity.R;
                    if (qp4Var != null) {
                        FrameLayout frameLayout = (FrameLayout) qp4Var.c;
                        int[] iArr = qg4.E;
                        qg4 qg4VarH = qg4.h(frameLayout, frameLayout.getResources().getText(R.string.playlist_chooser_dialog_toast_remove_success), 0);
                        qg4VarH.e(mainActivity.u());
                        final im3 im3Var2 = (im3) ew4Var.q;
                        final String str2 = (String) ew4Var.r;
                        final Child child = (Child) ew4Var.s;
                        final int i3 = ew4Var.o;
                        qg4VarH.i(R.string.song_bottom_sheet_undo, new View.OnClickListener(ew4Var, im3Var2, str2, child, i3, mainActivity) { // from class: gi4
                            public final /* synthetic */ im3 n;
                            public final /* synthetic */ String o;
                            public final /* synthetic */ Child p;
                            public final /* synthetic */ int q;
                            public final /* synthetic */ MainActivity r;

                            {
                                this.n = im3Var2;
                                this.o = str2;
                                this.p = child;
                                this.q = i3;
                                this.r = mainActivity;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                pz1 pz1Var = new pz1(23, this.r);
                                im3 im3Var3 = this.n;
                                if (im3Var3.f != null) {
                                    pz1Var.g();
                                    return;
                                }
                                String str3 = this.o;
                                im3Var3.f = str3;
                                im3Var3.e(str3);
                                k03 k03VarC = im3Var3.c.c(str3, false, new em3(im3Var3, str3, 2));
                                k03VarC.f(new gm3(im3Var3, k03VarC, pz1Var, this.q, this.p, str3));
                            }
                        });
                        qg4VarH.j();
                        break;
                    }
                }
                break;
        }
    }

    public void p(int i) {
        int[] iArr = (int[]) this.o;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.o = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.o = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.o;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public Call q(String str, int i, int i2, Integer num, Integer num2) {
        Log.d("BrowsingClient", "getAlbumList2()");
        return ((w8) this.p).b(((pn4) this.o).f(), str, i, i2, num, num2, ud3.k());
    }

    public Call s() {
        Log.d("BrowsingClient", "getStarred2()");
        return ((w8) this.p).d(((pn4) this.o).f());
    }

    public void t() {
        ((SparseIntArray) this.o).clear();
    }

    public void u(int i, int i2) {
        int[] iArr = (int[]) this.o;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        p(i3);
        int[] iArr2 = (int[]) this.o;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.o, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.p;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pk4 pk4Var = (pk4) ((ArrayList) this.p).get(size);
            int i4 = pk4Var.n;
            if (i4 >= i) {
                pk4Var.n = i4 + i2;
            }
        }
    }

    public void v(int i, int i2) {
        int[] iArr = (int[]) this.o;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        p(i3);
        int[] iArr2 = (int[]) this.o;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.o;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.p;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pk4 pk4Var = (pk4) ((ArrayList) this.p).get(size);
            int i4 = pk4Var.n;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.p).remove(size);
                } else {
                    pk4Var.n = i4 - i2;
                }
            }
        }
    }

    public void w(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        messageObtain.replyTo = messenger;
        ((Messenger) this.o).send(messageObtain);
    }

    public void x(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.o)) {
            map = new HashMap((Map) this.o);
        }
        synchronized (((Map) this.p)) {
            map2 = new HashMap((Map) this.p);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((cr4) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public /* synthetic */ xc5(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    public /* synthetic */ xc5(int i, boolean z) {
        this.n = i;
    }

    public /* synthetic */ xc5(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public xc5(WorkDatabase_Impl workDatabase_Impl) {
        this.n = 0;
        this.o = workDatabase_Impl;
        this.p = new vo0(workDatabase_Impl, 3);
    }

    public xc5(iu4 iu4Var) {
        this.n = 18;
        this.o = iu4Var;
        this.p = new be3();
    }

    public xc5(int i) {
        this.n = i;
        switch (i) {
            case 10:
                this.o = new SparseIntArray();
                this.p = new SparseIntArray();
                break;
            case 23:
                this.o = Collections.synchronizedMap(new WeakHashMap());
                this.p = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.o = new HashMap();
                this.p = new ArrayList();
                break;
        }
    }

    public xc5(Animation animation) {
        this.n = 9;
        this.o = animation;
        this.p = null;
    }

    public xc5(Handler handler, qm qmVar) {
        this.n = 3;
        if (qmVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.o = handler;
        this.p = qmVar;
    }

    public xc5(Animator animator) {
        this.n = 9;
        this.o = null;
        this.p = animator;
    }

    public xc5(EditText editText) {
        this.n = 7;
        this.o = editText;
        l01 l01Var = new l01(editText);
        this.p = l01Var;
        editText.addTextChangedListener(l01Var);
        if (yz0.b == null) {
            synchronized (yz0.a) {
                try {
                    if (yz0.b == null) {
                        yz0 yz0Var = new yz0();
                        try {
                            yz0.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, yz0.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        yz0.b = yz0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(yz0.b);
    }

    public xc5(gy3 gy3Var, int[] iArr) {
        this.n = 15;
        this.o = yw1.k(gy3Var);
        this.p = iArr;
    }

    public xc5(mm3 mm3Var, hq1 hq1Var) {
        this.n = 17;
        this.p = mm3Var;
        this.o = hq1Var;
    }

    public xc5(qy4 qy4Var) {
        this.n = 21;
        this.p = qy4Var;
        this.o = new h00(4, new byte[4]);
    }

    public xc5(IBinder iBinder, Bundle bundle) {
        this.n = 13;
        this.o = new Messenger(iBinder);
        this.p = bundle;
    }
}
