package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class em {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final il g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public em(dm dmVar) {
        this.a = dmVar.a;
        this.b = dmVar.b;
        this.c = dmVar.c;
        this.d = dmVar.d;
        this.e = dmVar.e;
        this.f = dmVar.f;
        this.g = dmVar.g;
        this.h = dmVar.h;
        this.i = dmVar.i;
        this.j = dmVar.j;
        this.k = dmVar.k;
    }

    public final dm a() {
        dm dmVar = new dm();
        dmVar.a = this.a;
        dmVar.b = this.b;
        dmVar.c = this.c;
        dmVar.d = this.d;
        dmVar.e = this.e;
        dmVar.f = this.f;
        dmVar.g = this.g;
        dmVar.h = this.h;
        dmVar.i = this.i;
        dmVar.j = this.j;
        dmVar.k = this.k;
        return dmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || em.class != obj.getClass()) {
            return false;
        }
        em emVar = (em) obj;
        return this.a == emVar.a && this.b == emVar.b && this.c == emVar.c && this.d == emVar.d && this.e == emVar.e && this.f == emVar.f && this.h == emVar.h && this.i == emVar.i && this.j == emVar.j && this.k == emVar.k && this.g.equals(emVar.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
