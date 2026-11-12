package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p11 {
    public static final String a = cx.i("EnqueueRunnable");

    public static void a(mc5 mc5Var) {
        boolean z;
        sc5 sc5Var = mc5Var.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(mc5Var.e);
        HashSet hashSetB = mc5.b(mc5Var);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(mc5Var.e);
                z = false;
                break;
            } else if (hashSetB.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            nz2.w(mc5Var, ")", "WorkContinuation has cycles (");
            return;
        }
        WorkDatabase workDatabase = sc5Var.c;
        r90 r90Var = sc5Var.b;
        workDatabase.c();
        try {
            gh0.e(workDatabase, r90Var, mc5Var);
            boolean zB = b(mc5Var);
            workDatabase.t();
            workDatabase.o();
            if (zB) {
                c64.b(r90Var, sc5Var.c, sc5Var.e);
            }
        } catch (Throwable th) {
            workDatabase.o();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0150  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:0x01aa  */
    public static boolean b(mc5 mc5Var) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        List<bd5> list;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i;
        boolean z10;
        HashSet hashSetB = mc5.b(mc5Var);
        sc5 sc5Var = mc5Var.a;
        List list2 = mc5Var.d;
        int i2 = 0;
        String[] strArr = (String[]) hashSetB.toArray(new String[0]);
        String str = mc5Var.b;
        int i3 = mc5Var.c;
        sc5Var.b.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = sc5Var.c;
        boolean z11 = strArr != null && strArr.length > 0;
        if (z11) {
            int length = strArr.length;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i2 < length) {
                    String str2 = strArr[i2];
                    dd5 dd5VarH = workDatabase2.A().h(str2);
                    if (dd5VarH == null) {
                        cx.f().d(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        int i4 = dd5VarH.b;
                        z &= i4 == 3;
                        if (i4 == 4) {
                            z3 = true;
                        } else if (i4 == 6) {
                            z2 = true;
                        }
                        i2++;
                    }
                }
                z7 = false;
                mc5Var.g = true;
                return z7;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z11) {
            list = list2;
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            z5 = false;
            z6 = z5;
        } else {
            ArrayList arrayListI = workDatabase2.A().i(str);
            if (arrayListI.isEmpty()) {
                list = list2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
                z5 = false;
            } else if (i3 == 3 || i3 == 4) {
                wo0 wo0VarV = workDatabase2.v();
                ArrayList arrayList = new ArrayList();
                int size = arrayListI.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayListI.get(i5);
                    i5++;
                    cd5 cd5Var = (cd5) obj;
                    List list3 = list2;
                    String str3 = cd5Var.a;
                    wo0VarV.getClass();
                    boolean z12 = zIsEmpty;
                    WorkDatabase workDatabase3 = workDatabase2;
                    w24 w24VarB = w24.b(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                    w24VarB.h(1, str3);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) wo0VarV.n;
                    workDatabase_Impl.b();
                    Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
                    try {
                        if (cursorH.moveToFirst()) {
                            z8 = false;
                            if (cursorH.getInt(0) != 0) {
                                z9 = true;
                            }
                            cursorH.close();
                            w24VarB.j();
                            if (z9) {
                                i = cd5Var.b;
                                if (i == 3) {
                                    z10 = true;
                                } else {
                                    z10 = z8;
                                }
                                boolean z13 = z & z10;
                                if (i == 4) {
                                    z3 = true;
                                } else if (i == 6) {
                                    z2 = true;
                                }
                                arrayList.add(cd5Var.a);
                                z = z13;
                            }
                            list2 = list3;
                            zIsEmpty = z12;
                            workDatabase2 = workDatabase3;
                        } else {
                            z8 = false;
                        }
                        z9 = z8;
                        cursorH.close();
                        w24VarB.j();
                        if (z9) {
                            i = cd5Var.b;
                            if (i == 3) {
                                z10 = true;
                            } else {
                                z10 = z8;
                            }
                            boolean z14 = z & z10;
                            if (i == 4) {
                                z3 = true;
                            } else if (i == 6) {
                                z2 = true;
                            }
                            arrayList.add(cd5Var.a);
                            z = z14;
                        }
                        list2 = list3;
                        zIsEmpty = z12;
                        workDatabase2 = workDatabase3;
                    } catch (Throwable th) {
                        cursorH.close();
                        w24VarB.j();
                        throw th;
                    }
                }
                list = list2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
                z5 = false;
                List list4 = arrayList;
                list4 = arrayList;
                if (i3 == 4 && (z2 || z3)) {
                    fd5 fd5VarA = workDatabase.A();
                    ArrayList arrayListI2 = fd5VarA.i(str);
                    int size2 = arrayListI2.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayListI2.get(i6);
                        i6++;
                        fd5VarA.a(((cd5) obj2).a);
                    }
                    z2 = false;
                    z3 = false;
                    list4 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) list4.toArray(strArr);
                z11 = strArr.length > 0;
            } else {
                if (i3 == 2) {
                    int size3 = arrayListI.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size3) {
                            Object obj3 = arrayListI.get(i7);
                            i7++;
                            int i8 = ((cd5) obj3).b;
                            if (i8 == 1 || i8 == 2) {
                                z7 = false;
                                mc5Var.g = true;
                                return z7;
                            }
                        }
                    }
                }
                workDatabase2.getClass();
                workDatabase2.s(new v6(workDatabase2, str, sc5Var, 4));
                fd5 fd5VarA2 = workDatabase2.A();
                int size4 = arrayListI.size();
                int i9 = 0;
                while (i9 < size4) {
                    Object obj4 = arrayListI.get(i9);
                    i9++;
                    fd5VarA2.a(((cd5) obj4).a);
                }
                list = list2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
                z6 = true;
            }
            z6 = z5;
        }
        boolean z15 = z6;
        for (bd5 bd5Var : list) {
            dd5 dd5Var = bd5Var.b;
            UUID uuid = bd5Var.a;
            if (!z11 || z) {
                dd5Var.n = jCurrentTimeMillis;
            } else if (z3) {
                dd5Var.b = 4;
            } else if (z2) {
                dd5Var.b = 6;
            } else {
                dd5Var.b = 5;
            }
            if (dd5Var.b == 1) {
                z15 = true;
            }
            fd5 fd5VarA3 = workDatabase.A();
            dd5 dd5VarK = gh0.K(sc5Var.e, dd5Var);
            WorkDatabase_Impl workDatabase_Impl2 = fd5VarA3.a;
            workDatabase_Impl2.b();
            workDatabase_Impl2.c();
            try {
                fd5VarA3.b.m(dd5VarK);
                workDatabase_Impl2.t();
                workDatabase_Impl2.o();
                if (z11) {
                    for (String str4 : strArr) {
                        String string = uuid.toString();
                        string.getClass();
                        to0 to0Var = new to0(string, str4);
                        wo0 wo0VarV2 = workDatabase.v();
                        WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) wo0VarV2.n;
                        workDatabase_Impl3.b();
                        workDatabase_Impl3.c();
                        try {
                            ((vo0) wo0VarV2.o).m(to0Var);
                            workDatabase_Impl3.t();
                            workDatabase_Impl3.o();
                        } catch (Throwable th2) {
                            workDatabase_Impl3.o();
                            throw th2;
                        }
                    }
                }
                hd5 hd5VarB = workDatabase.B();
                String string2 = uuid.toString();
                string2.getClass();
                Set set = bd5Var.c;
                hd5VarB.getClass();
                string2.getClass();
                set.getClass();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    gd5 gd5Var = new gd5((String) it.next(), string2);
                    WorkDatabase_Impl workDatabase_Impl4 = (WorkDatabase_Impl) hd5VarB.o;
                    workDatabase_Impl4.b();
                    workDatabase_Impl4.c();
                    try {
                        ((vo0) hd5VarB.p).m(gd5Var);
                        workDatabase_Impl4.t();
                        workDatabase_Impl4.o();
                    } catch (Throwable th3) {
                        workDatabase_Impl4.o();
                        throw th3;
                    }
                }
                if (!z4) {
                    xc5 xc5VarY = workDatabase.y();
                    String string3 = uuid.toString();
                    string3.getClass();
                    wc5 wc5Var = new wc5(str, string3);
                    WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) xc5VarY.o;
                    workDatabase_Impl5.b();
                    workDatabase_Impl5.c();
                    try {
                        ((vo0) xc5VarY.p).m(wc5Var);
                        workDatabase_Impl5.t();
                        workDatabase_Impl5.o();
                    } catch (Throwable th4) {
                        workDatabase_Impl5.o();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                workDatabase_Impl2.o();
                throw th5;
            }
        }
        z7 = z15;
        mc5Var.g = true;
        return z7;
    }
}
