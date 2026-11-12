package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q24 {
    public final i30 a;
    public final Context b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public Executor f;
    public Executor g;
    public ss2 h;
    public boolean i;
    public final r24 j;
    public final long k;
    public final pz1 l;
    public final LinkedHashSet m;
    public final LinkedHashSet n;
    public final ArrayList o;
    public boolean p;
    public boolean q;
    public final boolean r;

    public q24(Context context, Class cls, String str) {
        context.getClass();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.j = r24.n;
        this.k = -1L;
        this.l = new pz1(19);
        this.m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.o = new ArrayList();
        this.p = true;
        this.r = true;
        this.a = kx3.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(jw2... jw2VarArr) {
        for (jw2 jw2Var : jw2VarArr) {
            Integer numValueOf = Integer.valueOf(jw2Var.a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(jw2Var.b));
        }
        jw2[] jw2VarArr2 = (jw2[]) Arrays.copyOf(jw2VarArr, jw2VarArr.length);
        pz1 pz1Var = this.l;
        pz1Var.getClass();
        for (jw2 jw2Var2 : jw2VarArr2) {
            pz1Var.n(jw2Var2);
        }
    }

    public final s24 b() {
        String name;
        qz0 qz0VarE;
        LinkedHashMap linkedHashMap;
        int size;
        boolean[] zArr;
        Iterator it;
        so4 so4VarB;
        so4 so4VarB2;
        boolean zContainsKey;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            di diVar = ei.l;
            this.g = diVar;
            this.f = diVar;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.n;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.m;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    kf2.e(f34.f(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        ro4 y41Var = this.h;
        if (y41Var == null) {
            y41Var = new y41(16);
        }
        ro4 ro4Var = y41Var;
        if (this.k > 0) {
            if (this.c != null) {
                kf2.n("Required value was null.");
                return null;
            }
            kf2.n("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z = this.i;
        r24 r24Var = this.j;
        r24Var.getClass();
        Context context = this.b;
        context.getClass();
        if (r24Var == r24.n) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            r24Var = (activityManager == null || activityManager.isLowRamDevice()) ? r24.o : r24.p;
        }
        Executor executor2 = this.f;
        if (executor2 == null) {
            kf2.n("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            kf2.n("Required value was null.");
            return null;
        }
        li0 li0Var = new li0(context, this.c, ro4Var, this.l, this.d, z, r24Var, executor2, executor3, null, this.p, this.q, linkedHashSet2, null, null, null, this.e, this.o, false, null, null);
        li0Var.v = this.r;
        i30 i30Var = this.a;
        i30Var.getClass();
        Class clsA = i30Var.a();
        clsA.getClass();
        Package r0 = clsA.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = clsA.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsA.getClassLoader());
            cls.getClass();
            s24 s24Var = (s24) cls.getDeclaredConstructor(null).newInstance(null);
            s24Var.getClass();
            s24Var.j = li0Var.v;
            try {
                qz0VarE = s24Var.e();
                qz0VarE.getClass();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    int i = -1;
                    List list = li0Var.r;
                    if (zHasNext) {
                        i30 i30Var2 = (i30) it.next();
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i2 = size2 - 1;
                                if (i30Var2.d(list.get(size2))) {
                                    zArr[size2] = true;
                                    i = size2;
                                    break;
                                }
                                if (i2 < 0) {
                                    break;
                                }
                                size2 = i2;
                            }
                        }
                        if (i < 0) {
                            nz2.k(i30Var2.b(), ") is missing in the database configuration.", "A required auto migration spec (");
                            return null;
                        }
                        linkedHashMap.put(i30Var2, list.get(i));
                    } else {
                        int size3 = list.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i3 = size3 - 1;
                                if (size3 >= size || !zArr[size3]) {
                                    kf2.n("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                    return null;
                                }
                                if (i3 < 0) {
                                    break;
                                }
                                size3 = i3;
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(lg2.W(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            i30 i30Var3 = (i30) entry.getKey();
                            i30Var3.getClass();
                            Class clsA2 = i30Var3.a();
                            clsA2.getClass();
                            linkedHashMap2.put(clsA2, entry.getValue());
                        }
                        for (jw2 jw2Var : s24Var.g(linkedHashMap2)) {
                            int i4 = jw2Var.a;
                            int i5 = jw2Var.b;
                            pz1 pz1Var = li0Var.d;
                            LinkedHashMap linkedHashMap3 = (LinkedHashMap) pz1Var.o;
                            if (linkedHashMap3.containsKey(Integer.valueOf(i4))) {
                                Map map = (Map) linkedHashMap3.get(Integer.valueOf(i4));
                                if (map == null) {
                                    map = v01.n;
                                }
                                zContainsKey = map.containsKey(Integer.valueOf(i5));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                pz1Var.n(jw2Var);
                            }
                        }
                        Set<Map.Entry> setEntrySet = s24Var.l().entrySet();
                        int iW = lg2.W(r40.k0(setEntrySet, 10));
                        if (iW < 16) {
                            iW = 16;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iW);
                        for (Map.Entry entry2 : setEntrySet) {
                            Class cls2 = (Class) entry2.getKey();
                            List<Class> list2 = (List) entry2.getValue();
                            cls2.getClass();
                            i30 i30VarA = kx3.a(cls2);
                            ArrayList arrayList = new ArrayList(r40.k0(list2, 10));
                            for (Class cls3 : list2) {
                                cls3.getClass();
                                arrayList.add(kx3.a(cls3));
                            }
                            linkedHashMap4.put(i30VarA, arrayList);
                        }
                        boolean[] zArr2 = new boolean[linkedHashMap4.size()];
                        Iterator it3 = linkedHashMap4.entrySet().iterator();
                        while (true) {
                            boolean zHasNext2 = it3.hasNext();
                            List list3 = li0Var.q;
                            if (!zHasNext2) {
                                int size4 = list3.size() - 1;
                                if (size4 >= 0) {
                                    while (true) {
                                        int i6 = size4 - 1;
                                        if (!zArr2[size4]) {
                                            nz2.A(list3.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                            return null;
                                        }
                                        if (i6 < 0) {
                                            break;
                                        }
                                        size4 = i6;
                                    }
                                }
                                s24Var.b = li0Var.h;
                                s24Var.c = new ia4(li0Var.i, 1);
                                Executor executor4 = s24Var.b;
                                if (executor4 == null) {
                                    h12.Q("internalQueryExecutor");
                                    throw null;
                                }
                                td0 td0VarA = te5.a(ya4.F(kb4.w(executor4), new fo4(null)));
                                s24Var.a = td0VarA;
                                ne0 ne0Var = td0VarA.n;
                                ia4 ia4Var = s24Var.c;
                                if (ia4Var == null) {
                                    h12.Q("internalTransactionExecutor");
                                    throw null;
                                }
                                ne0Var.J(kb4.w(ia4Var));
                                s24Var.g = li0Var.f;
                                p24 p24Var = s24Var.d;
                                if (p24Var == null) {
                                    h12.Q("connectionManager");
                                    throw null;
                                }
                                so4 so4VarC = p24Var.c();
                                if (so4VarC == null) {
                                    so4VarB = null;
                                    break;
                                }
                                so4VarB = so4VarC;
                                while (!(so4VarB instanceof lo3)) {
                                    if (!(so4VarB instanceof go0)) {
                                        so4VarB = null;
                                        break;
                                    }
                                    so4VarB = ((go0) so4VarB).b();
                                }
                                p24 p24Var2 = s24Var.d;
                                if (p24Var2 == null) {
                                    h12.Q("connectionManager");
                                    throw null;
                                }
                                so4 so4VarC2 = p24Var2.c();
                                if (so4VarC2 == null) {
                                    so4VarB2 = null;
                                    break;
                                }
                                so4VarB2 = so4VarC2;
                                while (!(so4VarB2 instanceof pn)) {
                                    if (!(so4VarB2 instanceof go0)) {
                                        so4VarB2 = null;
                                        break;
                                    }
                                    so4VarB2 = ((go0) so4VarB2).b();
                                }
                                return s24Var;
                            }
                            Map.Entry entry3 = (Map.Entry) it3.next();
                            i30 i30Var4 = (i30) entry3.getKey();
                            for (i30 i30Var5 : (List) entry3.getValue()) {
                                int size5 = list3.size() - 1;
                                if (size5 < 0) {
                                    size5 = -1;
                                    break;
                                }
                                while (true) {
                                    int i7 = size5 - 1;
                                    if (i30Var5.d(list3.get(size5))) {
                                        zArr2[size5] = true;
                                        break;
                                    }
                                    if (i7 < 0) {
                                        size5 = -1;
                                        break;
                                    }
                                    size5 = i7;
                                }
                                if (size5 < 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + i30Var5.b() + ") for " + i30Var4.b() + " is missing in the database configuration.").toString());
                                }
                                Object obj = list3.get(size5);
                                i30Var5.getClass();
                                obj.getClass();
                                s24Var.i.put(i30Var5, obj);
                            }
                        }
                    }
                }
            } catch (p63 unused) {
                qz0VarE = null;
            }
            s24Var.d = qz0VarE == null ? new p24(li0Var, new kl3(4, s24Var)) : new p24(li0Var, qz0VarE);
            s24Var.e = s24Var.d();
            linkedHashMap = new LinkedHashMap();
            Set<Class> setK = s24Var.k();
            ArrayList arrayList2 = new ArrayList(r40.k0(setK, 10));
            for (Class cls4 : setK) {
                cls4.getClass();
                arrayList2.add(kx3.a(cls4));
            }
            Set setT0 = q40.T0(arrayList2);
            size = setT0.size();
            zArr = new boolean[size];
            it = setT0.iterator();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsA.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + clsA.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + clsA.getCanonicalName(), e3);
        }
    }
}
