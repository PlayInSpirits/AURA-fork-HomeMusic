package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wc implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ wc(uo uoVar, long j) {
        this.n = 0;
        this.o = uoVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0133 */
    /* JADX WARN: Code duplicated, block: B:199:0x03af  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:202:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:205:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:207:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:280:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116 A[Catch: all -> 0x012b, LOOP:4: B:49:0x00e3->B:60:0x0116, LOOP_END, TryCatch #4 {all -> 0x012b, blocks: (B:44:0x00c5, B:46:0x00d0, B:49:0x00e3, B:51:0x00f1, B:53:0x00fb, B:55:0x0101, B:56:0x010a, B:60:0x0116, B:61:0x011c), top: B:268:0x00c5, outer: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws IOException {
        boolean z;
        int i;
        dc5 dc5Var;
        af1 af1Var;
        z80 z80Var;
        char c;
        long j;
        long j2 = -9187201950435737472L;
        char c2 = 7;
        int i2 = 2;
        boolean z2 = true;
        context = null;
        Context context = null;
        int i3 = 0;
        switch (this.n) {
            case 0:
                return ((pv) ((uo) this.o)).w;
            case 1:
                j15 j15Var = j15.a;
                vz vzVar = (vz) this.o;
                rr1 rr1Var = rr1.a;
                String str = vzVar.c;
                boolean z3 = vzVar.d;
                String str2 = vzVar.f;
                String str3 = vzVar.g;
                String str4 = vzVar.h;
                String str5 = vzVar.i;
                qr1 qr1Var = (qr1) rr1.e.get();
                String strC = qr1Var != null ? qr1Var.a : rr1.c();
                o83 o83Var = (o83) rr1.h.getValue();
                nz3 nz3Var = new nz3();
                nz3Var.d(strC.concat("/healthz"));
                oz3 oz3Var = new oz3(nz3Var);
                o83Var.getClass();
                k14 k14VarC = new bv3(o83Var, oz3Var).c();
                try {
                    if (!k14VarC.C) {
                        throw rr1.i(k14VarC);
                    }
                    n14 n14Var = k14VarC.t;
                    String strString = n14Var != null ? n14Var.string() : null;
                    if (strString == null) {
                        strString = "";
                    }
                    f32 f32Var = (f32) e35.N(strString).a().n.get("capabilities");
                    if (f32Var == 0 || ((f32Var instanceof Collection) && ((Collection) f32Var).isEmpty())) {
                        z = false;
                    } else {
                        ArrayList arrayList = f32Var.n;
                        int size = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                if (h12.c(((h32) obj).b(), "catalog_favorite_download_v1")) {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                        }
                    }
                    k14VarC.close();
                    if (!z) {
                        throw new HubException(426, "Обновите Хаб для изменения понравившихся треков каталога");
                    }
                    kd3 kd3Var = z3 ? new kd3("/api/downloads", lg2.X(new kd3("track_refs", gb.O(str)), new kd3("star", Boolean.TRUE), new kd3("favorite_event_id", str2), new kd3("favorite_ts", str3), new kd3("favorite_client", str4), new kd3("favorite_context", str5))) : new kd3("/api/star", lg2.X(new kd3("refs", gb.O(str)), new kd3("unstar", Boolean.TRUE), new kd3("event_id", str2), new kd3("ts", str3), new kd3("client", str4), new kd3("context", str5)));
                    String str6 = (String) kd3Var.n;
                    Map map = (Map) kd3Var.o;
                    sz3 sz3Var = tz3.Companion;
                    String strJ = rr1.c.j(map);
                    strJ.getClass();
                    hu2 hu2Var = rr1.b;
                    sz3Var.getClass();
                    we5 we5VarB = sz3.b(strJ, hu2Var);
                    try {
                        rr1 rr1Var2 = rr1.a;
                        rr1.d(new pr1(str6, we5VarB, 0), new or1(2));
                        break;
                    } catch (IOException e) {
                        if (e instanceof HubException) {
                            throw e;
                        }
                        rr1 rr1Var3 = rr1.a;
                        rr1.d(new pr1(str6, we5VarB, 0), new or1(2));
                    }
                    return j15Var;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q05.h(k14VarC, th);
                        throw th2;
                    }
                }
            case 2:
                h80 h80Var = (h80) this.o;
                boolean zA = n02.a(0L, 0L);
                View view = h80Var.a;
                if (!zA) {
                    return new ap0(0L, bu.a(view.getContext()).i(l93.o0(0L)));
                }
                Context context2 = view.getContext();
                Context baseContext = context2;
                while (baseContext instanceof ContextWrapper) {
                    if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                        context = baseContext;
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                        if (contextWrapper.getBaseContext() != null) {
                            baseContext = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        Configuration configuration = context2.getResources().getConfiguration();
                        so0 so0VarA = bu.a(context2);
                        long jA = l93.a(configuration.screenWidthDp, configuration.screenHeightDp);
                        long jY = so0VarA.Y(jA);
                        return new ap0((((long) ((int) Float.intBitsToFloat((int) (jY & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jY >> 32)))) << 32), jA);
                    }
                    bc5.a.getClass();
                    ac5 ac5Var = ac5.a;
                    cc5 cc5Var = ac5.b;
                    cc5Var.getClass();
                    i = Build.VERSION.SDK_INT;
                    if (i >= 34) {
                        dc5Var = qo0.o;
                    } else if (i >= 30) {
                        dc5Var = ku.o;
                    } else {
                        dc5Var = rv2.L;
                    }
                    zb5 zb5VarE = dc5Var.e(context, cc5Var.b);
                    long jHeight = (((long) zb5VarE.a().height()) & 4294967295L) | (((long) zb5VarE.a().width()) << 32);
                    return new ap0(jHeight, bu.a(context).i(l93.o0(jHeight)));
                }
                if (context != null) {
                    Configuration configuration2 = context2.getResources().getConfiguration();
                    so0 so0VarA2 = bu.a(context2);
                    long jA2 = l93.a(configuration2.screenWidthDp, configuration2.screenHeightDp);
                    long jY2 = so0VarA2.Y(jA2);
                    return new ap0((((long) ((int) Float.intBitsToFloat((int) (jY2 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jY2 >> 32)))) << 32), jA2);
                }
                bc5.a.getClass();
                ac5 ac5Var2 = ac5.a;
                cc5 cc5Var2 = ac5.b;
                cc5Var2.getClass();
                i = Build.VERSION.SDK_INT;
                if (i >= 34) {
                    dc5Var = qo0.o;
                } else if (i >= 30) {
                    dc5Var = ku.o;
                } else {
                    dc5Var = rv2.L;
                }
                zb5 zb5VarE2 = dc5Var.e(context, cc5Var2.b);
                long jHeight2 = (((long) zb5VarE2.a().height()) & 4294967295L) | (((long) zb5VarE2.a().width()) << 32);
                return new ap0(jHeight2, bu.a(context).i(l93.o0(jHeight2)));
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return ((rf2) this.o).b(":memory:");
            case 4:
                ((ba1) this.o).s0();
                return j15.a;
            case 5:
                bf1 bf1Var = (bf1) this.o;
                String str7 = bf1Var.o;
                if (str7 == null || !bf1Var.q) {
                    af1Var = new af1(bf1Var.n, bf1Var.o, new d34(28), bf1Var.p, bf1Var.r);
                } else {
                    Context context3 = bf1Var.n;
                    context3.getClass();
                    File noBackupFilesDir = context3.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    af1Var = new af1(bf1Var.n, new File(noBackupFilesDir, str7).getAbsolutePath(), new d34(28), bf1Var.p, bf1Var.r);
                }
                af1Var.setWriteAheadLoggingEnabled(bf1Var.t);
                return af1Var;
            case 6:
                vb4 vb4Var = (vb4) this.o;
                App.b().getClass();
                SharedPreferences sharedPreferencesC = App.c();
                sharedPreferencesC.getClass();
                String string = sharedPreferencesC.getString("homemusic_hub_local_url", null);
                if (string == null) {
                    string = "http://192.168.0.111:8080";
                }
                String strK = e35.K(string);
                if (strK != null) {
                    return strK;
                }
                String strS = vb4Var.s(R.string.homemusic_settings_local_none);
                strS.getClass();
                return strS;
            case 7:
                return Float.valueOf(j51.v(((we0) this.o).e()));
            case 8:
                Object systemService = ((View) ((pz1) this.o).o).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 9:
                s24 s24Var = ((s12) this.o).a;
                return Boolean.valueOf(!s24Var.m() || s24Var.q());
            case 10:
                f72 f72Var = ((c72) this.o).R;
                f72Var.p.J = true;
                if2 if2Var = f72Var.q;
                if (if2Var != null) {
                    if2Var.F = true;
                }
                return j15.a;
            case 11:
                h72 h72Var = (h72) this.o;
                if (!((Boolean) h72Var.g.getValue()).booleanValue() && (z80Var = h72Var.c) != null) {
                    z80Var.l();
                }
                return j15.a;
            case 12:
                return (nc3) ((gf1) ((b13) this.o).getValue()).invoke();
            case 13:
                wf2 wf2Var = (wf2) ((ha2) this.o).a.o;
                if (!wf2Var.o) {
                    if (wf2Var.p) {
                        po3.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    wf2Var.a();
                    wf2Var.p = true;
                }
                return j15.a;
            case 14:
                return (we0) ((na4) this.o).q;
            case 15:
                return ((e53) this.o).q0();
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new y83((a93) this.o);
            case 17:
                ((hk3) this.o).l0(true);
                return j15.a;
            case 18:
                yv3 yv3Var = (yv3) this.o;
                yv3Var.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    yv3Var.a();
                    return j15.a;
                } finally {
                    Trace.endSection();
                }
            case 19:
                t44 t44Var = (t44) this.o;
                m54 m54Var = t44Var.n;
                Object obj2 = t44Var.q;
                if (obj2 != null) {
                    return m54Var.h(t44Var, obj2);
                }
                kf2.n("Value should be initialized");
                return null;
            case 20:
                gp3 gp3Var = ((a54) this.o).p;
                if (gp3Var == null) {
                    return null;
                }
                Bundle bundleG = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
                gp3Var.t(bundleG);
                if (bundleG.isEmpty()) {
                    return null;
                }
                return bundleG;
            case 21:
                return e54.c((f75) this.o);
            case 22:
                j54 j54Var = (j54) this.o;
                j54Var.h().a(new vv3(0, j54Var));
                return j15.a;
            case 23:
                return this.o;
            case 24:
                wb4 wb4Var = (wb4) this.o;
                zd3 zd3Var = wb4Var.p;
                if (((qf4) zd3Var.getValue()).a == 9205357640488583168L || qf4.b(((qf4) zd3Var.getValue()).a)) {
                    return null;
                }
                pv pvVar = wb4Var.n;
                long j3 = ((qf4) zd3Var.getValue()).a;
                return pvVar.w;
            case 25:
                rx1 rx1Var = (rx1) this.o;
                String strE = rx1Var.e();
                s24 s24Var2 = (s24) rx1Var.a;
                s24Var2.getClass();
                s24Var2.a();
                s24Var2.b();
                return s24Var2.j().z().j(strE);
            case 26:
                long j4 = 128;
                pp3 pp3Var = (pp3) this.o;
                while (true) {
                    synchronized (pp3Var.h) {
                        if (pp3Var.a) {
                            c = c2;
                        } else {
                            pp3Var.a = z2;
                            try {
                                f13 f13Var = (f13) pp3Var.g;
                                Object[] objArr = f13Var.n;
                                int i5 = f13Var.p;
                                int i6 = i3;
                                while (i6 < i5) {
                                    sh4 sh4Var = (sh4) objArr[i6];
                                    x03 x03Var = sh4Var.g;
                                    if1 if1Var = sh4Var.a;
                                    Object[] objArr2 = x03Var.b;
                                    long[] jArr = x03Var.a;
                                    int length = jArr.length - i2;
                                    char c3 = c2;
                                    if (length >= 0) {
                                        int i7 = i3;
                                        while (true) {
                                            long j5 = jArr[i7];
                                            int i8 = length;
                                            if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                                                int i10 = 0;
                                                while (i10 < i9) {
                                                    if ((j5 & 255) < j4) {
                                                        if1Var.invoke(objArr2[(i7 << 3) + i10]);
                                                    }
                                                    j5 >>= 8;
                                                    i10++;
                                                    j4 = 128;
                                                }
                                                if (i9 == 8) {
                                                    length = i8;
                                                    if (i7 != length) {
                                                        i7++;
                                                        j4 = 128;
                                                    }
                                                }
                                            } else {
                                                length = i8;
                                                if (i7 != length) {
                                                    i7++;
                                                    j4 = 128;
                                                }
                                            }
                                        }
                                    }
                                    x03Var.b();
                                    i6++;
                                    c2 = c3;
                                    i2 = 2;
                                    i3 = 0;
                                    j4 = 128;
                                }
                                c = c2;
                                pp3Var.a = i3;
                            } catch (Throwable th3) {
                                pp3Var.a = false;
                                throw th3;
                            }
                        }
                    }
                    if (!pp3Var.a()) {
                        return j15.a;
                    }
                    c2 = c;
                    i2 = 2;
                    z2 = true;
                    i3 = 0;
                    j4 = 128;
                }
                break;
            case 27:
                o72 o72VarA = ((kn4) this.o).a();
                c72 c72Var = o72VarA.n;
                if (o72VarA.A != ((c13) c72Var.o()).n.p) {
                    w03 w03Var = o72VarA.s;
                    Object[] objArr3 = w03Var.c;
                    long[] jArr2 = w03Var.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j6 = jArr2[i11];
                            if ((((~j6) << 7) & j6 & j2) != j2) {
                                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                int i13 = 0;
                                while (i13 < i12) {
                                    if ((j6 & 255) < 128) {
                                        ((h72) objArr3[(i11 << 3) + i13]).d = true;
                                    }
                                    j6 >>= 8;
                                    i13++;
                                    j2 = j2;
                                }
                                j = j2;
                                if (i12 == 8) {
                                }
                            } else {
                                j = j2;
                            }
                            if (i11 != length2) {
                                i11++;
                                j2 = j;
                            }
                        }
                    }
                    if (c72Var.u != null) {
                        if (!c72Var.R.e) {
                            c72.U(c72Var, false, 7);
                        }
                    } else if (!c72Var.q()) {
                        c72.W(c72Var, false, 7);
                    }
                }
                return j15.a;
            case 28:
                return new BaseInputConnection(((js4) this.o).a, false);
            default:
                ys4 ys4Var = (ys4) this.o;
                ys4Var.L = null;
                fu.C(ys4Var);
                g12.A(ys4Var);
                jz4.z(ys4Var);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ wc(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }
}
