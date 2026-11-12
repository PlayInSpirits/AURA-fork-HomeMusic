package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class mb5 {
    public static final pb5 b = null;
    public final pb5 a;

    static {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 36) goto L6;
        bb5 r1 = new ab5();
    L21:
        b = r1.b().a.a().a.b().a.c();
        return;
    L6:
        if (r0 < 35) goto L9;
        r1 = new za5();
        goto L21
    L9:
        if (r0 < 34) goto L12;
        r1 = new ya5();
        goto L21
    L12:
        if (r0 < 31) goto L15;
        r1 = new xa5();
        goto L21
    L15:
        if (r0 < 30) goto L18;
        r1 = new wa5();
        goto L21
    L18:
        if (r0 < 29) goto L20;
        r1 = new va5();
        goto L21
    L20:
        r1 = new ua5();
        goto L21
    }

    public mb5(pb5 r1) {
        this.a = r1;
    }

    public void A(Rect[][] r1) {
    }

    public pb5 a() {
        return this.a;
    }

    public pb5 b() {
        return this.a;
    }

    public pb5 c() {
        return this.a;
    }

    public void d(View r1) {
    }

    public List<Rect> e(int r1) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof mb5) == true) goto L8;
        return false;
    L8:
        mb5 r6 = (mb5) r5;
        if (s() == r6.s()) goto L11;
    L19:
        return false;
    L11:
        if (r() != r6.r()) goto L19;
        if (Objects.equals(m(), r6.m()) == false) goto L19;
        if (Objects.equals(k(), r6.k()) == false) goto L19;
        if (Objects.equals(g(), r6.g()) == false) goto L19;
        return true;
    }

    public List<Rect> f(int r1) {
        return Collections.EMPTY_LIST;
    }

    public tr0 g() {
        return null;
    }

    public vz1 h(int r1) {
        return vz1.e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g()});
    }

    public vz1 i(int r1) {
        if ((r1 & 8) == 0) goto L5;
        kf2.n("Unable to query the maximum insets for IME");
        return null;
    L5:
        return vz1.e;
    }

    public vz1 j() {
        return m();
    }

    public vz1 k() {
        return vz1.e;
    }

    public vz1 l() {
        return m();
    }

    public vz1 m() {
        return vz1.e;
    }

    public vz1 n() {
        return m();
    }

    public void o(View r1) {
    }

    public void p() {
    }

    public pb5 q(int r1, int r2, int r3, int r4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t(int r1) {
        return true;
    }

    public void u(vr0 r1) {
    }

    public void v(vz1[] r1) {
    }

    public void w(pb5 r1) {
    }

    public void x(vz1 r1) {
    }

    public void y(int r1) {
    }

    public void z(Rect[][] r1) {
    }
}
