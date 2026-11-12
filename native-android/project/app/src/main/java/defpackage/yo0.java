package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class yo0 implements uo0 {
    public ba5 a;
    public boolean b;
    public boolean c;
    public final ba5 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public eq0 i;
    public boolean j;
    public final ArrayList k;
    public final ArrayList l;

    public yo0(ba5 r4) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.e = 1;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = r4;
    }

    @Override // defpackage.uo0
    public final void a(uo0 r8) {
        ArrayList r9 = this.l;
        int r0 = r9.size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L7;
        Object r3 = r9.get(r2);
        r2 = r2 + 1;
        if (((yo0) r3).j == true) goto L3;
        return;
    L7:
        this.c = true;
        ba5 r4 = this.a;
        if (r4 == null) goto L11;
        r4.a(this);
    L11:
        if (this.b == false) goto L14;
        this.d.a(this);
        return;
    L14:
        int r5 = r9.size();
        yo0 r6 = null;
        int r7 = 0;
    L15:
        if (r7 >= r5) goto L20;
        Object r10 = r9.get(r7);
        r7 = r7 + 1;
        yo0 r11 = (yo0) r10;
        if ((r11 instanceof eq0) == true) goto L15;
        r1 = r1 + 1;
        r6 = r11;
        goto L15
    L20:
        if (r6 == null) goto L30;
        if (r1 != 1) goto L30;
        if (r6.j == false) goto L30;
        eq0 r12 = this.i;
        if (r12 != null) goto L27;
    L29:
        d(r6.g + this.f);
        goto L30
    L27:
        if (r12.j == false) goto L42;
        this.f = this.h * r12.g;
        goto L29
    L42:
        return;
    L30:
        ba5 r13 = this.a;
        if (r13 == null) goto L43;
        r13.a(this);
        return;
    }

    public final void b(ba5 r2) {
        this.k.add(r2);
        if (this.j == false) goto L6;
        r2.a(r2);
        return;
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int r3) {
        if (this.j == true) goto L8;
        this.j = true;
        this.g = r3;
        ArrayList r2 = this.k;
        int r4 = r2.size();
        int r0 = 0;
    L6:
        if (r0 >= r4) goto L10;
        Object r1 = r2.get(r0);
        r0 = r0 + 1;
        uo0 r5 = (uo0) r1;
        r5.a(r5);
        goto L6
    L10:
        return;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.d.b.g0);
        r0.append(":");
        switch(this.e) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L6;
            case 8: goto L5;
            default: goto L4;
        };
    L4:
        String r1 = "null";
    L13:
        r0.append(r1);
        r0.append("(");
        if (this.j == false) goto L16;
        Object r2 = Integer.valueOf(this.g);
    L17:
        r0.append(r2);
        r0.append(") <t=");
        r0.append(this.l.size());
        r0.append(":d=");
        r0.append(this.k.size());
        r0.append(">");
        return r0.toString();
    L16:
        r2 = "unresolved";
        goto L17
    L5:
        r1 = "BASELINE";
        goto L13
    L6:
        r1 = "BOTTOM";
        goto L13
    L7:
        r1 = "TOP";
        goto L13
    L8:
        r1 = "RIGHT";
        goto L13
    L9:
        r1 = "LEFT";
        goto L13
    L10:
        r1 = "VERTICAL_DIMENSION";
        goto L13
    L11:
        r1 = "HORIZONTAL_DIMENSION";
        goto L13
    L12:
        r1 = "UNKNOWN";
        goto L13
    }
}
