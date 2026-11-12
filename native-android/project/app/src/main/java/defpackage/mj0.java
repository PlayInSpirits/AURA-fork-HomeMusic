package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mj0 implements qc2, rs4, xv2, eg1, dw4, vw0, ry0, r83 {
    public final /* synthetic */ int n;

    public static /* synthetic */ void f(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void j(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void k(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // defpackage.vw0
    public void a() {
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object obj) {
        switch (this.n) {
            case 8:
                tv4 tv4Var = (tv4) obj;
                tv4Var.getClass();
                Bundle bundle = new Bundle();
                String str = tv4.e;
                gy3 gy3Var = tv4Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(gy3Var.q);
                vw1 vw1VarM = gy3Var.listIterator(0);
                while (vw1VarM.hasNext()) {
                    arrayList.add(((sv4) vw1VarM.next()).d());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            case WaveRetry.MAX_FAILURES /* 16 */:
                return new nj0((vp4) obj);
            case 20:
                o42 o42Var = (o42) obj;
                return o42Var.a + ": " + o42Var.b;
            case 22:
                return (pv4) obj;
            default:
                ln1 ln1Var = (ln1) obj;
                ln1Var.v();
                return yw1.k(hw.P(new tb4(10), ln1Var.V.b));
        }
    }

    @Override // defpackage.ry0
    public float b(float f) {
        return f;
    }

    @Override // defpackage.dw4
    public void c() {
        jn0 jn0Var = zs0.c;
    }

    public Constructor d() {
        switch (this.n) {
            case 2:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(k51.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(k51.class).getConstructor(null);
        }
    }

    @Override // defpackage.rs4
    public void e(jg0 jg0Var) {
    }

    @Override // defpackage.xv2
    public void h(qv2 qv2Var) {
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        switch (this.n) {
            case 0:
                ((ho2) obj).getClass();
                break;
            case 1:
                ((ho2) obj).getClass();
                break;
            case 17:
                ((oi3) obj).S(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
            default:
                ((oi3) obj).J();
                break;
        }
    }

    @Override // defpackage.r83
    public pb5 x(View view, pb5 pb5Var) {
        view.getClass();
        vz1 vz1VarH = pb5Var.a.h(527);
        vz1VarH.getClass();
        view.setPadding(view.getPaddingLeft(), vz1VarH.b, view.getPaddingRight(), vz1VarH.d);
        return pb5Var;
    }

    public /* synthetic */ mj0(int i) {
        this.n = i;
    }
}
