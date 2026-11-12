package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class au {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public au(BottomSheetBehavior r3, View r4, md1 r5) {
        this.a = false;
        this.f = new Handler(Looper.getMainLooper());
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = new xi3();
        r3.w(new wt(1, this));
    }

    public void a(float r5) {
        xi3 r4 = (xi3) this.e;
        if (r4 == null) goto L15;
        ns3 r6 = r4.o0;
        if (r6 == null) goto L7;
        ConstraintLayout r7 = (ConstraintLayout) ((ae1) r6.q).b;
    L8:
        if (r7 == null) goto L16;
        float r8 = Math.max(0.0f, Math.min(0.2f, r5 - 0.2f)) / 0.2f;
        r7.setAlpha(1.0f - r8);
        if (r8 <= 0.99d) goto L12;
        int r9 = 8;
    L13:
        r7.setVisibility(r9);
        return;
    L12:
        r9 = 0;
        goto L13
    L16:
        return;
    L7:
        r7 = null;
        goto L8
    }

    public tj0 b() {
        Context r0 = (Context) this.b;
        boolean r2 = true;
        rr2.w(!this.a);
        this.a = true;
        if (((qp4) this.d) != null) goto L5;
        this.d = new qp4(new im[0]);
    L5:
        dn r1 = (dn) this.f;
        wo0 r4 = (wo0) this.g;
        if (r1 != null) goto L29;
        if (r4 != null) goto L10;
        this.g = new wo0(r0);
    L10:
        if (((fz0) this.e) != null) goto L12;
        this.e = fz0.T;
    L12:
        ss0 r3 = new ss0();
        nl r5 = null;
        if (r0 == null) goto L15;
        Context r6 = r0.getApplicationContext();
    L16:
        r3.n = r6;
        r3.p = fz0.T;
        if (r0 != null) goto L19;
        r3.q = nl.c;
    L19:
        if (r0 != null) goto L22;
        r5 = (nl) this.c;
    L22:
        Context r7 = (Context) r3.n;
        if (r7 != null) goto L25;
        r3.q = r5;
    L25:
        wo0 r8 = (wo0) this.g;
        r3.o = r8;
        r3.p = (fz0) this.e;
        if (r8 != null) goto L28;
        r3.o = new wo0(r7);
    L28:
        this.f = new dn(r3);
    L38:
        return new tj0(this);
    L15:
        r6 = null;
        goto L16
    L29:
        if (r4 != null) goto L31;
        boolean r9 = true;
    L32:
        rr2.w(r9);
        if (((fz0) this.e) == null) goto L36;
        r2 = false;
    L36:
        rr2.w(r2);
        goto L38
    L31:
        r9 = false;
        goto L32
    }

    public lt2 c(int r8) {
        HashMap r0 = (HashMap) this.d;
        lt2 r1 = (lt2) r0.get(Integer.valueOf(r8));
        if (r1 == null) goto L5;
        return r1;
    L5:
        HashMap r2 = (HashMap) this.c;
        go4 r3 = (go4) r2.get(Integer.valueOf(r8));
        if (r3 != null) goto L26;
        final bi0 r4 = (bi0) this.e;
        r4.getClass();
        final int r5 = 0;
        if (r8 == 0) goto L24;
        final int r6 = 1;
        if (r8 == 1) goto L23;
        final int r7 = 2;
        if (r8 != 2) goto L15;
        final Class r9 = HlsMediaSource$Factory.class.asSubclass(lt2.class);
        go4 r10 = new am0(r9, r4, r7);
    L19:
        r3 = r10;
    L25:
        r2.put(Integer.valueOf(r8), r3);
        goto L26
    L15:
        if (r8 != 3) goto L17;
        r3 = new sl(r6, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(lt2.class));
        goto L25
    L17:
        if (r8 != 4) goto L20;
        r10 = new bm0(r5, this, r4);
        goto L19
    L20:
        kf2.n(f34.f(r8, "Unrecognized contentType: "));
        r3 = null;
        goto L26
    L23:
        final Class<? extends U> r11 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(lt2.class);
        r10 = new am0(r11, r4, r6);
        goto L19
    L24:
        final Class<? extends U> r12 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(lt2.class);
        r3 = new am0(r12, r4, r5);
    L26:
        lt2 r13 = (lt2) r3.get();
        yc5 r14 = (yc5) this.g;
        if (r14 == null) goto L29;
        r13.e(r14);
    L29:
        r13.a((om0) this.f);
        r13.c(this.a);
        r13.b();
        r0.put(Integer.valueOf(r8), r13);
        return r13;
    }

    public void d(boolean r1) {
        BottomSheetBehavior r0 = (BottomSheetBehavior) this.b;
        if (r1 == false) goto L5;
    L9:
        r0.J(4);
        return;
    L5:
        if (u52.c().a == true) goto L9;
        r0.J(5);
    }

    public au(Context r1) {
        this.b = r1;
        this.c = nl.c;
    }

    public au(n51 r1, om0 r2) {
        this.b = r1;
        this.f = r2;
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = true;
    }
}
