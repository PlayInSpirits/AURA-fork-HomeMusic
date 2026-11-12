package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jn0 extends cw4 {
    public static final jn0 F0 = null;
    public static final String G0 = null;
    public static final String H0 = null;
    public static final String I0 = null;
    public static final String J0 = null;
    public static final String K0 = null;
    public static final String L0 = null;
    public static final String M0 = null;
    public static final String N0 = null;
    public static final String O0 = null;
    public static final String P0 = null;
    public static final String Q0 = null;
    public static final String R0 = null;
    public static final String S0 = null;
    public static final String T0 = null;
    public static final String U0 = null;
    public static final String V0 = null;
    public static final String W0 = null;
    public static final String X0 = null;
    public static final String Y0 = null;
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final SparseArray D0;
    public final SparseBooleanArray E0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    static {
        F0 = new jn0(new in0());
        String r0 = f35.a;
        G0 = Integer.toString(1000, 36);
        H0 = Integer.toString(1001, 36);
        I0 = Integer.toString(1002, 36);
        J0 = Integer.toString(1003, 36);
        K0 = Integer.toString(1004, 36);
        L0 = Integer.toString(1005, 36);
        M0 = Integer.toString(1006, 36);
        N0 = Integer.toString(1007, 36);
        O0 = Integer.toString(1008, 36);
        P0 = Integer.toString(1009, 36);
        Q0 = Integer.toString(1010, 36);
        R0 = Integer.toString(1011, 36);
        S0 = Integer.toString(1012, 36);
        T0 = Integer.toString(1013, 36);
        U0 = Integer.toString(1014, 36);
        V0 = Integer.toString(1015, 36);
        W0 = Integer.toString(1016, 36);
        X0 = Integer.toString(1017, 36);
        Y0 = Integer.toString(1018, 36);
    }

    public jn0(in0 r2) {
        super(r2);
        this.w0 = r2.J;
        this.x0 = r2.K;
        this.y0 = r2.L;
        this.z0 = r2.M;
        this.A0 = r2.N;
        this.B0 = r2.O;
        this.C0 = r2.P;
        this.D0 = r2.Q;
        this.E0 = r2.R;
    }

    @Override // defpackage.cw4
    public final bw4 a() {
        return new in0(this);
    }

    @Override // defpackage.cw4
    public final Bundle c() {
        Bundle r0 = super.c();
        r0.putBoolean(G0, this.w0);
        int r2 = 0;
        r0.putBoolean(H0, false);
        r0.putBoolean(I0, this.x0);
        r0.putBoolean(U0, false);
        r0.putBoolean(J0, this.y0);
        r0.putBoolean(K0, false);
        r0.putBoolean(L0, false);
        r0.putBoolean(M0, false);
        r0.putBoolean(V0, false);
        r0.putBoolean(Y0, this.z0);
        r0.putBoolean(W0, this.A0);
        r0.putBoolean(N0, this.B0);
        r0.putBoolean(O0, false);
        r0.putBoolean(P0, this.C0);
        r0.putBoolean(X0, false);
        ArrayList r1 = new ArrayList();
        ArrayList r3 = new ArrayList();
        SparseArray r4 = new SparseArray();
        int r5 = 0;
    L3:
        SparseArray r6 = this.D0;
        if (r5 >= r6.size()) goto L18;
        int r7 = r6.keyAt(r5);
        Iterator r8 = ((Map) r6.valueAt(r5)).entrySet().iterator();
    L7:
        if (r8.hasNext() == false) goto L13;
        Map.Entry r9 = (Map.Entry) r8.next();
        if (r9.getValue() != null) goto L11;
        r3.add((tv4) r9.getKey());
        r1.add(Integer.valueOf(r7));
        goto L7
    L11:
        kf2.k();
        return null;
    L13:
        r0.putIntArray(Q0, jz4.N(r1));
        r0.putParcelableArrayList(R0, hw.N(r3, new mj0(8)));
        SparseArray<? extends Parcelable> r10 = new SparseArray(r4.size());
        if (r4.size() > 0) goto L16;
        r0.putSparseParcelableArray(S0, r10);
        r5 = r5 + 1;
        goto L3
    L16:
        r4.keyAt(0);
        xa3.r(r4.valueAt(0));
        throw null;
    L18:
        SparseBooleanArray r11 = this.E0;
        int[] r12 = new int[r11.size()];
    L20:
        if (r2 >= r11.size()) goto L22;
        r12[r2] = r11.keyAt(r2);
        r2 = r2 + 1;
        goto L20
    L22:
        r0.putIntArray(T0, r12);
        return r0;
    }

    @Override // defpackage.cw4
    public final boolean equals(Object r9) {
        if (this != r9) goto L5;
        return true;
    L5:
        if (r9 != null) goto L7;
    L55:
        return false;
    L7:
        if (jn0.class != r9.getClass()) goto L55;
        jn0 r10 = (jn0) r9;
        if (super.equals(r10) == false) goto L55;
        if (this.w0 != r10.w0) goto L55;
        if (this.x0 != r10.x0) goto L55;
        if (this.y0 != r10.y0) goto L55;
        if (this.z0 != r10.z0) goto L55;
        if (this.A0 != r10.A0) goto L55;
        if (this.B0 != r10.B0) goto L55;
        if (this.C0 != r10.C0) goto L55;
        SparseBooleanArray r1 = r10.E0;
        SparseBooleanArray r2 = this.E0;
        int r3 = r2.size();
        if (r1.size() != r3) goto L55;
        int r4 = 0;
    L29:
        if (r4 >= r3) goto L34;
        if (r1.indexOfKey(r2.keyAt(r4)) < 0) goto L55;
        r4 = r4 + 1;
        goto L29
    L34:
        SparseArray r11 = r10.D0;
        SparseArray r8 = this.D0;
        int r5 = r8.size();
        if (r11.size() != r5) goto L55;
        int r6 = 0;
    L38:
        if (r6 >= r5) goto L65;
        int r7 = r11.indexOfKey(r8.keyAt(r6));
        if (r7 < 0) goto L55;
        Map r12 = (Map) r8.valueAt(r6);
        Map r13 = (Map) r11.valueAt(r7);
        if (r13.size() != r12.size()) goto L55;
        Iterator r14 = r12.entrySet().iterator();
    L46:
        if (r14.hasNext() == false) goto L52;
        Map.Entry r15 = (Map.Entry) r14.next();
        tv4 r16 = (tv4) r15.getKey();
        if (r13.containsKey(r16) == false) goto L55;
        if (Objects.equals(r15.getValue(), r13.get(r16)) == true) goto L46;
    L52:
        r6 = r6 + 1;
        goto L38
    L65:
        return true;
    }

    @Override // defpackage.cw4
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w0 ? 1 : 0)) * 961) + (this.x0 ? 1 : 0)) * 961) + (this.y0 ? 1 : 0)) * 28629151) + (this.z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 961) + (this.C0 ? 1 : 0)) * 31;
    }
}
