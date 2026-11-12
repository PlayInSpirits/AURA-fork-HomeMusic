package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mj0 implements qc2, rs4, xv2, eg1, dw4, vw0, ry0, r83 {
    public final /* synthetic */ int n;

    public /* synthetic */ mj0(oe1 r1) {
        this.n = 22;
    }

    public static /* synthetic */ void f(int r1, String r2) {
        throw new IllegalArgumentException(r2 + r1);
    }

    public static /* synthetic */ void g(Object r2, String r3) {
        throw new IllegalStateException((r3 + r2).toString());
    }

    public static /* synthetic */ void i(String r1) {
        throw new IOException(r1);
    }

    public static /* synthetic */ void j(String r1, Throwable r2) {
        throw new IllegalStateException(r1, r2);
    }

    public static /* synthetic */ void k(Object r2, String r3) {
        throw new FileNotFoundException(r3 + r2);
    }

    public static /* synthetic */ void l(Object r2, String r3) {
        throw new IllegalArgumentException(r3 + r2);
    }

    public static /* synthetic */ void m(Object r1, String r2) {
        throw new IOException(r2 + r1);
    }

    @Override // defpackage.vw0
    public void a() {
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object r4) {
        switch(this.n) {
            case 8: goto L12;
            case 16: goto L11;
            case 20: goto L8;
            case 22: goto L7;
            default: goto L4;
        };
    L4:
        ln1 r5 = (ln1) r4;
        r5.v();
        return yw1.k(hw.P(new tb4(10), r5.V.b));
    L8:
        o42 r6 = (o42) r4;
        return r6.a + ": " + r6.b;
    L12:
        tv4 r7 = (tv4) r4;
        r7.getClass();
        Bundle r3 = new Bundle();
        String r0 = tv4.e;
        gy3 r8 = r7.b;
        ArrayList<? extends Parcelable> r1 = new ArrayList(r8.q);
        vw1 r9 = r8.m(0);
    L14:
        if (r9.hasNext() == false) goto L16;
        r1.add(((sv4) r9.next()).d());
        goto L14
    L16:
        r3.putParcelableArrayList(r0, r1);
        return r3;
    L7:
        return (pv4) r4;
    L11:
        return new nj0((vp4) r4);
    }

    @Override // defpackage.ry0
    public float b(float r1) {
        return r1;
    }

    @Override // defpackage.dw4
    public void c() {
        jn0 r0 = zs0.c;
    }

    public Constructor d() {
        switch(this.n) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(k51.class).getConstructor(null);
    L7:
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null)) == true) goto L9;
        return null;
    L9:
        return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(k51.class).getConstructor(new Class[]{Integer.TYPE});
    }

    @Override // defpackage.rs4
    public void e(jg0 r1) {
    }

    @Override // defpackage.xv2
    public void h(qv2 r1) {
    }

    @Override // defpackage.qc2
    public void invoke(Object r4) {
        switch(this.n) {
            case 0: goto L10;
            case 1: goto L8;
            case 17: goto L6;
            default: goto L4;
        };
    L4:
        ((oi3) r4).J();
        return;
    L6:
        ((oi3) r4).S(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
        return;
    L8:
        ((ho2) r4).getClass();
        return;
    L10:
        ((ho2) r4).getClass();
    }

    @Override // defpackage.r83
    public pb5 x(View r4, pb5 r5) {
        r4.getClass();
        vz1 r3 = r5.a.h(527);
        r3.getClass();
        int r0 = r3.b;
        int r6 = r3.d;
        r4.setPadding(r4.getPaddingLeft(), r0, r4.getPaddingRight(), r6);
        return r5;
    }

    public /* synthetic */ mj0(int r1) {
        this.n = r1;
    }
}
