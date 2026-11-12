package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l64 extends rw3 {
    public q80 a;
    public final ViewPager2 b;
    public final p75 c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final k64 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public l64(ViewPager2 r1) {
        this.b = r1;
        p75 r2 = r1.w;
        this.c = r2;
        this.d = (LinearLayoutManager) r2.getLayoutManager();
        this.g = new k64();
        d();
    }

    @Override // defpackage.rw3
    public final void a(RecyclerView r7, int r8) {
        int r9 = this.e;
        if (r9 == 1) goto L5;
    L6:
        if (r8 != 1) goto L16;
        this.e = 1;
        int r10 = this.i;
        if (r10 == (-1)) goto L11;
        this.h = r10;
        this.i = -1;
    L13:
        c(1);
        return;
    L11:
        if (this.h != (-1)) goto L13;
        this.h = this.d.P0();
    L16:
        if (r9 == 1) goto L18;
        if (r9 == 4) goto L18;
    L23:
        k64 r4 = this.g;
        if (r9 == 1) goto L26;
        if (r9 == 4) goto L26;
    L43:
        if (this.e != 2) goto L59;
        if (r8 == 0) goto L46;
        return;
    L46:
        if (this.l == false) goto L61;
        e();
        if (r4.c != 0) goto L62;
        int r11 = this.i;
        int r12 = r4.b;
        if (r11 == r12) goto L56;
        if (r12 != (-1)) goto L53;
        r12 = 0;
    L53:
        q80 r13 = this.a;
        if (r13 == null) goto L56;
        r13.c(r12);
    L56:
        c(0);
        d();
        return;
    L62:
        return;
    L61:
        return;
    L59:
        return;
    L26:
        if (r8 != 0) goto L43;
        e();
        if (this.k == true) goto L35;
        int r14 = r4.b;
        if (r14 == (-1)) goto L41;
        q80 r1 = this.a;
        if (r1 == null) goto L41;
        r1.b(r14, 0.0f, 0);
    L41:
        c(0);
        d();
        goto L43
    L35:
        if (r4.c != 0) goto L43;
        int r15 = this.h;
        int r2 = r4.b;
        if (r15 == r2) goto L41;
        q80 r16 = this.a;
        if (r16 == null) goto L41;
        r16.c(r2);
    L18:
        if (r8 != 2) goto L23;
        if (this.k == false) goto L58;
        c(2);
        this.j = true;
        return;
    L58:
        return;
    L5:
        if (this.f == 1) goto L16;
        goto L6
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView r6, int r7, int r8) {
        this.k = true;
        e();
        boolean r0 = this.j;
        k64 r2 = this.g;
        if (r0 == false) goto L25;
        this.j = false;
        if (r8 > 0) goto L16;
        if (r8 != 0) goto L18;
        if (r7 >= 0) goto L9;
        boolean r9 = true;
    L11:
        if (this.b.t.b.getLayoutDirection() != 1) goto L13;
        boolean r10 = true;
    L14:
        if (r9 != r10) goto L18;
    L13:
        r10 = false;
        goto L14
    L9:
        r9 = false;
    L18:
        int r11 = r2.b;
    L19:
        this.i = r11;
        if (this.h == r11) goto L32;
        q80 r12 = this.a;
        if (r12 == null) goto L32;
        r12.c(r11);
    L32:
        int r13 = r2.b;
        if (r13 != (-1)) goto L35;
        r13 = 0;
    L35:
        float r14 = r2.a;
        int r1 = r2.c;
        q80 r4 = this.a;
        if (r4 == null) goto L38;
        r4.b(r13, r14, r1);
    L38:
        int r15 = r2.b;
        int r16 = this.i;
        if (r15 == r16) goto L42;
        if (r16 == (-1)) goto L42;
        return;
    L42:
        if (r2.c == 0) goto L44;
        return;
    L44:
        if (this.f == 1) goto L49;
        c(0);
        d();
        return;
    L49:
        return;
    L16:
        if (r2.c == 0) goto L18;
        r11 = r2.b + 1;
        goto L19
    L25:
        if (this.e != 0) goto L32;
        int r17 = r2.b;
        if (r17 != (-1)) goto L29;
        r17 = 0;
    L29:
        q80 r18 = this.a;
        if (r18 == null) goto L32;
        r18.c(r17);
        goto L32
    }

    public final void c(int r3) {
        if (this.e != 3) goto L8;
        if (this.f != 0) goto L8;
        return;
    L8:
        if (this.f == r3) goto L16;
        this.f = r3;
        q80 r2 = this.a;
        if (r2 == null) goto L14;
        r2.a(r3);
        return;
    L14:
        return;
    }

    public final void d() {
        this.e = 0;
        this.f = 0;
        k64 r1 = this.g;
        r1.b = -1;
        r1.a = 0.0f;
        r1.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    public final void e() {
        LinearLayoutManager r0 = this.d;
        int r1 = r0.P0();
        k64 r2 = this.g;
        r2.b = r1;
        int r3 = 0;
        float r4 = 0.0f;
        if (r1 != (-1)) goto L6;
        r2.b = -1;
        r2.a = 0.0f;
        r2.c = 0;
        return;
    L6:
        View r5 = r0.q(r1);
        if (r5 != null) goto L10;
        r2.b = -1;
        r2.a = 0.0f;
        r2.c = 0;
        return;
    L10:
        int r6 = ((nw3) r5.getLayoutParams()).b.left;
        int r7 = ((nw3) r5.getLayoutParams()).b.right;
        int r8 = ((nw3) r5.getLayoutParams()).b.top;
        int r9 = ((nw3) r5.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams r10 = r5.getLayoutParams();
        if ((r10 instanceof ViewGroup.MarginLayoutParams) == false) goto L13;
        ViewGroup.MarginLayoutParams r11 = (ViewGroup.MarginLayoutParams) r10;
        r6 = r6 + r11.leftMargin;
        r7 = r7 + r11.rightMargin;
        r8 = r8 + r11.topMargin;
        r9 = r9 + r11.bottomMargin;
    L13:
        int r12 = (r5.getHeight() + r8) + r9;
        int r13 = (r5.getWidth() + r6) + r7;
        int r14 = r0.p;
        p75 r15 = this.c;
        if (r14 != 0) goto L19;
        int r16 = (r5.getLeft() - r6) - r15.getPaddingLeft();
        if (this.b.t.b.getLayoutDirection() != 1) goto L18;
        r16 = -r16;
    L18:
        r12 = r13;
    L20:
        int r17 = -r16;
        r2.c = r17;
        if (r17 >= 0) goto L72;
        int r18 = r0.v();
        if (r18 == 0) goto L62;
        if (r0.p != 0) goto L28;
        boolean r19 = true;
    L29:
        int[][] r20 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{r18, 2});
        int r21 = 0;
    L30:
        if (r21 >= r18) goto L50;
        View r22 = r0.u(r21);
        if (r22 == null) goto L48;
        ViewGroup.LayoutParams r23 = r22.getLayoutParams();
        if ((r23 instanceof ViewGroup.MarginLayoutParams) == false) goto L36;
        ViewGroup.MarginLayoutParams r24 = (ViewGroup.MarginLayoutParams) r23;
    L37:
        int[] r25 = r20[r21];
        if (r19 == false) goto L41;
        int r26 = r22.getLeft();
        int r110 = r24.leftMargin;
    L42:
        r25[0] = r26 - r110;
        int[] r27 = r20[r21];
        if (r19 == false) goto L46;
        int r28 = r22.getRight();
        int r29 = r24.rightMargin;
    L47:
        r27[1] = r28 + r29;
        r21 = r21 + 1;
        goto L30
    L46:
        r28 = r22.getBottom();
        r29 = r24.bottomMargin;
        goto L47
    L41:
        r26 = r22.getTop();
        r110 = r24.topMargin;
        goto L42
    L36:
        r24 = kd.a;
        goto L37
    L48:
        kf2.o("null view contained in the view hierarchy");
        return;
    L50:
        Arrays.sort(r20, new ca1(9));
        int r30 = 1;
    L51:
        if (r30 >= r18) goto L56;
        if (r20[r30 - 1][1] != r20[r30][0]) goto L63;
        r30 = r30 + 1;
    L63:
        int r111 = r0.v();
    L64:
        if (r3 >= r111) goto L70;
        if (kd.a(r0.u(r3)) == true) goto L68;
        r3 = r3 + 1;
        goto L64
    L68:
        kf2.o("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        return;
    L70:
        Locale r112 = Locale.US;
        kf2.o(f34.f(r2.c, "Page can only be offset by a positive amount, not by "));
        return;
    L56:
        int[] r31 = r20[0];
        int r32 = r31[1];
        int r33 = r31[0];
        int r34 = r32 - r33;
        if (r33 > 0) goto L63;
        if (r20[r18 - 1][1] >= r34) goto L62;
    L28:
        r19 = false;
    L62:
        if (r0.v() > 1) goto L70;
    L72:
        if (r12 == 0) goto L75;
        r4 = r17 / r12;
    L75:
        r2.a = r4;
        return;
    L19:
        r16 = (r5.getTop() - r8) - r15.getPaddingTop();
        goto L20
    }
}
