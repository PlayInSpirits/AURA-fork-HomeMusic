package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bn2 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final ym2 c;
    public final sm2 d;
    public final List e;
    public final String f;
    public final yw1 g;
    public final long h;

    static {
        String str = f35.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public bn2(Uri uri, String str, ym2 ym2Var, sm2 sm2Var, List list, String str2, yw1 yw1Var, long j2) {
        this.a = uri;
        this.b = lw2.m(str);
        this.c = ym2Var;
        this.d = sm2Var;
        this.e = list;
        this.f = str2;
        this.g = yw1Var;
        uw1 uw1VarJ = yw1.j();
        for (int i2 = 0; i2 < yw1Var.size(); i2++) {
            fn2 fn2Var = (fn2) yw1Var.get(i2);
            en2 en2Var = new en2();
            en2Var.a = fn2Var.a;
            en2Var.b = fn2Var.b;
            en2Var.c = fn2Var.c;
            en2Var.d = fn2Var.d;
            en2Var.e = fn2Var.e;
            en2Var.f = fn2Var.f;
            en2Var.g = fn2Var.g;
            uw1VarJ.c(new dn2(en2Var));
        }
        uw1VarJ.f();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn2)) {
            return false;
        }
        bn2 bn2Var = (bn2) obj;
        return this.a.equals(bn2Var.a) && Objects.equals(this.b, bn2Var.b) && Objects.equals(this.c, bn2Var.c) && Objects.equals(this.d, bn2Var.d) && this.e.equals(bn2Var.e) && Objects.equals(this.f, bn2Var.f) && this.g.equals(bn2Var.g) && this.h == bn2Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ym2 ym2Var = this.c;
        int iHashCode3 = (iHashCode2 + (ym2Var == null ? 0 : ym2Var.hashCode())) * 31;
        sm2 sm2Var = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (sm2Var == null ? 0 : sm2Var.hashCode())) * 31)) * 31;
        String str2 = this.f;
        return (int) ((((long) ((this.g.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.h);
    }
}
