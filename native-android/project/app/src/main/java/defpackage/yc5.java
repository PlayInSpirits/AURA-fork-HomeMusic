package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc5 implements aw1, kg1, Callback {
    public Object n;
    public Object o;
    public Object p;

    public yc5(int r1) {
        switch(r1) {
            case 10: goto L5;
            default: goto L3;
        };
    L3:
        this.n = new Object();
        return;
    L5:
        this.n = new WeakHashMap();
        this.o = new WeakHashMap();
        this.p = new WeakHashMap();
    }

    public static kk0 a(ym2 r14) {
        bl0 r0 = new bl0(0);
        Uri r2 = r14.b;
        byte[] r10 = null;
        if (r2 != null) goto L5;
        String r3 = null;
    L6:
        ll r4 = new ll(r3, r14.f, r0);
        bx1 r1 = r14.c;
        jx1 r5 = r1.n;
        if (r5 != null) goto L9;
        r5 = r1.c();
        r1.n = r5;
    L9:
        o15 r6 = r5.h();
    L11:
        if (r6.hasNext() == false) goto L21;
        Map.Entry r7 = (Map.Entry) r6.next();
        String r8 = (String) r7.getKey();
        String r9 = (String) r7.getValue();
        r8.getClass();
        r9.getClass();
        HashMap r11 = (HashMap) r4.r;
        monitor-enter(r11);
        ((HashMap) r4.r).put(r8, r9);     // Catch: Throwable -> L17
        monitor-exit(r11);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    L21:
        HashMap r12 = new HashMap();
        UUID r13 = ax.a;
        i80 r15 = new i80(28);
        UUID r16 = r14.a;
        r16.getClass();
        boolean r17 = r14.d;
        boolean r18 = r14.e;
        int[] r19 = jz4.N(r14.g);
        int r20 = r19.length;
        int r21 = 0;
    L22:
        if (r21 >= r20) goto L29;
        int r110 = r19[r21];
        boolean r111 = true;
        if (r110 == 2) goto L28;
        if (r110 == 1) goto L28;
        r111 = false;
    L28:
        rr2.l(r111);
        r21 = r21 + 1;
        goto L22
    L29:
        kk0 r22 = new kk0(r16, r4, r12, r17, (int[]) r19.clone(), r18, r15);
        byte[] r112 = r14.h;
        if (r112 == null) goto L32;
        r10 = Arrays.copyOf(r112, r112.length);
    L32:
        rr2.w(r22.m.isEmpty());
        r22.v = r10;
        return r22;
    L5:
        r3 = r2.toString();
        goto L6
    }

    public ww0 b(gn2 r3) {
        r3.b.getClass();
        ym2 r4 = r3.b.c;
        if (r4 == null) goto L5;
        Object r0 = this.n;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (r4.equals((ym2) this.o) == true) goto L13;
        this.o = r4;     // Catch: Throwable -> L11
        this.p = a(r4);     // Catch: Throwable -> L11
    L13:
        kk0 r2 = (kk0) this.p;     // Catch: Throwable -> L11
        r2.getClass();     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return r2;
    L5:
        return ww0.a;
    }

    @Override // defpackage.aw1
    public int c() {
        List r0 = (List) this.p;
        aw3 r1 = (aw3) ((hg3) this.n).o;
        r1.reset();
        return kb4.A(r0, r1, (qj0) this.o);
    }

    @Override // defpackage.kg1
    public void h(Object r5) {
        View r6 = (View) r5;
        ViewGroup r0 = (ViewGroup) this.o;
        View r1 = (View) this.n;
        ViewGroup.LayoutParams r2 = r1.getLayoutParams();
        if (r2 == null) goto L6;
        r6.setId(R.id.exo_media_route_button_placeholder);
        r6.setLayoutParams(r2);
        int r3 = r0.indexOfChild(r1);
        r0.removeView(r1);
        r0.addView(r6, r3);
        r6.setVisibility(0);
        ((PlayerControlView) this.p).n.h(r6, true);
        return;
    L6:
        kf2.o("The media route button placeholder missing layout params.");
    }

    @Override // defpackage.aw1
    public Bitmap i(BitmapFactory.Options r2) {
        aw3 r1 = (aw3) ((hg3) this.n).o;
        r1.reset();
        return BitmapFactory.decodeStream(r1, null, r2);
    }

    @Override // defpackage.aw1
    public void k() {
        aw3 r1 = (aw3) ((hg3) this.n).o;
        monitor-enter(r1);
        r1.p = r1.n.length;     // Catch: Throwable -> L7
        monitor-exit(r1);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.aw1
    public ImageHeaderParser$ImageType l() {
        List r0 = (List) this.p;
        aw3 r1 = (aw3) ((hg3) this.n).o;
        r1.reset();
        return kb4.B(r0, r1, (qj0) this.o);
    }

    @Override // defpackage.kg1
    public void o(Throwable r1) {
        ((View) this.n).setVisibility(8);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        ((xi4) this.p).l((String) this.o, (k03) this.n);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r3, Response r4) {
        k03 r5 = (k03) this.n;
        xi4 r0 = (xi4) this.p;
        List r6 = xi4.h(r0, r4, "similarSongs2");
        if (r6.isEmpty() == true) goto L6;
        r5.i(r6);
        return;
    L6:
        r0.l((String) this.o, r5);
    }

    public /* synthetic */ yc5(Object r1, Object r2, Object r3) {
        this.p = r1;
        this.n = r2;
        this.o = r3;
    }

    public yc5(zg5 r1) {
        this.n = r1;
        this.o = Choreographer.getInstance();
        this.p = new sd(this);
    }
}
