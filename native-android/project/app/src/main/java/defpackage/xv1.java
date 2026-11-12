package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xv1 implements kg0 {
    public final ArrayList a;

    public xv1(int r1) {
        switch(r1) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.a = new ArrayList();
        return;
    L5:
        this.a = new ArrayList();
    }

    @Override // defpackage.kg0
    public long a(long r12) {
        ArrayList r11 = this.a;
        if (r11.isEmpty() == false) goto L6;
        return Long.MIN_VALUE;
    L6:
        if (r12 < ((lg0) r11.get(0)).b) goto L8;
        int r3 = 1;
    L11:
        if (r3 >= r11.size()) goto L23;
        lg0 r4 = (lg0) r11.get(r3);
        long r7 = r4.b;
        long r9 = r4.b;
        if (r12 < r7) goto L14;
        r3 = r3 + 1;
        goto L11
    L14:
        long r0 = ((lg0) r11.get(r3 - 1)).d;
        if (r0 != (-9223372036854775807L)) goto L17;
    L21:
        return r9;
    L17:
        if (r0 <= r12) goto L21;
        if (r0 >= r9) goto L21;
        return r0;
    L23:
        long r5 = ((lg0) te5.w(r11)).d;
        if (r5 != (-9223372036854775807L)) goto L26;
    L28:
        return Long.MIN_VALUE;
    L26:
        if (r12 >= r5) goto L28;
        return r5;
    L8:
        return ((lg0) r11.get(0)).b;
    }

    @Override // defpackage.kg0
    public boolean b(lg0 r10, long r11) {
        long r0 = r10.b;
        if (r0 == (-9223372036854775807L)) goto L5;
        boolean r4 = true;
    L6:
        rr2.l(r4);
        if (r0 > r11) goto L13;
        long r7 = r10.d;
        if (r7 != (-9223372036854775807L)) goto L11;
    L12:
        boolean r2 = true;
    L14:
        ArrayList r9 = this.a;
        int r3 = r9.size() - 1;
    L15:
        if (r3 < 0) goto L24;
        if (r0 >= ((lg0) r9.get(r3)).b) goto L18;
        if (((lg0) r9.get(r3)).b > r11) goto L23;
        r2 = false;
    L23:
        r3 = r3 - 1;
        goto L15
    L18:
        r9.add(r3 + 1, r10);
        return r2;
    L24:
        r9.add(0, r10);
        return r2;
    L11:
        if (r11 < r7) goto L12;
    L13:
        r2 = false;
        goto L14
    L5:
        r4 = false;
        goto L6
    }

    @Override // defpackage.kg0
    public yw1 c(long r5) {
        int r0 = f(r5);
        if (r0 != 0) goto L6;
        vw1 r4 = yw1.o;
        return gy3.r;
    L6:
        lg0 r6 = (lg0) this.a.get(r0 - 1);
        long r1 = r6.d;
        if (r1 == (-9223372036854775807L)) goto L14;
        if (r5 < r1) goto L14;
        vw1 r7 = yw1.o;
        return gy3.r;
    L14:
        return r6.a;
    }

    @Override // defpackage.kg0
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.kg0
    public long d(long r8) {
        ArrayList r7 = this.a;
        if (r7.isEmpty() == false) goto L5;
    L30:
        return -9223372036854775807L;
    L5:
        if (r8 < ((lg0) r7.get(0)).b) goto L30;
        int r3 = 1;
    L9:
        if (r3 >= r7.size()) goto L22;
        long r4 = ((lg0) r7.get(r3)).b;
        if (r8 == r4) goto L12;
        if (r8 < r4) goto L14;
        r3 = r3 + 1;
        goto L9
    L14:
        lg0 r9 = (lg0) r7.get(r3 - 1);
        long r5 = r9.d;
        if (r5 == (-9223372036854775807L)) goto L20;
        if (r5 > r8) goto L20;
        return r5;
    L20:
        return r9.b;
    L12:
        return r4;
    L22:
        lg0 r10 = (lg0) te5.w(r7);
        long r6 = r10.d;
        if (r6 == (-9223372036854775807L)) goto L29;
        if (r8 < r6) goto L29;
        return r6;
    L29:
        return r10.b;
    }

    @Override // defpackage.kg0
    public void e(long r6) {
        int r0 = f(r6);
        if (r0 != 0) goto L5;
        return;
    L5:
        ArrayList r5 = this.a;
        long r1 = ((lg0) r5.get(r0 - 1)).d;
        if (r1 != (-9223372036854775807L)) goto L8;
    L9:
        r0 = r0 - 1;
    L10:
        r5.subList(0, r0).clear();
        return;
    L8:
        if (r1 < r6) goto L10;
        goto L9
    }

    public int f(long r4) {
        int r0 = 0;
    L3:
        ArrayList r1 = this.a;
        if (r0 >= r1.size()) goto L10;
        if (r4 < ((lg0) r1.get(r0)).b) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r0;
    L10:
        return r1.size();
    }
}
