package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class co2 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public yw1 I;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public lu3 i;
    public lu3 j;
    public byte[] k;
    public Integer l;
    public Uri m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public Boolean r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public CharSequence y;
    public CharSequence z;

    public co2() {
        vw1 vw1Var = yw1.o;
        this.I = gy3.r;
    }

    public final void a(int i, byte[] bArr) {
        if (this.k == null || i == 3 || !Objects.equals(this.l, 3)) {
            this.k = (byte[]) bArr.clone();
            this.l = Integer.valueOf(i);
        }
    }

    public final void b(do2 do2Var) {
        if (do2Var == null) {
            return;
        }
        yw1 yw1Var = do2Var.J;
        byte[] bArr = do2Var.k;
        CharSequence charSequence = do2Var.a;
        if (charSequence != null) {
            this.a = charSequence;
        }
        CharSequence charSequence2 = do2Var.b;
        if (charSequence2 != null) {
            this.b = charSequence2;
        }
        CharSequence charSequence3 = do2Var.c;
        if (charSequence3 != null) {
            this.c = charSequence3;
        }
        CharSequence charSequence4 = do2Var.d;
        if (charSequence4 != null) {
            this.d = charSequence4;
        }
        CharSequence charSequence5 = do2Var.e;
        if (charSequence5 != null) {
            this.e = charSequence5;
        }
        CharSequence charSequence6 = do2Var.f;
        if (charSequence6 != null) {
            this.f = charSequence6;
        }
        CharSequence charSequence7 = do2Var.g;
        if (charSequence7 != null) {
            this.g = charSequence7;
        }
        Long l = do2Var.h;
        if (l != null) {
            d(l);
        }
        lu3 lu3Var = do2Var.i;
        if (lu3Var != null) {
            this.i = lu3Var;
        }
        lu3 lu3Var2 = do2Var.j;
        if (lu3Var2 != null) {
            this.j = lu3Var2;
        }
        Uri uri = do2Var.m;
        if (uri != null || bArr != null) {
            this.m = uri;
            c(bArr, do2Var.l);
        }
        Integer num = do2Var.n;
        if (num != null) {
            this.n = num;
        }
        Integer num2 = do2Var.o;
        if (num2 != null) {
            this.o = num2;
        }
        Integer num3 = do2Var.p;
        if (num3 != null) {
            this.p = num3;
        }
        Boolean bool = do2Var.q;
        if (bool != null) {
            this.q = bool;
        }
        Boolean bool2 = do2Var.r;
        if (bool2 != null) {
            this.r = bool2;
        }
        Integer num4 = do2Var.s;
        if (num4 != null) {
            this.s = num4;
        }
        Integer num5 = do2Var.t;
        if (num5 != null) {
            this.s = num5;
        }
        Integer num6 = do2Var.u;
        if (num6 != null) {
            this.t = num6;
        }
        Integer num7 = do2Var.v;
        if (num7 != null) {
            this.u = num7;
        }
        Integer num8 = do2Var.w;
        if (num8 != null) {
            this.v = num8;
        }
        Integer num9 = do2Var.x;
        if (num9 != null) {
            this.w = num9;
        }
        Integer num10 = do2Var.y;
        if (num10 != null) {
            this.x = num10;
        }
        CharSequence charSequence8 = do2Var.z;
        if (charSequence8 != null) {
            this.y = charSequence8;
        }
        CharSequence charSequence9 = do2Var.A;
        if (charSequence9 != null) {
            this.z = charSequence9;
        }
        CharSequence charSequence10 = do2Var.B;
        if (charSequence10 != null) {
            this.A = charSequence10;
        }
        Integer num11 = do2Var.C;
        if (num11 != null) {
            this.B = num11;
        }
        Integer num12 = do2Var.D;
        if (num12 != null) {
            this.C = num12;
        }
        CharSequence charSequence11 = do2Var.E;
        if (charSequence11 != null) {
            this.D = charSequence11;
        }
        CharSequence charSequence12 = do2Var.F;
        if (charSequence12 != null) {
            this.E = charSequence12;
        }
        CharSequence charSequence13 = do2Var.G;
        if (charSequence13 != null) {
            this.F = charSequence13;
        }
        Integer num13 = do2Var.H;
        if (num13 != null) {
            this.G = num13;
        }
        Bundle bundle = do2Var.I;
        if (bundle != null) {
            this.H = bundle;
        }
        if (yw1Var.isEmpty()) {
            return;
        }
        this.I = yw1.k(yw1Var);
    }

    public final void c(byte[] bArr, Integer num) {
        this.k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = num;
    }

    public final void d(Long l) {
        rr2.l(l == null || l.longValue() >= 0);
        this.h = l;
    }
}
