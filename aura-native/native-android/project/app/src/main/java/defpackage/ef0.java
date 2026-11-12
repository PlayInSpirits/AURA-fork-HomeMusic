package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.content.Context
 *  android.media.DeniedByServerException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaDrm$MediaDrmStateException
 *  android.media.MediaDrmResetException
 *  android.media.NotProvisionedException
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.net.nsd.NsdManager
 *  android.net.nsd.NsdManager$ResolveListener
 *  android.net.nsd.NsdServiceInfo
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.system.ErrnoException
 *  android.system.OsConstants
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.MenuItem
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.widget.EditText
 *  android.widget.Toast
 */
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
import android.view.SurfaceHolder;
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
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.ui.crash.CrashActivity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ef0
implements q43,
rc2,
qc2,
fz,
cp3,
gz0,
bp3,
py,
ik2,
xl2,
lm2,
ks2,
wc0,
it2 {
    public final int n;
    public final Object o;
    public final Object p;

    public /* synthetic */ ef0(int n16, Object object, Object object2) {
        this.n = n16;
        this.o = object;
        this.p = object2;
    }

    public /* synthetic */ ef0(boolean bl5, va4 va42, Bundle bundle) {
        this.n = 24;
        this.o = va42;
        this.p = bundle;
    }

    @Override
    public boolean a(MenuItem menuItem) {
        CrashActivity crashActivity = (CrashActivity)this.o;
        DrawerLayout drawerLayout = (DrawerLayout)((Object)this.p);
        int n16 = CrashActivity.T;
        n16 = menuItem.getItemId();
        if (n16 == 2131362186) {
            crashActivity.p(new if0(), crashActivity.getString(2131951774));
        } else if (n16 == 2131362187) {
            crashActivity.p(new jf0(), crashActivity.getString(2131951777));
        } else if (n16 == 2131362185) {
            crashActivity.p(new gf0(), crashActivity.getString(2131951767));
        }
        drawerLayout.e(false);
        return true;
    }

    @Override
    public void accept(Object object) {
        int n16 = this.n;
        Object object2 = this.p;
        kt2 kt22 = (kt2)this.o;
        switch (n16) {
            default: {
                object2 = (Surface)object2;
                object = (al3)object;
                ((tn2)kt22.e.get()).getClass();
                if (object2 == null) {
                    ((al3)object).Q(null);
                    kt22.j = null;
                } else {
                    kt22.j = object2 = new jt2((Surface)object2);
                    ((al3)object).Q((SurfaceHolder)object2);
                }
                return;
            }
            case 25: {
                object2 = (fr2)object2;
                object = (al3)object;
                object = (tn2)kt22.e.get();
                if (object != null && !((tn2)object).l()) {
                    ((tn2)object).i((fr2)object2, false);
                }
                return;
            }
            case 23: 
        }
        object2 = (cw4)object2;
        al3 al32 = (al3)object;
        Object object3 = ((cw4)object2).H;
        if (((bx1)object3).isEmpty()) {
            object = object2;
        } else {
            object = ((cw4)object2).a().c();
            object3 = ((bx1)object3).f().h();
            while (object3.hasNext()) {
                object2 = (yv4)object3.next();
                sv4 sv42 = ((yv4)object2).a;
                sv42 = (sv4)kt22.h.u.get(sv42.b);
                if (sv42 != null && ((yv4)object2).a.a == sv42.a) {
                    ((bw4)object).a(new yv4(sv42, ((yv4)object2).b));
                    continue;
                }
                ((bw4)object).a((yv4)object2);
            }
            object = ((bw4)object).b();
        }
        al32.M((cw4)object);
    }

    @Override
    public void b(fr2 object) {
        int n16 = this.n;
        Object object2 = this.p;
        Object object3 = (ls2)this.o;
        switch (n16) {
            default: {
                object = ((pm2)object2).n;
                if (TextUtils.isEmpty((CharSequence)object)) {
                    l93.q0("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                } else {
                    object3 = ((ls2)object3).g.s;
                    if (!((al3)object3).S0(17)) {
                        l93.q0("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    } else {
                        cu4 cu42 = ((al3)object3).x0();
                        object2 = new bu4();
                        for (n16 = 0; n16 < cu42.o(); ++n16) {
                            if (!TextUtils.equals((CharSequence)cu42.m((int)n16, (bu4)object2, (long)0L).b.a, (CharSequence)object)) continue;
                            ((al3)object3).N(n16);
                            break;
                        }
                    }
                }
                return;
            }
            case 21: {
                ((j60)object2).h(((ls2)object3).g.s);
                return;
            }
            case 20: 
        }
        object2 = (lu3)object2;
        object3 = ((ls2)object3).g;
        Object object4 = ((tn2)object3).s.Y0();
        if (object4 != null) {
            object4 = ((gn2)object4).a;
            ((tn2)object3).e.e(((tn2)object3).k, ((tn2)object3).B((fr2)object), (String)object4, (lu3)object2);
        }
    }

    @Override
    public void c(bm2 object) {
        int n16 = this.n;
        Object object2 = this.p;
        Object object3 = this.o;
        switch (n16) {
            default: {
                object3 = (wa4)object3;
                Object object4 = (mi3)object2;
                if (((bm2)object).Y()) {
                    boolean bl5 = Objects.equals(((bm2)object).x, object4);
                    boolean bl6 = Objects.equals(((bm2)object).w, object3);
                    if (!bl5 || !bl6) {
                        boolean bl7;
                        boolean bl8;
                        ((bm2)object).w = object3;
                        boolean bl9 = true;
                        if (!bl5) {
                            ((bm2)object).x = object4;
                            object2 = ((bm2)object).z;
                            ((bm2)object).z = object4 = bm2.Y0((mi3)object4, ((bm2)object).y);
                            n16 = ((mi3)object4).equals(object2) ^ 1;
                        } else {
                            n16 = 0;
                        }
                        if (bl6 && n16 == 0) {
                            bl8 = false;
                            bl7 = false;
                        } else {
                            object4 = ((bm2)object).u;
                            gy3 gy32 = ((bm2)object).v;
                            ((bm2)object).u = object2 = bm2.u1(((bm2)object).t, ((bm2)object).s, (wa4)object3, ((bm2)object).z, ((bm2)object).I);
                            ((bm2)object).v = bm2.t1((gy3)object2, ((bm2)object).s, ((bm2)object).I, (wa4)object3, ((bm2)object).z);
                            bl8 = ((bm2)object).u.equals(object4) ^ true;
                            bl7 = ((bm2)object).v.equals(gy32) ^ true;
                        }
                        if (n16 != 0) {
                            ((bm2)object).i.f(13, new cl2((bm2)object, 1));
                        }
                        if (!bl6) {
                            object3 = ((bm2)object).f1();
                            object3.getClass();
                            bl5 = Looper.myLooper() == ((sk2)object3).f.getLooper();
                            rr2.w(bl5);
                            ((sk2)object3).e.l();
                        }
                        if (bl7) {
                            object3 = ((bm2)object).f1();
                            object3.getClass();
                            bl5 = Looper.myLooper() == ((sk2)object3).f.getLooper();
                            rr2.w(bl5);
                            ((sk2)object3).e.getClass();
                        }
                        if (bl8) {
                            object = ((bm2)object).f1();
                            object.getClass();
                            bl5 = Looper.myLooper() == ((sk2)object).f.getLooper() ? bl9 : false;
                            rr2.w(bl5);
                            ((sk2)object).e.u();
                        }
                    }
                }
                return;
            }
            case 18: 
        }
        ((bm2)object).o1((lk3)object3, (jk3)object2);
    }

    @Override
    public void d(pu1 pu12, int n16) {
        int n17 = this.n;
        Object object = this.p;
        Object object2 = (bm2)this.o;
        switch (n17) {
            default: {
                object = (cw4)object;
                pu12.A(((bm2)object2).c, n16, ((cw4)object).c());
                return;
            }
            case 14: {
                object = (qh3)object;
                mm2 mm22 = ((bm2)object2).c;
                object2 = new Bundle();
                object2.putFloat(qh3.e, ((qh3)object).a);
                object2.putFloat(qh3.f, ((qh3)object).b);
                pu12.r0(mm22, n16, (Bundle)object2);
                return;
            }
            case 13: {
                object = (do2)object;
                pu12.y0(((bm2)object2).c, n16, ((do2)object).c());
                return;
            }
            case 12: {
                object = (Surface)object;
                pu12.m0(((bm2)object2).c, n16, (Surface)object);
                return;
            }
            case 11: 
        }
        object = (ArrayList)object;
        object2 = ((bm2)object2).c;
        uw1 uw12 = yw1.j();
        for (n17 = 0; n17 < ((ArrayList)object).size(); ++n17) {
            uw12.c(((gn2)((ArrayList)object).get(n17)).c(true));
        }
        pu12.J((ju1)object2, n16, new iw(uw12.f()));
    }

    @Override
    public int e(Object object) {
        Context context = (Context)this.o;
        tb1 tb12 = (tb1)this.p;
        object = (dk2)object;
        String string = ((dk2)object).b;
        if (!string.equals(tb12.n) && !string.equals(jk2.c(tb12))) {
            return 0;
        }
        if (((dk2)object).c(context, tb12, false) && ((dk2)object).d(tb12)) {
            return 1;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f(Object object, w71 object2) {
        long l16;
        int n16;
        Object object3;
        Object object4;
        Object object5;
        block120: {
            int n17;
            block124: {
                block123: {
                    int n18;
                    int n19;
                    block122: {
                        block121: {
                            block119: {
                                boolean bl5;
                                Object object6;
                                block112: {
                                    block111: {
                                        Object object7;
                                        block114: {
                                            block116: {
                                                block117: {
                                                    block118: {
                                                        block115: {
                                                            block113: {
                                                                object5 = (nj0)this.o;
                                                                object4 = (qi3)this.p;
                                                                object3 = (ho2)object;
                                                                object6 = ((nj0)object5).r;
                                                                object5 = new SparseArray(((w71)object2).a.size());
                                                                for (n16 = 0; n16 < ((w71)object2).a.size(); ++n16) {
                                                                    n19 = ((w71)object2).b(n16);
                                                                    object = (q9)object6.get(n19);
                                                                    object.getClass();
                                                                    object5.append(n19, object);
                                                                }
                                                                object3.getClass();
                                                                if (((w71)object2).a.size() == 0) {
                                                                    return;
                                                                }
                                                                n16 = 0;
                                                                while (true) {
                                                                    block109: {
                                                                        Object object8;
                                                                        n18 = ((w71)object2).a.size();
                                                                        n19 = 1;
                                                                        if (n16 >= n18) break;
                                                                        n18 = ((w71)object2).b(n16);
                                                                        object6 = (q9)object5.get(n18);
                                                                        object6.getClass();
                                                                        object = ((ho2)object3).c;
                                                                        if (n18 == 0) {
                                                                            synchronized (object) {
                                                                                try {
                                                                                    ((nm0)object).d.getClass();
                                                                                    object7 = ((nm0)object).e;
                                                                                    ((nm0)object).e = ((q9)object6).b;
                                                                                    object8 = ((nm0)object).c.values().iterator();
                                                                                    while (object8.hasNext()) {
                                                                                        mm0 mm02 = (mm0)object8.next();
                                                                                        if (mm02.b((cu4)object7, ((nm0)object).e) && !mm02.a((q9)object6)) continue;
                                                                                        object8.remove();
                                                                                        if (mm02.a.equals(((nm0)object).f)) {
                                                                                            ((nm0)object).a(mm02);
                                                                                        }
                                                                                        if (!mm02.e) continue;
                                                                                        ((nm0)object).d.d((q9)object6, mm02.a);
                                                                                    }
                                                                                    ((nm0)object).d((q9)object6);
                                                                                    break block109;
                                                                                }
                                                                                catch (Throwable throwable) {}
                                                                                throw throwable;
                                                                            }
                                                                        }
                                                                        if (n18 == 11) {
                                                                            n18 = ((ho2)object3).l;
                                                                            synchronized (object) {
                                                                                try {
                                                                                    ((nm0)object).d.getClass();
                                                                                    if (n18 != 0) {
                                                                                        n19 = 0;
                                                                                    }
                                                                                    object7 = ((nm0)object).c.values().iterator();
                                                                                    while (object7.hasNext()) {
                                                                                        object8 = (mm0)object7.next();
                                                                                        if (!((mm0)object8).a((q9)object6)) continue;
                                                                                        object7.remove();
                                                                                        bl5 = ((mm0)object8).a.equals(((nm0)object).f);
                                                                                        if (bl5) {
                                                                                            ((nm0)object).a((mm0)object8);
                                                                                        }
                                                                                        if (!((mm0)object8).e) continue;
                                                                                        if (n19 != 0 && bl5) {
                                                                                            bl5 = ((mm0)object8).f;
                                                                                        }
                                                                                        ((nm0)object).d.d((q9)object6, ((mm0)object8).a);
                                                                                    }
                                                                                    ((nm0)object).d((q9)object6);
                                                                                    break block109;
                                                                                }
                                                                                catch (Throwable throwable) {}
                                                                                throw throwable;
                                                                            }
                                                                        }
                                                                        ((nm0)object).e((q9)object6);
                                                                    }
                                                                    ++n16;
                                                                }
                                                                l16 = SystemClock.elapsedRealtime();
                                                                if (((w71)object2).a.get(0)) {
                                                                    object = (q9)object5.get(0);
                                                                    object.getClass();
                                                                    if (((ho2)object3).k != null) {
                                                                        ((ho2)object3).c(((q9)object).b, ((q9)object).d);
                                                                    }
                                                                }
                                                                if (((w71)object2).a.get(2) && ((ho2)object3).k != null) {
                                                                    object6 = object4.e0().a.m(0);
                                                                    block36: while (true) {
                                                                        if (!((v0)object6).hasNext()) {
                                                                            object = null;
                                                                            break;
                                                                        }
                                                                        object7 = (iw4)((v0)object6).next();
                                                                        n16 = 0;
                                                                        while (true) {
                                                                            if (n16 >= ((iw4)object7).a) continue block36;
                                                                            if (((iw4)object7).e[n16] && (object = ((iw4)object7).a((int)n16).r) != null) break block36;
                                                                            ++n16;
                                                                        }
                                                                        break;
                                                                    }
                                                                    if (object != null) {
                                                                        block110: {
                                                                            object6 = ((ho2)object3).k;
                                                                            object7 = f35.a;
                                                                            object7 = fo2.h(object6);
                                                                            for (n16 = 0; n16 < ((ow0)object).q; ++n16) {
                                                                                object6 = ((ow0)object).n[n16].o;
                                                                                if (((UUID)object6).equals(ax.d)) {
                                                                                    n16 = 3;
                                                                                    break block110;
                                                                                }
                                                                                if (((UUID)object6).equals(ax.e)) {
                                                                                    n16 = 2;
                                                                                    break block110;
                                                                                } else {
                                                                                    if (!((UUID)object6).equals(ax.c)) continue;
                                                                                    n16 = 6;
                                                                                }
                                                                                break block110;
                                                                            }
                                                                            n16 = 1;
                                                                        }
                                                                        fo2.o((PlaybackMetrics.Builder)object7, n16);
                                                                    }
                                                                }
                                                                if (((w71)object2).a.get(1011)) {
                                                                    ++((ho2)object3).A;
                                                                }
                                                                if ((object6 = ((ho2)object3).o) == null) break block112;
                                                                n17 = ((PlaybackException)object6).n;
                                                                object = ((ho2)object3).a;
                                                                n19 = ((ho2)object3).w == 4 ? 1 : 0;
                                                                if (n17 != 1001) break block113;
                                                                object = new n50(20, 0);
                                                                break block111;
                                                            }
                                                            if (object6 instanceof ExoPlaybackException) {
                                                                object7 = (ExoPlaybackException)object6;
                                                                n16 = ((ExoPlaybackException)object7).w == 1 ? 1 : 0;
                                                                n18 = ((ExoPlaybackException)object7).A;
                                                            } else {
                                                                n16 = 0;
                                                                n18 = 0;
                                                            }
                                                            object7 = ((Throwable)object6).getCause();
                                                            object7.getClass();
                                                            if (!(object7 instanceof IOException)) break block114;
                                                            if (!(object7 instanceof HttpDataSource$InvalidResponseCodeException)) break block115;
                                                            object = new n50(5, ((HttpDataSource$InvalidResponseCodeException)object7).p);
                                                            break block111;
                                                        }
                                                        if (object7 instanceof HttpDataSource$InvalidContentTypeException || object7 instanceof ParserException) break block116;
                                                        bl5 = object7 instanceof HttpDataSource$HttpDataSourceException;
                                                        if (bl5 || object7 instanceof UdpDataSource$UdpDataSourceException) break block117;
                                                        if (n17 != 1002) break block118;
                                                        object = new n50(21, 0);
                                                        break block111;
                                                    }
                                                    if (object7 instanceof DrmSession$DrmSessionException) {
                                                        object = ((Throwable)object7).getCause();
                                                        object.getClass();
                                                        if (object instanceof MediaDrm.MediaDrmStateException) {
                                                            n19 = f35.z(((MediaDrm.MediaDrmStateException)object).getDiagnosticInfo());
                                                            switch (f35.y(n19)) {
                                                                default: {
                                                                    n16 = 27;
                                                                    break;
                                                                }
                                                                case 6005: {
                                                                    n16 = 26;
                                                                    break;
                                                                }
                                                                case 6004: {
                                                                    n16 = 25;
                                                                    break;
                                                                }
                                                                case 6003: {
                                                                    n16 = 28;
                                                                    break;
                                                                }
                                                                case 6002: {
                                                                    n16 = 24;
                                                                }
                                                            }
                                                            object = new n50(n16, n19);
                                                            break block111;
                                                        } else {
                                                            object = object instanceof MediaDrmResetException ? new n50(27, 0) : (object instanceof NotProvisionedException ? new n50(24, 0) : (object instanceof DeniedByServerException ? new n50(29, 0) : (object instanceof UnsupportedDrmException ? new n50(23, 0) : (object instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new n50(28, 0) : new n50(30, 0)))));
                                                        }
                                                        break block111;
                                                    } else if (object7 instanceof FileDataSource$FileDataSourceException && ((Throwable)object7).getCause() instanceof FileNotFoundException) {
                                                        object = ((Throwable)object7).getCause();
                                                        object.getClass();
                                                        object = ((Throwable)object).getCause();
                                                        object = object instanceof ErrnoException && ((ErrnoException)((Object)object)).errno == OsConstants.EACCES ? new n50(32, 0) : new n50(31, 0);
                                                        break block111;
                                                    } else {
                                                        object = new n50(9, 0);
                                                    }
                                                    break block111;
                                                }
                                                object = v53.a((Context)object).b() == 1 ? new n50(3, 0) : ((object = ((Throwable)object7).getCause()) instanceof UnknownHostException ? new n50(6, 0) : (object instanceof SocketTimeoutException ? new n50(7, 0) : (bl5 && ((HttpDataSource$HttpDataSourceException)object7).o == 1 ? new n50(4, 0) : new n50(8, 0))));
                                                break block111;
                                            }
                                            n16 = n19 != 0 ? 10 : 11;
                                            object = new n50(n16, 0);
                                            break block111;
                                        }
                                        if (n16 != 0 && (n18 == 0 || n18 == 1)) {
                                            object = new n50(35, 0);
                                        } else if (n16 != 0 && n18 == 3) {
                                            object = new n50(15, 0);
                                        } else if (n16 != 0 && n18 == 2) {
                                            object = new n50(23, 0);
                                        } else if (object7 instanceof MediaCodecRenderer$DecoderInitializationException) {
                                            object = new n50(13, f35.z(((MediaCodecRenderer$DecoderInitializationException)object7).q));
                                        } else if (object7 instanceof MediaCodecDecoderException) {
                                            object = new n50(14, ((MediaCodecDecoderException)object7).n);
                                        } else if (object7 instanceof OutOfMemoryError) {
                                            object = new n50(14, 0);
                                        } else if (object7 instanceof AudioSink$InitializationException) {
                                            object = new n50(17, 0);
                                        } else if (object7 instanceof AudioSink$WriteException) {
                                            object = new n50(18, ((AudioSink$WriteException)object7).n);
                                        } else if (object7 instanceof MediaCodec.CryptoException) {
                                            n19 = ((MediaCodec.CryptoException)((Object)object7)).getErrorCode();
                                            switch (f35.y(n19)) {
                                                default: {
                                                    n16 = 27;
                                                    break;
                                                }
                                                case 6005: {
                                                    n16 = 26;
                                                    break;
                                                }
                                                case 6004: {
                                                    n16 = 25;
                                                    break;
                                                }
                                                case 6003: {
                                                    n16 = 28;
                                                    break;
                                                }
                                                case 6002: {
                                                    n16 = 24;
                                                }
                                            }
                                            object = new n50(n16, n19);
                                        } else {
                                            object = new n50(22, 0);
                                        }
                                    }
                                    object = fo2.f(fo2.e(fo2.u(fo2.c(fo2.d(go2.f(), l16 - ((ho2)object3).e), ((n50)object).a), ((n50)object).b), (PlaybackException)object6));
                                    ((ho2)object3).b.execute(new ws1(25, object3, object));
                                    ((ho2)object3).B = true;
                                    ((ho2)object3).o = null;
                                }
                                if (((w71)object2).a.get(2)) {
                                    object = object4.e0();
                                    bl5 = ((jw4)object).a(2);
                                    boolean bl6 = ((jw4)object).a(1);
                                    boolean bl7 = ((jw4)object).a(3);
                                    if (bl5 || bl6 || bl7) {
                                        if (!bl5 && !Objects.equals(((ho2)object3).s, null)) {
                                            n16 = ((ho2)object3).s == null ? 1 : 0;
                                            ((ho2)object3).s = null;
                                            ((ho2)object3).e(1, l16, null, n16);
                                        }
                                        if (!bl6 && !Objects.equals(((ho2)object3).t, null)) {
                                            n16 = ((ho2)object3).t == null ? 1 : 0;
                                            ((ho2)object3).t = null;
                                            ((ho2)object3).e(0, l16, null, n16);
                                        }
                                        if (!bl7 && !Objects.equals(((ho2)object3).u, null)) {
                                            n16 = ((ho2)object3).u == null ? 1 : 0;
                                            ((ho2)object3).u = null;
                                            ((ho2)object3).e(2, l16, null, n16);
                                        }
                                    }
                                }
                                n19 = 10;
                                if (((ho2)object3).a(((ho2)object3).p)) {
                                    object = ((ho2)object3).p;
                                    object6 = (tb1)((ue1)object).p;
                                    if (((tb1)object6).v != -1) {
                                        n16 = ((ue1)object).o;
                                        if (!Objects.equals(((ho2)object3).s, object6)) {
                                            if (((ho2)object3).s == null && n16 == 0) {
                                                n16 = 1;
                                            }
                                            ((ho2)object3).s = object6;
                                            ((ho2)object3).e(1, l16, (tb1)object6, n16);
                                        }
                                        ((ho2)object3).p = null;
                                    }
                                }
                                if (((ho2)object3).a(((ho2)object3).q)) {
                                    object = ((ho2)object3).q;
                                    object6 = (tb1)((ue1)object).p;
                                    n16 = ((ue1)object).o;
                                    if (!Objects.equals(((ho2)object3).t, object6)) {
                                        if (((ho2)object3).t == null && n16 == 0) {
                                            n16 = 1;
                                        }
                                        ((ho2)object3).t = object6;
                                        ((ho2)object3).e(0, l16, (tb1)object6, n16);
                                    }
                                    ((ho2)object3).q = null;
                                }
                                if (((ho2)object3).a(((ho2)object3).r)) {
                                    object = ((ho2)object3).r;
                                    object6 = (tb1)((ue1)object).p;
                                    n16 = ((ue1)object).o;
                                    if (!Objects.equals(((ho2)object3).u, object6)) {
                                        if (((ho2)object3).u == null && n16 == 0) {
                                            n16 = 1;
                                        }
                                        ((ho2)object3).u = object6;
                                        ((ho2)object3).e(2, l16, (tb1)object6, n16);
                                    }
                                    ((ho2)object3).r = null;
                                }
                                switch (v53.a(((ho2)object3).a).b()) {
                                    default: {
                                        n16 = 1;
                                        break;
                                    }
                                    case 10: {
                                        n16 = 7;
                                        break;
                                    }
                                    case 9: {
                                        n16 = 8;
                                        break;
                                    }
                                    case 7: {
                                        n16 = 3;
                                        break;
                                    }
                                    case 5: {
                                        n16 = 6;
                                        break;
                                    }
                                    case 4: {
                                        n16 = 5;
                                        break;
                                    }
                                    case 3: {
                                        n16 = 4;
                                        break;
                                    }
                                    case 2: {
                                        n16 = 2;
                                        break;
                                    }
                                    case 1: {
                                        n16 = 9;
                                        break;
                                    }
                                    case 0: {
                                        n16 = 0;
                                    }
                                }
                                if (n16 != ((ho2)object3).n) {
                                    ((ho2)object3).n = n16;
                                    object = hd0.i(hd0.h(hd0.g(go2.e(), n16), l16 - ((ho2)object3).e));
                                    ((ho2)object3).b.execute(new ws1(24, object3, object));
                                }
                                if (object4.g() != 2) {
                                    ((ho2)object3).v = false;
                                }
                                if (object4.U() == null) {
                                    ((ho2)object3).x = false;
                                } else if (((w71)object2).a.get(10)) {
                                    ((ho2)object3).x = true;
                                }
                                n17 = object4.g();
                                if (!((ho2)object3).v) break block119;
                                n16 = 5;
                                break block120;
                            }
                            if (!((ho2)object3).x) break block121;
                            n16 = 13;
                            break block120;
                        }
                        if (n17 != 4) break block122;
                        n16 = 11;
                        break block120;
                    }
                    n18 = 2;
                    if (n17 != 2) break block123;
                    n17 = ((ho2)object3).m;
                    n16 = n18;
                    if (n17 != 0) {
                        n16 = n18;
                        if (n17 != 2) {
                            n16 = n17 == 12 ? n18 : (!object4.q() ? 7 : (object4.v0() != 0 ? n19 : 6));
                        }
                    }
                    break block120;
                }
                n16 = 3;
                if (n17 != 3) break block124;
                if (!object4.q()) {
                    n16 = 4;
                    break block120;
                } else if (object4.v0() != 0) {
                    n16 = 9;
                }
                break block120;
            }
            n16 = n17 == 1 && ((ho2)object3).m != 0 ? 12 : ((ho2)object3).m;
        }
        if (((ho2)object3).m != n16) {
            ((ho2)object3).m = n16;
            ((ho2)object3).B = true;
            object = fo2.m(fo2.l(fo2.k(hd0.k(), ((ho2)object3).m), l16 - ((ho2)object3).e));
            ((ho2)object3).b.execute(new ws1(27, object3, object));
        }
        if (!((w71)object2).a.get(1028)) return;
        object = ((ho2)object3).c;
        object2 = (q9)object5.get(1028);
        object2.getClass();
        synchronized (object) {
            try {
                object3 = ((nm0)object).f;
                if (object3 != null) {
                    object3 = (mm0)((nm0)object).c.get(object3);
                    object3.getClass();
                    ((nm0)object).a((mm0)object3);
                }
                object4 = ((nm0)object).c.values().iterator();
                while (object4.hasNext()) {
                    object3 = (mm0)object4.next();
                    object4.remove();
                    if (!((mm0)object3).e || (object5 = ((nm0)object).d) == null) continue;
                    ((ho2)object5).d((q9)object2, ((mm0)object3).a);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean g(Preference object, Object object2) {
        object = (h62)this.o;
        EditTextPreference editTextPreference = (EditTextPreference)this.p;
        if (((String)(object2 = ((Object)qm4.K0(object2.toString())).toString())).length() == 0 || ((String)object2).length() > 40) {
            ((h62)object).s0(2131952321);
            return false;
        }
        boolean bl5 = LanReceiverService.y;
        Context context = ((h62)object).t0;
        if (context != null) {
            context.getSharedPreferences("lan-playback", 0).edit().putString("name", (String)object2).apply();
            editTextPreference.E((String)object2);
            editTextPreference.x((CharSequence)object2);
            if (!LanReceiverService.y) return false;
            object = ((h62)object).t0;
            if (object != null) {
                Toast.makeText((Context)object, (int)2131952322, (int)1).show();
                return false;
            } else {
                h12.Q("app");
                throw null;
            }
        }
        h12.Q("app");
        throw null;
    }

    @Override
    public Object h(tn2 object, fr2 fr22, int n16) {
        int n17 = this.n;
        Object object2 = this.p;
        Object object3 = this.o;
        switch (n17) {
            default: {
                object3 = (it2)object3;
                object2 = (zr2)object2;
                object = ((tn2)object).l() ? new mw1(new ab4(-100)) : f35.h0((ic2)object3.h((tn2)object, fr22, n16), new eg0(object, fr22, object2, 8));
                return object;
            }
            case 28: {
                return ((tn2)object).y(fr22, (String)object3, (jn2)object2);
            }
            case 26: {
                object3 = (String)object3;
                object2 = (lu3)object2;
                return ((tn2)object).e.e(((tn2)object).k, ((tn2)object).B(fr22), (String)object3, (lu3)object2);
            }
            case 24: 
        }
        return ((tn2)object).q(fr22, (va4)object3, (Bundle)object2);
    }

    @Override
    public void i(EditText editText) {
        EditTextPreference editTextPreference = (EditTextPreference)this.o;
        String string = (String)this.p;
        editText.getClass();
        editText.setInputType(17);
        editText.setSingleLine();
        if (editTextPreference.h0 == null) {
            editText.setText((CharSequence)string);
        }
        editText.setSelection(editText.getText().length());
    }

    @Override
    public void invoke(Object object) {
        block5: {
            Object object2;
            block6: {
                block7: {
                    int n16 = this.n;
                    Object object3 = this.p;
                    object2 = this.o;
                    switch (n16) {
                        default: {
                            object2 = (ml3)object2;
                            object3 = (Integer)object3;
                            object = (oi3)object;
                            object2 = ((lk3)((ml3)object2).a).s();
                            object.t((Integer)object3, (gn2)object2);
                            return;
                        }
                        case 15: {
                            object2 = (gn2)object2;
                            object3 = (Integer)object3;
                            ((oi3)object).t((Integer)object3, (gn2)object2);
                            return;
                        }
                        case 2: 
                    }
                    object2 = (q9)object2;
                    object3 = (un2)object3;
                    object = (ho2)object;
                    object.getClass();
                    mt2 mt22 = ((q9)object2).d;
                    if (mt22 == null) break block5;
                    tb1 tb12 = ((un2)object3).c;
                    tb12.getClass();
                    n16 = ((un2)object3).d;
                    nm0 nm02 = ((ho2)object).c;
                    object2 = ((q9)object2).b;
                    mt22.getClass();
                    object2 = new ue1(n16, 6, (Object)tb12, nm02.c((cu4)object2, mt22));
                    n16 = ((un2)object3).b;
                    if (n16 == 0) break block6;
                    if (n16 == 1) break block7;
                    if (n16 == 2) break block6;
                    if (n16 == 3) {
                        ((ho2)object).r = object2;
                    }
                    break block5;
                }
                ((ho2)object).q = object2;
                break block5;
            }
            ((ho2)object).p = object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void j(Preference object) {
        int n16 = this.n;
        Object object2 = this.p;
        object = this.o;
        switch (n16) {
            default: {
                object = (h62)object;
                NsdServiceInfo nsdServiceInfo = ((c62)object2).a;
                if (((h62)object).N0) return;
                if (((h62)object).O0) {
                    return;
                }
                ((h62)object).N0 = true;
                ((h62)object).s0(2131952304);
                long l16 = ((h62)object).M0;
                try {
                    NsdManager nsdManager = ((h62)object).u0;
                    if (nsdManager != null) {
                        object2 = new f62((h62)object, l16, nsdServiceInfo);
                        nsdManager.resolveService(nsdServiceInfo, (NsdManager.ResolveListener)object2);
                        return;
                    }
                    h12.Q("nsd");
                    throw null;
                }
                catch (Exception exception) {
                    ((h62)object).N0 = false;
                    ((h62)object).s0(2131952305);
                }
                return;
            }
            case 6: {
                ((h62)object).r0((h52)object2);
                return;
            }
            case 4: 
        }
        object = (Preference)object;
        object2 = (vb4)object2;
        ((Preference)object).x(((kc1)object2).s(2131952163));
        io1.a.execute(new ts1((vb4)object2, (Preference)object, 1));
    }

    @Override
    public Object k(oy oy5) {
        Executor executor = (Executor)this.o;
        uy1 uy12 = (uy1)this.p;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        jc2 jc22 = new jc2(atomicBoolean, 0);
        n04 n042 = oy5.c;
        if (n042 != null) {
            n042.f(jc22, fq0.n);
        }
        executor.execute(new v6(atomicBoolean, oy5, uy12, 24));
        return "setForegroundAsync";
    }

    @Override
    public void onCancel() {
        Object object = (Animator)this.o;
        pj4 pj42 = (pj4)this.p;
        object.end();
        if (ld1.I(2)) {
            object = new StringBuilder("Animator from operation ");
            ((StringBuilder)object).append(pj42);
            ((StringBuilder)object).append(" has been canceled.");
            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
    }
}

