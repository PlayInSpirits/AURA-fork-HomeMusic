package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.util.a;
import defpackage.al0;
import defpackage.fn1;
import defpackage.gn2;
import defpackage.i80;
import defpackage.lt2;
import defpackage.mj0;
import defpackage.om0;
import defpackage.rf2;
import defpackage.rr2;
import defpackage.ww0;
import defpackage.xk0;
import defpackage.yc5;
import defpackage.zh0;
import defpackage.zm1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class my0 implements lt2 {
    public final MediaService a;

    public my0(MediaService mediaService) {
        this.a = mediaService;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    @Override // defpackage.lt2
    public final bq d(gn2 gn2Var) {
        boolean z;
        final kx kxVarD;
        bn2 bn2Var;
        Uri uri;
        String lastPathSegment;
        gn2Var.getClass();
        Bundle bundle = gn2Var.d.I;
        if (h12.c(bundle != null ? bundle.getString("type", "") : null, WaveOrigin.RADIO)) {
            z = true;
        } else {
            String str = gn2Var.a;
            str.getClass();
            if (xm4.k0(str, "ir-", false)) {
                z = true;
            } else {
                z = false;
            }
        }
        long jF = ud3.F();
        boolean z2 = ((int) jF) == 0 || (jF > 0 && z) || jF <= 0 || z;
        MediaService mediaService = this.a;
        if (z) {
            synchronized (au0.class) {
                kxVarD = au0.d(new rf2((Context) mediaService, (bi0) au0.y()), au0.u(mediaService));
            }
        } else if (z2) {
            kxVarD = au0.E(mediaService);
        } else {
            synchronized (au0.class) {
                kx kxVar = new kx();
                kxVar.n = au0.B(mediaService);
                kxVar.p = new xi4(10);
                kxVar.r = au0.E(mediaService);
                kxVarD = au0.d(new wo0(new rm2(21, kxVar), new mj0(12)), au0.u(mediaService));
            }
        }
        bn2 bn2Var2 = gn2Var.b;
        if (h12.c(bn2Var2 != null ? bn2Var2.b : null, "application/x-mpegURL") || !((bn2Var = gn2Var.b) == null || (uri = bn2Var.a) == null || (lastPathSegment = uri.getLastPathSegment()) == null || !xm4.e0(lastPathSegment, ".m3u8", true))) {
            return new lt2(kxVarD) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                public final zh0 a;
                public xk0 b;
                public om0 c;
                public yc5 h = new yc5(3);
                public final i80 e = new i80(27);
                public final mj0 f = al0.B;
                public final i80 i = new i80(28);
                public final i80 g = new i80(24);
                public final int k = 1;
                public final long l = -9223372036854775807L;
                public final boolean j = true;
                public boolean d = true;

                {
                    this.a = new zh0(19, kxVarD);
                }

                @Override // defpackage.lt2
                public final void a(om0 om0Var) {
                    this.c = om0Var;
                }

                @Override // defpackage.lt2
                public final void b() {
                }

                @Override // defpackage.lt2
                public final void c(boolean z3) {
                    this.d = z3;
                }

                @Override // defpackage.lt2
                public final lt2 e(yc5 yc5Var) {
                    rr2.s(yc5Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
                    this.h = yc5Var;
                    return this;
                }

                @Override // defpackage.lt2
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final zm1 d(gn2 gn2Var2) {
                    gn2Var2.b.getClass();
                    if (this.b == null) {
                        xk0 xk0Var = new xk0(0);
                        xk0Var.p = new om0(1);
                        this.b = xk0Var;
                    }
                    om0 om0Var = this.c;
                    if (om0Var != null) {
                        this.b.p = om0Var;
                    }
                    xk0 xk0Var2 = this.b;
                    xk0Var2.o = this.d;
                    xk0Var2.getClass();
                    List list = gn2Var2.b.e;
                    boolean zIsEmpty = list.isEmpty();
                    fn1 rf2Var = this.e;
                    if (!zIsEmpty) {
                        rf2Var = new rf2(rf2Var, list);
                    }
                    ww0 ww0VarB = this.h.b(gn2Var2);
                    this.f.getClass();
                    zh0 zh0Var = this.a;
                    i80 i80Var = this.i;
                    return new zm1(gn2Var2, zh0Var, xk0Var2, this.g, ww0VarB, i80Var, new al0(zh0Var, i80Var, rf2Var), this.l, this.j, this.k);
                }
            }.d(gn2Var);
        }
        jr3 jr3Var = new jr3(kxVarD, new sk0());
        jr3Var.e = 262144;
        bn2 bn2Var3 = gn2Var.b;
        Uri uri2 = bn2Var3 != null ? bn2Var3.a : null;
        return ((uri2 != null ? uri2.getQueryParameter("format") : null) == null || h12.c(uri2.getQueryParameter("format"), "raw") || a.a("transcodeOffset") == null) ? new tv2(jr3Var.d(gn2Var)) : new qw4(gn2Var, kxVarD, jr3Var);
    }

    @Override // defpackage.lt2
    public final lt2 e(yc5 yc5Var) {
        yc5Var.getClass();
        throw new p63("An operation is not implemented: Not yet implemented");
    }
}
