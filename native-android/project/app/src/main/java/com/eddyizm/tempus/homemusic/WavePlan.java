package com.eddyizm.tempus.homemusic;

import defpackage.gb;
import defpackage.h12;
import defpackage.q40;
import defpackage.xj0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WavePlan {
    private final List<Integer> add;
    private final int keep;
    private final List<Integer> remove;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public WavePlan(int i, List<Integer> list, List<Integer> list2) {
        list.getClass();
        list2.getClass();
        this.keep = i;
        this.remove = list;
        this.add = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WavePlan copy$default(WavePlan wavePlan, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wavePlan.keep;
        }
        if ((i2 & 2) != 0) {
            list = wavePlan.remove;
        }
        if ((i2 & 4) != 0) {
            list2 = wavePlan.add;
        }
        return wavePlan.copy(i, list, list2);
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

    public final WavePlan copy(int i, List<Integer> list, List<Integer> list2) {
        list.getClass();
        list2.getClass();
        return new WavePlan(i, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WavePlan)) {
            return false;
        }
        WavePlan wavePlan = (WavePlan) obj;
        return this.keep == wavePlan.keep && h12.c(this.remove, wavePlan.remove) && h12.c(this.add, wavePlan.add);
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
        return this.add.hashCode() + ((this.remove.hashCode() + (Integer.hashCode(this.keep) * 31)) * 31);
    }

    public final int insertAt(List<Integer> list, int i) {
        list.getClass();
        int i2 = this.keep;
        if (i2 > 0) {
            return list.get(i2 - 1).intValue() + 1;
        }
        return !list.isEmpty() ? ((Number) q40.w0(list)).intValue() : i;
    }

    public String toString() {
        return "WavePlan(keep=" + this.keep + ", remove=" + this.remove + ", add=" + this.add + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        public final WavePlan of(List<String> list, List<String> list2) {
            list.getClass();
            list2.getClass();
            int i = 0;
            int i2 = 0;
            while (i2 < list.size() && i2 < list2.size() && h12.c(list.get(i2), list2.get(i2))) {
                i2++;
            }
            Set setT0 = q40.T0(q40.L0(list, i2));
            List listU0 = q40.u0(gb.C(list2), i2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listU0) {
                if (!setT0.contains(list2.get(((Number) obj).intValue()))) {
                    arrayList.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (hashSet.add(list2.get(((Number) obj2).intValue()))) {
                    arrayList2.add(obj2);
                }
            }
            return new WavePlan(i2, q40.Q0(gb.g0(i2, list.size())), arrayList2);
        }

        private Companion() {
        }
    }
}
