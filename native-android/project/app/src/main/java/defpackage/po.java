package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public po(po poVar) {
        this();
        poVar.q.F();
        mc1 mc1Var = poVar.q.v;
        if (mc1Var != null) {
            mc1Var.B.getClassLoader();
        }
        ArrayList arrayList = poVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            je1 je1Var = (je1) obj;
            ArrayList arrayList2 = this.a;
            je1 je1Var2 = new je1();
            je1Var2.a = je1Var.a;
            je1Var2.b = je1Var.b;
            je1Var2.c = je1Var.c;
            je1Var2.d = je1Var.d;
            je1Var2.e = je1Var.e;
            je1Var2.f = je1Var.f;
            je1Var2.g = je1Var.g;
            je1Var2.h = je1Var.h;
            je1Var2.i = je1Var.i;
            arrayList2.add(je1Var2);
        }
        this.b = poVar.b;
        this.c = poVar.c;
        this.d = poVar.d;
        this.e = poVar.e;
        this.f = poVar.f;
        this.g = poVar.g;
        this.h = poVar.h;
        this.i = poVar.i;
        this.l = poVar.l;
        this.m = poVar.m;
        this.j = poVar.j;
        this.k = poVar.k;
        if (poVar.n != null) {
            ArrayList arrayList3 = new ArrayList();
            this.n = arrayList3;
            arrayList3.addAll(poVar.n);
        }
        if (poVar.o != null) {
            ArrayList arrayList4 = new ArrayList();
            this.o = arrayList4;
            arrayList4.addAll(poVar.o);
        }
        this.p = poVar.p;
        this.s = -1;
        this.t = false;
        this.q = poVar.q;
        this.r = poVar.r;
        this.s = poVar.s;
        this.t = poVar.t;
    }

    @Override // defpackage.id1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        ld1 ld1Var = this.q;
        if (ld1Var.d == null) {
            ld1Var.d = new ArrayList();
        }
        ld1Var.d.add(this);
        return true;
    }

    public final void b(je1 je1Var) {
        this.a.add(je1Var);
        je1Var.d = this.b;
        je1Var.e = this.c;
        je1Var.f = this.d;
        je1Var.g = this.e;
    }

    public final void c(String str) {
        if (!this.h) {
            kf2.o("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.g = true;
            this.i = str;
        }
    }

    public final void d(int i) {
        if (this.g) {
            if (ld1.I(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                je1 je1Var = (je1) arrayList.get(i2);
                kc1 kc1Var = je1Var.b;
                if (kc1Var != null) {
                    kc1Var.E += i;
                    if (ld1.I(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + je1Var.b + " to " + je1Var.b.E);
                    }
                }
            }
        }
    }

    public final int e(boolean z) {
        if (this.r) {
            kf2.o("commit already called");
            return 0;
        }
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new fe2());
            h("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z2 = this.g;
        ld1 ld1Var = this.q;
        if (z2) {
            this.s = ld1Var.i.getAndIncrement();
        } else {
            this.s = -1;
        }
        ld1Var.w(this, z);
        return this.s;
    }

    public final void f() {
        if (this.g) {
            kf2.o("This transaction is already being added to the back stack");
        } else {
            this.h = false;
            this.q.z(this, false);
        }
    }

    public final void g(int i, kc1 kc1Var, String str, int i2) {
        String str2 = kc1Var.a0;
        if (str2 != null) {
            he1.c(kc1Var, str2);
        }
        Class<?> cls = kc1Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            er1.j(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = kc1Var.L;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(kc1Var);
                String str4 = kc1Var.L;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            kc1Var.L = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + kc1Var + " with tag " + str + " to container view with no id");
            }
            int i3 = kc1Var.J;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(kc1Var);
                int i4 = kc1Var.J;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            kc1Var.J = i;
            kc1Var.K = i;
        }
        b(new je1(i2, kc1Var));
        kc1Var.F = this.q;
    }

    public final void h(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            je1 je1Var = (je1) arrayList.get(i);
            switch (je1Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + je1Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(je1Var.b);
            if (z) {
                if (je1Var.d != 0 || je1Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(je1Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(je1Var.e));
                }
                if (je1Var.f != 0 || je1Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(je1Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(je1Var.g));
                }
            }
        }
    }

    public final void i(kc1 kc1Var) {
        ld1 ld1Var = kc1Var.F;
        if (ld1Var == null || ld1Var == this.q) {
            b(new je1(3, kc1Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + kc1Var.toString() + " is already attached to a FragmentManager.");
    }

    public final void j(int i, kc1 kc1Var, String str) {
        if (i != 0) {
            g(i, kc1Var, str, 2);
        } else {
            kf2.n("Must use non-zero containerViewId");
        }
    }

    public final void k(kc1 kc1Var, r92 r92Var) {
        ld1 ld1Var = kc1Var.F;
        ld1 ld1Var2 = this.q;
        if (ld1Var != ld1Var2) {
            mj0.l(ld1Var2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (r92Var == r92.o && kc1Var.n > -1) {
            nz2.A(r92Var, " after the Fragment has been created", "Cannot set maximum Lifecycle to ");
            return;
        }
        if (r92Var == r92.n) {
            nz2.A(r92Var, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.", "Cannot set maximum Lifecycle to ");
            return;
        }
        je1 je1Var = new je1();
        je1Var.a = 10;
        je1Var.b = kc1Var;
        je1Var.c = false;
        je1Var.h = kc1Var.b0;
        je1Var.i = r92Var;
        b(je1Var);
    }

    public final void l(kc1 kc1Var) {
        ld1 ld1Var = kc1Var.F;
        if (ld1Var == null || ld1Var == this.q) {
            b(new je1(8, kc1Var));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + kc1Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public po(ld1 ld1Var) {
        this();
        ld1Var.F();
        mc1 mc1Var = ld1Var.v;
        if (mc1Var != null) {
            mc1Var.B.getClassLoader();
        }
        this.s = -1;
        this.t = false;
        this.q = ld1Var;
    }

    public po() {
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
    }
}
