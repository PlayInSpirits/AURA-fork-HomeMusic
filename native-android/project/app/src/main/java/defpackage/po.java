package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class po implements id1 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public final ld1 q;
    public boolean r;
    public int s;
    public boolean t;

    public po(po r9) {
        r9.q.F();
        mc1 r0 = r9.q.v;
        if (r0 == null) goto L5;
        r0.B.getClassLoader();
    L5:
        this();
        ArrayList r1 = r9.a;
        int r2 = r1.size();
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L8;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        je1 r5 = (je1) r4;
        ArrayList r6 = this.a;
        je1 r7 = new je1();
        r7.a = r5.a;
        r7.b = r5.b;
        r7.c = r5.c;
        r7.d = r5.d;
        r7.e = r5.e;
        r7.f = r5.f;
        r7.g = r5.g;
        r7.h = r5.h;
        r7.i = r5.i;
        r6.add(r7);
        goto L6
    L8:
        this.b = r9.b;
        this.c = r9.c;
        this.d = r9.d;
        this.e = r9.e;
        this.f = r9.f;
        this.g = r9.g;
        this.h = r9.h;
        this.i = r9.i;
        this.l = r9.l;
        this.m = r9.m;
        this.j = r9.j;
        this.k = r9.k;
        if (r9.n == null) goto L12;
        ArrayList r8 = new ArrayList();
        this.n = r8;
        r8.addAll(r9.n);
    L12:
        if (r9.o == null) goto L14;
        ArrayList r10 = new ArrayList();
        this.o = r10;
        r10.addAll(r9.o);
    L14:
        this.p = r9.p;
        this.s = -1;
        this.t = false;
        this.q = r9.q;
        this.r = r9.r;
        this.s = r9.s;
        this.t = r9.t;
    }

    @Override // defpackage.id1
    public final boolean a(ArrayList r3, ArrayList r4) {
        if (ld1.I(2) == false) goto L5;
        Log.v("FragmentManager", "Run: " + this);
    L5:
        r3.add(this);
        r4.add(Boolean.FALSE);
        if (this.g == false) goto L13;
        ld1 r5 = this.q;
        if (r5.d != null) goto L10;
        r5.d = new ArrayList();
    L10:
        r5.d.add(this);
        return true;
    L13:
        return true;
    }

    public final void b(je1 r2) {
        this.a.add(r2);
        r2.d = this.b;
        r2.e = this.c;
        r2.f = this.d;
        r2.g = this.e;
    }

    public final void c(String r2) {
        if (this.h == false) goto L6;
        this.g = true;
        this.i = r2;
        return;
    L6:
        kf2.o("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void d(int r8) {
        if (this.g == true) goto L6;
        return;
    L6:
        if (ld1.I(2) == false) goto L8;
        Log.v("FragmentManager", "Bump nesting in " + this + " by " + r8);
    L8:
        ArrayList r7 = this.a;
        int r1 = r7.size();
        int r3 = 0;
    L9:
        if (r3 >= r1) goto L21;
        je1 r4 = (je1) r7.get(r3);
        kc1 r5 = r4.b;
        if (r5 == null) goto L15;
        r5.E += r8;
        if (ld1.I(2) == false) goto L15;
        Log.v("FragmentManager", "Bump nesting of " + r4.b + " to " + r4.b.E);
    L15:
        r3 = r3 + 1;
        goto L9
    }

    public final int e(boolean r4) {
        if (this.r == false) goto L5;
        kf2.o("commit already called");
        return 0;
    L5:
        if (ld1.I(2) == false) goto L7;
        Log.v("FragmentManager", "Commit: " + this);
        PrintWriter r2 = new PrintWriter(new fe2());
        h("  ", r2, true);
        r2.close();
    L7:
        this.r = true;
        boolean r0 = this.g;
        ld1 r1 = this.q;
        if (r0 == false) goto L10;
        this.s = r1.i.getAndIncrement();
    L11:
        r1.w(this, r4);
        return this.s;
    L10:
        this.s = -1;
        goto L11
    }

    public final void f() {
        if (this.g == true) goto L6;
        this.h = false;
        this.q.z(this, false);
        return;
    L6:
        kf2.o("This transaction is already being added to the back stack");
    }

    public final void g(int r4, kc1 r5, String r6, int r7) {
        String r0 = r5.a0;
        if (r0 == null) goto L5;
        he1.c(r5, r0);
    L5:
        Class<?> r1 = r5.getClass();
        int r2 = r1.getModifiers();
        if (r1.isAnonymousClass() == false) goto L8;
    L37:
        er1.j(r1.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
        return;
    L8:
        if (Modifier.isPublic(r2) == false) goto L37;
        if (r1.isMemberClass() == false) goto L14;
        if (Modifier.isStatic(r2) == false) goto L37;
    L14:
        if (r6 == null) goto L23;
        String r3 = r5.L;
        if (r3 != null) goto L18;
    L22:
        r5.L = r6;
        goto L23
    L18:
        if (r6.equals(r3) == true) goto L22;
        StringBuilder r8 = new StringBuilder("Can't change tag of fragment ");
        r8.append(r5);
        String r9 = r5.L;
        r8.append(": was ");
        r8.append(r9);
        r8.append(" now ");
        r8.append(r6);
        throw new IllegalStateException(r8.toString());
    L23:
        if (r4 != 0) goto L25;
    L35:
        b(new je1(r7, r5));
        r5.F = this.q;
        return;
    L25:
        if (r4 == (-1)) goto L34;
        int r10 = r5.J;
        if (r10 == 0) goto L32;
        if (r10 == r4) goto L32;
        StringBuilder r11 = new StringBuilder("Can't change container ID of fragment ");
        r11.append(r5);
        int r12 = r5.J;
        r11.append(": was ");
        r11.append(r12);
        r11.append(" now ");
        r11.append(r4);
        throw new IllegalStateException(r11.toString());
    L32:
        r5.J = r4;
        r5.K = r4;
        goto L35
    L34:
        throw new IllegalArgumentException("Can't add fragment " + r5 + " with tag " + r6 + " to container view with no id");
    }

    public final void h(String r6, PrintWriter r7, boolean r8) {
        if (r8 == false) goto L26;
        r7.print(r6);
        r7.print("mName=");
        r7.print(this.i);
        r7.print(" mIndex=");
        r7.print(this.s);
        r7.print(" mCommitted=");
        r7.println(this.r);
        if (this.f == 0) goto L7;
        r7.print(r6);
        r7.print("mTransition=#");
        r7.print(Integer.toHexString(this.f));
    L7:
        if (this.b == 0) goto L9;
    L10:
        r7.print(r6);
        r7.print("mEnterAnim=#");
        r7.print(Integer.toHexString(this.b));
        r7.print(" mExitAnim=#");
        r7.println(Integer.toHexString(this.c));
    L12:
        if (this.d == 0) goto L14;
    L15:
        r7.print(r6);
        r7.print("mPopEnterAnim=#");
        r7.print(Integer.toHexString(this.d));
        r7.print(" mPopExitAnim=#");
        r7.println(Integer.toHexString(this.e));
    L17:
        if (this.j == 0) goto L19;
    L20:
        r7.print(r6);
        r7.print("mBreadCrumbTitleRes=#");
        r7.print(Integer.toHexString(this.j));
        r7.print(" mBreadCrumbTitleText=");
        r7.println(this.k);
    L22:
        if (this.l == 0) goto L24;
    L25:
        r7.print(r6);
        r7.print("mBreadCrumbShortTitleRes=#");
        r7.print(Integer.toHexString(this.l));
        r7.print(" mBreadCrumbShortTitleText=");
        r7.println(this.m);
        goto L26
    L24:
        if (this.m == null) goto L26;
    L19:
        if (this.k == null) goto L22;
    L14:
        if (this.e == 0) goto L17;
    L9:
        if (this.c == 0) goto L12;
    L26:
        ArrayList r5 = this.a;
        if (r5.isEmpty() == true) goto L57;
        r7.print(r6);
        r7.println("Operations:");
        int r0 = r5.size();
        int r1 = 0;
    L29:
        if (r1 >= r0) goto L62;
        je1 r2 = (je1) r5.get(r1);
        switch(r2.a) {
            case 0: goto L43;
            case 1: goto L42;
            case 2: goto L41;
            case 3: goto L40;
            case 4: goto L39;
            case 5: goto L38;
            case 6: goto L37;
            case 7: goto L36;
            case 8: goto L35;
            case 9: goto L34;
            case 10: goto L33;
            default: goto L32;
        };
    L32:
        String r3 = "cmd=" + r2.a;
    L44:
        r7.print(r6);
        r7.print("  Op #");
        r7.print(r1);
        r7.print(": ");
        r7.print(r3);
        r7.print(" ");
        r7.println(r2.b);
        if (r8 == false) goto L56;
        if (r2.d == 0) goto L49;
    L50:
        r7.print(r6);
        r7.print("enterAnim=#");
        r7.print(Integer.toHexString(r2.d));
        r7.print(" exitAnim=#");
        r7.println(Integer.toHexString(r2.e));
    L52:
        if (r2.f == 0) goto L54;
    L55:
        r7.print(r6);
        r7.print("popEnterAnim=#");
        r7.print(Integer.toHexString(r2.f));
        r7.print(" popExitAnim=#");
        r7.println(Integer.toHexString(r2.g));
        goto L56
    L54:
        if (r2.g == 0) goto L56;
    L49:
        if (r2.e == 0) goto L52;
    L56:
        r1 = r1 + 1;
        goto L29
    L33:
        r3 = "OP_SET_MAX_LIFECYCLE";
        goto L44
    L34:
        r3 = "UNSET_PRIMARY_NAV";
        goto L44
    L35:
        r3 = "SET_PRIMARY_NAV";
        goto L44
    L36:
        r3 = "ATTACH";
        goto L44
    L37:
        r3 = "DETACH";
        goto L44
    L38:
        r3 = "SHOW";
        goto L44
    L39:
        r3 = "HIDE";
        goto L44
    L40:
        r3 = "REMOVE";
        goto L44
    L41:
        r3 = "REPLACE";
        goto L44
    L42:
        r3 = "ADD";
        goto L44
    L43:
        r3 = "NULL";
        goto L44
    L62:
        return;
    }

    public final void i(kc1 r3) {
        ld1 r0 = r3.F;
        if (r0 != null) goto L5;
    L9:
        b(new je1(3, r3));
        return;
    L5:
        if (r0 == this.q) goto L9;
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + r3.toString() + " is already attached to a FragmentManager.");
    }

    public final void j(int r2, kc1 r3, String r4) {
        if (r2 == 0) goto L5;
        g(r2, r3, r4, 2);
        return;
    L5:
        kf2.n("Must use non-zero containerViewId");
    }

    public final void k(kc1 r4, r92 r5) {
        ld1 r0 = r4.F;
        ld1 r1 = this.q;
        if (r0 == r1) goto L5;
        mj0.l(r1, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        return;
    L5:
        if (r5 != r92.o) goto L12;
        if (r4.n <= (-1)) goto L12;
        nz2.A(r5, " after the Fragment has been created", "Cannot set maximum Lifecycle to ");
        return;
    L12:
        if (r5 == r92.n) goto L15;
        je1 r2 = new je1();
        r2.a = 10;
        r2.b = r4;
        r2.c = false;
        r2.h = r4.b0;
        r2.i = r5;
        b(r2);
        return;
    L15:
        nz2.A(r5, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.", "Cannot set maximum Lifecycle to ");
    }

    public final void l(kc1 r3) {
        ld1 r0 = r3.F;
        if (r0 != null) goto L5;
    L9:
        b(new je1(8, r3));
        return;
    L5:
        if (r0 == this.q) goto L9;
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + r3.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("BackStackEntry{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s < 0) goto L6;
        r0.append(" #");
        r0.append(this.s);
    L6:
        if (this.i == null) goto L8;
        r0.append(" ");
        r0.append(this.i);
    L8:
        r0.append("}");
        return r0.toString();
    }

    public po(ld1 r2) {
        r2.F();
        mc1 r0 = r2.v;
        if (r0 == null) goto L5;
        r0.B.getClassLoader();
    L5:
        this();
        this.s = -1;
        this.t = false;
        this.q = r2;
    }

    public po() {
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
    }
}
