package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a33 extends h33 {
    public final /* synthetic */ int r;

    public /* synthetic */ a33(int r1, boolean r2) {
        this.r = r1;
        super(r2);
    }

    public static int[] g(String r1) {
        r1.getClass();
        return new int[]{((Number) h33.b.d(r1)).intValue()};
    }

    public static long[] h(String r3) {
        r3.getClass();
        return new long[]{((Number) h33.f.d(r3)).longValue()};
    }

    public static boolean[] i(String r2) {
        r2.getClass();
        return new boolean[]{((Boolean) h33.l.d(r2)).booleanValue()};
    }

    @Override // defpackage.h33
    public final Object a(String r3, Bundle r4) {
        switch(this.r) {
            case 0: goto L40;
            case 1: goto L36;
            case 2: goto L34;
            case 3: goto L30;
            case 4: goto L28;
            case 5: goto L16;
            case 6: goto L14;
            case 7: goto L10;
            case 8: goto L8;
            default: goto L4;
        };
    L4:
        r4.getClass();
        r3.getClass();
        String[] r2 = (String[]) r4.get(r3);
        if (r2 != null) goto L7;
        return null;
    L7:
        return ti.r0(r2);
    L8:
        r4.getClass();
        r3.getClass();
        return (String[]) r4.get(r3);
    L10:
        r4.getClass();
        r3.getClass();
        long[] r5 = (long[]) r4.get(r3);
        if (r5 != null) goto L13;
        return null;
    L13:
        return ti.q0(r5);
    L14:
        r4.getClass();
        r3.getClass();
        return (long[]) r4.get(r3);
    L16:
        r4.getClass();
        r3.getClass();
        int[] r6 = (int[]) r4.get(r3);
        if (r6 == null) goto L45;
        int r7 = r6.length;
        if (r7 == 0) goto L27;
        int r8 = 0;
        if (r7 == 1) goto L46;
        ArrayList r0 = new ArrayList(r6.length);
        int r9 = r6.length;
    L23:
        if (r8 >= r9) goto L47;
        r0.add(Integer.valueOf(r6[r8]));
        r8 = r8 + 1;
        goto L23
    L47:
        return r0;
    L46:
        return gb.O(Integer.valueOf(r6[0]));
    L27:
        return u01.n;
    L45:
        return null;
    L28:
        r4.getClass();
        r3.getClass();
        return (int[]) r4.get(r3);
    L30:
        r4.getClass();
        r3.getClass();
        float[] r10 = (float[]) r4.get(r3);
        if (r10 != null) goto L33;
        return null;
    L33:
        return ti.p0(r10);
    L34:
        r4.getClass();
        r3.getClass();
        return (float[]) r4.get(r3);
    L36:
        r4.getClass();
        r3.getClass();
        boolean[] r11 = (boolean[]) r4.get(r3);
        if (r11 != null) goto L39;
        return null;
    L39:
        return ti.s0(r11);
    L40:
        r4.getClass();
        r3.getClass();
        return (boolean[]) r4.get(r3);
    }

    @Override // defpackage.h33
    public final String b() {
        switch(this.r) {
            case 0: goto L22;
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L14;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        return "List<String>";
    L6:
        return "string[]";
    L8:
        return "List<Long>";
    L10:
        return "long[]";
    L12:
        return "List<Int>";
    L14:
        return "integer[]";
    L16:
        return "List<Float>";
    L18:
        return "float[]";
    L20:
        return "List<Boolean>";
    L22:
        return "boolean[]";
    }

    @Override // defpackage.h33
    public final Object c(Object r4, String r5) {
        switch(this.r) {
            case 0: goto L49;
            case 1: goto L44;
            case 2: goto L39;
            case 3: goto L34;
            case 4: goto L29;
            case 5: goto L24;
            case 6: goto L19;
            case 7: goto L14;
            case 8: goto L9;
            default: goto L4;
        };
    L4:
        List r6 = (List) r4;
        if (r6 == null) goto L8;
        return q40.G0(r6, gb.O(r5));
    L8:
        return gb.O(r5);
    L9:
        String[] r7 = (String[]) r4;
        if (r7 == null) goto L13;
        String[] r3 = {r5};
        int r8 = r7.length;
        Object[] r9 = Arrays.copyOf(r7, r8 + 1);
        System.arraycopy(r3, 0, r9, r8, 1);
        return (String[]) r9;
    L13:
        return new String[]{r5};
    L14:
        List r10 = (List) r4;
        b33 r11 = h33.f;
        if (r10 == null) goto L18;
        return q40.G0(r10, gb.O(r11.d(r5)));
    L18:
        return gb.O(r11.d(r5));
    L19:
        long[] r12 = (long[]) r4;
        if (r12 == null) goto L23;
        long[] r13 = h(r5);
        int r14 = r12.length;
        long[] r15 = Arrays.copyOf(r12, r14 + 1);
        System.arraycopy(r13, 0, r15, r14, 1);
        return r15;
    L23:
        return h(r5);
    L24:
        List r16 = (List) r4;
        b33 r17 = h33.b;
        if (r16 == null) goto L28;
        return q40.G0(r16, gb.O(r17.d(r5)));
    L28:
        return gb.O(r17.d(r5));
    L29:
        int[] r18 = (int[]) r4;
        if (r18 == null) goto L33;
        int[] r19 = g(r5);
        int r20 = r18.length;
        int[] r21 = Arrays.copyOf(r18, r20 + 1);
        System.arraycopy(r19, 0, r21, r20, 1);
        return r21;
    L33:
        return g(r5);
    L34:
        List r22 = (List) r4;
        if (r22 == null) goto L38;
        return q40.G0(r22, gb.O(Float.valueOf(Float.parseFloat(r5))));
    L38:
        return gb.O(Float.valueOf(Float.parseFloat(r5)));
    L39:
        float[] r23 = (float[]) r4;
        if (r23 == null) goto L43;
        float[] r24 = {Float.parseFloat(r5)};
        int r25 = r23.length;
        float[] r26 = Arrays.copyOf(r23, r25 + 1);
        System.arraycopy(r24, 0, r26, r25, 1);
        return r26;
    L43:
        return new float[]{Float.parseFloat(r5)};
    L44:
        List r27 = (List) r4;
        b33 r28 = h33.l;
        if (r27 == null) goto L48;
        return q40.G0(r27, gb.O(r28.d(r5)));
    L48:
        return gb.O(r28.d(r5));
    L49:
        boolean[] r29 = (boolean[]) r4;
        if (r29 == null) goto L53;
        boolean[] r30 = i(r5);
        int r31 = r29.length;
        boolean[] r32 = Arrays.copyOf(r29, r31 + 1);
        System.arraycopy(r30, 0, r32, r31, 1);
        return r32;
    L53:
        return i(r5);
    }

    @Override // defpackage.h33
    public final Object d(String r2) {
        switch(this.r) {
            case 0: goto L23;
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L15;
            case 5: goto L12;
            case 6: goto L11;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        r2.getClass();
        return gb.O(r2);
    L6:
        r2.getClass();
        return new String[]{r2};
    L8:
        r2.getClass();
        return gb.O(h33.f.d(r2));
    L12:
        r2.getClass();
        return gb.O(h33.b.d(r2));
    L16:
        r2.getClass();
        return gb.O(Float.valueOf(Float.parseFloat(r2)));
    L18:
        r2.getClass();
        return new float[]{Float.parseFloat(r2)};
    L20:
        r2.getClass();
        return gb.O(h33.l.d(r2));
    L11:
        return h(r2);
    L15:
        return g(r2);
    L23:
        return i(r2);
    }

    @Override // defpackage.h33
    public final void e(Bundle r5, String r6, Object r7) {
        int r0 = 0;
        boolean[] r1 = null;
        String[] r2 = null;
        long[] r3 = null;
        int[] r4 = null;
        float[] r8 = null;
        switch(this.r) {
            case 0: goto L43;
            case 1: goto L38;
            case 2: goto L36;
            case 3: goto L28;
            case 4: goto L26;
            case 5: goto L21;
            case 6: goto L19;
            case 7: goto L11;
            case 8: goto L9;
            default: goto L4;
        };
    L4:
        List r9 = (List) r7;
        r6.getClass();
        if (r9 == null) goto L7;
        r2 = (String[]) r9.toArray(new String[0]);
    L7:
        r5.putStringArray(r6, r2);
        return;
    L9:
        r6.getClass();
        r5.putStringArray(r6, (String[]) r7);
        return;
    L11:
        List r10 = (List) r7;
        r6.getClass();
        if (r10 == null) goto L17;
        r3 = new long[r10.size()];
        Iterator r11 = r10.iterator();
    L15:
        if (r11.hasNext() == false) goto L17;
        long r12 = ((Number) r11.next()).longValue();
        r3[r0] = r12;
        r0 = r0 + 1;
    L17:
        r5.putLongArray(r6, r3);
        return;
    L19:
        r6.getClass();
        r5.putLongArray(r6, (long[]) r7);
        return;
    L21:
        List r13 = (List) r7;
        r6.getClass();
        if (r13 == null) goto L24;
        r4 = q40.P0(r13);
    L24:
        r5.putIntArray(r6, r4);
        return;
    L26:
        r6.getClass();
        r5.putIntArray(r6, (int[]) r7);
        return;
    L28:
        List r14 = (List) r7;
        r6.getClass();
        if (r14 == null) goto L34;
        r8 = new float[r14.size()];
        Iterator r15 = r14.iterator();
    L32:
        if (r15.hasNext() == false) goto L34;
        r8[r0] = ((Number) r15.next()).floatValue();
        r0 = r0 + 1;
    L34:
        r5.putFloatArray(r6, r8);
        return;
    L36:
        r6.getClass();
        r5.putFloatArray(r6, (float[]) r7);
        return;
    L38:
        List r16 = (List) r7;
        r6.getClass();
        if (r16 == null) goto L41;
        r1 = q40.N0(r16);
    L41:
        r5.putBooleanArray(r6, r1);
        return;
    L43:
        r6.getClass();
        r5.putBooleanArray(r6, (boolean[]) r7);
    }
}
