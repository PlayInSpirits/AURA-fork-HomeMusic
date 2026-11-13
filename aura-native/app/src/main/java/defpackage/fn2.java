package defpackage;

import android.net.Uri;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class fn2 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        String str = f35.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public fn2(en2 en2Var) {
        this.a = en2Var.a;
        this.b = en2Var.b;
        this.c = en2Var.c;
        this.d = en2Var.d;
        this.e = en2Var.e;
        this.f = en2Var.f;
        this.g = en2Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn2)) {
            return false;
        }
        fn2 fn2Var = (fn2) obj;
        return this.a.equals(fn2Var.a) && Objects.equals(this.b, fn2Var.b) && Objects.equals(this.c, fn2Var.c) && this.d == fn2Var.d && this.e == fn2Var.e && Objects.equals(this.f, fn2Var.f) && Objects.equals(this.g, fn2Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
