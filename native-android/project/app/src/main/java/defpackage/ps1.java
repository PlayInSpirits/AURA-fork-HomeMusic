package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ps1 implements oi3 {
    public final qi3 n;
    public final LinkedHashMap o = new LinkedHashMap();
    public final zq2 p = new zq2(new lc(2, this));
    public final Handler q;
    public final g5 r;
    public final qa1 s;

    public ps1(qi3 qi3Var) {
        this.n = qi3Var;
        Handler handler = new Handler(qi3Var.U0());
        this.q = handler;
        g5 g5Var = new g5(15, this);
        this.r = g5Var;
        qa1 qa1Var = new qa1(13, this);
        this.s = qa1Var;
        handler.postDelayed(g5Var, 15000L);
        handler.postDelayed(qa1Var, 15000L);
    }

    @Override // defpackage.oi3
    public final void S(PlaybackException playbackException) {
        playbackException.getClass();
        qi3 qi3Var = this.n;
        gn2 gn2VarA = qi3Var.a();
        this.p.c(gn2VarA != null ? gn2VarA.a : null, Long.valueOf(qi3Var.M0()), SystemClock.elapsedRealtime(), false, "error");
    }

    @Override // defpackage.oi3
    public final void V(boolean z) {
        if (z) {
            c();
            return;
        }
        qi3 qi3Var = this.n;
        gn2 gn2VarA = qi3Var.a();
        String str = gn2VarA != null ? gn2VarA.a : null;
        zq2 zq2Var = this.p;
        oh3 oh3Var = (oh3) zq2Var.r;
        if (h12.c(str, oh3Var != null ? oh3Var.a : null)) {
            long jM0 = qi3Var.M0();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((oh3) zq2Var.r) != null) {
                zq2Var.b(jM0, jElapsedRealtime, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    public final void c() {
        long j;
        Object obj;
        kd3 kd3Var;
        if (this.n.h0()) {
            oh3 oh3VarL = l(this.n.a());
            if (oh3VarL != null) {
                oh3 oh3Var = (oh3) this.p.r;
                if ((oh3Var != null ? oh3Var.a : null) == null) {
                    long jM0 = this.n.M0();
                    b00 b00Var = b00.a;
                    String strA = b00.a();
                    rs1 rs1Var = rs1.a;
                    String str = oh3VarL.a;
                    synchronized (rs1Var) {
                        try {
                            ArrayList arrayList = rs1.l;
                            int size = arrayList.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    j = 0;
                                    obj = null;
                                    break;
                                }
                                obj = arrayList.get(i);
                                i++;
                                PlayEvent playEvent = (PlayEvent) ((kd3) obj).o;
                                rs1 rs1Var2 = rs1.a;
                                j = 0;
                                String ref = playEvent.getRef();
                                if (h12.c(ref != null ? "hub:".concat(ref) : playEvent.getNdSongId(), str) && h12.c(playEvent.getAccount(), strA) && h12.c(playEvent.getDeviceId(), (String) rs1.k.getValue())) {
                                    break;
                                }
                            }
                            kd3Var = (kd3) obj;
                            if (kd3Var != null) {
                                rs1.l.remove(kd3Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    rs1 rs1Var3 = rs1.a;
                    rs1.a(strA, oh3VarL.a);
                    if (kd3Var != null) {
                        PlayEvent playEvent2 = (PlayEvent) kd3Var.o;
                        Double positionS = playEvent2.getPositionS();
                        Long lValueOf = positionS != null ? Long.valueOf((long) (positionS.doubleValue() * 1000.0d)) : null;
                        if (lValueOf == null || jM0 <= j || Math.abs(jM0 - lValueOf.longValue()) > 15000) {
                            rs1.d(playEvent2);
                        } else {
                            zq2 zq2Var = this.p;
                            String playbackId = playEvent2.getPlaybackId();
                            playbackId.getClass();
                            Long listenedMs = playEvent2.getListenedMs();
                            listenedMs.getClass();
                            long jLongValue = listenedMs.longValue();
                            zq2Var.getClass();
                            if (((oh3) zq2Var.r) != null) {
                                kf2.o("Check failed.");
                                return;
                            }
                            oh3VarL.f = playbackId;
                            if (jLongValue < j) {
                                jLongValue = j;
                            }
                            oh3VarL.g = jLongValue;
                            zq2Var.r = oh3VarL;
                            zq2Var.p = false;
                            this.o.put(playEvent2.getPlaybackId(), playEvent2.getAccount());
                        }
                    }
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            zq2 zq2Var2 = this.p;
            if (oh3VarL == null) {
                zq2Var2.c(null, null, SystemClock.elapsedRealtime(), false, null);
                return;
            }
            long jM1 = this.n.M0();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zq2Var2.getClass();
            oh3 oh3Var2 = (oh3) zq2Var2.r;
            if (oh3Var2 != null && !h12.c(oh3Var2.a, oh3VarL.a)) {
                zq2Var2.c(oh3Var2.a, null, jElapsedRealtime, false, null);
            }
            oh3 oh3Var3 = (oh3) zq2Var2.r;
            if (oh3Var3 == null) {
                zq2Var2.r = oh3VarL;
                ((lc) zq2Var2.q).d(PlayEvent.START, oh3VarL, Long.valueOf(jM1), Long.valueOf(jElapsedRealtime));
            } else {
                long j2 = oh3VarL.b;
                if (j2 > j && oh3Var3.b <= j) {
                    oh3Var3.b = j2;
                }
            }
            zq2Var2.b(jM1, jElapsedRealtime, true);
        }
    }

    @Override // defpackage.oi3
    public final void k(pi3 pi3Var, pi3 pi3Var2, int i) {
        pi3Var.getClass();
        pi3Var2.getClass();
        gn2 gn2Var = pi3Var.c;
        String str = gn2Var != null ? gn2Var.a : null;
        boolean z = i == 0;
        if (!z && pi3Var.b == pi3Var2.b) {
            gn2 gn2Var2 = pi3Var2.c;
            if (h12.c(str, gn2Var2 != null ? gn2Var2.a : null)) {
                gn2 gn2VarA = this.n.a();
                String str2 = gn2VarA != null ? gn2VarA.a : null;
                zq2 zq2Var = this.p;
                oh3 oh3Var = (oh3) zq2Var.r;
                if (h12.c(str2, oh3Var != null ? oh3Var.a : null)) {
                    long j = pi3Var2.f;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (((oh3) zq2Var.r) != null) {
                        zq2Var.b(j, jElapsedRealtime, zq2Var.p);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.p.c(str, Long.valueOf(pi3Var.f), SystemClock.elapsedRealtime(), z, null);
        c();
    }

    public final oh3 l(gn2 gn2Var) {
        String string;
        String string2;
        String string3;
        qi3 qi3Var = this.n;
        if (gn2Var != null) {
            String str = gn2Var.a;
            do2 do2Var = gn2Var.d;
            Bundle bundle = do2Var.I;
            if (h12.c(bundle != null ? bundle.getString("type") : null, "music")) {
                str.getClass();
                if (str.length() != 0) {
                    long duration = gn2Var.equals(qi3Var.a()) ? qi3Var.getDuration() : -9223372036854775807L;
                    if (duration == -9223372036854775807L || duration <= 0) {
                        duration = ((long) bundle.getInt("duration")) * 1000;
                    }
                    ag2 ag2Var = new ag2();
                    CharSequence charSequence = do2Var.a;
                    if (charSequence != null && (string3 = charSequence.toString()) != null) {
                        if (qm4.u0(string3)) {
                            string3 = null;
                        }
                        if (string3 != null) {
                            ag2Var.put("title", string3);
                        }
                    }
                    CharSequence charSequence2 = do2Var.b;
                    if (charSequence2 != null && (string2 = charSequence2.toString()) != null) {
                        if (qm4.u0(string2)) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            ag2Var.put("artist_credit", string2);
                        }
                    }
                    String string4 = bundle.getString("artistId");
                    if (string4 != null) {
                        if (qm4.u0(string4)) {
                            string4 = null;
                        }
                        if (string4 != null) {
                            ag2Var.put("primary_nd_artist_id", string4);
                        }
                    }
                    int i = bundle.getInt("year");
                    Integer numValueOf = Integer.valueOf(i);
                    if (1000 > i || i >= 10000) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        ag2Var.put("year", Integer.valueOf(numValueOf.intValue()));
                    }
                    String string5 = bundle.getString("genre");
                    if (string5 != null) {
                        if (qm4.u0(string5)) {
                            string5 = null;
                        }
                        if (string5 != null) {
                            ag2Var.put("genre", string5);
                        }
                    }
                    CharSequence charSequence3 = do2Var.c;
                    if (charSequence3 != null && (string = charSequence3.toString()) != null) {
                        String str2 = qm4.u0(string) ? null : string;
                        if (str2 != null) {
                            ag2Var.put("album", str2);
                        }
                    }
                    if (duration > 0) {
                        ag2Var.put("duration_s", Double.valueOf(duration / 1000.0d));
                    }
                    ag2 ag2VarB = ag2Var.b();
                    rs1 rs1Var = rs1.a;
                    return new oh3(str, duration, rs1.c(str), ag2VarB, (k62) rs1.o.get(str));
                }
            }
        }
        return null;
    }

    @Override // defpackage.oi3
    public final void t(int i, gn2 gn2Var) {
        oh3 oh3Var = (oh3) this.p.r;
        String str = oh3Var != null ? oh3Var.a : null;
        if (str != null) {
            if (!h12.c(gn2Var != null ? gn2Var.a : null, str)) {
                this.p.c(str, null, SystemClock.elapsedRealtime(), false, null);
            }
        }
        c();
    }

    @Override // defpackage.oi3
    public final void v(int i) {
        if (i == 4) {
            zq2 zq2Var = this.p;
            oh3 oh3Var = (oh3) zq2Var.r;
            zq2Var.c(oh3Var != null ? oh3Var.a : null, null, SystemClock.elapsedRealtime(), true, null);
            WeakReference weakReference = b.a;
            io1.b.post(new u6(13));
        }
    }
}
