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

    public qi1(String str) {
        u72 u72Var = ul1.a;
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            kf2.n("Must not be null or empty");
            throw null;
        }
        this.d = str;
        h12.f(u72Var, "Argument must not be null");
        this.b = u72Var;
    }

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(f42.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        h12.f(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String string = this.d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.c;
                    h12.f(url, "Argument must not be null");
                    string = url.toString();
                }
                this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.e);
        }
        return this.f;
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof qi1) {
            qi1 qi1Var = (qi1) obj;
            if (c().equals(qi1Var.c()) && this.b.equals(qi1Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public qi1(URL url) {
        u72 u72Var = ul1.a;
        h12.f(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        h12.f(u72Var, "Argument must not be null");
        this.b = u72Var;
    }
}
