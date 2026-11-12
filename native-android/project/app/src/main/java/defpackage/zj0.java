package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zj0 implements ci0 {
    public final Context n;
    public final ArrayList o;
    public final ci0 p;
    public t61 q;
    public ek r;
    public ad0 s;
    public ci0 t;
    public c15 u;
    public ai0 v;
    public ru3 w;
    public ci0 x;

    public zj0(Context r1, ci0 r2) {
        this.n = r1.getApplicationContext();
        r2.getClass();
        this.p = r2;
        this.o = new ArrayList();
    }

    public static void p(ci0 r0, rw4 r1) {
        if (r0 == null) goto L5;
        r0.c(r1);
        return;
    }

    @Override // defpackage.ci0
    public final long b(ii0 r7) {
        if (this.x != null) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        Uri r1 = r7.a;
        String r2 = r1.getScheme();
        String r3 = f35.a;
        String r4 = r1.getScheme();
        boolean r5 = TextUtils.isEmpty(r4);
        Context r6 = this.n;
        if (r5 == false) goto L9;
    L59:
        String r8 = r1.getPath();
        if (r8 == null) goto L68;
        if (r8.startsWith("/android_asset/") == false) goto L68;
        if (this.r != null) goto L66;
        ek r9 = new ek(r6);
        this.r = r9;
        o(r9);
    L66:
        this.x = this.r;
    L72:
        return this.x.b(r7);
    L68:
        if (this.q != null) goto L70;
        t61 r10 = new t61(false);
        this.q = r10;
        o(r10);
    L70:
        this.x = this.q;
        goto L72
    L9:
        if (Objects.equals(r4, "file") == true) goto L59;
        if ("asset".equals(r2) == false) goto L18;
        if (this.r != null) goto L16;
        ek r11 = new ek(r6);
        this.r = r11;
        o(r11);
    L16:
        this.x = this.r;
        goto L72
    L18:
        if ("content".equals(r2) == true) goto L20;
        boolean r12 = "rtmp".equals(r2);
        ci0 r13 = this.p;
        if (r12 == false) goto L38;
        if (this.t == null) goto L73;
    L36:
        this.x = this.t;
        goto L72
    L73:
        ci0 r14 = (ci0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);     // Catch: Exception -> L29 ClassNotFoundException -> L32
        this.t = r14;     // Catch: Exception -> L29 ClassNotFoundException -> L32
        o(r14);     // Catch: Exception -> L29 ClassNotFoundException -> L32
    L34:
        if (this.t != null) goto L36;
        this.t = r13;
    L32:
        l93.q0("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
    L29:
        e = move-exception;
        nz2.s("Error instantiating RTMP extension", e);
        return 0;
    L38:
        if ("udp".equals(r2) == false) goto L44;
        if (this.u != null) goto L42;
        c15 r15 = new c15();
        this.u = r15;
        o(r15);
    L42:
        this.x = this.u;
        goto L72
    L44:
        if ("data".equals(r2) == false) goto L50;
        if (this.v != null) goto L48;
        ai0 r16 = new ai0(false);
        this.v = r16;
        o(r16);
    L48:
        this.x = this.v;
        goto L72
    L50:
        if ("rawresource".equals(r2) == true) goto L56;
        if ("android.resource".equals(r2) == true) goto L56;
        this.x = r13;
    L56:
        if (this.w != null) goto L58;
        ru3 r17 = new ru3(r6);
        this.w = r17;
        o(r17);
    L58:
        this.x = this.w;
        goto L72
    L20:
        if (this.s != null) goto L22;
        ad0 r18 = new ad0(r6);
        this.s = r18;
        o(r18);
    L22:
        this.x = this.s;
        goto L72
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.ci0
    public final void c(rw4 r2) {
        r2.getClass();
        this.p.c(r2);
        this.o.add(r2);
        p(this.q, r2);
        p(this.r, r2);
        p(this.s, r2);
        p(this.t, r2);
        p(this.u, r2);
        p(this.v, r2);
        p(this.w, r2);
    }

    @Override // defpackage.ci0
    public final void close() {
        ci0 r0 = this.x;
        if (r0 != null) goto L12;
        return;
    L12:
        r0.close();     // Catch: Throwable -> L8
        this.x = null;
        return;
    L8:
        th = move-exception;
        this.x = null;
        throw th;
    }

    @Override // defpackage.ci0
    public final Map j() {
        ci0 r0 = this.x;
        if (r0 != null) goto L7;
        return Collections.EMPTY_MAP;
    L7:
        return r0.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        ci0 r0 = this.x;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.m();
    }

    public final void o(ci0 r4) {
        int r0 = 0;
    L3:
        ArrayList r1 = this.o;
        if (r0 >= r1.size()) goto L6;
        r4.c((rw4) r1.get(r0));
        r0 = r0 + 1;
        goto L3
    }

    @Override // defpackage.wh0
    public final int read(byte[] r1, int r2, int r3) {
        ci0 r0 = this.x;
        r0.getClass();
        return r0.read(r1, r2, r3);
    }
}
