package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOut;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ qa1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    private final void a() {
        synchronized (((MediaLibraryService) this.o).n) {
        }
    }

    private final void b() {
        hw2 hw2Var = (hw2) this.o;
        synchronized (hw2Var.p) {
            try {
                fw2 fw2Var = hw2Var.s;
                if (fw2Var != null) {
                    fw2Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d A[Catch: all -> 0x0021, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001b, B:15:0x0027, B:19:0x002d, B:25:0x003a, B:27:0x003e, B:29:0x0044, B:31:0x004e, B:33:0x0058, B:35:0x0069, B:34:0x005d, B:36:0x006b, B:38:0x007f, B:40:0x0087), top: B:48:0x0017 }] */
    private final void c() {
        String strV;
        TelephonyManager telephonyManager;
        u53 u53Var = (u53) this.o;
        uj0 uj0Var = (uj0) u53Var.a.get();
        if (uj0Var != null) {
            int iB = u53Var.c.b();
            vj0 vj0Var = uj0Var.a;
            synchronized (vj0Var) {
                int i = vj0Var.A;
                if (i == 0 || vj0Var.r) {
                    if (i != iB || vj0Var.B == null) {
                        vj0Var.A = iB;
                        if (iB != 1 && iB != 0 && iB != 8) {
                            if (vj0Var.B == null) {
                                Context context = vj0Var.n;
                                String str = f35.a;
                                if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                    strV = rr2.V(Locale.getDefault().getCountry());
                                } else {
                                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        strV = rr2.V(Locale.getDefault().getCountry());
                                    } else {
                                        strV = rr2.V(networkCountryIso);
                                    }
                                }
                                vj0Var.B = strV;
                            }
                            vj0Var.y = vj0Var.e(iB);
                            vj0Var.q.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            vj0Var.f(vj0Var.t > 0 ? (int) (jElapsedRealtime - vj0Var.u) : 0, vj0Var.v, vj0Var.y);
                            vj0Var.u = jElapsedRealtime;
                            vj0Var.v = 0L;
                            vj0Var.x = 0L;
                            vj0Var.w = 0L;
                            fg4 fg4Var = vj0Var.s;
                            ((ArrayList) fg4Var.f).clear();
                            fg4Var.b = -1;
                            fg4Var.c = 0;
                            fg4Var.d = 0;
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.n) {
            case 0:
                ra1 ra1Var = (ra1) this.o;
                synchronized (ra1Var.q) {
                    try {
                        if (ra1Var.u == null) {
                            return;
                        }
                        try {
                            ib1 ib1VarC = ra1Var.c();
                            int i2 = ib1VarC.f;
                            if (i2 == 2) {
                                synchronized (ra1Var.q) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                Method method = ov4.b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                y41 y41Var = ra1Var.p;
                                Context context = ra1Var.n;
                                y41Var.getClass();
                                ib1[] ib1VarArr = {ib1VarC};
                                vr1 vr1Var = d05.a;
                                Trace.beginSection(xl.N("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceF = d05.a.f(context, ib1VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferN = wr1.N(ra1Var.n, ib1VarC.a);
                                    if (mappedByteBufferN == null || typefaceF == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        na4 na4Var = new na4(typefaceF, fh0.s(mappedByteBufferN));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (ra1Var.q) {
                                            try {
                                                bu buVar = ra1Var.u;
                                                if (buVar != null) {
                                                    buVar.v(na4Var);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        ra1Var.b();
                                        return;
                                    } catch (Throwable th2) {
                                        Method method2 = ov4.b;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                Method method3 = ov4.b;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (ra1Var.q) {
                                try {
                                    bu buVar2 = ra1Var.u;
                                    if (buVar2 != null) {
                                        buVar2.u(th5);
                                    }
                                    ra1Var.b();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 1:
                kc1 kc1Var = (kc1) this.o;
                kc1Var.d0.s.s(kc1Var.q);
                kc1Var.q = null;
                return;
            case 2:
                ((ui1) this.o).k();
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((om1) this.o).k();
                return;
            case 4:
                ((fo1) this.o).w();
                return;
            case 5:
                ((ap1) this.o).b.j0();
                return;
            case 6:
                ((cp1) ((i4) ((np0) this.o).b).o).j0();
                return;
            case 7:
                ((ap1) this.o).b.j0();
                return;
            case 8:
                ((bp1) this.o).c.j0();
                return;
            case 9:
                ((ap1) this.o).b.j0();
                return;
            case 10:
                ((bp1) this.o).c.j0();
                return;
            case 11:
                gp1 gp1Var = (gp1) this.o;
                jn3 jn3Var = gp1Var.n0;
                if (jn3Var != null) {
                    le1 le1VarV = gp1Var.v();
                    jn3Var.c.getClass();
                    k03 k03VarL = hh3.l(null, false);
                    k03 k03Var = jn3Var.e;
                    Objects.requireNonNull(k03Var);
                    k03VarL.e(le1VarV, new g7(k03Var, i));
                }
                jn3 jn3Var2 = gp1Var.n0;
                if (jn3Var2 != null) {
                    le1 le1VarV2 = gp1Var.v();
                    jn3Var2.c.getClass();
                    k03 k03VarK = hh3.k();
                    k03 k03Var2 = jn3Var2.d;
                    Objects.requireNonNull(k03Var2);
                    k03VarK.e(le1VarV2, new g7(k03Var2, i));
                    return;
                }
                return;
            case 12:
                hp1 hp1Var = (hp1) this.o;
                iu3 iu3Var = hp1Var.n0;
                if (iu3Var != null) {
                    le1 le1VarV3 = hp1Var.v();
                    k03 k03VarJ = iu3Var.c.j();
                    k03 k03Var3 = iu3Var.d;
                    Objects.requireNonNull(k03Var3);
                    k03VarJ.e(le1VarV3, new g7(k03Var3, i));
                    return;
                }
                return;
            case 13:
                ps1 ps1Var = (ps1) this.o;
                oh3 oh3VarL = ps1Var.l(ps1Var.n.a());
                rs1 rs1Var = rs1.a;
                b00 b00Var = b00.a;
                rs1.a(b00.a(), oh3VarL != null ? oh3VarL.a : null);
                return;
            case 14:
                Context applicationContext = ((vb4) this.o).Z().getApplicationContext();
                applicationContext.getClass();
                gi1.W(applicationContext);
                return;
            case 15:
                WaveOut waveOut = (WaveOut) this.o;
                zr1 zr1Var = xt1.e;
                if (zr1Var != null) {
                    zr1Var.invoke(waveOut);
                    return;
                }
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                IndexFragment indexFragment = (IndexFragment) this.o;
                Toast.makeText(indexFragment.Z(), indexFragment.s(R.string.folder_play_no_songs), 0).show();
                return;
            case 17:
                s22 s22Var = (s22) this.o;
                if (s22Var != null) {
                    s22Var.f(null);
                    return;
                }
                return;
            case 18:
                ((sk2) this.o).Y0();
                return;
            case 19:
                ((vo2) this.o).n = -1;
                return;
            case 20:
                ((uq2) this.o).b();
                return;
            case 21:
                a();
                return;
            case 22:
                b();
                return;
            case 23:
                qp4 qp4Var = (qp4) this.o;
                ah2 ah2Var = (ah2) qp4Var.a;
                if (ah2Var != null) {
                    ah2Var.b((zg2) qp4Var.b, (View) qp4Var.c, true);
                    return;
                }
                return;
            case 24:
                c();
                return;
            case 25:
                ((ki3) this.o).m--;
                return;
            case 26:
                PlayerControlView playerControlView = (PlayerControlView) this.o;
                float[] fArr = PlayerControlView.U0;
                playerControlView.n();
                return;
            case 27:
                PlayerControllerFragment playerControllerFragment = (PlayerControllerFragment) this.o;
                try {
                    bj2 bj2Var = (bj2) playerControllerFragment.M0.get();
                    ((PlayerControlView) playerControllerFragment.l0.p).setPlayer(u52.c().a ? playerControllerFragment.m0 : bj2Var);
                    App.b().getClass();
                    bj2Var.s(App.c().getBoolean("shuffle_mode", false));
                    App.b().getClass();
                    bj2Var.p0(App.c().getInt("repeat_mode", 0));
                    playerControllerFragment.n0(bj2Var);
                    playerControllerFragment.q0(bj2Var.K0());
                    playerControllerFragment.p0(bj2Var.K0());
                    bj2Var.v(new zj3(playerControllerFragment, bj2Var));
                    playerControllerFragment.E0.setOnClickListener(new j8(15, playerControllerFragment, bj2Var));
                    yf4.c().h = new vj3(playerControllerFragment);
                    playerControllerFragment.x0();
                    playerControllerFragment.v0.setOnClickListener(new rj3(playerControllerFragment, 6));
                    playerControllerFragment.w0.setOnClickListener(new rj3(playerControllerFragment, 7));
                    playerControllerFragment.m0();
                    i61 i61Var = playerControllerFragment.l0;
                    if (i61Var != null) {
                        fu.K((LinearLayout) i61Var.o, bj2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 28:
                ey eyVar = ((hk3) this.o).l0;
                if (eyVar != null) {
                    ((Button) eyVar.h).setVisibility(8);
                    return;
                }
                return;
            default:
                PlaylistPageFragment playlistPageFragment = (PlaylistPageFragment) this.o;
                if (playlistPageFragment.l0 == null) {
                    return;
                }
                int dimension = (int) playlistPageFragment.r().getDimension(R.dimen.bottom_sheet_behavior_peek_height);
                View decorView = playlistPageFragment.X().getWindow().getDecorView();
                WeakHashMap weakHashMap = j65.a;
                pb5 pb5VarA = b65.a(decorView);
                i = pb5VarA != null ? pb5VarA.a.h(519).d : 0;
                RecyclerView recyclerView = playlistPageFragment.l0.n;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), playlistPageFragment.l0.n.getPaddingTop(), playlistPageFragment.l0.n.getPaddingRight(), i + dimension);
                return;
        }
    }
}
