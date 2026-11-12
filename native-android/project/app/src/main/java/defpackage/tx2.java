package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tx2 {
    public long a;
    public final SparseLongArray b;
    public final SparseBooleanArray c;
    public final ArrayList d;
    public final xe2 e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public g83 j;

    public tx2() {
        this.b = new SparseLongArray();
        this.c = new SparseBooleanArray();
        this.d = new ArrayList();
        this.e = new xe2(null);
        this.f = -1;
        this.g = -1;
    }

    public final void a(MotionEvent r8) {
        int r0 = r8.getActionMasked();
        SparseLongArray r3 = this.b;
        if (r0 != 0) goto L5;
    L13:
        int r1 = r8.getActionIndex();
        int r4 = r8.getPointerId(r1);
        if (r3.indexOfKey(r4) >= 0) goto L20;
        long r5 = this.a;
        this.a = 1 + r5;
        r3.put(r4, r5);
        if (r8.getToolType(r1) != 3) goto L21;
        this.c.put(r4, true);
        return;
    L21:
        return;
    L20:
        return;
    L5:
        if (r0 == 5) goto L13;
        if (r0 != 9) goto L22;
        int r9 = r8.getPointerId(0);
        if (r3.indexOfKey(r9) >= 0) goto L19;
        long r6 = this.a;
        this.a = 1 + r6;
        r3.put(r9, r6);
        return;
    L19:
        return;
    }

    public final void b(MotionEvent r3) {
        if (r3.getPointerCount() != 1) goto L13;
        int r0 = r3.getToolType(0);
        int r4 = r3.getSource();
        if (r0 == this.f) goto L8;
    L11:
        this.f = r0;
        this.g = r4;
        this.c.clear();
        this.b.clear();
        return;
    L8:
        if (r4 != this.g) goto L11;
        return;
    }

    public final rf2 c(MotionEvent r16, ra r17) {
        int r0 = r16.getActionMasked();
        SparseBooleanArray r1 = this.c;
        if (r0 != 3) goto L5;
    L91:
        this.b.clear();
        r1.clear();
        this.h = false;
        this.i = false;
        this.j = null;
        return null;
    L5:
        if (r0 == 4) goto L91;
        b(r16);
        a(r16);
        if (r0 != 9) goto L9;
    L14:
        boolean r9 = true;
    L16:
        if (r0 != 8) goto L18;
        boolean r10 = true;
    L19:
        if (r9 == false) goto L21;
        r1.put(r16.getPointerId(r16.getActionIndex()), true);
    L21:
        if (r0 != 1) goto L23;
        int r11 = 0;
    L28:
        ArrayList r12 = this.d;
        r12.clear();
        if (r16.getActionMasked() != 0) goto L50;
        if (Build.VERSION.SDK_INT >= 34) goto L33;
    L37:
        boolean r2 = false;
    L39:
        if (r16.getButtonState() == 0) goto L41;
    L45:
        boolean r5 = false;
    L46:
        if (r2 == true) goto L48;
        if (r5 == false) goto L50;
    L48:
        this.h = true;
        goto L50
    L41:
        if (r16.isFromSource(8194) == false) goto L43;
    L44:
        r5 = true;
        goto L46
    L43:
        if (r16.isFromSource(1048584) == false) goto L45;
    L33:
        if (ek2.c(r16) != 3) goto L35;
    L36:
        r2 = true;
        goto L39
    L35:
        if (ek2.c(r16) != 5) goto L37;
    L50:
        if (Build.VERSION.SDK_INT >= 34) goto L52;
    L76:
        this.i = false;
        int r13 = r16.getPointerCount();
        int r4 = 0;
    L77:
        if (r4 >= r13) goto L87;
        if (r9 == true) goto L84;
        if (r4 == r11) goto L84;
        if (r10 == true) goto L82;
    L83:
        boolean r6 = true;
    L85:
        r12.add(d(r17, r16, null, r4, r6));
        r4 = r4 + 1;
        goto L77
    L82:
        if (r16.getButtonState() != 0) goto L83;
    L84:
        r6 = false;
    L87:
        if (r16.getActionMasked() != 1) goto L89;
        this.h = false;
        this.i = false;
        this.j = null;
    L89:
        e(r16);
        r16.getEventTime();
        return new rf2(r12, r16);
    L52:
        if (ek2.c(r16) == 3) goto L56;
        if (ek2.c(r16) != 5) goto L76;
    L56:
        if (ek2.c(r16) == 5) goto L58;
    L64:
        this.i = true;
        if (r16.getActionMasked() != 0) goto L68;
        float r3 = ek2.z(r16);
        float r7 = ek2.a(r16);
        this.j = new g83((Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(r7) & 4294967295L));
    L74:
        r12.add(d(r17, r16, this.j, 0, false));
        goto L87
    L68:
        if (r16.getActionMasked() != 5) goto L74;
        if (ek2.c(r16) != 5) goto L74;
        if (r16.getPointerCount() != 2) goto L74;
        float r8 = (ek2.C(r16) + ek2.z(r16)) / 2.0f;
        float r14 = (ek2.v(r16) + ek2.a(r16)) / 2.0f;
        this.j = new g83((Float.floatToRawIntBits(r8) << 32) | (Float.floatToRawIntBits(r14) & 4294967295L));
        goto L74
    L58:
        if (r16.getPointerCount() != 1) goto L64;
        if (r16.getActionMasked() != 1) goto L62;
        this.h = false;
        this.i = false;
        this.j = null;
    L62:
        e(r16);
        return null;
    L23:
        if (r0 == 6) goto L26;
        int r15 = -1;
    L25:
        r11 = r15;
        goto L28
    L26:
        r15 = r16.getActionIndex();
        goto L25
    L18:
        r10 = false;
        goto L19
    L9:
        if (r0 == 7) goto L14;
        if (r0 == 10) goto L14;
        r9 = false;
        goto L16
    }

    public final qn3 d(ra r43, MotionEvent r44, g83 r45, int r46, boolean r47) {
        int r5 = r44.getPointerId(r46);
        SparseLongArray r6 = this.b;
        int r7 = r6.indexOfKey(r5);
        if (r7 < 0) goto L5;
        long r12 = r6.valueAt(r7);
    L6:
        float r21 = r44.getPressure(r46);
        float r8 = r44.getX(r46);
        float r9 = r44.getY(r46);
        long r10 = Float.floatToRawIntBits(r8);
        long r11 = (((long) Float.floatToRawIntBits(r9)) & 4294967295L) | (r10 << 32);
        if (r46 != 0) goto L13;
        if (r45 == null) goto L10;
        long r14 = r45.a;
        char r13 = ' ';
        long r16 = 4294967295L;
    L11:
        long r15 = r43.E(r14);
    L12:
        long r18 = r15;
    L21:
        int r1 = r44.getToolType(r46);
        if (r1 == 0) goto L29;
        int r17 = 2;
        if (r1 == 1) goto L33;
        if (r1 == 2) goto L31;
        if (r1 == 3) goto L30;
        r17 = 4;
        if (r1 != 4) goto L29;
    L30:
        int r22 = r17;
    L42:
        ArrayList r2 = new ArrayList(r44.getHistorySize());
        int r19 = r44.getHistorySize();
        char r20 = r13;
        int r110 = 0;
    L43:
        Float r23 = null;
        long r24 = 0;
        float r26 = 1.0f;
        if (r110 >= r19) goto L63;
        float r28 = r44.getHistoricalX(r46, r110);
        float r29 = r44.getHistoricalY(r46, r110);
        if ((Float.floatToRawIntBits(r28) & Integer.MAX_VALUE) >= 2139095040) goto L61;
        if ((Float.floatToRawIntBits(r29) & Integer.MAX_VALUE) >= 2139095040) goto L61;
        long r35 = (Float.floatToRawIntBits(r28) << r20) | (((long) Float.floatToRawIntBits(r29)) & r16);
        long r33 = r44.getHistoricalEventTime(r110);
        float r3 = r44.getHistoricalAxisValue(52, r46, r110);
        Float r25 = Float.valueOf(r3);
        if (r3 <= 0.0f) goto L52;
        r23 = r25;
    L52:
        if (r23 == null) goto L54;
        r26 = r23.floatValue();
    L54:
        float r37 = r26;
        if (Build.VERSION.SDK_INT >= 29) goto L57;
    L59:
        r2.add(new bm1(r33, r35, r37, r24, r35));
        goto L61
    L57:
        if (ek2.c(r44) != 3) goto L59;
        float r4 = r44.getHistoricalAxisValue(50, r46, r110);
        float r27 = r44.getHistoricalAxisValue(51, r46, r110);
        r24 = (Float.floatToRawIntBits(r4) << r20) | (((long) Float.floatToRawIntBits(r27)) & r16);
    L61:
        r110 = r110 + 1;
        r19 = r19;
        goto L43
    L63:
        if (r44.getActionMasked() != 8) goto L65;
        float r30 = r44.getAxisValue(10);
        float r31 = (-r44.getAxisValue(9)) + 0.0f;
        long r32 = (Float.floatToRawIntBits(r30) << r20) | (Float.floatToRawIntBits(r31) & r16);
    L66:
        int r34 = Build.VERSION.SDK_INT;
        if (r34 >= 29) goto L69;
    L75:
        float r210 = r26;
        if (r34 < 29) goto L80;
        if (ek2.c(r44) != 3) goto L80;
        float r36 = r44.getAxisValue(50, r46);
        float r38 = r44.getAxisValue(51, r46);
        r24 = (Float.floatToRawIntBits(r36) << r20) | (Float.floatToRawIntBits(r38) & r16);
    L80:
        long r211 = r24;
        return new qn3(r12, r44.getEventTime(), r14, r18, r47, r21, r22, this.c.get(r44.getPointerId(r46), false), r2, r32, r210, r211, r11);
    L69:
        if (ek2.c(r44) != 5) goto L75;
        float r111 = r44.getAxisValue(52, r46);
        Float r112 = Float.valueOf(r111);
        if (r111 <= 0.0f) goto L73;
        r23 = r112;
    L73:
        if (r23 == null) goto L75;
        r26 = r23.floatValue();
        goto L75
    L65:
        r32 = 0;
        goto L66
    L31:
        r22 = 3;
        goto L42
    L33:
        if (r44.isFromSource(8194) == true) goto L37;
        if (r44.isFromSource(1048584) == true) goto L37;
    L41:
        r22 = 1;
    L37:
        if (this.h == false) goto L30;
        if (this.i == false) goto L41;
    L29:
        r22 = 0;
        goto L42
    L10:
        float r39 = r44.getRawX();
        float r40 = r44.getRawY();
        long r113 = Float.floatToRawIntBits(r39);
        int r41 = Float.floatToRawIntBits(r40);
        r13 = ' ';
        r16 = 4294967295L;
        r14 = (r113 << 32) | (((long) r41) & 4294967295L);
        goto L11
    L13:
        r13 = ' ';
        r16 = 4294967295L;
        if (Build.VERSION.SDK_INT < 29) goto L20;
        if (r45 == null) goto L18;
        long r42 = r45.a;
    L17:
        r14 = r42;
        r15 = r43.E(r14);
        goto L12
    L18:
        float r48 = ek2.b(r44, r46);
        float r49 = ek2.w(r44, r46);
        r42 = (Float.floatToRawIntBits(r48) << 32) | (Float.floatToRawIntBits(r49) & 4294967295L);
        goto L17
    L20:
        r14 = r43.p(r11);
        r18 = r11;
        goto L21
    L5:
        long r50 = this.a;
        this.a = 1 + r50;
        r6.put(r5, r50);
        r12 = r50;
        goto L6
    }

    public final void e(MotionEvent r8) {
        int r0 = r8.getActionMasked();
        SparseBooleanArray r2 = this.c;
        SparseLongArray r7 = this.b;
        if (r0 != 1) goto L5;
    L7:
        int r1 = r8.getPointerId(r8.getActionIndex());
        if (r2.get(r1, false) == true) goto L11;
        r7.delete(r1);
        r2.delete(r1);
    L11:
        if (r7.size() <= r8.getPointerCount()) goto L23;
        int r3 = r7.size() - 1;
    L14:
        if ((-1) >= r3) goto L28;
        int r4 = r7.keyAt(r3);
        int r5 = r8.getPointerCount();
        int r6 = 0;
    L16:
        if (r6 >= r5) goto L21;
        if (r8.getPointerId(r6) == r4) goto L22;
        r6 = r6 + 1;
    L22:
        r3 = r3 - 1;
        goto L14
    L21:
        r7.removeAt(r3);
        r2.delete(r4);
        goto L22
    L28:
        return;
    L23:
        return;
    L5:
        if (r0 == 6) goto L7;
        goto L7
    }
}
