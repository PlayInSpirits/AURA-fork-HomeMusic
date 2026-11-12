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

    public zj0(Context context, ci0 ci0Var) {
        this.n = context.getApplicationContext();
        ci0Var.getClass();
        this.p = ci0Var;
        this.o = new ArrayList();
    }

    public static void p(ci0 ci0Var, rw4 rw4Var) {
        if (ci0Var != null) {
            ci0Var.c(rw4Var);
        }
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) {
        rr2.w(this.x == null);
        Uri uri = ii0Var.a;
        String scheme = uri.getScheme();
        String str = f35.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.n;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.q == null) {
                    t61 t61Var = new t61(false);
                    this.q = t61Var;
                    o(t61Var);
                }
                this.x = this.q;
            } else {
                if (this.r == null) {
                    ek ekVar = new ek(context);
                    this.r = ekVar;
                    o(ekVar);
                }
                this.x = this.r;
            }
        } else if ("asset".equals(scheme)) {
            if (this.r == null) {
                ek ekVar2 = new ek(context);
                this.r = ekVar2;
                o(ekVar2);
            }
            this.x = this.r;
        } else if ("content".equals(scheme)) {
            if (this.s == null) {
                ad0 ad0Var = new ad0(context);
                this.s = ad0Var;
                o(ad0Var);
            }
            this.x = this.s;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            ci0 ci0Var = this.p;
            if (zEquals) {
                if (this.t == null) {
                    try {
                        ci0 ci0Var2 = (ci0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.t = ci0Var2;
                        o(ci0Var2);
                    } catch (ClassNotFoundException unused) {
                        l93.q0("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        nz2.s("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.t == null) {
                        this.t = ci0Var;
                    }
                }
                this.x = this.t;
            } else if ("udp".equals(scheme)) {
                if (this.u == null) {
                    c15 c15Var = new c15();
                    this.u = c15Var;
                    o(c15Var);
                }
                this.x = this.u;
            } else if ("data".equals(scheme)) {
                if (this.v == null) {
                    ai0 ai0Var = new ai0(false);
                    this.v = ai0Var;
                    o(ai0Var);
                }
                this.x = this.v;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.w == null) {
                    ru3 ru3Var = new ru3(context);
                    this.w = ru3Var;
                    o(ru3Var);
                }
                this.x = this.w;
            } else {
                this.x = ci0Var;
            }
        }
        return this.x.b(ii0Var);
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        rw4Var.getClass();
        this.p.c(rw4Var);
        this.o.add(rw4Var);
        p(this.q, rw4Var);
        p(this.r, rw4Var);
        p(this.s, rw4Var);
        p(this.t, rw4Var);
        p(this.u, rw4Var);
        p(this.v, rw4Var);
        p(this.w, rw4Var);
    }

    @Override // defpackage.ci0
    public final void close() {
        ci0 ci0Var = this.x;
        if (ci0Var != null) {
            try {
                ci0Var.close();
            } finally {
                this.x = null;
            }
        }
    }

    @Override // defpackage.ci0
    public final Map j() {
        ci0 ci0Var = this.x;
        return ci0Var == null ? Collections.EMPTY_MAP : ci0Var.j();
    }

    @Override // defpackage.ci0
    public final Uri m() {
        ci0 ci0Var = this.x;
        if (ci0Var == null) {
            return null;
        }
        return ci0Var.m();
    }

    public final void o(ci0 ci0Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.o;
            if (i >= arrayList.size()) {
                return;
            }
            ci0Var.c((rw4) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) {
        ci0 ci0Var = this.x;
        ci0Var.getClass();
        return ci0Var.read(bArr, i, i2);
    }
}
