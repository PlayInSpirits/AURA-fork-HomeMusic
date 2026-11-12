package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class al0 implements hd2 {
    public static final mj0 B = new mj0(4);
    public final zh0 n;
    public final fn1 o;
    public final i80 p;
    public ue1 s;
    public i61 t;
    public Handler u;
    public zm1 v;
    public cn1 w;
    public Uri x;
    public ym1 y;
    public boolean z;
    public final CopyOnWriteArrayList r = new CopyOnWriteArrayList();
    public final HashMap q = new HashMap();
    public long A = -9223372036854775807L;

    public al0(zh0 zh0Var, i80 i80Var, fn1 fn1Var) {
        this.n = zh0Var;
        this.o = fn1Var;
        this.p = i80Var;
    }

    public final ym1 a(boolean z, Uri uri) {
        HashMap map = this.q;
        ym1 ym1Var = ((zk0) map.get(uri)).q;
        if (ym1Var != null && z) {
            if (!uri.equals(this.x)) {
                List list = this.w.e;
                for (int i = 0; i < list.size(); i++) {
                    if (uri.equals(((bn1) list.get(i)).a)) {
                        ym1 ym1Var2 = this.y;
                        if (ym1Var2 != null && ym1Var2.o) {
                            break;
                        }
                        this.x = uri;
                        zk0 zk0Var = (zk0) map.get(uri);
                        ym1 ym1Var3 = zk0Var.q;
                        if (ym1Var3 != null && ym1Var3.o) {
                            this.y = ym1Var3;
                            this.v.u(ym1Var3);
                            break;
                        }
                        zk0Var.f(c(uri));
                        break;
                    }
                }
            }
            zk0 zk0Var2 = (zk0) map.get(uri);
            ym1 ym1Var4 = zk0Var2.q;
            if (!zk0Var2.x) {
                zk0Var2.x = true;
                if (ym1Var4 != null && !ym1Var4.o) {
                    zk0Var2.d(true);
                }
            }
        }
        return ym1Var;
    }

    @Override // defpackage.hd2
    public final void b(jd2 jd2Var, long j, long j2, boolean z) {
        de3 de3Var = (de3) jd2Var;
        long j3 = de3Var.a;
        ii0 ii0Var = de3Var.b;
        yl4 yl4Var = de3Var.d;
        ed2 ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        this.p.getClass();
        this.s.q(ed2Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri c(Uri uri) {
        um1 um1Var;
        ym1 ym1Var = this.y;
        if (ym1Var == null || !ym1Var.v.e || (um1Var = (um1) ym1Var.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(um1Var.b));
        int i = um1Var.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean d(Uri uri) {
        int i;
        zk0 zk0Var = (zk0) this.q.get(uri);
        if (zk0Var.q == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, f35.i0(zk0Var.q.u));
        ym1 ym1Var = zk0Var.q;
        return ym1Var.o || (i = ym1Var.d) == 2 || i == 1 || zk0Var.r + jMax > jElapsedRealtime;
    }

    @Override // defpackage.hd2
    public final void g(jd2 jd2Var, long j, long j2) {
        cn1 cn1Var;
        de3 de3Var = (de3) jd2Var;
        dn1 dn1Var = (dn1) de3Var.f;
        boolean z = dn1Var instanceof ym1;
        if (z) {
            String str = dn1Var.a;
            cn1 cn1Var2 = cn1.l;
            Uri uri = Uri.parse(str);
            sb1 sb1Var = new sb1();
            sb1Var.a = "0";
            sb1Var.l = lw2.m("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new bn1(uri, new tb1(sb1Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            cn1Var = new cn1("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            cn1Var = (cn1) dn1Var;
        }
        this.w = cn1Var;
        this.x = ((bn1) cn1Var.e.get(0)).a;
        this.r.add(new yk0(this));
        List list2 = cn1Var.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list2.get(i);
            this.q.put(uri2, new zk0(this, uri2));
        }
        ii0 ii0Var = de3Var.b;
        yl4 yl4Var = de3Var.d;
        ed2 ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        zk0 zk0Var = (zk0) this.q.get(this.x);
        if (z) {
            zk0Var.h((ym1) dn1Var, ed2Var);
        } else {
            zk0Var.d(false);
        }
        this.p.getClass();
        this.s.r(ed2Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.hd2
    public final void j(jd2 jd2Var, long j, long j2, int i) {
        ed2 ed2Var;
        de3 de3Var = (de3) jd2Var;
        if (i == 0) {
            long j3 = de3Var.a;
            ed2Var = new ed2(j, de3Var.b);
        } else {
            long j4 = de3Var.a;
            ii0 ii0Var = de3Var.b;
            yl4 yl4Var = de3Var.d;
            ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        }
        this.s.u(ed2Var, de3Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 jd2Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        de3 de3Var = (de3) jd2Var;
        long j3 = de3Var.a;
        ii0 ii0Var = de3Var.b;
        yl4 yl4Var = de3Var.d;
        ed2 ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        int i2 = de3Var.c;
        this.p.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, SmartSession.MAX_SONGS);
                break;
            }
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException) || ((cause instanceof DataSourceException) && ((DataSourceException) cause).n == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        boolean z = jMin == -9223372036854775807L;
        long j4 = jMin;
        this.s.s(ed2Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        return z ? i61.t : new dd2(0, j4, false);
    }
}
