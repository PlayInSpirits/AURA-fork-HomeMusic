package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y41 implements v11, m51, q51, bi0, ro4, d04, d14, w04, fi1 {
    public final /* synthetic */ int n;

    public /* synthetic */ y41(int r1) {
        this.n = r1;
    }

    public static final float e(float r7, float[] r8, float[] r9) {
        float r0 = Math.abs(r7);
        float r1 = Math.signum(r7);
        int r2 = Arrays.binarySearch(r8, r0);
        if (r2 >= 0) goto L5;
        int r3 = -(r2 + 1);
        int r4 = r3 - 1;
        if (r4 < (r8.length - 1)) goto L14;
        float r5 = r8[r8.length - 1];
        float r10 = r9[r8.length - 1];
        if (r5 != 0.0f) goto L12;
        return 0.0f;
    L12:
        return (r10 / r5) * r7;
    L14:
        if (r4 != (-1)) goto L16;
        float r11 = r8[0];
        float r12 = r9[0];
        float r13 = r11;
        float r14 = 0.0f;
        float r6 = 0.0f;
    L18:
        if (r14 != r13) goto L20;
        float r15 = 0.0f;
    L22:
        return (((r12 - r6) * Math.max(0.0f, Math.min(1.0f, r15))) + r6) * r1;
    L20:
        r15 = (r0 - r14) / (r13 - r14);
        goto L22
    L16:
        float r16 = r8[r4];
        float r17 = r8[r3];
        r6 = r9[r4];
        r14 = r16;
        r12 = r9[r3];
        r13 = r17;
        goto L18
    L5:
        return r1 * r9[r2];
    }

    public static final void h(List r6, StringBuilder r7) {
        h02 r0 = gb.b0(gb.g0(0, r6.size()), 2);
        int r1 = r0.n;
        int r2 = r0.o;
        int r3 = r0.p;
        if (r3 <= 0) goto L5;
        if (r1 > r2) goto L5;
    L7:
        String r4 = (String) r6.get(r1);
        String r5 = (String) r6.get(r1 + 1);
        if (r1 <= 0) goto L10;
        r7.append('&');
    L10:
        r7.append(r4);
        if (r5 == null) goto L13;
        r7.append('=');
        r7.append(r5);
    L13:
        if (r1 == r2) goto L19;
        r1 = r1 + r3;
        goto L7
    L19:
        return;
    L5:
        if (r3 >= 0) goto L15;
        if (r2 <= r1) goto L7;
        return;
    }

    public static k03 j(int r4, boolean r5) {
        k03 r0 = new k03();
        gp3 r1 = App.f(false).c();
        r1.getClass();
        Log.d("BrowsingClient", "getGenres()");
        ((ov) r1.p).i(((pn4) r1.o).f()).enqueue(new o8(r4, r0, r5));
        return r0;
    }

    private final void k(Object r1) {
    }

    @Override // defpackage.d04
    public c04 a(a r1, s92 r2, f04 r3, Context r4) {
        return new oi1(r1, r2, r3, r4);
    }

    @Override // defpackage.v11
    public short b() {
        return 0;
    }

    @Override // defpackage.fi1
    public g04 build() {
        return new g04();
    }

    @Override // defpackage.ro4
    public so4 c(y10 r7) {
        return new bf1((Context) r7.d, (String) r7.e, (uv) r7.f, r7.b, r7.c);
    }

    @Override // defpackage.v11
    public short[] d() {
        return null;
    }

    @Override // defpackage.v11
    public boolean f(Context r2, int r3) {
        if (r3 != 0) goto L5;
        return false;
    L5:
        Intent r1 = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        r1.putExtra("android.media.extra.AUDIO_SESSION", r3);
        r1.putExtra("android.media.extra.PACKAGE_NAME", r2.getApplicationContext().getPackageName());
        r2.sendBroadcast(r1);
        return true;
    }

    @Override // defpackage.q51
    public Object g() {
        return new ArrayList();
    }

    @Override // defpackage.c11
    public boolean i(Object r1, File r2, db3 r3) {
        vw.d(((bi1) ((vh1) ((q04) r1).get()).n.b).a.d.asReadOnlyBuffer(), r2);     // Catch: IOException -> L6
        return true;
    L6:
        e = move-exception;
        if (Log.isLoggable("GifEncoder", 5) == false) goto L14;
        Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
        return false;
    L14:
        return false;
    }

    @Override // defpackage.w04
    public int l(db3 r1) {
        return 1;
    }

    @Override // defpackage.bi0
    public ci0 m() {
        return new t61(false);
    }

    @Override // defpackage.v11
    public Integer n(short r1) {
        return null;
    }

    @Override // defpackage.v11
    public void o(Context r2, int r3) {
        if (r3 != 0) goto L4;
        return;
    L4:
        Intent r1 = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        r1.putExtra("android.media.extra.AUDIO_SESSION", r3);
        r1.putExtra("android.media.extra.PACKAGE_NAME", r2.getApplicationContext().getPackageName());
        r2.sendBroadcast(r1);
    }

    @Override // defpackage.m51
    public void p() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.d14
    public q04 q(q04 r4, db3 r5) {
        ByteBuffer r3 = ((bi1) ((vh1) r4.get()).n.b).a.d.asReadOnlyBuffer();
        AtomicReference r6 = vw.a;
        if (r3.isReadOnly() == false) goto L5;
    L7:
        k35 r7 = null;
    L8:
        if (r7 != null) goto L10;
    L14:
        ByteBuffer r8 = r3.asReadOnlyBuffer();
        byte[] r9 = new byte[r8.limit()];
        ByteBuffer r0 = (ByteBuffer) r8.position(0);
        r8.get(r9);
        byte[] r10 = r9;
    L16:
        return new ld(r10);
    L10:
        if (r7.a != 0) goto L14;
        if (r7.b != r7.c.length) goto L14;
        r10 = r3.array();
        goto L16
    L5:
        if (r3.hasArray() == false) goto L7;
        r7 = new k35(r3.array(), r3.arrayOffset(), r3.limit());
        goto L8
    }

    @Override // defpackage.v11
    public void setEnabled(boolean r1) {
    }

    @Override // defpackage.m51
    public wv4 t(int r1, int r2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v11
    public void v(short r1, short r2) {
    }

    @Override // defpackage.m51
    public void w(m84 r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.v11
    public Short z(short r1) {
        return null;
    }
}
