package com.eddyizm.tempus.homemusic;

import defpackage.fu;
import defpackage.gg4;
import defpackage.h12;
import defpackage.if1;
import defpackage.kd3;
import defpackage.q40;
import defpackage.r40;
import defpackage.s11;
import defpackage.u01;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SmartPlan {
    public static final int $stable = 0;
    public static final SmartPlan INSTANCE = new SmartPlan();
    public static final int MAX_QUEUE = 500;

    private SmartPlan() {
    }

    public static /* synthetic */ List build$default(SmartPlan smartPlan, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        return smartPlan.build(list, list2, list3, str);
    }

    private static final void build$recsAfter(Map<String, ? extends List<SmartRec>> map, HashSet<String> hashSet, ArrayList<gg4> arrayList, String str) {
        List<SmartRec> list = map.get(str);
        if (list == null) {
            list = u01.n;
        }
        for (SmartRec smartRec : list) {
            String queueId = smartRec.getQueueId();
            if (queueId != null) {
                if (!hashSet.add(queueId)) {
                    queueId = null;
                }
                if (queueId != null) {
                    arrayList.add(new gg4(queueId, smartRec));
                }
            }
        }
    }

    public final String anchor(List<s11> list, int i, if1 if1Var) {
        list.getClass();
        if1Var.getClass();
        int size = list.size() - 1;
        if (i > size) {
            i = size;
        }
        while (-1 < i) {
            s11 s11Var = list.get(i);
            boolean z = s11Var.b;
            String str = s11Var.a;
            if (!z && ((Boolean) if1Var.invoke(str)).booleanValue()) {
                return str;
            }
            i--;
        }
        return null;
    }

    public final List<gg4> build(List<String> list, List<String> list2, List<SmartRec> list3, String str) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        Set setT0 = q40.T0(list);
        List listK0 = q40.K0(list3, new Comparator() { // from class: com.eddyizm.tempus.homemusic.SmartPlan$build$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return fu.l(Integer.valueOf(((SmartRec) t).getSlot()), Integer.valueOf(((SmartRec) t2).getSlot()));
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listK0) {
            String after = ((SmartRec) obj).getAfter();
            if (after == null) {
                after = "";
            }
            Object arrayList = linkedHashMap.get(after);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(after, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        if (str != null) {
            build$recsAfter(linkedHashMap, hashSet, arrayList2, SmartContexts.INSTANCE.hubId(str));
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : list2) {
            String strMediaId = SmartContexts.INSTANCE.mediaId(str2);
            hashSet2.add(strMediaId);
            if (setT0.contains(strMediaId) && hashSet.add(strMediaId)) {
                arrayList2.add(new gg4(strMediaId, null));
            }
            if (setT0.contains(strMediaId) || h12.c(strMediaId, str)) {
                build$recsAfter(linkedHashMap, hashSet, arrayList2, str2);
            }
        }
        for (String str3 : list) {
            if (!hashSet2.contains(str3) && hashSet.add(str3)) {
                arrayList2.add(new gg4(str3, null));
            }
        }
        return arrayList2;
    }

    public final List<kd3> insertions(List<s11> list, int i, List<SmartRec> list2) {
        String after;
        String strMediaId;
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (SmartRec smartRec : q40.K0(list2, new Comparator() { // from class: com.eddyizm.tempus.homemusic.SmartPlan$insertions$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return fu.l(Integer.valueOf(((SmartRec) t).getSlot()), Integer.valueOf(((SmartRec) t2).getSlot()));
            }
        })) {
            String queueId = smartRec.getQueueId();
            if (queueId != null && (after = smartRec.getAfter()) != null && (strMediaId = SmartContexts.INSTANCE.mediaId(after)) != null) {
                int i2 = 0;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            if (h12.c(((s11) obj).a, queueId)) {
                            }
                        }
                    }
                }
                int size2 = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        i2 = -1;
                        break;
                    }
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    s11 s11Var = (s11) obj2;
                    if (!s11Var.b && h12.c(s11Var.a, strMediaId)) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0 && i2 >= i) {
                    int i5 = i2 + 1;
                    arrayList.add(i5, new s11(queueId, true));
                    arrayList2.add(new kd3(Integer.valueOf(i5), smartRec));
                }
            }
        }
        return arrayList2;
    }

    public final List<String> restore(List<String> list, List<s11> list2, String str) {
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!((s11) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r40.k0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(((s11) obj2).a);
        }
        Set setT0 = q40.T0(arrayList2);
        SmartContexts smartContexts = SmartContexts.INSTANCE;
        ArrayList arrayList3 = new ArrayList(r40.k0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(smartContexts.mediaId((String) it.next()));
        }
        int iIndexOf = (str != null ? arrayList3.indexOf(str) : -1) + 1;
        ArrayList arrayListG0 = q40.G0(q40.u0(arrayList3, iIndexOf), q40.L0(arrayList3, iIndexOf));
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayListG0.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayListG0.get(i3);
            i3++;
            if (setT0.contains((String) obj3)) {
                arrayList4.add(obj3);
            }
        }
        Set setT1 = q40.T0(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        int size3 = arrayList2.size();
        while (i < size3) {
            Object obj4 = arrayList2.get(i);
            i++;
            if (!setT1.contains((String) obj4)) {
                arrayList5.add(obj4);
            }
        }
        return q40.G0(arrayList4, arrayList5);
    }
}
