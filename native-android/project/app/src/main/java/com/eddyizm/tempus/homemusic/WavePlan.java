package com.eddyizm.tempus.homemusic;

import defpackage.gb;
import defpackage.h12;
import defpackage.q40;
import defpackage.xj0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WavePlan {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final List<Integer> add;
    private final int keep;
    private final List<Integer> remove;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 r1) {
            this();
        }

        public final WavePlan of(List<String> r8, List<String> r9) {
            r8.getClass();
            r9.getClass();
            int r7 = 0;
            int r0 = 0;
        L4:
            if (r0 >= r8.size()) goto L10;
            if (r0 >= r9.size()) goto L10;
            if (h12.c(r8.get(r0), r9.get(r0)) == false) goto L10;
            r0 = r0 + 1;
        L10:
            Set r1 = q40.T0(q40.L0(r8, r0));
            List r2 = q40.u0(gb.C(r9), r0);
            ArrayList r3 = new ArrayList();
            Iterator r4 = r2.iterator();
        L12:
            if (r4.hasNext() == false) goto L16;
            Object r5 = r4.next();
            if (r1.contains(r9.get(((Number) r5).intValue())) == true) goto L12;
            r3.add(r5);
            goto L12
        L16:
            HashSet r6 = new HashSet();
            ArrayList r10 = new ArrayList();
            int r11 = r3.size();
        L17:
            if (r7 >= r11) goto L22;
            Object r12 = r3.get(r7);
            r7 = r7 + 1;
            if (r6.add(r9.get(((Number) r12).intValue())) == false) goto L17;
            r10.add(r12);
            goto L17
        L22:
            return new WavePlan(r0, q40.Q0(gb.g0(r0, r8.size())), r10);
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public WavePlan(int r1, List<Integer> r2, List<Integer> r3) {
        r2.getClass();
        r3.getClass();
        this.keep = r1;
        this.remove = r2;
        this.add = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WavePlan copy$default(WavePlan r0, int r1, List r2, List r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.keep;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.remove;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.add;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.keep;
    }

    public final List<Integer> component2() {
        return this.remove;
    }

    public final List<Integer> component3() {
        return this.add;
    }

    public final WavePlan copy(int r1, List<Integer> r2, List<Integer> r3) {
        r2.getClass();
        r3.getClass();
        return new WavePlan(r1, r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WavePlan) == true) goto L8;
        return false;
    L8:
        WavePlan r6 = (WavePlan) r5;
        if (this.keep == r6.keep) goto L12;
        return false;
    L12:
        if (h12.c(this.remove, r6.remove) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.add, r6.add) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final List<Integer> getAdd() {
        return this.add;
    }

    public final int getKeep() {
        return this.keep;
    }

    public final List<Integer> getRemove() {
        return this.remove;
    }

    public int hashCode() {
        int r0 = Integer.hashCode(this.keep) * 31;
        int r1 = (this.remove.hashCode() + r0) * 31;
        return this.add.hashCode() + r1;
    }

    public final int insertAt(List<Integer> r1, int r2) {
        r1.getClass();
        int r0 = this.keep;
        if (r0 <= 0) goto L7;
        return r1.get(r0 - 1).intValue() + 1;
    L7:
        if (r1.isEmpty() == false) goto L9;
        return r2;
    L9:
        return ((Number) q40.w0(r1)).intValue();
    }

    public String toString() {
        return "WavePlan(keep=" + this.keep + ", remove=" + this.remove + ", add=" + this.add + ")";
    }
}
