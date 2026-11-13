package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class mb5 {
    public static final pb5 b;
    public final pb5 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new ab5() : i >= 35 ? new za5() : i >= 34 ? new ya5() : i >= 31 ? new xa5() : i >= 30 ? new wa5() : i >= 29 ? new va5() : new ua5()).b().a.a().a.b().a.c();
    }

    public mb5(pb5 pb5Var) {
        this.a = pb5Var;
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

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb5)) {
            return false;
        }
        mb5 mb5Var = (mb5) obj;
        return s() == mb5Var.s() && r() == mb5Var.r() && Objects.equals(m(), mb5Var.m()) && Objects.equals(k(), mb5Var.k()) && Objects.equals(g(), mb5Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public tr0 g() {
        return null;
    }

    public vz1 h(int i) {
        return vz1.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public vz1 i(int i) {
        if ((i & 8) == 0) {
            return vz1.e;
        }
        kf2.n("Unable to query the maximum insets for IME");
        return null;
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

    public pb5 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t(int i) {
        return true;
    }

    public void p() {
    }

    public void A(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void u(vr0 vr0Var) {
    }

    public void v(vz1[] vz1VarArr) {
    }

    public void w(pb5 pb5Var) {
    }

    public void x(vz1 vz1Var) {
    }

    public void y(int i) {
    }

    public void z(Rect[][] rectArr) {
    }
}
