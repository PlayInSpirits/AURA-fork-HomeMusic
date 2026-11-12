package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.Surface;
import android.widget.EditText;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.ui.crash.CrashActivity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef0 implements q43, rc2, qc2, fz, cp3, gz0, bp3, py, ik2, xl2, lm2, ks2, wc0, it2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ef0(boolean z, va4 va4Var, Bundle bundle) {
        this.n = 24;
        this.o = va4Var;
        this.p = bundle;
    }

    @Override // defpackage.q43
    public boolean a(MenuItem menuItem) {
        CrashActivity crashActivity = (CrashActivity) this.o;
        DrawerLayout drawerLayout = (DrawerLayout) this.p;
        int i = CrashActivity.T;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.crash_nav_info) {
            crashActivity.p(new if0(), crashActivity.getString(R.string.ca_info_title));
        } else if (itemId == R.id.crash_nav_logs) {
            crashActivity.p(new jf0(), crashActivity.getString(R.string.ca_logs_title));
        } else if (itemId == R.id.crash_nav_export) {
            crashActivity.p(new gf0(), crashActivity.getString(R.string.ca_export_title));
        }
        drawerLayout.e(false);
        return true;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        int i = this.n;
        Object obj2 = this.p;
        kt2 kt2Var = (kt2) this.o;
        switch (i) {
            case 23:
                cw4 cw4VarB = (cw4) obj2;
                al3 al3Var = (al3) obj;
                bx1 bx1Var = cw4VarB.H;
                if (!bx1Var.isEmpty()) {
                    bw4 bw4VarC = cw4VarB.a().c();
                    o15 it = bx1Var.values().iterator();
                    while (it.hasNext()) {
                        yv4 yv4Var = (yv4) it.next();
                        sv4 sv4Var = (sv4) kt2Var.h.u.get(yv4Var.a.b);
                        if (sv4Var == null || yv4Var.a.a != sv4Var.a) {
                            bw4VarC.a(yv4Var);
                        } else {
                            bw4VarC.a(new yv4(sv4Var, yv4Var.b));
                        }
                    }
                    cw4VarB = bw4VarC.b();
                }
                al3Var.M(cw4VarB);
                break;
            case 24:
            default:
                Surface surface = (Surface) obj2;
                al3 al3Var2 = (al3) obj;
                ((tn2) kt2Var.e.get()).getClass();
                if (surface != null) {
                    jt2 jt2Var = new jt2(surface);
                    kt2Var.j = jt2Var;
                    al3Var2.Q(jt2Var);
                } else {
                    al3Var2.Q(null);
                    kt2Var.j = null;
                }
                break;
            case 25:
                fr2 fr2Var = (fr2) obj2;
                tn2 tn2Var = (tn2) kt2Var.e.get();
                if (tn2Var != null && !tn2Var.l()) {
                    tn2Var.i(fr2Var, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ks2
    public void b(fr2 fr2Var) {
        int i = this.n;
        Object obj = this.p;
        ls2 ls2Var = (ls2) this.o;
        switch (i) {
            case 20:
                lu3 lu3Var = (lu3) obj;
                tn2 tn2Var = ls2Var.g;
                gn2 gn2VarY0 = tn2Var.s.Y0();
                if (gn2VarY0 != null) {
                    tn2Var.e.e(tn2Var.k, tn2Var.B(fr2Var), gn2VarY0.a, lu3Var);
                    break;
                }
                break;
            case 21:
                ((j60) obj).h(ls2Var.g.s);
                break;
            default:
                String str = ((pm2) obj).n;
                if (TextUtils.isEmpty(str)) {
                    l93.q0("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                } else {
                    al3 al3Var = ls2Var.g.s;
                    if (al3Var.S0(17)) {
                        cu4 cu4VarX0 = al3Var.x0();
                        bu4 bu4Var = new bu4();
                        for (int i2 = 0; i2 < cu4VarX0.o(); i2++) {
                            if (TextUtils.equals(cu4VarX0.m(i2, bu4Var, 0L).b.a, str)) {
                                al3Var.N(i2);
                            }
                        }
                    } else {
                        l93.q0("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    }
                }
                break;
        }
    }

    @Override // defpackage.lm2
    public void c(bm2 bm2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.n;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 18:
                bm2Var.o1((lk3) obj2, (jk3) obj);
                break;
            default:
                wa4 wa4Var = (wa4) obj2;
                mi3 mi3Var = (mi3) obj;
                if (bm2Var.Y()) {
                    boolean zEquals = Objects.equals(bm2Var.x, mi3Var);
                    boolean zEquals2 = Objects.equals(bm2Var.w, wa4Var);
                    if (!zEquals || !zEquals2) {
                        bm2Var.w = wa4Var;
                        char c = 1;
                        if (zEquals) {
                            z = false;
                        } else {
                            bm2Var.x = mi3Var;
                            mi3 mi3Var2 = bm2Var.z;
                            mi3 mi3VarY0 = bm2.Y0(mi3Var, bm2Var.y);
                            bm2Var.z = mi3VarY0;
                            z = !mi3VarY0.equals(mi3Var2);
                        }
                        if (!zEquals2 || z) {
                            gy3 gy3Var = bm2Var.u;
                            gy3 gy3Var2 = bm2Var.v;
                            gy3 gy3VarU1 = bm2.u1(bm2Var.t, bm2Var.s, wa4Var, bm2Var.z, bm2Var.I);
                            bm2Var.u = gy3VarU1;
                            bm2Var.v = bm2.t1(gy3VarU1, bm2Var.s, bm2Var.I, wa4Var, bm2Var.z);
                            z2 = !bm2Var.u.equals(gy3Var);
                            z3 = !bm2Var.v.equals(gy3Var2);
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                        if (z) {
                            bm2Var.i.f(13, new cl2(bm2Var, c == true ? 1 : 0));
                        }
                        if (!zEquals2) {
                            sk2 sk2VarF1 = bm2Var.f1();
                            sk2VarF1.getClass();
                            rr2.w(Looper.myLooper() == sk2VarF1.f.getLooper());
                            sk2VarF1.e.l();
                        }
                        if (z3) {
                            sk2 sk2VarF2 = bm2Var.f1();
                            sk2VarF2.getClass();
                            rr2.w(Looper.myLooper() == sk2VarF2.f.getLooper());
                            sk2VarF2.e.getClass();
                        }
                        if (z2) {
                            sk2 sk2VarF3 = bm2Var.f1();
                            sk2VarF3.getClass();
                            rr2.w(Looper.myLooper() == sk2VarF3.f.getLooper());
                            sk2VarF3.e.u();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xl2
    public void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        Object obj = this.p;
        bm2 bm2Var = (bm2) this.o;
        switch (i2) {
            case 11:
                ArrayList arrayList = (ArrayList) obj;
                mm2 mm2Var = bm2Var.c;
                uw1 uw1VarJ = yw1.j();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    uw1VarJ.c(((gn2) arrayList.get(i3)).c(true));
                }
                pu1Var.J(mm2Var, i, new iw(uw1VarJ.f()));
                break;
            case 12:
                pu1Var.m0(bm2Var.c, i, (Surface) obj);
                break;
            case 13:
                pu1Var.y0(bm2Var.c, i, ((do2) obj).c());
                break;
            case 14:
                qh3 qh3Var = (qh3) obj;
                mm2 mm2Var2 = bm2Var.c;
                Bundle bundle = new Bundle();
                bundle.putFloat(qh3.e, qh3Var.a);
                bundle.putFloat(qh3.f, qh3Var.b);
                pu1Var.r0(mm2Var2, i, bundle);
                break;
            default:
                pu1Var.A(bm2Var.c, i, ((cw4) obj).c());
                break;
        }
    }

    @Override // defpackage.ik2
    public int e(Object obj) {
        Context context = (Context) this.o;
        tb1 tb1Var = (tb1) this.p;
        dk2 dk2Var = (dk2) obj;
        String str = dk2Var.b;
        return ((str.equals(tb1Var.n) || str.equals(jk2.c(tb1Var))) && dk2Var.c(context, tb1Var, false) && dk2Var.d(tb1Var)) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:260:0x0492  */
    /* JADX WARN: Code duplicated, block: B:278:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:279:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:287:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:288:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:377:0x0619 A[PHI: r8
  0x0619: PHI (r8v20 int) = (r8v19 int), (r8v18 int), (r8v18 int), (r8v18 int) binds: [B:384:0x062a, B:366:0x0600, B:367:0x0602, B:368:0x0604] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:394:0x063e  */
    /* JADX WARN: Code duplicated, block: B:397:0x066b  */
    /* JADX WARN: Code duplicated, block: B:401:0x067b A[Catch: all -> 0x068a, TryCatch #2 {all -> 0x068a, blocks: (B:399:0x0677, B:401:0x067b, B:404:0x068c, B:405:0x0696, B:407:0x069c, B:409:0x06a9, B:411:0x06ad), top: B:422:0x0677 }] */
    /* JADX WARN: Code duplicated, block: B:407:0x069c A[Catch: all -> 0x068a, TryCatch #2 {all -> 0x068a, blocks: (B:399:0x0677, B:401:0x067b, B:404:0x068c, B:405:0x0696, B:407:0x069c, B:409:0x06a9, B:411:0x06ad), top: B:422:0x0677 }] */
    /* JADX WARN: Code duplicated, block: B:417:0x06b7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:422:0x0677 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [ue1] */
    /* JADX WARN: Type inference failed for: r2v41 */
    @Override // defpackage.rc2
    public void f(Object obj, w71 w71Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        n50 n50Var;
        int i8;
        n50 n50Var2;
        n50 n50Var3;
        int i9;
        int i10;
        int i11;
        int i12;
        ?? r2;
        int i13;
        int i14;
        boolean z2;
        nm0 nm0Var;
        String str;
        Iterator it;
        mm0 mm0Var;
        ho2 ho2Var;
        tb1 tb1Var;
        int i15;
        int i16;
        ow0 ow0Var;
        int i17;
        nj0 nj0Var = (nj0) this.o;
        qi3 qi3Var = (qi3) this.p;
        ho2 ho2Var2 = (ho2) obj;
        SparseArray sparseArray = nj0Var.r;
        SparseArray sparseArray2 = new SparseArray(w71Var.a.size());
        for (int i18 = 0; i18 < w71Var.a.size(); i18++) {
            int iB = w71Var.b(i18);
            q9 q9Var = (q9) sparseArray.get(iB);
            q9Var.getClass();
            sparseArray2.append(iB, q9Var);
        }
        ho2Var2.getClass();
        if (w71Var.a.size() == 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            boolean z3 = true;
            if (i19 >= w71Var.a.size()) {
                break;
            }
            int iB2 = w71Var.b(i19);
            q9 q9Var2 = (q9) sparseArray2.get(iB2);
            q9Var2.getClass();
            nm0 nm0Var2 = ho2Var2.c;
            if (iB2 == 0) {
                synchronized (nm0Var2) {
                    try {
                        nm0Var2.d.getClass();
                        cu4 cu4Var = nm0Var2.e;
                        nm0Var2.e = q9Var2.b;
                        Iterator it2 = nm0Var2.c.values().iterator();
                        while (it2.hasNext()) {
                            mm0 mm0Var2 = (mm0) it2.next();
                            if (!mm0Var2.b(cu4Var, nm0Var2.e) || mm0Var2.a(q9Var2)) {
                                it2.remove();
                                if (mm0Var2.a.equals(nm0Var2.f)) {
                                    nm0Var2.a(mm0Var2);
                                }
                                if (mm0Var2.e) {
                                    nm0Var2.d.d(q9Var2, mm0Var2.a);
                                }
                            }
                        }
                        nm0Var2.d(q9Var2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iB2 == 11) {
                int i20 = ho2Var2.l;
                synchronized (nm0Var2) {
                    try {
                        nm0Var2.d.getClass();
                        if (i20 != 0) {
                            z3 = false;
                        }
                        Iterator it3 = nm0Var2.c.values().iterator();
                        while (it3.hasNext()) {
                            mm0 mm0Var3 = (mm0) it3.next();
                            if (mm0Var3.a(q9Var2)) {
                                it3.remove();
                                boolean zEquals = mm0Var3.a.equals(nm0Var2.f);
                                if (zEquals) {
                                    nm0Var2.a(mm0Var3);
                                }
                                if (mm0Var3.e) {
                                    if (z3 && zEquals) {
                                        boolean z4 = mm0Var3.f;
                                    }
                                    nm0Var2.d.d(q9Var2, mm0Var3.a);
                                }
                            }
                        }
                        nm0Var2.d(q9Var2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                nm0Var2.e(q9Var2);
            }
            i19++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (w71Var.a.get(0)) {
            q9 q9Var3 = (q9) sparseArray2.get(0);
            q9Var3.getClass();
            if (ho2Var2.k != null) {
                ho2Var2.c(q9Var3.b, q9Var3.d);
            }
        }
        if (w71Var.a.get(2) && ho2Var2.k != null) {
            vw1 vw1VarListIterator = qi3Var.e0().a.listIterator(0);
            loop4: while (true) {
                if (!vw1VarListIterator.hasNext()) {
                    ow0Var = null;
                    break;
                }
                iw4 iw4Var = (iw4) vw1VarListIterator.next();
                for (int i21 = 0; i21 < iw4Var.a; i21++) {
                    if (iw4Var.e[i21] && (ow0Var = iw4Var.a(i21).r) != null) {
                        break loop4;
                    }
                }
            }
            if (ow0Var != null) {
                PlaybackMetrics.Builder builder = ho2Var2.k;
                String str2 = f35.a;
                PlaybackMetrics.Builder builderH = fo2.h(builder);
                int i22 = 0;
                while (true) {
                    if (i22 >= ow0Var.q) {
                        i17 = 1;
                        break;
                    }
                    UUID uuid = ow0Var.n[i22].o;
                    if (uuid.equals(ax.d)) {
                        i17 = 3;
                        break;
                    } else if (uuid.equals(ax.e)) {
                        i17 = 2;
                        break;
                    } else {
                        if (uuid.equals(ax.c)) {
                            i17 = 6;
                            break;
                        }
                        i22++;
                    }
                }
                builderH.setDrmType(i17);
            }
        }
        if (w71Var.a.get(1011)) {
            ho2Var2.A++;
        }
        PlaybackException playbackException = ho2Var2.o;
        if (playbackException == null) {
            i12 = 1;
            i2 = 27;
            i7 = 13;
            i3 = 6;
            i4 = 8;
            i5 = 7;
            i6 = 9;
        } else {
            int i23 = playbackException.n;
            Context context = ho2Var2.a;
            boolean z5 = ho2Var2.w == 4;
            if (i23 == 1001) {
                n50Var = new n50(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z = exoPlaybackException.w == 1;
                    i = exoPlaybackException.A;
                } else {
                    z = false;
                    i = 0;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    i2 = 27;
                    i3 = 6;
                    i4 = 8;
                    i5 = 7;
                    i6 = 9;
                    if (z && (i == 0 || i == 1)) {
                        n50Var3 = new n50(35, 0);
                    } else if (z && i == 3) {
                        n50Var3 = new n50(15, 0);
                    } else if (z && i == 2) {
                        n50Var3 = new n50(23, 0);
                    } else if (cause instanceof MediaCodecRenderer$DecoderInitializationException) {
                        i7 = 13;
                        n50Var = new n50(13, f35.z(((MediaCodecRenderer$DecoderInitializationException) cause).q));
                    } else {
                        i7 = 13;
                        if (cause instanceof MediaCodecDecoderException) {
                            n50Var2 = new n50(14, ((MediaCodecDecoderException) cause).n);
                        } else if (cause instanceof OutOfMemoryError) {
                            n50Var = new n50(14, 0);
                        } else if (cause instanceof AudioSink$InitializationException) {
                            n50Var = new n50(17, 0);
                        } else if (cause instanceof AudioSink$WriteException) {
                            n50Var = new n50(18, ((AudioSink$WriteException) cause).n);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (f35.y(errorCode)) {
                                case 6002:
                                    i8 = 24;
                                    break;
                                case 6003:
                                    i8 = 28;
                                    break;
                                case 6004:
                                    i8 = 25;
                                    break;
                                case 6005:
                                    i8 = 26;
                                    break;
                                default:
                                    i8 = 27;
                                    break;
                            }
                            n50Var2 = new n50(i8, errorCode);
                        } else {
                            n50Var = new n50(22, 0);
                        }
                        n50Var = n50Var2;
                    }
                    n50Var = n50Var3;
                    i7 = 13;
                } else if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                    n50Var = new n50(5, ((HttpDataSource$InvalidResponseCodeException) cause).p);
                } else {
                    if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                        i2 = 27;
                        i9 = 9;
                        i10 = 7;
                        i3 = 6;
                        i4 = 8;
                        n50Var = new n50(z5 ? 10 : 11, 0);
                    } else {
                        boolean z6 = cause instanceof HttpDataSource$HttpDataSourceException;
                        if (z6 || (cause instanceof UdpDataSource$UdpDataSourceException)) {
                            i2 = 27;
                            i9 = 9;
                            if (v53.a(context).b() == 1) {
                                n50Var = new n50(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i3 = 6;
                                    n50Var = new n50(6, 0);
                                    i6 = 9;
                                    i7 = 13;
                                    i4 = 8;
                                    i5 = 7;
                                } else {
                                    i3 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i10 = 7;
                                        n50Var = new n50(7, 0);
                                    } else {
                                        i10 = 7;
                                        if (z6 && ((HttpDataSource$HttpDataSourceException) cause).o == 1) {
                                            n50Var = new n50(4, 0);
                                        } else {
                                            n50Var = new n50(8, 0);
                                            i4 = 8;
                                        }
                                    }
                                    i6 = 9;
                                    i5 = i10;
                                    i7 = 13;
                                    i4 = 8;
                                }
                            }
                        } else if (i23 == 1002) {
                            n50Var = new n50(21, 0);
                        } else {
                            if (cause instanceof DrmSession$DrmSessionException) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int iZ = f35.z(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (f35.y(iZ)) {
                                        case 6002:
                                            i11 = 24;
                                            break;
                                        case 6003:
                                            i11 = 28;
                                            break;
                                        case 6004:
                                            i11 = 25;
                                            break;
                                        case 6005:
                                            i11 = 26;
                                            break;
                                        default:
                                            i11 = 27;
                                            break;
                                    }
                                    n50Var = new n50(i11, iZ);
                                } else if (cause3 instanceof MediaDrmResetException) {
                                    i2 = 27;
                                    n50Var = new n50(27, 0);
                                } else {
                                    i2 = 27;
                                    if (cause3 instanceof NotProvisionedException) {
                                        n50Var = new n50(24, 0);
                                    } else if (cause3 instanceof DeniedByServerException) {
                                        n50Var = new n50(29, 0);
                                    } else if (cause3 instanceof UnsupportedDrmException) {
                                        n50Var = new n50(23, 0);
                                    } else {
                                        n50Var = cause3 instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new n50(28, 0) : new n50(30, 0);
                                    }
                                }
                            } else {
                                i2 = 27;
                                if ((cause instanceof FileDataSource$FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause4 = cause.getCause();
                                    cause4.getClass();
                                    Throwable cause5 = cause4.getCause();
                                    n50Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new n50(32, 0) : new n50(31, 0);
                                } else {
                                    i9 = 9;
                                    n50Var = new n50(9, 0);
                                }
                            }
                            i7 = 13;
                            i3 = 6;
                            i4 = 8;
                            i5 = 7;
                            i6 = 9;
                        }
                        i6 = i9;
                        i7 = 13;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                    }
                    i6 = i9;
                    i5 = i10;
                    i7 = 13;
                }
                ho2Var2.b.execute(new ws1(25, ho2Var2, go2.f().setTimeSinceCreatedMillis(jElapsedRealtime - ho2Var2.e).setErrorCode(n50Var.a).setSubErrorCode(n50Var.b).setException(playbackException).build()));
                i12 = 1;
                ho2Var2.B = true;
                ho2Var2.o = null;
            }
            i2 = 27;
            i7 = 13;
            i3 = 6;
            i4 = 8;
            i5 = 7;
            i6 = 9;
            ho2Var2.b.execute(new ws1(25, ho2Var2, go2.f().setTimeSinceCreatedMillis(jElapsedRealtime - ho2Var2.e).setErrorCode(n50Var.a).setSubErrorCode(n50Var.b).setException(playbackException).build()));
            i12 = 1;
            ho2Var2.B = true;
            ho2Var2.o = null;
        }
        if (w71Var.a.get(2)) {
            jw4 jw4VarE0 = qi3Var.e0();
            boolean zA = jw4VarE0.a(2);
            boolean zA2 = jw4VarE0.a(i12);
            boolean zA3 = jw4VarE0.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    tb1Var = null;
                } else {
                    tb1Var = null;
                    if (!Objects.equals(ho2Var2.s, null)) {
                        int i24 = ho2Var2.s == null ? 1 : 0;
                        ho2Var2.s = null;
                        i7 = i7;
                        i13 = 10;
                        ho2Var2.e(1, jElapsedRealtime, null, i24);
                    }
                    if (!zA2 && !Objects.equals(ho2Var2.t, tb1Var)) {
                        if (ho2Var2.t == null) {
                            i16 = 1;
                        } else {
                            i16 = 0;
                        }
                        ho2Var2.t = tb1Var;
                        ho2Var2.e(0, jElapsedRealtime, tb1Var, i16);
                    }
                    if (!zA3 && !Objects.equals(ho2Var2.u, tb1Var)) {
                        if (ho2Var2.u == null) {
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                        ho2Var2.u = tb1Var;
                        ho2Var2.e(2, jElapsedRealtime, tb1Var, i15);
                    }
                    r2 = tb1Var;
                }
                i13 = 10;
                if (!zA2) {
                    if (ho2Var2.t == null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    ho2Var2.t = tb1Var;
                    ho2Var2.e(0, jElapsedRealtime, tb1Var, i16);
                }
                if (!zA3) {
                    if (ho2Var2.u == null) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                    ho2Var2.u = tb1Var;
                    ho2Var2.e(2, jElapsedRealtime, tb1Var, i15);
                }
                r2 = tb1Var;
            } else {
                i7 = i7;
                r2 = 0;
                i13 = 10;
                i2 = i2;
            }
        } else {
            i7 = i7;
            r2 = 0;
            i13 = 10;
            i2 = i2;
        }
        if (ho2Var2.a(ho2Var2.p)) {
            ue1 ue1Var = ho2Var2.p;
            tb1 tb1Var2 = (tb1) ue1Var.p;
            if (tb1Var2.v != -1) {
                int i25 = ue1Var.o;
                if (!Objects.equals(ho2Var2.s, tb1Var2)) {
                    int i26 = (ho2Var2.s == null && i25 == 0) ? 1 : i25;
                    ho2Var2.s = tb1Var2;
                    ho2Var2.e(1, jElapsedRealtime, tb1Var2, i26);
                }
                ho2Var2.p = r2;
            }
        }
        if (ho2Var2.a(ho2Var2.q)) {
            ue1 ue1Var2 = ho2Var2.q;
            tb1 tb1Var3 = (tb1) ue1Var2.p;
            int i27 = ue1Var2.o;
            if (!Objects.equals(ho2Var2.t, tb1Var3)) {
                int i28 = (ho2Var2.t == null && i27 == 0) ? 1 : i27;
                ho2Var2.t = tb1Var3;
                ho2Var2.e(0, jElapsedRealtime, tb1Var3, i28);
            }
            ho2Var2.q = r2;
        }
        if (ho2Var2.a(ho2Var2.r)) {
            ue1 ue1Var3 = ho2Var2.r;
            tb1 tb1Var4 = (tb1) ue1Var3.p;
            int i29 = ue1Var3.o;
            if (!Objects.equals(ho2Var2.u, tb1Var4)) {
                int i30 = (ho2Var2.u == null && i29 == 0) ? 1 : i29;
                ho2Var2.u = tb1Var4;
                ho2Var2.e(2, jElapsedRealtime, tb1Var4, i30);
            }
            ho2Var2.r = r2;
        }
        switch (v53.a(ho2Var2.a).b()) {
            case 0:
                i14 = 0;
                break;
            case 1:
                i14 = i6;
                break;
            case 2:
                i14 = 2;
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                i14 = 4;
                break;
            case 4:
                i14 = 5;
                break;
            case 5:
                i14 = i3;
                break;
            case 6:
            case 8:
            default:
                i14 = 1;
                break;
            case 7:
                i14 = 3;
                break;
            case 9:
                i14 = i4;
                break;
            case 10:
                i14 = i5;
                break;
        }
        if (i14 != ho2Var2.n) {
            ho2Var2.n = i14;
            ho2Var2.b.execute(new ws1(24, ho2Var2, go2.e().setNetworkType(i14).setTimeSinceCreatedMillis(jElapsedRealtime - ho2Var2.e).build()));
        }
        if (qi3Var.g() != 2) {
            ho2Var2.v = false;
        }
        if (qi3Var.U() == null) {
            ho2Var2.x = false;
        } else if (w71Var.a.get(i13)) {
            ho2Var2.x = true;
        }
        int iG = qi3Var.g();
        if (ho2Var2.v) {
            i13 = 5;
        } else if (ho2Var2.x) {
            i13 = i7;
        } else {
            if (iG != 4) {
                int i31 = 2;
                if (iG == 2) {
                    int i32 = ho2Var2.m;
                    if (i32 == 0 || i32 == 2 || i32 == 12) {
                        i13 = i31;
                    } else if (!qi3Var.q()) {
                        i13 = i5;
                    } else if (qi3Var.v0() == 0) {
                        i13 = i3;
                    }
                } else {
                    i31 = 3;
                    if (iG != 3) {
                        z2 = true;
                        i13 = (iG != 1 || ho2Var2.m == 0) ? ho2Var2.m : 12;
                    } else if (!qi3Var.q()) {
                        i13 = 4;
                    } else if (qi3Var.v0() != 0) {
                        i13 = i6;
                    } else {
                        i13 = i31;
                    }
                }
                if (ho2Var2.m != i13) {
                    ho2Var2.m = i13;
                    ho2Var2.B = z2;
                    ho2Var2.b.execute(new ws1(i2, ho2Var2, hd0.k().setState(ho2Var2.m).setTimeSinceCreatedMillis(jElapsedRealtime - ho2Var2.e).build()));
                }
                if (w71Var.a.get(1028)) {
                    nm0Var = ho2Var2.c;
                    q9 q9Var4 = (q9) sparseArray2.get(1028);
                    q9Var4.getClass();
                    synchronized (nm0Var) {
                        try {
                            str = nm0Var.f;
                            if (str != null) {
                                mm0 mm0Var4 = (mm0) nm0Var.c.get(str);
                                mm0Var4.getClass();
                                nm0Var.a(mm0Var4);
                            }
                            it = nm0Var.c.values().iterator();
                            while (it.hasNext()) {
                                mm0Var = (mm0) it.next();
                                it.remove();
                                if (!mm0Var.e && (ho2Var = nm0Var.d) != null) {
                                    ho2Var.d(q9Var4, mm0Var.a);
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            i13 = 11;
        }
        z2 = true;
        if (ho2Var2.m != i13) {
            ho2Var2.m = i13;
            ho2Var2.B = z2;
            ho2Var2.b.execute(new ws1(i2, ho2Var2, hd0.k().setState(ho2Var2.m).setTimeSinceCreatedMillis(jElapsedRealtime - ho2Var2.e).build()));
        }
        if (w71Var.a.get(1028)) {
            nm0Var = ho2Var2.c;
            q9 q9Var5 = (q9) sparseArray2.get(1028);
            q9Var5.getClass();
            synchronized (nm0Var) {
                str = nm0Var.f;
                if (str != null) {
                    mm0 mm0Var5 = (mm0) nm0Var.c.get(str);
                    mm0Var5.getClass();
                    nm0Var.a(mm0Var5);
                }
                it = nm0Var.c.values().iterator();
                while (it.hasNext()) {
                    mm0Var = (mm0) it.next();
                    it.remove();
                    if (!mm0Var.e) {
                    }
                }
            }
        }
    }

    @Override // defpackage.bp3
    public boolean g(Preference preference, Object obj) {
        h62 h62Var = (h62) this.o;
        EditTextPreference editTextPreference = (EditTextPreference) this.p;
        String string = qm4.K0(obj.toString()).toString();
        if (string.length() != 0 && string.length() <= 40) {
            boolean z = LanReceiverService.y;
            Context context = h62Var.t0;
            if (context == null) {
                h12.Q("app");
                throw null;
            }
            context.getSharedPreferences("lan-playback", 0).edit().putString("name", string).apply();
            editTextPreference.E(string);
            editTextPreference.x(string);
            if (LanReceiverService.y) {
                Context context2 = h62Var.t0;
                if (context2 == null) {
                    h12.Q("app");
                    throw null;
                }
                Toast.makeText(context2, R.string.lan_name_saved, 1).show();
            }
        } else {
            h62Var.s0(R.string.lan_name_required);
        }
        return false;
    }

    @Override // defpackage.it2
    public Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        int i2 = this.n;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i2) {
            case 24:
                return tn2Var.q(fr2Var, (va4) obj2, (Bundle) obj);
            case 25:
            case 27:
            default:
                return tn2Var.l() ? new mw1(new ab4(-100)) : f35.h0((ic2) ((it2) obj2).h(tn2Var, fr2Var, i), new eg0(tn2Var, fr2Var, (zr2) obj, 8));
            case 26:
                return tn2Var.e.e(tn2Var.k, tn2Var.B(fr2Var), (String) obj2, (lu3) obj);
            case 28:
                return tn2Var.y(fr2Var, (String) obj2, (jn2) obj);
        }
    }

    @Override // defpackage.gz0
    public void i(EditText editText) {
        EditTextPreference editTextPreference = (EditTextPreference) this.o;
        String str = (String) this.p;
        editText.getClass();
        editText.setInputType(17);
        editText.setSingleLine();
        if (editTextPreference.h0 == null) {
            editText.setText(str);
        }
        editText.setSelection(editText.getText().length());
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (i) {
            case 2:
                q9 q9Var = (q9) obj3;
                un2 un2Var = (un2) obj2;
                ho2 ho2Var = (ho2) obj;
                ho2Var.getClass();
                mt2 mt2Var = q9Var.d;
                if (mt2Var != null) {
                    tb1 tb1Var = un2Var.c;
                    tb1Var.getClass();
                    int i2 = un2Var.d;
                    nm0 nm0Var = ho2Var.c;
                    cu4 cu4Var = q9Var.b;
                    mt2Var.getClass();
                    ue1 ue1Var = new ue1(i2, 6, tb1Var, nm0Var.c(cu4Var, mt2Var));
                    int i3 = un2Var.b;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            ho2Var.q = ue1Var;
                            break;
                        } else if (i3 != 2) {
                            if (i3 == 3) {
                                ho2Var.r = ue1Var;
                                break;
                            }
                        }
                    }
                    ho2Var.p = ue1Var;
                    break;
                }
                break;
            case 15:
                ((oi3) obj).t(((Integer) obj2).intValue(), (gn2) obj3);
                break;
            default:
                ((oi3) obj).t(((Integer) obj2).intValue(), ((lk3) ((ml3) obj3).a).s());
                break;
        }
    }

    @Override // defpackage.cp3
    public void j(Preference preference) {
        int i = this.n;
        int i2 = 1;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 4:
                Preference preference2 = (Preference) obj2;
                vb4 vb4Var = (vb4) obj;
                preference2.x(vb4Var.s(R.string.homemusic_settings_traffic_hint));
                io1.a.execute(new ts1(vb4Var, preference2, i2));
                return;
            case 5:
            default:
                h62 h62Var = (h62) obj2;
                NsdServiceInfo nsdServiceInfo = ((c62) obj).a;
                if (h62Var.N0 || h62Var.O0) {
                    return;
                }
                h62Var.N0 = true;
                h62Var.s0(R.string.lan_connecting);
                long j = h62Var.M0;
                try {
                    NsdManager nsdManager = h62Var.u0;
                    if (nsdManager != null) {
                        nsdManager.resolveService(nsdServiceInfo, new f62(h62Var, j, nsdServiceInfo));
                        return;
                    } else {
                        h12.Q("nsd");
                        throw null;
                    }
                } catch (Exception unused) {
                    h62Var.N0 = false;
                    h62Var.s0(R.string.lan_connection_error);
                    return;
                }
            case 6:
                ((h62) obj2).r0((h52) obj);
                return;
        }
    }

    @Override // defpackage.py
    public Object k(oy oyVar) {
        Executor executor = (Executor) this.o;
        uy1 uy1Var = (uy1) this.p;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        jc2 jc2Var = new jc2(atomicBoolean, 0);
        n04 n04Var = oyVar.c;
        if (n04Var != null) {
            n04Var.f(jc2Var, fq0.n);
        }
        executor.execute(new v6(atomicBoolean, oyVar, uy1Var, 24));
        return "setForegroundAsync";
    }

    @Override // defpackage.fz
    public void onCancel() {
        Animator animator = (Animator) this.o;
        pj4 pj4Var = (pj4) this.p;
        animator.end();
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Animator from operation " + pj4Var + " has been canceled.");
        }
    }

    public /* synthetic */ ef0(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }
}
