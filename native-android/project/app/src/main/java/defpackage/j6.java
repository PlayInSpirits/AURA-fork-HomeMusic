package defpackage;

import android.net.Uri;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import java.io.IOException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 implements ci0 {
    public final /* synthetic */ int n;
    public final ci0 o;
    public final Object p;
    public Object q;
    public Object r;

    public j6(ci0 r2) {
        this.n = 1;
        this.o = r2;
        this.p = new ArrayList();
    }

    public static ii0 o(ii0 r3, String r4, boolean r5) {
        String r0 = rr1.c();
        boolean r1 = h12.c(r3.a.getScheme(), "homemusic-hub");
        String r6 = URLEncoder.encode(r4, "UTF-8");
        String r2 = "";
        if (r5 == false) goto L5;
        String r7 = "&q=mobile";
    L6:
        if (r1 == false) goto L8;
        r2 = "&full=1";
    L8:
        String r8 = r0 + "/api/listen/stream?ref=" + r6 + r7 + r2;
        HashMap r9 = new HashMap(r3.e);
        Object r10 = CookieManager.getInstance().getCookie(r8);     // Catch: Throwable -> L11
    L14:
        if ((r10 instanceof s14) == false) goto L16;
        r10 = null;
    L16:
        String r11 = (String) r10;
        if (r11 == null) goto L19;
        r9.put("Cookie", r11);
    L19:
        hi0 r12 = r3.a();
        r12.a = Uri.parse(r8);
        r12.e = r9;
        return r12.a();
    L11:
        th = move-exception;
        r10 = new s14(th);
        goto L14
    L5:
        r7 = "";
        goto L6
    }

    @Override // defpackage.ci0
    public final long b(ii0 r19) {
        int r0 = this.n;
        Object r3 = this.p;
        ci0 r4 = this.o;
        switch(r0) {
            case 0: goto L110;
            default: goto L4;
        };
    L4:
        r19.getClass();
        String r8 = r19.h;
        Uri r1 = r19.a;
        String r9 = r1.toString();
        r9.getClass();
        boolean r10 = jp1.a();
        if (r8 != null) goto L7;
    L10:
        String r11 = r1.getLastPathSegment();
        long r12 = r19.f;
        StringBuilder r13 = b11.u("open ", r11, " key=", r8, " light=");
        r13.append(r10);
        r13.append(" at ");
        r13.append(r12);
        Log.d("HubTracks", r13.toString());
        boolean r14 = h12.c(r1.getScheme(), "homemusic-hub");
        if (r14 == true) goto L14;
        if (r10 == false) goto L14;
        String r15 = uo.x(r1.toString());
    L15:
        if (r14 == true) goto L18;
        if (r15 != null) goto L18;
        this.q = r4;
        return r4.b(r19);
    L18:
        el0 r16 = new el0(15000, 45000, true, new qr2(10));
        ArrayList r5 = (ArrayList) r3;
        int r6 = r5.size();
        int r17 = 0;
    L19:
        if (r17 >= r6) goto L21;
        Object r18 = r5.get(r17);
        r17 = r17 + 1;
        r16.c((rw4) r18);
        goto L19
    L21:
        this.q = r16;
        if (r15 == null) goto L25;
        String r2 = "nd:".concat(r15);
    L24:
        String r7 = r2;
        long r110 = r16.b(o(r19, r7, r10));     // Catch: IOException -> L31 HttpDataSource$InvalidResponseCodeException -> L33
    L44:
        if (r14 == false) goto L60;
        Set r20 = r16.j().entrySet();     // Catch: IOException -> L31
        if ((r20 instanceof Collection) == true) goto L48;
    L50:
        Iterator r21 = r20.iterator();     // Catch: IOException -> L31
    L52:
        if (r21.hasNext() == false) goto L60;
        Map.Entry r22 = (Map.Entry) r21.next();     // Catch: IOException -> L31
        if (xm4.f0((String) r22.getKey(), "X-HomeMusic-Listen-Kind", true) == false) goto L52;
        Object r23 = r22.getValue();     // Catch: IOException -> L31
        r23.getClass();     // Catch: IOException -> L31
        if (h12.c(q40.x0((List) r23), "preview") == false) goto L52;
        throw new IOException(App.a().getString(R.string.homemusic_full_track_unavailable));     // Catch: IOException -> L31
    L48:
        if (r20.isEmpty() == false) goto L50;
    L60:
        if (r10 == false) goto L123;
        Iterator r24 = r16.j().entrySet().iterator();     // Catch: IOException -> L31
    L63:
        if (r24.hasNext() == false) goto L67;
        Object r25 = r24.next();     // Catch: IOException -> L31
        if (xm4.f0((String) ((Map.Entry) r25).getKey(), "X-HomeMusic-Variant", true) == false) goto L63;
    L68:
        Map.Entry r26 = (Map.Entry) r25;     // Catch: IOException -> L31
        if (r26 == null) goto L75;
        List r27 = (List) r26.getValue();     // Catch: IOException -> L31
        if (r27 == null) goto L75;
        String r28 = (String) q40.x0(r27);     // Catch: IOException -> L31
        if (r28 == null) goto L75;
        String r29 = qm4.K0(r28).toString();     // Catch: IOException -> L31
    L77:
        if (h12.c(r29, "original-pending") == false) goto L123;
        if (r8 == null) goto L123;
        this.r = r8;     // Catch: IOException -> L31
        ConcurrentHashMap r30 = ot1.b;     // Catch: IOException -> L31
        nt1 r31 = nt1.n;     // Catch: IOException -> L31
        r30.merge(r8, 1, new j61(2));     // Catch: IOException -> L31
    L75:
        r29 = null;
        goto L77
    L67:
        r25 = null;
    L123:
        return r110;
    L31:
        e = move-exception;
        if (r15 == null) goto L90;
        Log.w("HubTracks", "the Hub does not give " + r7 + ", Navidrome does: " + e);
        r16.close();
        this.q = r4;
        if (r8 == null) goto L89;
        this.r = r8;
        ConcurrentHashMap r32 = ot1.b;
        nt1 r33 = nt1.n;
        r32.merge(r8, 1, new j61(2));
    L89:
        return r4.b(r19);
    L90:
        r16.close();
        this.q = null;
        throw e;
    L33:
        e = move-exception;
        int r111 = e.p;
        if (r14 == false) goto L42;
        if (r111 != 503) goto L42;
        throw new IOException(App.a().getString(R.string.homemusic_full_track_unavailable), e);     // Catch: IOException -> L31
    L42:
        if (r111 != 401) goto L82;
        r16.close();     // Catch: IOException -> L31
        rr1.h();     // Catch: IOException -> L31
        r110 = r16.b(o(r19, r7, r10));     // Catch: IOException -> L31
        goto L44
    L82:
        throw e;     // Catch: IOException -> L31
    L25:
        r2 = r1.getQueryParameter("ref");
        if (r2 != null) goto L24;
        r2 = "";
    L14:
        r15 = null;
        goto L15
    L7:
        if (r8.equals(r9) == true) goto L10;
        r10 = xm4.e0(r8, "|mobile", false);
        goto L10
    L110:
        Cipher r34 = Cipher.getInstance("AES/CBC/PKCS7Padding");     // Catch: Throwable -> L101 NoSuchAlgorithmException -> L103
        r34.init(2, new SecretKeySpec((byte[]) r3, "AES"), new IvParameterSpec((byte[]) this.q));     // Catch: Throwable -> L97 InvalidKeyException -> L99
        gi0 r35 = new gi0(r4, r19);
        this.r = new CipherInputStream(r35, r34);
        r35.b();
        return -1;
    L97:
        e = move-exception;
        er1.m(e);
        return 0;
    L101:
        e = move-exception;
        er1.m(e);
        return 0;
    }

    @Override // defpackage.ci0
    public final void c(rw4 r3) {
        int r0 = this.n;
        ci0 r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.getClass();
        r1.c(r3);
        ((ArrayList) this.p).add(r3);
        return;
    L6:
        r3.getClass();
        r1.c(r3);
    }

    @Override // defpackage.ci0
    public final void close() {
        switch(this.n) {
            case 0: goto L21;
            default: goto L24;
        };
    L24:
        ci0 r0 = (ci0) this.q;     // Catch: Throwable -> L8
        if (r0 == null) goto L10;
        r0.close();     // Catch: Throwable -> L8
    L10:
        this.q = null;
        String r1 = (String) this.r;
        if (r1 == null) goto L13;
        ConcurrentHashMap r2 = ot1.a;
        ot1.a(r1);
    L13:
        this.r = null;
        return;
    L8:
        th = move-exception;
        this.q = null;
        String r3 = (String) this.r;
        if (r3 == null) goto L18;
        ConcurrentHashMap r4 = ot1.a;
        ot1.a(r3);
    L18:
        this.r = null;
        throw th;
    L21:
        if (((CipherInputStream) this.r) == null) goto L26;
        this.r = null;
        this.o.close();
        return;
    }

    @Override // defpackage.ci0
    public final Map j() {
        switch(this.n) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        ci0 r1 = (ci0) this.q;
        if (r1 == null) goto L9;
        Map r2 = r1.j();
        if (r2 == null) goto L9;
        return r2;
    L9:
        return v01.n;
    L11:
        return this.o.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        switch(this.n) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        ci0 r1 = (ci0) this.q;
        if (r1 != null) goto L11;
        return null;
    L11:
        return r1.m();
    L10:
        return this.o.m();
    }

    @Override // defpackage.wh0
    public final int read(byte[] r2, int r3, int r4) {
        switch(this.n) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        r2.getClass();
        ci0 r1 = (ci0) this.q;
        if (r1 != null) goto L13;
        kf2.o("not opened");
        return 0;
    L13:
        return r1.read(r2, r3, r4);
    L9:
        ((CipherInputStream) this.r).getClass();
        int r5 = ((CipherInputStream) this.r).read(r2, r3, r4);
        if (r5 >= 0) goto L14;
        return -1;
    L14:
        return r5;
    }

    public j6(ci0 r2, byte[] r3, byte[] r4) {
        this.n = 0;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }
}
