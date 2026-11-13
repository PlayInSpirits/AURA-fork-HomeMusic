package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import com.eddyizm.tempus.service.MediaService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public o31(MediaService mediaService) {
        n31 n31Var = new n31(mediaService, 0);
        n31 n31Var2 = new n31(mediaService, 1);
        n31 n31Var3 = new n31(mediaService, 2);
        di0 di0Var = new di0(3);
        n31 n31Var4 = new n31(mediaService, 3);
        this.a = mediaService;
        this.c = n31Var;
        this.d = n31Var2;
        this.e = n31Var3;
        this.f = di0Var;
        this.g = n31Var4;
        this.h = f35.x();
        this.j = il.i;
        this.l = 0;
        this.o = 1;
        this.p = true;
        this.q = n84.d;
        this.s = 5000L;
        this.t = 15000L;
        this.u = 3000L;
        this.r = i74.b;
        this.v = new ul0(f35.Q(20L), f35.Q(500L));
        this.b = vp4.a;
        this.w = 500L;
        this.x = 2000L;
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
