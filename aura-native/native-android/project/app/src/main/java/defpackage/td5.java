package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class td5 {
    public final dd5 a;
    public final Context b;
    public final String c;
    public final bq4 d;
    public final r90 e;
    public final xi4 f;
    public final pq3 g;
    public final WorkDatabase h;
    public final fd5 i;
    public final wo0 j;
    public final ArrayList k;
    public final String l;
    public final t22 m;

    public td5(lv4 lv4Var) {
        dd5 dd5Var = (dd5) lv4Var.s;
        this.a = dd5Var;
        this.b = (Context) lv4Var.n;
        String str = dd5Var.a;
        this.c = str;
        this.d = (bq4) lv4Var.p;
        r90 r90Var = (r90) lv4Var.o;
        this.e = r90Var;
        this.f = r90Var.d;
        this.g = (pq3) lv4Var.q;
        WorkDatabase workDatabase = (WorkDatabase) lv4Var.r;
        this.h = workDatabase;
        this.i = workDatabase.A();
        this.j = workDatabase.v();
        ArrayList arrayList = (ArrayList) lv4Var.t;
        this.k = arrayList;
        this.l = b11.q(xa3.j("Work [ id=", str, ", tags={ "), q40.B0(arrayList, ",", null, null, null, 62), " } ]");
        this.m = gb.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [vd0] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public static final Object a(td5 td5Var, wd0 wd0Var) {
        rd5 rd5Var;
        dd5 dd5Var;
        rd5 rd5Var2;
        oh0 oh0Var;
        OverwritingInputMerger overwritingInputMerger;
        OverwritingInputMerger overwritingInputMerger2;
        oh0 oh0Var2;
        Object nd5Var;
        final td5 td5Var2 = td5Var;
        String str = td5Var2.c;
        bq4 bq4Var = td5Var2.d;
        WorkDatabase workDatabase = td5Var2.h;
        r90 r90Var = td5Var2.e;
        i80 i80Var = r90Var.m;
        dd5 dd5Var2 = td5Var2.a;
        if (wd0Var instanceof rd5) {
            rd5Var = (rd5) wd0Var;
            int i = rd5Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd5Var.q = i - Integer.MIN_VALUE;
            } else {
                rd5Var = new rd5(td5Var2, wd0Var);
            }
        } else {
            rd5Var = new rd5(td5Var2, wd0Var);
        }
        Object objP = rd5Var.o;
        int i2 = rd5Var.q;
        try {
            if (i2 == 0) {
                kb4.X(objP);
                fz0 fz0Var = r90Var.e;
                i80Var.getClass();
                boolean zY = xl.y();
                String str2 = dd5Var2.x;
                String str3 = dd5Var2.c;
                String str4 = dd5Var2.d;
                oh0 oh0Var3 = dd5Var2.e;
                if (!zY || str2 == null) {
                    dd5Var = dd5Var2;
                    rd5Var2 = rd5Var;
                    oh0Var = oh0Var3;
                } else {
                    int iHashCode = dd5Var2.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        nv4.a(iHashCode, xl.N(str2));
                        dd5Var = dd5Var2;
                        rd5Var2 = rd5Var;
                        oh0Var = oh0Var3;
                    } else {
                        String strN = xl.N(str2);
                        try {
                            if (xl.j == null) {
                                dd5Var = dd5Var2;
                                try {
                                    oh0Var = oh0Var3;
                                    rd5Var2 = rd5Var;
                                    try {
                                        xl.j = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                    } catch (Exception e) {
                                        e = e;
                                        xl.w("asyncTraceBegin", e);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    rd5Var2 = rd5Var;
                                    oh0Var = oh0Var3;
                                    xl.w("asyncTraceBegin", e);
                                }
                            } else {
                                dd5Var = dd5Var2;
                                rd5Var2 = rd5Var;
                                oh0Var = oh0Var3;
                            }
                            xl.j.invoke(null, Long.valueOf(xl.h), strN, Integer.valueOf(iHashCode));
                        } catch (Exception e3) {
                            e = e3;
                            dd5Var = dd5Var2;
                        }
                    }
                }
                final int i3 = 0;
                Boolean bool = (Boolean) workDatabase.r(new Callable(td5Var2) { // from class: ld5
                    public final /* synthetic */ td5 b;

                    {
                        this.b = td5Var2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i4 = i3;
                        boolean z = true;
                        td5 td5Var3 = this.b;
                        switch (i4) {
                            case 0:
                                dd5 dd5Var3 = td5Var3.a;
                                int i5 = dd5Var3.b;
                                String str5 = dd5Var3.c;
                                if (i5 != 1) {
                                    String str6 = ud5.a;
                                    cx.f().b(str6, str5 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if (dd5Var3.d() || (dd5Var3.b == 1 && dd5Var3.k > 0)) {
                                    td5Var3.f.getClass();
                                    if (System.currentTimeMillis() < dd5Var3.a()) {
                                        cx.f().b(ud5.a, "Delaying execution for " + str5 + " because it is being executed before schedule.");
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                fd5 fd5Var = td5Var3.i;
                                String str7 = td5Var3.c;
                                if (fd5Var.g(str7) == 1) {
                                    fd5Var.n(2, str7);
                                    WorkDatabase_Impl workDatabase_Impl = fd5Var.a;
                                    workDatabase_Impl.b();
                                    aq4 aq4Var = fd5Var.i;
                                    df1 df1VarA = aq4Var.a();
                                    df1VarA.h(1, str7);
                                    try {
                                        workDatabase_Impl.c();
                                        try {
                                            df1VarA.b();
                                            workDatabase_Impl.t();
                                            workDatabase_Impl.o();
                                            aq4Var.h(df1VarA);
                                            fd5Var.o(-256, str7);
                                        } catch (Throwable th) {
                                            workDatabase_Impl.o();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        aq4Var.h(df1VarA);
                                        throw th2;
                                    }
                                } else {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                });
                bool.getClass();
                if (bool.booleanValue()) {
                    return new od5();
                }
                if (dd5Var.d()) {
                    oh0Var2 = oh0Var;
                    overwritingInputMerger = null;
                } else {
                    r90Var.f.getClass();
                    str4.getClass();
                    String str5 = oz1.a;
                    try {
                        overwritingInputMerger = null;
                        try {
                            Object objNewInstance = Class.forName(str4).getDeclaredConstructor(null).newInstance(null);
                            objNewInstance.getClass();
                            overwritingInputMerger2 = (OverwritingInputMerger) objNewInstance;
                        } catch (Exception e4) {
                            e = e4;
                            cx.f().e(oz1.a, "Trouble instantiating ".concat(str4), e);
                            overwritingInputMerger2 = overwritingInputMerger;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger2 == null) {
                        cx.f().d(ud5.a, "Could not create Input Merger ".concat(str4));
                        return new md5();
                    }
                    List listO = gb.O(oh0Var);
                    fd5 fd5Var = td5Var2.i;
                    fd5Var.getClass();
                    w24 w24VarB = w24.b(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                    w24VarB.h(1, str);
                    WorkDatabase_Impl workDatabase_Impl = fd5Var.a;
                    workDatabase_Impl.b();
                    Cursor cursorH = xl.H(workDatabase_Impl, w24VarB);
                    try {
                        ArrayList arrayList = new ArrayList(cursorH.getCount());
                        while (cursorH.moveToNext()) {
                            arrayList.add(oh0.a(cursorH.getBlob(0)));
                        }
                        cursorH.close();
                        w24VarB.j();
                        ArrayList arrayListG0 = q40.G0(listO, arrayList);
                        nh0 nh0Var = new nh0(0);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int size = arrayListG0.size();
                        while (i3 < size) {
                            Object obj = arrayListG0.get(i3);
                            i3++;
                            Map mapUnmodifiableMap = Collections.unmodifiableMap(((oh0) obj).a);
                            mapUnmodifiableMap.getClass();
                            linkedHashMap.putAll(mapUnmodifiableMap);
                        }
                        nh0Var.a(linkedHashMap);
                        oh0Var2 = new oh0(nh0Var.a);
                        bu.E(oh0Var2);
                    } catch (Throwable th) {
                        cursorH.close();
                        w24VarB.j();
                        throw th;
                    }
                }
                UUID uuidFromString = UUID.fromString(str);
                ArrayList arrayList2 = td5Var2.k;
                ExecutorService executorService = r90Var.a;
                rm0 rm0Var = r90Var.b;
                qc5 qc5Var = new qc5(workDatabase, td5Var2.g, bq4Var);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.a = uuidFromString;
                workerParameters.b = oh0Var2;
                new HashSet(arrayList2);
                workerParameters.c = executorService;
                workerParameters.d = rm0Var;
                workerParameters.e = bq4Var;
                workerParameters.f = fz0Var;
                try {
                    oc2 oc2VarG = fz0Var.g(td5Var2.b, str3, workerParameters);
                    final int i4 = 1;
                    oc2VarG.d = true;
                    le0 le0VarK = rd5Var2.getContext().K(fz0.h0);
                    le0VarK.getClass();
                    s22 s22Var = (s22) le0VarK;
                    s22Var.M(new sd5(oc2VarG, zY, str2, td5Var2));
                    Object objR = workDatabase.r(new Callable(td5Var2) { // from class: ld5
                        public final /* synthetic */ td5 b;

                        {
                            this.b = td5Var2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i5 = i4;
                            boolean z = true;
                            td5 td5Var3 = this.b;
                            switch (i5) {
                                case 0:
                                    dd5 dd5Var3 = td5Var3.a;
                                    int i6 = dd5Var3.b;
                                    String str6 = dd5Var3.c;
                                    if (i6 != 1) {
                                        String str7 = ud5.a;
                                        cx.f().b(str7, str6 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if (dd5Var3.d() || (dd5Var3.b == 1 && dd5Var3.k > 0)) {
                                        td5Var3.f.getClass();
                                        if (System.currentTimeMillis() < dd5Var3.a()) {
                                            cx.f().b(ud5.a, "Delaying execution for " + str6 + " because it is being executed before schedule.");
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    fd5 fd5Var2 = td5Var3.i;
                                    String str8 = td5Var3.c;
                                    if (fd5Var2.g(str8) == 1) {
                                        fd5Var2.n(2, str8);
                                        WorkDatabase_Impl workDatabase_Impl2 = fd5Var2.a;
                                        workDatabase_Impl2.b();
                                        aq4 aq4Var = fd5Var2.i;
                                        df1 df1VarA = aq4Var.a();
                                        df1VarA.h(1, str8);
                                        try {
                                            workDatabase_Impl2.c();
                                            try {
                                                df1VarA.b();
                                                workDatabase_Impl2.t();
                                                workDatabase_Impl2.o();
                                                aq4Var.h(df1VarA);
                                                fd5Var2.o(-256, str8);
                                            } catch (Throwable th2) {
                                                workDatabase_Impl2.o();
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            aq4Var.h(df1VarA);
                                            throw th3;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    });
                    objR.getClass();
                    if (!((Boolean) objR).booleanValue()) {
                        return new od5();
                    }
                    if (s22Var.isCancelled()) {
                        return new od5();
                    }
                    vc5 vc5Var = (vc5) bq4Var.q;
                    vc5Var.getClass();
                    pe0 pe0VarW = kb4.w(vc5Var);
                    r rVar = new r(td5Var2, oc2VarG, qc5Var, overwritingInputMerger, 15);
                    rd5 rd5Var3 = rd5Var2;
                    rd5Var3.n = td5Var2;
                    rd5Var3.q = 1;
                    objP = fu.P(pe0VarW, rVar, rd5Var3);
                    nd5Var = xe0.n;
                    if (objP != nd5Var) {
                    }
                    return nd5Var;
                } catch (Throwable unused) {
                    String str6 = ud5.a;
                    cx.f().d(str6, "Could not create Worker " + str3);
                    return new md5();
                }
            }
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            td5Var2 = rd5Var.n;
            kb4.X(objP);
            nc2 nc2Var = (nc2) objP;
            nc2Var.getClass();
            nd5Var = new nd5(nc2Var);
            return nd5Var;
        } catch (CancellationException e6) {
            String str7 = ud5.a;
            cx cxVarF = cx.f();
            String strQ = b11.q(new StringBuilder(), td5Var2.l, " was cancelled");
            if (cxVarF.a <= 4) {
                Log.i(str7, strQ, e6);
            }
            throw e6;
        } catch (Throwable th2) {
            cx.f().e(ud5.a, b11.q(new StringBuilder(), td5Var2.l, " failed because it threw an exception/error"), th2);
            return new md5();
        }
    }

    public final void b(int i) {
        fd5 fd5Var = this.i;
        String str = this.c;
        fd5Var.n(1, str);
        this.f.getClass();
        fd5Var.l(str, System.currentTimeMillis());
        fd5Var.k(this.a.v, str);
        fd5Var.j(str, -1L);
        fd5Var.o(i, str);
    }

    public final void c() {
        this.f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        fd5 fd5Var = this.i;
        String str = this.c;
        fd5Var.l(str, jCurrentTimeMillis);
        fd5Var.n(1, str);
        WorkDatabase_Impl workDatabase_Impl = fd5Var.a;
        workDatabase_Impl.b();
        aq4 aq4Var = fd5Var.j;
        df1 df1VarA = aq4Var.a();
        df1VarA.h(1, str);
        try {
            workDatabase_Impl.c();
            try {
                df1VarA.b();
                workDatabase_Impl.t();
                workDatabase_Impl.o();
                aq4Var.h(df1VarA);
                fd5Var.k(this.a.v, str);
                workDatabase_Impl.b();
                aq4 aq4Var2 = fd5Var.f;
                df1 df1VarA2 = aq4Var2.a();
                df1VarA2.h(1, str);
                try {
                    workDatabase_Impl.c();
                    try {
                        df1VarA2.b();
                        workDatabase_Impl.t();
                        workDatabase_Impl.o();
                        aq4Var2.h(df1VarA2);
                        fd5Var.j(str, -1L);
                    } catch (Throwable th) {
                        workDatabase_Impl.o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    aq4Var2.h(df1VarA2);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase_Impl.o();
                throw th3;
            }
        } catch (Throwable th4) {
            aq4Var.h(df1VarA);
            throw th4;
        }
    }

    public final void d(nc2 nc2Var) {
        nc2Var.getClass();
        String str = this.c;
        ArrayList arrayListQ = gb.Q(str);
        while (true) {
            boolean zIsEmpty = arrayListQ.isEmpty();
            fd5 fd5Var = this.i;
            if (zIsEmpty) {
                oh0 oh0Var = ((kc2) nc2Var).a;
                oh0Var.getClass();
                fd5Var.k(this.a.v, str);
                fd5Var.m(str, oh0Var);
                return;
            }
            String str2 = (String) v40.q0(arrayListQ);
            if (fd5Var.g(str2) != 6) {
                fd5Var.n(4, str2);
            }
            arrayListQ.addAll(this.j.w(str2));
        }
    }
}
