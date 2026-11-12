package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xy4 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public yr4 r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(xy4 xy4Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (xy4Var != null) {
            if (!this.c && xy4Var.c) {
                this.b = xy4Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = xy4Var.h;
            }
            if (this.i == -1) {
                this.i = xy4Var.i;
            }
            if (this.a == null && (str = xy4Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = xy4Var.f;
            }
            if (this.g == -1) {
                this.g = xy4Var.g;
            }
            if (this.n == -1) {
                this.n = xy4Var.n;
            }
            if (this.o == null && (alignment2 = xy4Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = xy4Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = xy4Var.q;
            }
            if (this.j == -1) {
                this.j = xy4Var.j;
                this.k = xy4Var.k;
            }
            if (this.r == null) {
                this.r = xy4Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = xy4Var.s;
            }
            if (this.t == null) {
                this.t = xy4Var.t;
            }
            if (this.u == null) {
                this.u = xy4Var.u;
            }
            if (!this.e && xy4Var.e) {
                this.d = xy4Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = xy4Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
