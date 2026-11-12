package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ho2 {
    public int A;
    public boolean B;
    public final Context a;
    public final nm0 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public PlaybackException o;
    public ue1 p;
    public ue1 q;
    public ue1 r;
    public tb1 s;
    public tb1 t;
    public tb1 u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = uo.t();
    public final bu4 f = new bu4();
    public final zt4 g = new zt4();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public ho2(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        nm0 nm0Var = new nm0();
        this.c = nm0Var;
        nm0Var.d = this;
    }

    public final boolean a(ue1 ue1Var) {
        String str;
        if (ue1Var == null) {
            return false;
        }
        String str2 = (String) ue1Var.q;
        nm0 nm0Var = this.c;
        synchronized (nm0Var) {
            str = nm0Var.f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new ws1(26, this, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final void c(cu4 cu4Var, mt2 mt2Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (mt2Var == null || (iB = cu4Var.b(mt2Var.a)) == -1) {
            return;
        }
        zt4 zt4Var = this.g;
        int i = 0;
        cu4Var.f(iB, zt4Var, false);
        int i2 = zt4Var.c;
        bu4 bu4Var = this.f;
        cu4Var.n(i2, bu4Var);
        bn2 bn2Var = bu4Var.b.b;
        if (bn2Var != null) {
            int iJ = f35.J(bn2Var.a, bn2Var.b);
            if (iJ == 0) {
                i = 3;
            } else if (iJ != 1) {
                i = iJ != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (bu4Var.l != -9223372036854775807L && !bu4Var.j && !bu4Var.h && !bu4Var.a()) {
            builder.setMediaDurationMillis(f35.i0(bu4Var.l));
        }
        builder.setPlaybackType(bu4Var.a() ? 2 : 1);
        this.B = true;
    }

    public final void d(q9 q9Var, String str) {
        mt2 mt2Var = q9Var.d;
        if ((mt2Var == null || !mt2Var.b()) && str.equals(this.j)) {
            b();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void e(int i, long j, tb1 tb1Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = go2.g(i).setTimeSinceCreatedMillis(j - this.e);
        if (tb1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = tb1Var.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = tb1Var.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = tb1Var.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = tb1Var.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = tb1Var.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = tb1Var.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = tb1Var.F;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = tb1Var.G;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = tb1Var.d;
            if (str4 != null) {
                String str5 = f35.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = tb1Var.y;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new ws1(23, this, timeSinceCreatedMillis.build()));
    }
}
