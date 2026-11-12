package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zk0 implements hd2 {
    public final Uri n;
    public final i61 o = new i61("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final ci0 p;
    public ym1 q;
    public long r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public IOException w;
    public boolean x;
    public final /* synthetic */ al0 y;

    public zk0(al0 al0Var, Uri uri) {
        this.y = al0Var;
        this.n = uri;
        this.p = ((bi0) al0Var.n.o).m();
    }

    public static boolean a(zk0 zk0Var, long j) {
        zk0Var.u = SystemClock.elapsedRealtime() + j;
        Uri uri = zk0Var.n;
        al0 al0Var = zk0Var.y;
        if (!uri.equals(al0Var.x)) {
            return true;
        }
        List list = al0Var.w.e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            zk0 zk0Var2 = (zk0) al0Var.q.get(((bn1) list.get(i)).a);
            zk0Var2.getClass();
            if (jElapsedRealtime > zk0Var2.u) {
                Uri uri2 = zk0Var2.n;
                al0Var.x = uri2;
                zk0Var2.f(al0Var.c(uri2));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hd2
    public final void b(jd2 jd2Var, long j, long j2, boolean z) {
        de3 de3Var = (de3) jd2Var;
        long j3 = de3Var.a;
        ii0 ii0Var = de3Var.b;
        yl4 yl4Var = de3Var.d;
        ed2 ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        al0 al0Var = this.y;
        al0Var.p.getClass();
        al0Var.s.q(ed2Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri c() {
        ym1 ym1Var = this.q;
        Uri uri = this.n;
        if (ym1Var != null) {
            xm1 xm1Var = ym1Var.v;
            if (xm1Var.a != -9223372036854775807L || xm1Var.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                ym1 ym1Var2 = this.q;
                if (ym1Var2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ym1Var2.k + ((long) ym1Var2.r.size())));
                    ym1 ym1Var3 = this.q;
                    if (ym1Var3.n != -9223372036854775807L) {
                        yw1 yw1Var = ym1Var3.s;
                        int size = yw1Var.size();
                        if (!yw1Var.isEmpty() && ((tm1) te5.w(yw1Var)).z) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                xm1 xm1Var2 = this.q.v;
                if (xm1Var2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", xm1Var2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void d(boolean z) {
        f(z ? c() : this.n);
    }

    public final void e(Uri uri) {
        al0 al0Var = this.y;
        ce3 ce3VarE = al0Var.o.e(al0Var.w, this.q);
        Map map = Collections.EMPTY_MAP;
        rr2.s(uri, "The uri must be set.");
        de3 de3Var = new de3(this.p, new ii0(uri, 0L, 1, null, map, 0L, -1L, null, 1), ce3VarE);
        this.o.u(de3Var, this, al0Var.p.D(de3Var.c));
    }

    public final void f(Uri uri) {
        this.u = 0L;
        if (this.v) {
            return;
        }
        i61 i61Var = this.o;
        if (i61Var.l() || ((IOException) i61Var.q) != null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.t;
        if (jElapsedRealtime >= j) {
            e(uri);
        } else {
            this.v = true;
            this.y.u.postDelayed(new k6(19, this, uri), j - jElapsedRealtime);
        }
    }

    @Override // defpackage.hd2
    public final void g(jd2 jd2Var, long j, long j2) {
        de3 de3Var = (de3) jd2Var;
        dn1 dn1Var = (dn1) de3Var.f;
        ii0 ii0Var = de3Var.b;
        yl4 yl4Var = de3Var.d;
        ed2 ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        if (dn1Var instanceof ym1) {
            h((ym1) dn1Var, ed2Var);
            this.y.s.r(ed2Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException parserExceptionB = ParserException.b("Loaded playlist has unexpected type.");
            this.w = parserExceptionB;
            this.y.s.s(ed2Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, parserExceptionB, true);
        }
        this.y.p.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0248  */
    /* JADX WARN: Code duplicated, block: B:102:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x024c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:106:0x025b  */
    /* JADX WARN: Code duplicated, block: B:109:0x026f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0277  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0145  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2 A[LOOP:0: B:79:0x01cc->B:81:0x01d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0214  */
    /* JADX WARN: Code duplicated, block: B:93:0x0218  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d A[LOOP:1: B:94:0x0227->B:96:0x022d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0243 A[DONT_INVERT] */
    public final void h(ym1 ym1Var, ed2 ed2Var) {
        boolean z;
        long j;
        yw1 yw1Var;
        long j2;
        boolean z2;
        ym1 ym1Var2;
        long j3;
        long j4;
        yw1 yw1Var2;
        int size;
        int i;
        vm1 vm1Var;
        long j5;
        long j6;
        long j7;
        ym1 ym1Var3;
        int i2;
        int i3;
        yw1 yw1Var3;
        vm1 vm1Var2;
        int i4;
        ym1 ym1Var4;
        IOException iOException;
        Uri uri;
        long size2;
        ym1 ym1Var5;
        IOException hlsPlaylistTracker$PlaylistStuckException;
        boolean z3;
        x7 x7Var;
        Iterator it;
        ym1 ym1Var6;
        xm1 xm1Var;
        long j8;
        long j9;
        Iterator it2;
        int size3;
        int size4;
        int size5;
        ym1 ym1Var7 = this.q;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.r = jElapsedRealtime;
        al0 al0Var = this.y;
        CopyOnWriteArrayList copyOnWriteArrayList = al0Var.r;
        if (ym1Var7 != null) {
            long j10 = ym1Var.k;
            long j11 = ym1Var7.k;
            z = j10 > j11 || (j10 >= j11 && ((size3 = ym1Var.r.size() - ym1Var7.r.size()) == 0 ? (size4 = ym1Var.s.size()) > (size5 = ym1Var7.s.size()) || (size4 == size5 && ym1Var.o && !ym1Var7.o) : size3 > 0));
            j = ym1Var.k;
            yw1Var = ym1Var.r;
            j2 = 0;
            if (z) {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z2 = true;
                if (ym1Var.p) {
                    j6 = ym1Var.h;
                } else {
                    ym1Var2 = al0Var.y;
                    if (ym1Var2 != null) {
                        j3 = ym1Var2.h;
                    } else {
                        j3 = 0;
                    }
                    if (ym1Var7 == null) {
                        long j12 = ym1Var7.h;
                        j4 = ym1Var7.k;
                        yw1Var2 = ym1Var7.r;
                        size = yw1Var2.size();
                        i = (int) (j - j4);
                        if (i < yw1Var2.size()) {
                            vm1Var = (vm1) yw1Var2.get(i);
                        } else {
                            vm1Var = null;
                        }
                        if (vm1Var != null) {
                            j5 = vm1Var.r;
                        } else {
                            if (size == j - j4) {
                                j5 = ym1Var7.u;
                            }
                            if (ym1Var.i) {
                                i4 = ym1Var.j;
                            } else {
                                ym1Var3 = al0Var.y;
                                if (ym1Var3 != null) {
                                    i2 = ym1Var3.j;
                                } else {
                                    i2 = 0;
                                }
                                if (ym1Var7 == null) {
                                    i3 = (int) (j - ym1Var7.k);
                                    yw1Var3 = ym1Var7.r;
                                    if (i3 < yw1Var3.size()) {
                                        vm1Var2 = (vm1) yw1Var3.get(i3);
                                    } else {
                                        vm1Var2 = null;
                                    }
                                    if (vm1Var2 != null) {
                                        i2 = (ym1Var7.j + vm1Var2.q) - ((vm1) yw1Var.get(0)).q;
                                    }
                                }
                                i4 = i2;
                            }
                            iOException = null;
                            ym1Var4 = new ym1(ym1Var.d, ym1Var.a, ym1Var.b, ym1Var.e, ym1Var.g, j7, true, i4, ym1Var.k, ym1Var.l, ym1Var.m, ym1Var.n, ym1Var.c, ym1Var.o, ym1Var.p, ym1Var.q, yw1Var, ym1Var.s, ym1Var.v, ym1Var.t, ym1Var.w);
                        }
                        j6 = j12 + j5;
                    }
                    j7 = j3;
                    if (ym1Var.i) {
                        i4 = ym1Var.j;
                    } else {
                        ym1Var3 = al0Var.y;
                        if (ym1Var3 != null) {
                            i2 = ym1Var3.j;
                        } else {
                            i2 = 0;
                        }
                        if (ym1Var7 == null) {
                            i3 = (int) (j - ym1Var7.k);
                            yw1Var3 = ym1Var7.r;
                            if (i3 < yw1Var3.size()) {
                                vm1Var2 = (vm1) yw1Var3.get(i3);
                            } else {
                                vm1Var2 = null;
                            }
                            if (vm1Var2 != null) {
                                i2 = (ym1Var7.j + vm1Var2.q) - ((vm1) yw1Var.get(0)).q;
                            }
                        }
                        i4 = i2;
                    }
                    iOException = null;
                    ym1Var4 = new ym1(ym1Var.d, ym1Var.a, ym1Var.b, ym1Var.e, ym1Var.g, j7, true, i4, ym1Var.k, ym1Var.l, ym1Var.m, ym1Var.n, ym1Var.c, ym1Var.o, ym1Var.p, ym1Var.q, yw1Var, ym1Var.s, ym1Var.v, ym1Var.t, ym1Var.w);
                }
                j7 = j6;
                if (ym1Var.i) {
                    i4 = ym1Var.j;
                } else {
                    ym1Var3 = al0Var.y;
                    if (ym1Var3 != null) {
                        i2 = ym1Var3.j;
                    } else {
                        i2 = 0;
                    }
                    if (ym1Var7 == null) {
                        i3 = (int) (j - ym1Var7.k);
                        yw1Var3 = ym1Var7.r;
                        if (i3 < yw1Var3.size()) {
                            vm1Var2 = (vm1) yw1Var3.get(i3);
                        } else {
                            vm1Var2 = null;
                        }
                        if (vm1Var2 != null) {
                            i2 = (ym1Var7.j + vm1Var2.q) - ((vm1) yw1Var.get(0)).q;
                        }
                    }
                    i4 = i2;
                }
                iOException = null;
                ym1Var4 = new ym1(ym1Var.d, ym1Var.a, ym1Var.b, ym1Var.e, ym1Var.g, j7, true, i4, ym1Var.k, ym1Var.l, ym1Var.m, ym1Var.n, ym1Var.c, ym1Var.o, ym1Var.p, ym1Var.q, yw1Var, ym1Var.s, ym1Var.v, ym1Var.t, ym1Var.w);
            } else {
                if (ym1Var.o) {
                    z2 = true;
                    ym1Var4 = ym1Var7;
                } else if (ym1Var7.o) {
                    ym1Var4 = ym1Var7;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    iOException = null;
                    z2 = true;
                } else {
                    z2 = true;
                    ym1Var4 = new ym1(ym1Var7.d, ym1Var7.a, ym1Var7.b, ym1Var7.e, ym1Var7.g, ym1Var7.h, ym1Var7.i, ym1Var7.j, ym1Var7.k, ym1Var7.l, ym1Var7.m, ym1Var7.n, ym1Var7.c, true, ym1Var7.p, ym1Var7.q, ym1Var7.r, ym1Var7.s, ym1Var7.v, ym1Var7.t, ym1Var7.w);
                }
                iOException = null;
            }
            this.q = ym1Var4;
            uri = this.n;
            if (ym1Var4 != ym1Var7) {
                this.w = iOException;
                this.s = jElapsedRealtime;
                if (uri.equals(al0Var.x)) {
                    if (al0Var.y == null) {
                        al0Var.z = !ym1Var4.o;
                        al0Var.A = ym1Var4.h;
                    }
                    al0Var.y = ym1Var4;
                    al0Var.v.u(ym1Var4);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((gn1) it2.next()).a();
                }
            } else if (!ym1Var4.o) {
                size2 = ym1Var.k + ((long) ym1Var.r.size());
                ym1Var5 = this.q;
                if (size2 < ym1Var5.k) {
                    hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistResetException();
                    z3 = z2;
                } else {
                    if (jElapsedRealtime - this.s > f35.i0(ym1Var5.m) * 3.5d) {
                        hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistStuckException();
                    } else {
                        hlsPlaylistTracker$PlaylistStuckException = iOException;
                    }
                    z3 = false;
                }
                if (hlsPlaylistTracker$PlaylistStuckException != null) {
                    this.w = hlsPlaylistTracker$PlaylistStuckException;
                    x7Var = new x7(z2 ? 1 : 0, 8, hlsPlaylistTracker$PlaylistStuckException);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((gn1) it.next()).b(uri, x7Var, z3);
                    }
                }
            }
            ym1Var6 = this.q;
            xm1Var = ym1Var6.v;
            j8 = ym1Var6.m;
            if (!xm1Var.e) {
                if (ym1Var6 == ym1Var7) {
                    j9 = ym1Var6.n;
                    if (j9 != -9223372036854775807L) {
                        j2 = j9 / 2;
                    } else {
                        j8 /= 2;
                    }
                }
                this.t = (f35.i0(j2) + jElapsedRealtime) - ed2Var.e;
                if (this.q.o) {
                }
                if (!uri.equals(al0Var.x) || this.x) {
                    f(c());
                }
                return;
            }
            if (ym1Var6 == ym1Var7) {
                j8 /= 2;
            }
            j2 = j8;
            this.t = (f35.i0(j2) + jElapsedRealtime) - ed2Var.e;
            if (this.q.o) {
                if (uri.equals(al0Var.x)) {
                }
                f(c());
            }
        }
        ym1Var.getClass();
        j = ym1Var.k;
        yw1Var = ym1Var.r;
        j2 = 0;
        if (z) {
            if (ym1Var.o) {
                z2 = true;
                ym1Var4 = ym1Var7;
            } else if (ym1Var7.o) {
                ym1Var4 = ym1Var7;
                copyOnWriteArrayList = copyOnWriteArrayList;
                iOException = null;
                z2 = true;
            } else {
                z2 = true;
                ym1Var4 = new ym1(ym1Var7.d, ym1Var7.a, ym1Var7.b, ym1Var7.e, ym1Var7.g, ym1Var7.h, ym1Var7.i, ym1Var7.j, ym1Var7.k, ym1Var7.l, ym1Var7.m, ym1Var7.n, ym1Var7.c, true, ym1Var7.p, ym1Var7.q, ym1Var7.r, ym1Var7.s, ym1Var7.v, ym1Var7.t, ym1Var7.w);
            }
            iOException = null;
        } else {
            copyOnWriteArrayList = copyOnWriteArrayList;
            z2 = true;
            if (ym1Var.p) {
                j6 = ym1Var.h;
            } else {
                ym1Var2 = al0Var.y;
                if (ym1Var2 != null) {
                    j3 = ym1Var2.h;
                } else {
                    j3 = 0;
                }
                if (ym1Var7 == null) {
                    long j13 = ym1Var7.h;
                    j4 = ym1Var7.k;
                    yw1Var2 = ym1Var7.r;
                    size = yw1Var2.size();
                    i = (int) (j - j4);
                    if (i < yw1Var2.size()) {
                        vm1Var = (vm1) yw1Var2.get(i);
                    } else {
                        vm1Var = null;
                    }
                    if (vm1Var != null) {
                        j5 = vm1Var.r;
                    } else {
                        if (size == j - j4) {
                            j5 = ym1Var7.u;
                        }
                        if (ym1Var.i) {
                            i4 = ym1Var.j;
                        } else {
                            ym1Var3 = al0Var.y;
                            if (ym1Var3 != null) {
                                i2 = ym1Var3.j;
                            } else {
                                i2 = 0;
                            }
                            if (ym1Var7 == null) {
                                i3 = (int) (j - ym1Var7.k);
                                yw1Var3 = ym1Var7.r;
                                if (i3 < yw1Var3.size()) {
                                    vm1Var2 = (vm1) yw1Var3.get(i3);
                                } else {
                                    vm1Var2 = null;
                                }
                                if (vm1Var2 != null) {
                                    i2 = (ym1Var7.j + vm1Var2.q) - ((vm1) yw1Var.get(0)).q;
                                }
                            }
                            i4 = i2;
                        }
                        iOException = null;
                        ym1Var4 = new ym1(ym1Var.d, ym1Var.a, ym1Var.b, ym1Var.e, ym1Var.g, j7, true, i4, ym1Var.k, ym1Var.l, ym1Var.m, ym1Var.n, ym1Var.c, ym1Var.o, ym1Var.p, ym1Var.q, yw1Var, ym1Var.s, ym1Var.v, ym1Var.t, ym1Var.w);
                    }
                    j6 = j13 + j5;
                }
                j7 = j3;
                if (ym1Var.i) {
                    i4 = ym1Var.j;
                } else {
                    ym1Var3 = al0Var.y;
                    if (ym1Var3 != null) {
                        i2 = ym1Var3.j;
                    } else {
                        i2 = 0;
                    }
                    if (ym1Var7 == null) {
                        i3 = (int) (j - ym1Var7.k);
                        yw1Var3 = ym1Var7.r;
                        if (i3 < yw1Var3.size()) {
                            vm1Var2 = (vm1) yw1Var3.get(i3);
                        } else {
                            vm1Var2 = null;
                        }
                        if (vm1Var2 != null) {
                            i2 = (ym1Var7.j + vm1Var2.q) - ((vm1) yw1Var.get(0)).q;
                        }
                    }
                    i4 = i2;
                }
                iOException = null;
                ym1Var4 = new ym1(ym1Var.d, ym1Var.a, ym1Var.b, ym1Var.e, ym1Var.g, j7, true, i4, ym1Var.k, ym1Var.l, ym1Var.m, ym1Var.n, ym1Var.c, ym1Var.o, ym1Var.p, ym1Var.q, yw1Var, ym1Var.s, ym1Var.v, ym1Var.t, ym1Var.w);
            }
            j7 = j6;
            if (ym1Var.i) {
                i4 = ym1Var.j;
            } else {
                ym1Var3 = al0Var.y;
                if (ym1Var3 != null) {
                    i2 = ym1Var3.j;
                } else {
                    i2 = 0;
                }
                if (ym1Var7 == null) {
                    i3 = (int) (j - ym1Var7.k);
                    yw1Var3 = ym1Var7.r;
                    if (i3 < yw1Var3.size()) {
                        vm1Var2 = (vm1) yw1Var3.get(i3);
                    } else {
                        vm1Var2 = null;
                    }
                    if (vm1Var2 != null) {
                        i2 = (ym1Var7.j + vm1Var2.q) - ((vm1) yw1Var.get(0)).q;
                    }
                }
                i4 = i2;
            }
            iOException = null;
            ym1Var4 = new ym1(ym1Var.d, ym1Var.a, ym1Var.b, ym1Var.e, ym1Var.g, j7, true, i4, ym1Var.k, ym1Var.l, ym1Var.m, ym1Var.n, ym1Var.c, ym1Var.o, ym1Var.p, ym1Var.q, yw1Var, ym1Var.s, ym1Var.v, ym1Var.t, ym1Var.w);
        }
        this.q = ym1Var4;
        uri = this.n;
        if (ym1Var4 != ym1Var7) {
            this.w = iOException;
            this.s = jElapsedRealtime;
            if (uri.equals(al0Var.x)) {
                if (al0Var.y == null) {
                    al0Var.z = !ym1Var4.o;
                    al0Var.A = ym1Var4.h;
                }
                al0Var.y = ym1Var4;
                al0Var.v.u(ym1Var4);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((gn1) it2.next()).a();
            }
        } else if (!ym1Var4.o) {
            size2 = ym1Var.k + ((long) ym1Var.r.size());
            ym1Var5 = this.q;
            if (size2 < ym1Var5.k) {
                hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistResetException();
                z3 = z2;
            } else {
                if (jElapsedRealtime - this.s > f35.i0(ym1Var5.m) * 3.5d) {
                    hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistStuckException();
                } else {
                    hlsPlaylistTracker$PlaylistStuckException = iOException;
                }
                z3 = false;
            }
            if (hlsPlaylistTracker$PlaylistStuckException != null) {
                this.w = hlsPlaylistTracker$PlaylistStuckException;
                x7Var = new x7(z2 ? 1 : 0, 8, hlsPlaylistTracker$PlaylistStuckException);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((gn1) it.next()).b(uri, x7Var, z3);
                }
            }
        }
        ym1Var6 = this.q;
        xm1Var = ym1Var6.v;
        j8 = ym1Var6.m;
        if (!xm1Var.e) {
            if (ym1Var6 == ym1Var7) {
                j9 = ym1Var6.n;
                if (j9 != -9223372036854775807L) {
                    j2 = j9 / 2;
                } else {
                    j8 /= 2;
                }
            }
            this.t = (f35.i0(j2) + jElapsedRealtime) - ed2Var.e;
            if (this.q.o) {
                if (uri.equals(al0Var.x)) {
                }
                f(c());
            }
        }
        if (ym1Var6 == ym1Var7) {
            j8 /= 2;
        }
        j2 = j8;
        this.t = (f35.i0(j2) + jElapsedRealtime) - ed2Var.e;
        if (this.q.o) {
            if (uri.equals(al0Var.x)) {
            }
            f(c());
        }
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
        this.y.s.u(ed2Var, de3Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 jd2Var, long j, long j2, IOException iOException, int i) {
        de3 de3Var = (de3) jd2Var;
        long j3 = de3Var.a;
        int i2 = de3Var.c;
        ii0 ii0Var = de3Var.b;
        yl4 yl4Var = de3Var.d;
        Uri uri = yl4Var.p;
        ed2 ed2Var = new ed2(ii0Var, uri, yl4Var.q, j, j2, yl4Var.o);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        dd2 dd2Var = i61.s;
        al0 al0Var = this.y;
        if (z || z2) {
            int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).p : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.t = SystemClock.elapsedRealtime();
                d(false);
                ue1 ue1Var = al0Var.s;
                String str = f35.a;
                ue1Var.s(ed2Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return dd2Var;
            }
        }
        x7 x7Var = new x7(i, 8, iOException);
        Iterator it = al0Var.r.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((gn1) it.next()).b(this.n, x7Var, false);
        }
        i80 i80Var = al0Var.p;
        if (z3) {
            i80Var.getClass();
            long jE = i80.E(x7Var);
            dd2Var = jE != -9223372036854775807L ? new dd2(0, jE, false) : i61.t;
        }
        int i4 = dd2Var.a;
        boolean z4 = i4 == 0 || i4 == 1;
        al0Var.s.s(ed2Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !z4);
        if (!z4) {
            i80Var.getClass();
        }
        return dd2Var;
    }
}
