package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 extends jw3 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList r2) {
        int r0 = r2.size() - 1;
    L3:
        if (r0 < 0) goto L5;
        ((cx3) r2.get(r0)).a.animate().cancel();
        r0 = r0 - 1;
        goto L3
    }

    @Override // defpackage.jw3
    public final boolean a(cx3 r9, cx3 r10, n50 r11, n50 r12) {
        int r2 = r11.a;
        int r3 = r11.b;
        if (r10.q() == false) goto L5;
        int r13 = r11.a;
        int r5 = r11.b;
        int r4 = r13;
    L6:
        if (r9 == r10) goto L8;
        View r8 = r9.a;
        float r14 = r8.getTranslationX();
        float r15 = r8.getTranslationY();
        float r16 = r8.getAlpha();
        l(r9);
        r8.setTranslationX(r14);
        r8.setTranslationY(r15);
        r8.setAlpha(r16);
        View r17 = r10.a;
        l(r10);
        r17.setTranslationX(-((int) ((r4 - r2) - r14)));
        r17.setTranslationY(-((int) ((r5 - r3) - r15)));
        r17.setAlpha(0.0f);
        ArrayList r18 = this.k;
        nl0 r19 = new nl0();
        r19.a = r9;
        r19.b = r10;
        r19.c = r2;
        r19.d = r3;
        r19.e = r4;
        r19.f = r5;
        r18.add(r19);
        return true;
    L8:
        return g(r9, r2, r3, r4, r5);
    L5:
        r4 = r12.a;
        r5 = r12.b;
        goto L6
    }

    @Override // defpackage.jw3
    public final void d(cx3 r10) {
        ArrayList r0 = this.l;
        ArrayList r1 = this.m;
        ArrayList r2 = this.n;
        View r3 = r10.a;
        r3.animate().cancel();
        ArrayList r4 = this.j;
        int r5 = r4.size();
    L3:
        r5 = r5 - 1;
        if (r5 < 0) goto L9;
        if (((ol0) r4.get(r5)).a != r10) goto L3;
        r3.setTranslationY(0.0f);
        r3.setTranslationX(0.0f);
        c(r10);
        r4.remove(r5);
        goto L3
    L9:
        j(this.k, r10);
        if (this.h.remove(r10) == false) goto L13;
        r3.setAlpha(1.0f);
        c(r10);
    L13:
        if (this.i.remove(r10) == false) goto L15;
        r3.setAlpha(1.0f);
        c(r10);
    L15:
        int r6 = r2.size() - 1;
    L16:
        if (r6 < 0) goto L21;
        ArrayList r7 = (ArrayList) r2.get(r6);
        j(r7, r10);
        if (r7.isEmpty() == false) goto L20;
        r2.remove(r6);
    L20:
        r6 = r6 - 1;
        goto L16
    L21:
        int r8 = r1.size() - 1;
    L22:
        if (r8 < 0) goto L32;
        ArrayList r9 = (ArrayList) r1.get(r8);
        int r11 = r9.size() - 1;
    L24:
        if (r11 < 0) goto L31;
        if (((ol0) r9.get(r11)).a == r10) goto L27;
        r11 = r11 - 1;
        goto L24
    L27:
        r3.setTranslationY(0.0f);
        r3.setTranslationX(0.0f);
        c(r10);
        r9.remove(r11);
        if (r9.isEmpty() == false) goto L31;
        r1.remove(r8);
    L31:
        r8 = r8 - 1;
        goto L22
    L32:
        int r12 = r0.size() - 1;
    L33:
        if (r12 < 0) goto L40;
        ArrayList r13 = (ArrayList) r0.get(r12);
        if (r13.remove(r10) == false) goto L39;
        r3.setAlpha(1.0f);
        c(r10);
        if (r13.isEmpty() == false) goto L39;
        r0.remove(r12);
    L39:
        r12 = r12 - 1;
        goto L33
    L40:
        this.q.remove(r10);
        this.o.remove(r10);
        this.r.remove(r10);
        this.p.remove(r10);
        i();
    }

    @Override // defpackage.jw3
    public final void e() {
        ArrayList r0 = this.k;
        ArrayList r1 = this.n;
        ArrayList r2 = this.l;
        ArrayList r3 = this.m;
        ArrayList r4 = this.i;
        ArrayList r5 = this.h;
        ArrayList r6 = this.j;
        int r7 = r6.size();
    L3:
        r7 = r7 - 1;
        if (r7 < 0) goto L6;
        ol0 r9 = (ol0) r6.get(r7);
        View r10 = r9.a.a;
        r10.setTranslationY(0.0f);
        r10.setTranslationX(0.0f);
        c(r9.a);
        r6.remove(r7);
        goto L3
    L6:
        int r8 = r5.size() - 1;
    L7:
        if (r8 < 0) goto L9;
        c((cx3) r5.get(r8));
        r5.remove(r8);
        r8 = r8 - 1;
        goto L7
    L9:
        int r11 = r4.size();
    L10:
        r11 = r11 - 1;
        if (r11 < 0) goto L13;
        cx3 r12 = (cx3) r4.get(r11);
        r12.a.setAlpha(1.0f);
        c(r12);
        r4.remove(r11);
        goto L10
    L13:
        int r13 = r0.size() - 1;
    L14:
        if (r13 < 0) goto L22;
        nl0 r14 = (nl0) r0.get(r13);
        cx3 r15 = r14.a;
        if (r15 == null) goto L18;
        k(r14, r15);
    L18:
        cx3 r16 = r14.b;
        if (r16 == null) goto L21;
        k(r14, r16);
    L21:
        r13 = r13 - 1;
        goto L14
    L22:
        r0.clear();
        if (f() == true) goto L25;
        return;
    L25:
        int r17 = r3.size() - 1;
    L26:
        if (r17 < 0) goto L34;
        ArrayList r18 = (ArrayList) r3.get(r17);
        int r19 = r18.size() - 1;
    L28:
        if (r19 < 0) goto L33;
        ol0 r20 = (ol0) r18.get(r19);
        View r21 = r20.a.a;
        r21.setTranslationY(0.0f);
        r21.setTranslationX(0.0f);
        c(r20.a);
        r18.remove(r19);
        if (r18.isEmpty() == false) goto L32;
        r3.remove(r18);
    L32:
        r19 = r19 - 1;
        goto L28
    L33:
        r17 = r17 - 1;
        goto L26
    L34:
        int r22 = r2.size() - 1;
    L35:
        if (r22 < 0) goto L43;
        ArrayList r23 = (ArrayList) r2.get(r22);
        int r24 = r23.size() - 1;
    L37:
        if (r24 < 0) goto L42;
        cx3 r25 = (cx3) r23.get(r24);
        r25.a.setAlpha(1.0f);
        c(r25);
        r23.remove(r24);
        if (r23.isEmpty() == false) goto L41;
        r2.remove(r23);
    L41:
        r24 = r24 - 1;
        goto L37
    L42:
        r22 = r22 - 1;
        goto L35
    L43:
        int r26 = r1.size() - 1;
    L44:
        if (r26 < 0) goto L58;
        ArrayList r27 = (ArrayList) r1.get(r26);
        int r28 = r27.size() - 1;
    L46:
        if (r28 < 0) goto L57;
        nl0 r29 = (nl0) r27.get(r28);
        cx3 r30 = r29.a;
        if (r30 == null) goto L50;
        k(r29, r30);
    L50:
        cx3 r31 = r29.b;
        if (r31 == null) goto L54;
        k(r29, r31);
    L54:
        if (r27.isEmpty() == false) goto L56;
        r1.remove(r27);
    L56:
        r28 = r28 - 1;
        goto L46
    L57:
        r26 = r26 - 1;
        goto L44
    L58:
        h(this.q);
        h(this.p);
        h(this.o);
        h(this.r);
        ArrayList r110 = this.b;
        if (r110.size() > 0) goto L62;
        r110.clear();
        return;
    L62:
        r110.get(0).getClass();
        kf2.k();
    }

    @Override // defpackage.jw3
    public final boolean f() {
        if (this.i.isEmpty() == true) goto L5;
        return true;
    L5:
        if (this.k.isEmpty() == true) goto L7;
        return true;
    L7:
        if (this.j.isEmpty() == true) goto L9;
        return true;
    L9:
        if (this.h.isEmpty() == true) goto L11;
        return true;
    L11:
        if (this.p.isEmpty() == true) goto L13;
        return true;
    L13:
        if (this.q.isEmpty() == true) goto L15;
        return true;
    L15:
        if (this.o.isEmpty() == true) goto L17;
        return true;
    L17:
        if (this.r.isEmpty() == true) goto L19;
        return true;
    L19:
        if (this.m.isEmpty() == true) goto L21;
        return true;
    L21:
        if (this.l.isEmpty() == true) goto L23;
        return true;
    L23:
        if (this.n.isEmpty() == false) goto L38;
        return false;
    L38:
        return true;
    }

    public final boolean g(cx3 r4, int r5, int r6, int r7, int r8) {
        View r0 = r4.a;
        int r9 = r5 + ((int) r0.getTranslationX());
        int r10 = r6 + ((int) r4.a.getTranslationY());
        l(r4);
        int r1 = r7 - r9;
        int r2 = r8 - r10;
        if (r1 != 0) goto L7;
        if (r2 != 0) goto L7;
        c(r4);
        return false;
    L7:
        if (r1 == 0) goto L9;
        r0.setTranslationX(-r1);
    L9:
        if (r2 == 0) goto L11;
        r0.setTranslationY(-r2);
    L11:
        ArrayList r3 = this.j;
        ol0 r11 = new ol0();
        r11.a = r4;
        r11.b = r9;
        r11.c = r10;
        r11.d = r7;
        r11.e = r8;
        r3.add(r11);
        return true;
    }

    public final void i() {
        if (f() == true) goto L10;
        ArrayList r1 = this.b;
        if (r1.size() > 0) goto L8;
        r1.clear();
        return;
    L8:
        r1.get(0).getClass();
        kf2.k();
        return;
    }

    public final void j(ArrayList r4, cx3 r5) {
        int r0 = r4.size() - 1;
    L3:
        if (r0 < 0) goto L12;
        nl0 r1 = (nl0) r4.get(r0);
        if (k(r1, r5) == false) goto L11;
        if (r1.a != null) goto L11;
        if (r1.b != null) goto L11;
        r4.remove(r1);
    L11:
        r0 = r0 - 1;
        goto L3
    }

    public final boolean k(nl0 r3, cx3 r4) {
        if (r3.b != r4) goto L6;
        r3.b = null;
    L8:
        View r5 = r4.a;
        View r0 = r4.a;
        r5.setAlpha(1.0f);
        r0.setTranslationX(0.0f);
        r0.setTranslationY(0.0f);
        c(r4);
        return true;
    L6:
        if (r3.a != r4) goto L10;
        r3.a = null;
        goto L8
    L10:
        return false;
    }

    public final void l(cx3 r3) {
        if (s != null) goto L5;
        s = new ValueAnimator().getInterpolator();
    L5:
        r3.a.animate().setInterpolator(s);
        d(r3);
    }
}
