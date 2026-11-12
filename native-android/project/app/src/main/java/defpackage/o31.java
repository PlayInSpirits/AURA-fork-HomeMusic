package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import com.eddyizm.tempus.service.MediaService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o31 {
    public final int A;
    public final int B;
    public final boolean C;
    public boolean D;
    public final String E;
    public final boolean F;
    public final MediaService a;
    public final vp4 b;
    public go4 c;
    public go4 d;
    public final n31 e;
    public go4 f;
    public final n31 g;
    public final Looper h;
    public final int i;
    public il j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public final int o;
    public final boolean p;
    public final n84 q;
    public final i74 r;
    public final long s;
    public final long t;
    public final long u;
    public final ul0 v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    public o31(MediaService r9) {
        n31 r0 = new n31(r9, 0);
        n31 r2 = new n31(r9, 1);
        n31 r4 = new n31(r9, 2);
        di0 r5 = new di0(3);
        n31 r7 = new n31(r9, 3);
        this.a = r9;
        this.c = r0;
        this.d = r2;
        this.e = r4;
        this.f = r5;
        this.g = r7;
        this.h = f35.x();
        this.j = il.i;
        this.l = 0;
        this.o = 1;
        this.p = true;
        this.q = n84.d;
        this.s = 5000;
        this.t = 15000;
        this.u = 3000;
        this.r = i74.b;
        this.v = new ul0(f35.Q(20), f35.Q(500));
        this.b = vp4.a;
        this.w = 500;
        this.x = 2000;
        this.y = 600000;
        this.z = ExoPlayer.a;
        this.A = 60000;
        this.B = 600000;
        this.C = true;
        this.E = "";
        this.i = -1000;
        new om0();
        this.F = true;
    }
}
