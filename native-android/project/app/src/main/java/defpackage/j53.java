package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j53 {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public j53(ViewGroup r1) {
        this.c = r1;
    }

    public final boolean a(float r3, float r4, boolean r5) {
        if (this.d == false) goto L11;
        ViewParent r0 = e(0);
        if (r0 == null) goto L11;
        return r0.onNestedFling(this.c, r3, r4, r5);
    L9:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r0 + " does not implement interface method onNestedFling", e);
    L11:
        return false;
    }

    public final boolean b(float r3, float r4) {
        if (this.d == false) goto L11;
        ViewParent r0 = e(0);
        if (r0 == null) goto L11;
        return r0.onNestedPreFling(this.c, r3, r4);
    L9:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r0 + " does not implement interface method onNestedPreFling", e);
    L11:
        return false;
    }

    public final boolean c(int r12, int r13, int r14, int[] r15, int[] r16) {
        if (this.d == false) goto L42;
        ViewParent r1 = e(r14);
        if (r1 != null) goto L8;
        return false;
    L8:
        if (r12 != 0) goto L14;
        if (r13 != 0) goto L14;
        if (r16 == null) goto L43;
        r16[0] = 0;
        r16[1] = 0;
        return false;
    L43:
        return false;
    L14:
        ViewGroup r2 = this.c;
        if (r16 == null) goto L17;
        r2.getLocationInWindow(r16);
        int r9 = r16[0];
        int r10 = r16[1];
    L18:
        if (r15 == null) goto L20;
        int[] r4 = r15;
    L24:
        r4[0] = 0;
        r4[1] = 0;
        if ((r1 instanceof k53) == false) goto L27;
        ((k53) r1).f(r2, r12, r13, r4, r14);
        r2 = r2;
    L32:
        if (r16 == null) goto L35;
        r2.getLocationInWindow(r16);
        r16[0] = r16[0] - r9;
        r16[1] = r16[1] - r10;
    L35:
        if (r4[0] != 0) goto L39;
        if (r4[1] != 0) goto L39;
        return false;
    L39:
        return true;
    L27:
        if (r14 != 0) goto L32;
        r1.onNestedPreScroll(r2, r12, r13, r4);     // Catch: AbstractMethodError -> L30
    L30:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r1 + " does not implement interface method onNestedPreScroll", e);
        goto L32
    L20:
        if (this.e != null) goto L22;
        this.e = new int[2];
    L22:
        r4 = this.e;
        goto L24
    L17:
        r9 = 0;
        r10 = 0;
        goto L18
    L42:
        return false;
    }

    public final boolean d(int r15, int r16, int r17, int r18, int[] r19, int r20, int[] r21) {
        if (this.d == false) goto L41;
        ViewParent r2 = e(r20);
        if (r2 == null) goto L41;
        if (r15 != 0) goto L16;
        if (r16 != 0) goto L16;
        if (r17 != 0) goto L16;
        if (r18 != 0) goto L16;
        if (r19 == null) goto L41;
        r19[0] = 0;
        r19[1] = 0;
        return false;
    L16:
        ViewGroup r3 = this.c;
        if (r19 == null) goto L19;
        r3.getLocationInWindow(r19);
        int r12 = r19[0];
        int r13 = r19[1];
    L20:
        if (r21 == null) goto L22;
        int[] r9 = r21;
    L27:
        if ((r2 instanceof l53) == false) goto L29;
        ((l53) r2).a(r3, r15, r16, r17, r18, r20, r9);
    L38:
        if (r19 == null) goto L40;
        r3.getLocationInWindow(r19);
        r19[0] = r19[0] - r12;
        r19[1] = r19[1] - r13;
    L40:
        return true;
    L29:
        r9[0] = r9[0] + r17;
        r9[1] = r9[1] + r18;
        if ((r2 instanceof k53) == false) goto L32;
        ((k53) r2).b(r3, r15, r16, r17, r18, r20);
        goto L38
    L32:
        if (r20 != 0) goto L38;
        r2.onNestedScroll(r3, r15, r16, r17, r18);     // Catch: AbstractMethodError -> L36
    L36:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r2 + " does not implement interface method onNestedScroll", e);
        goto L38
    L22:
        if (this.e != null) goto L24;
        this.e = new int[2];
    L24:
        int[] r14 = this.e;
        r14[0] = 0;
        r14[1] = 0;
        r9 = r14;
        goto L27
    L19:
        r12 = 0;
        r13 = 0;
    L41:
        return false;
    }

    public final ViewParent e(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return null;
    L8:
        return this.b;
    L10:
        return this.a;
    }

    public final boolean f(int r1) {
        if (e(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean g(int r12, int r13) {
        if (f(r13) == false) goto L6;
    L31:
        return true;
    L6:
        if (this.d == false) goto L36;
        View r0 = this.c;
        ViewParent r3 = r0.getParent();
        View r4 = r0;
    L8:
        if (r3 == null) goto L36;
        boolean r5 = r3 instanceof k53;
        if (r5 == false) goto L12;
        boolean r8 = ((k53) r3).c(r4, r0, r12, r13);
    L18:
        if (r8 == true) goto L19;
        if ((r3 instanceof View) == false) goto L35;
        r4 = (View) r3;
    L35:
        r3 = r3.getParent();
        goto L8
    L19:
        if (r13 == 0) goto L23;
        if (r13 != 1) goto L24;
        this.b = r3;
    L24:
        if (r5 == false) goto L26;
        ((k53) r3).d(r4, r0, r12, r13);
        goto L31
    L26:
        if (r13 != 0) goto L31;
        r3.onNestedScrollAccepted(r4, r0, r12);     // Catch: AbstractMethodError -> L29
    L29:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r3 + " does not implement interface method onNestedScrollAccepted", e);
        goto L31
    L23:
        this.a = r3;
        goto L24
    L12:
        if (r13 == 0) goto L37;
    L17:
        r8 = false;
        goto L18
    L37:
        r8 = r3.onStartNestedScroll(r4, r0, r12);     // Catch: AbstractMethodError -> L15
    L15:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r3 + " does not implement interface method onStartNestedScroll", e);
    L36:
        return false;
    }

    public final void h(int r5) {
        ViewParent r0 = e(r5);
        if (r0 == null) goto L22;
        boolean r1 = r0 instanceof k53;
        ViewGroup r2 = this.c;
        if (r1 == false) goto L7;
        ((k53) r0).e(r2, r5);
    L13:
        if (r5 != 0) goto L15;
        this.a = null;
        return;
    L15:
        if (r5 != 1) goto L24;
        this.b = null;
        return;
    L24:
        return;
    L7:
        if (r5 != 0) goto L13;
        r0.onStopNestedScroll(r2);     // Catch: AbstractMethodError -> L10
    L10:
        e = move-exception;
        Log.e("ViewParentCompat", "ViewParent " + r0 + " does not implement interface method onStopNestedScroll", e);
        goto L13
    }
}
