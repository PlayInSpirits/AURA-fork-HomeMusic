package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qi1 implements f42 {
    public final ul1 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public qi1(String r4) {
        u72 r0 = ul1.a;
        this.c = null;
        if (TextUtils.isEmpty(r4) == true) goto L6;
        this.d = r4;
        h12.f(r0, "Argument must not be null");
        this.b = r0;
        return;
    L6:
        kf2.n("Must not be null or empty");
        throw null;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r3) {
        if (this.g != null) goto L5;
        this.g = c().getBytes(f42.a);
    L5:
        r3.update(this.g);
    }

    public final String c() {
        String r0 = this.d;
        if (r0 == null) goto L5;
        return r0;
    L5:
        URL r1 = this.c;
        h12.f(r1, "Argument must not be null");
        return r1.toString();
    }

    public final URL d() {
        if (this.f != null) goto L12;
        if (TextUtils.isEmpty(this.e) == false) goto L10;
        String r1 = this.d;
        if (TextUtils.isEmpty(r1) == false) goto L9;
        URL r2 = this.c;
        h12.f(r2, "Argument must not be null");
        r1 = r2.toString();
    L9:
        this.e = Uri.encode(r1, "@#&=*+-_.,:!?()/~'%;$");
    L10:
        this.f = new URL(this.e);
    L12:
        return this.f;
    }

    @Override // defpackage.f42
    public final boolean equals(Object r4) {
        if ((r4 instanceof qi1) == false) goto L10;
        qi1 r5 = (qi1) r4;
        if (c().equals(r5.c()) == false) goto L10;
        if (this.b.equals(r5.b) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        if (this.h != 0) goto L6;
        int r0 = c().hashCode();
        this.h = r0;
        int r1 = this.b.hashCode();
        this.h = r1 + (r0 * 31);
    L6:
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public qi1(URL r3) {
        u72 r0 = ul1.a;
        h12.f(r3, "Argument must not be null");
        this.c = r3;
        this.d = null;
        h12.f(r0, "Argument must not be null");
        this.b = r0;
    }
}
