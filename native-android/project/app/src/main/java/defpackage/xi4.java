package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xi4 implements Callback, l83, px, xn4, zj2, me0, y45 {
    public static xi4 o;
    public final /* synthetic */ int n;

    public /* synthetic */ xi4(int r1) {
        this.n = r1;
    }

    public static List h(xi4 r0, Response r1, String r2) {
        if (r1.isSuccessful() == false) goto L22;
        if (r1.body() == null) goto L22;
        SubsonicResponse r3 = ((ApiResponse) r1.body()).getSubsonicResponse();
        if (r2.equals("similarSongs") == false) goto L12;
        if (r3.getSimilarSongs() == null) goto L12;
        List<Child> r4 = r3.getSimilarSongs().getSongs();
    L17:
        if (r4 == null) goto L20;
        return r4;
    L20:
        return new ArrayList();
    L12:
        if (r2.equals("similarSongs2") == true) goto L14;
    L16:
        r4 = null;
        goto L17
    L14:
        if (r3.getSimilarSongs2() == null) goto L16;
        r4 = r3.getSimilarSongs2().getSongs();
    L22:
        return new ArrayList();
    }

    public static final int i(int r1, long r2) {
        int r0 = e35.o;
        return ((int) (r2 >> (r1 * 15))) & 32767;
    }

    public static RectF j(TabLayout r3, View r4) {
        if (r4 != null) goto L6;
        return new RectF();
    L6:
        if (r3.Q == true) goto L15;
        if ((r4 instanceof mq4) == false) goto L15;
        mq4 r5 = (mq4) r4;
        int r6 = r5.getContentWidth();
        int r0 = r5.getContentHeight();
        int r1 = (int) vr1.l(r5.getContext(), 24);
        if (r6 >= r1) goto L12;
        r6 = r1;
    L12:
        int r2 = (r5.getRight() + r5.getLeft()) / 2;
        int r7 = (r5.getBottom() + r5.getTop()) / 2;
        int r8 = r6 / 2;
        return new RectF(r2 - r8, r7 - (r0 / 2), r8 + r2, (r2 / 2) + r7);
    L15:
        return new RectF(r4.getLeft(), r4.getTop(), r4.getRight(), r4.getBottom());
    }

    public static MediaCodec k(ml3 r2) {
        String r3 = ((dk2) r2.a).a;
        Trace.beginSection("createCodec:" + r3);
        MediaCodec r4 = MediaCodec.createByCodecName(r3);
        Trace.endSection();
        return r4;
    }

    public static mu4 m(String r2) {
        r2.getClass();
        int r0 = r2.hashCode();
        if (r0 == 79201641) goto L25;
        if (r0 == 79923350) goto L21;
        switch(r0) {
            case -503070503: goto L17;
            case -503070502: goto L13;
            case -503070501: goto L9;
            default: goto L28;
        };
    L28:
        kf2.n("Unexpected TLS version: ".concat(r2));
        return null;
    L9:
        if (r2.equals("TLSv1.3") == false) goto L28;
        return mu4.p;
    L13:
        if (r2.equals("TLSv1.2") == false) goto L28;
        return mu4.q;
    L17:
        if (r2.equals("TLSv1.1") == false) goto L28;
        return mu4.r;
    L21:
        if (r2.equals("TLSv1") == false) goto L28;
        return mu4.s;
    L25:
        if (r2.equals("SSLv3") == false) goto L28;
        return mu4.t;
    }

    public static Path p(float r1, float r2, float r3, float r4) {
        Path r0 = new Path();
        r0.moveTo(r1, r2);
        r0.lineTo(r3, r4);
        return r0;
    }

    public static k03 q(int r9, Integer r10, Integer r11) {
        k03 r0 = new k03();
        xc5 r1 = App.f(false).a();
        r1.getClass();
        Log.d("BrowsingClient", "getRandomSongs()");
        ((w8) r1.p).c(((pn4) r1.o).f(), r9, r10, r11, ud3.k()).enqueue(new r8(r0, 4));
        return r0;
    }

    public static k03 r(String r3) {
        k03 r0 = new k03();
        App.f(false).c().m(r3).enqueue(new ck(r0, 3));
        return r0;
    }

    public static k03 s(final int r3, final boolean r4, boolean r5) {
        final k03 r0 = new k03(Collections.EMPTY_LIST);
        if (r5 == false) goto L6;
        wn1.a(new vi4(r3, r0, r4));
        return r0;
    L6:
        App.f(false).a().s().enqueue(new o8(r4, r0, r3, 2));
        return r0;
    }

    private final void u(Call r1, Throwable r2) {
    }

    private final void v(Call r1, Throwable r2) {
    }

    private final void w(Call r1, Response r2) {
    }

    private final void x(Call r1, Response r2) {
    }

    @Override // defpackage.xn4
    public zn4 C(tb1 r1) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.xn4
    public int R(tb1 r1) {
        return 1;
    }

    @Override // defpackage.zj2
    public ak2 a(ml3 r5) {
        MediaCodec r4 = null;
        r4 = k(r5);     // Catch: RuntimeException -> L10 IOException -> L12
        Trace.beginSection("configureCodec");     // Catch: RuntimeException -> L10 IOException -> L12
        Surface r0 = (Surface) r5.d;     // Catch: RuntimeException -> L10 IOException -> L12
        if (r0 == null) goto L6;
    L14:
        int r1 = 0;
    L15:
        r4.configure((MediaFormat) r5.b, r0, (MediaCrypto) r5.e, r1);     // Catch: RuntimeException -> L10 IOException -> L12
        Trace.endSection();     // Catch: RuntimeException -> L10 IOException -> L12
        Trace.beginSection("startCodec");     // Catch: RuntimeException -> L10 IOException -> L12
        r4.start();     // Catch: RuntimeException -> L10 IOException -> L12
        Trace.endSection();     // Catch: RuntimeException -> L10 IOException -> L12
        return new rm3(r4, (ns3) r5.f);
    L6:
        if (((dk2) r5.a).h == false) goto L14;
        if (Build.VERSION.SDK_INT < 35) goto L14;
        r1 = 8;
    L12:
        e = e;
    L17:
        if (r4 == null) goto L19;
        r4.release();
    L19:
        throw e;
    L10:
        e = e;
        goto L17
    }

    @Override // defpackage.l83
    public long b(l51 r1) {
        return -1;
    }

    @Override // defpackage.y45
    public void c(MediaExtractor r7, Object r8) {
        switch(this.n) {
            case 27: goto L6;
            default: goto L4;
        };
    L4:
        r7.setDataSource(new x45((ByteBuffer) r8));
        return;
    L6:
        AssetFileDescriptor r9 = (AssetFileDescriptor) r8;
        r7.setDataSource(r9.getFileDescriptor(), r9.getStartOffset(), r9.getLength());
    }

    @Override // defpackage.px
    public String d(ii0 r6) {
        r6.getClass();
        Uri r5 = r6.a;
        String r7 = r6.h;
        String r0 = null;
        if (r7 != null) goto L5;
    L10:
        r5.getClass();
        String r8 = r5.getScheme();
        if (h12.c(r8, "http") == false) goto L13;
    L38:
        r0 = r5.getQueryParameter("id");     // Catch: UnsupportedOperationException -> L18
    L20:
        if (r0 != null) goto L23;
        String r9 = r5.toString();
        r9.getClass();
        return r9;
    L23:
        String r10 = r5.getQueryParameter("maxBitRate");
        String r1 = "";
        if (r10 != null) goto L26;
        r10 = "";
    L26:
        String r2 = r5.getQueryParameter("format");
        if (r2 != null) goto L29;
        r2 = "";
    L29:
        String r3 = r5.getQueryParameter("timeOffset");
        if (r3 != null) goto L32;
        r3 = "";
    L32:
        String r4 = ud3.E();
        if (r4 == null) goto L37;
        r1 = r4;
    L37:
        return ot1.i(r5, r1 + "|" + r0 + "|" + r10 + "|" + r2 + "|" + r3);
    L18:
        e = move-exception;
        Log.d("StreamingCacheKeyFactory", "Opaque URI, falling back to URL-based cache key", e);
        goto L20
    L13:
        if (h12.c(r8, "https") == true) goto L38;
        String r11 = r5.toString();
        r11.getClass();
        return ot1.i(r5, r11);
    L5:
        if (r7.equals(r5.toString()) == false) goto L8;
        r7 = null;
    L8:
        if (r7 == null) goto L10;
        return r7;
    }

    @Override // defpackage.l83
    public m84 e() {
        return new bo(-9223372036854775807L);
    }

    @Override // defpackage.y45
    public void f(MediaMetadataRetriever r7, Object r8) {
        switch(this.n) {
            case 27: goto L6;
            default: goto L4;
        };
    L4:
        r7.setDataSource(new x45((ByteBuffer) r8));
        return;
    L6:
        AssetFileDescriptor r9 = (AssetFileDescriptor) r8;
        r7.setDataSource(r9.getFileDescriptor(), r9.getStartOffset(), r9.getLength());
    }

    @Override // defpackage.l83
    public void g(long r1) {
    }

    public void l(String r4, k03 r5) {
        gp3 r0 = App.f(false).c();
        r0.getClass();
        Log.d("BrowsingClient", "getSimilarSongs()");
        ((ov) r0.p).g(((pn4) r0.o).f(), r4, 25).enqueue(new qr2(18, this, r5));
    }

    @Override // defpackage.xn4
    public boolean n(tb1 r1) {
        return false;
    }

    public k03 o(String r7, fb0 r8, int r9) {
        k03 r2 = new k03(new ArrayList());
        wi4 r0 = new wi4(this, r2, new HashSet(), r9, r7);
        int r6 = r8.ordinal();
        if (r6 != 0) goto L5;
        gp3 r10 = App.f(false).c();
        r10.getClass();
        Log.d("BrowsingClient", "getSimilarSongs2()");
        ((ov) r10.p).a(((pn4) r10.o).f(), r7, r9).enqueue(new ue1(this, r9, r0, 13));
        return r2;
    L5:
        if (r6 != 1) goto L7;
        App.f(false).c().e(r7).enqueue(new x7(r9, r0));
        return r2;
    L7:
        if (r6 == 2) goto L9;
        return r2;
    L9:
        App.f(false).c().m(r7).enqueue(new rm2(19, r0));
        return r2;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r1, Throwable r2) {
        int r0 = this.n;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r1, Response r2) {
        int r0 = this.n;
    }

    public boolean t(CharSequence r1) {
        return false;
    }

    public String toString() {
        switch(this.n) {
            case 6: goto L10;
            case 7: goto L8;
            case 11: goto L6;
            default: goto L5;
        };
    L6:
        return "ReusedSlotId";
    L8:
        return "SharingStarted.Lazily";
    L10:
        return "SharingStarted.Eagerly";
    L5:
        return super.toString();
    }

    public void y(TabLayout r1, View r2, View r3, float r4, Drawable r5) {
        RectF r0 = j(r1, r2);
        RectF r6 = j(r1, r3);
        r5.setBounds(yd.c((int) r0.left, r4, (int) r6.left), r5.getBounds().top, yd.c((int) r0.right, r4, (int) r6.right), r5.getBounds().bottom);
    }
}
