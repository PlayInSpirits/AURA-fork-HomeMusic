package defpackage;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kd1 implements id1 {
    public final /* synthetic */ int a;
    public final String b;
    public final /* synthetic */ ld1 c;

    public /* synthetic */ kd1(ld1 ld1Var, String str, int i) {
        this.a = i;
        this.c = ld1Var;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    @Override // defpackage.id1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        ArrayList arrayList3;
        int i;
        int i2 = this.a;
        Throwable th = null;
        String str = this.b;
        ld1 ld1Var = this.c;
        switch (i2) {
            case 0:
                ro roVar = (ro) ld1Var.j.remove(str);
                if (roVar != null) {
                    HashMap map = new HashMap();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        po poVar = (po) obj;
                        if (poVar.t) {
                            ArrayList arrayList4 = poVar.a;
                            int size2 = arrayList4.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                Object obj2 = arrayList4.get(i4);
                                i4++;
                                kc1 kc1Var = ((je1) obj2).b;
                                if (kc1Var != null) {
                                    map.put(kc1Var.r, kc1Var);
                                }
                            }
                        }
                    }
                    ArrayList arrayList5 = roVar.n;
                    HashMap map2 = new HashMap(arrayList5.size());
                    int size3 = arrayList5.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj3 = arrayList5.get(i5);
                        i5++;
                        String str2 = (String) obj3;
                        kc1 kc1Var2 = (kc1) map.get(str2);
                        if (kc1Var2 != null) {
                            map2.put(kc1Var2.r, kc1Var2);
                        } else {
                            Bundle bundleG = ld1Var.c.G(str2, null);
                            if (bundleG != null) {
                                ClassLoader classLoader = ld1Var.v.B.getClassLoader();
                                kc1 kc1VarA = ((be1) bundleG.getParcelable("state")).a(ld1Var.F());
                                kc1VarA.o = bundleG;
                                if (bundleG.getBundle("savedInstanceState") == null) {
                                    kc1VarA.o.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = bundleG.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                kc1VarA.c0(bundle);
                                map2.put(kc1VarA.r, kc1VarA);
                            }
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = roVar.o;
                    int size4 = arrayList7.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj4 = arrayList7.get(i6);
                        i6++;
                        qo qoVar = (qo) obj4;
                        ArrayList arrayList8 = qoVar.o;
                        po poVar2 = new po(ld1Var);
                        qoVar.a(poVar2);
                        for (int i7 = 0; i7 < arrayList8.size(); i7++) {
                            String str3 = (String) arrayList8.get(i7);
                            if (str3 != null) {
                                kc1 kc1Var3 = (kc1) map2.get(str3);
                                if (kc1Var3 != null) {
                                    ((je1) poVar2.a.get(i7)).b = kc1Var3;
                                } else {
                                    tb4.j("Restoring FragmentTransaction ", qoVar.s, " failed due to missing saved state for Fragment (", str3, ")");
                                }
                            }
                        }
                        arrayList6.add(poVar2);
                    }
                    int size5 = arrayList6.size();
                    int i8 = 0;
                    boolean z = false;
                    while (i8 < size5) {
                        Object obj5 = arrayList6.get(i8);
                        i8++;
                        ((po) obj5).a(arrayList, arrayList2);
                        z = true;
                    }
                    return z;
                }
                return false;
            default:
                byte b = -1;
                int iB = ld1Var.B(-1, str, true);
                if (iB < 0) {
                    return false;
                }
                for (int i9 = iB; i9 < ld1Var.d.size(); i9++) {
                    po poVar3 = (po) ld1Var.d.get(i9);
                    if (!poVar3.p) {
                        ld1Var.g0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + poVar3 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                int i10 = iB;
                while (i10 < ld1Var.d.size()) {
                    po poVar4 = (po) ld1Var.d.get(i10);
                    HashSet hashSet2 = new HashSet();
                    byte b2 = b;
                    HashSet hashSet3 = new HashSet();
                    ArrayList arrayList9 = poVar4.a;
                    Throwable th2 = th;
                    int size6 = arrayList9.size();
                    int i11 = 0;
                    while (i11 < size6) {
                        Object obj6 = arrayList9.get(i11);
                        i11++;
                        je1 je1Var = (je1) obj6;
                        kc1 kc1Var4 = je1Var.b;
                        if (kc1Var4 != null) {
                            int i12 = size6;
                            if (je1Var.c) {
                                int i13 = je1Var.a;
                                arrayList3 = arrayList9;
                                if (i13 == 1 || i13 == 2 || i13 == 8) {
                                }
                                i = je1Var.a;
                                if (i != 1 || i == 2) {
                                    hashSet3.add(kc1Var4);
                                }
                                size6 = i12;
                                arrayList9 = arrayList3;
                            } else {
                                arrayList3 = arrayList9;
                            }
                            hashSet.add(kc1Var4);
                            hashSet2.add(kc1Var4);
                            i = je1Var.a;
                            if (i != 1) {
                                hashSet3.add(kc1Var4);
                            } else {
                                hashSet3.add(kc1Var4);
                            }
                            size6 = i12;
                            arrayList9 = arrayList3;
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder sbJ = xa3.j("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        sbJ.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        sbJ.append(" in ");
                        sbJ.append(poVar4);
                        sbJ.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        ld1Var.g0(new IllegalArgumentException(sbJ.toString()));
                        throw th2;
                    }
                    i10++;
                    b = b2;
                    th = th2;
                }
                Throwable th3 = th;
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    kc1 kc1Var5 = (kc1) arrayDeque.removeFirst();
                    if (kc1Var5.O) {
                        StringBuilder sbJ2 = xa3.j("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                        sbJ2.append(hashSet.contains(kc1Var5) ? "direct reference to retained " : "retained child ");
                        sbJ2.append("fragment ");
                        sbJ2.append(kc1Var5);
                        ld1Var.g0(new IllegalArgumentException(sbJ2.toString()));
                        throw th3;
                    }
                    ArrayList arrayListW = kc1Var5.H.c.w();
                    int size7 = arrayListW.size();
                    int i14 = 0;
                    while (i14 < size7) {
                        Object obj7 = arrayListW.get(i14);
                        i14++;
                        kc1 kc1Var6 = (kc1) obj7;
                        if (kc1Var6 != null) {
                            arrayDeque.addLast(kc1Var6);
                        }
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList10.add(((kc1) it.next()).r);
                }
                ArrayList arrayList11 = new ArrayList(ld1Var.d.size() - iB);
                int i15 = iB;
                while (i15 < ld1Var.d.size()) {
                    arrayList11.add(th3);
                    i15++;
                    th3 = null;
                }
                ro roVar2 = new ro(arrayList10, arrayList11);
                boolean z2 = true;
                int size8 = ld1Var.d.size() - 1;
                while (size8 >= iB) {
                    po poVar5 = (po) ld1Var.d.remove(size8);
                    po poVar6 = new po(poVar5);
                    ArrayList arrayList12 = poVar6.a;
                    int size9 = arrayList12.size() - 1;
                    while (size9 >= 0) {
                        je1 je1Var2 = (je1) arrayList12.get(size9);
                        if (je1Var2.c) {
                            if (je1Var2.a == 8) {
                                je1Var2.c = false;
                                arrayList12.remove(size9 - 1);
                                size9--;
                            } else {
                                int i16 = je1Var2.b.K;
                                je1Var2.a = 2;
                                je1Var2.c = false;
                                for (int i17 = size9 - 1; i17 >= 0; i17--) {
                                    je1 je1Var3 = (je1) arrayList12.get(i17);
                                    if (je1Var3.c && je1Var3.b.K == i16) {
                                        arrayList12.remove(i17);
                                        size9--;
                                    }
                                }
                            }
                        }
                        size9--;
                    }
                    arrayList11.set(size8 - iB, new qo(poVar6));
                    poVar5.t = true;
                    arrayList.add(poVar5);
                    arrayList2.add(Boolean.TRUE);
                    size8--;
                    z2 = true;
                }
                boolean z3 = z2;
                ld1Var.j.put(str, roVar2);
                return z3;
        }
    }
}
