package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uo4 implements mw4, qu3 {
    public final po4 a;

    public uo4(po4 po4Var) {
        this.a = po4Var;
    }

    @Override // defpackage.mw4
    public final Object a(lw4 lw4Var, wf1 wf1Var, ep4 ep4Var) {
        return e(lw4Var, wf1Var, ep4Var);
    }

    @Override // defpackage.yn3
    public final Object b(String str, if1 if1Var, wd0 wd0Var) {
        zo4 zo4VarU = this.a.U(str);
        try {
            Object objInvoke = if1Var.invoke(zo4VarU);
            ud3.e(zo4VarU, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ud3.e(zo4VarU, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.qu3
    public final x34 c() {
        return this.a;
    }

    @Override // defpackage.mw4
    public final Object d(ep4 ep4Var) {
        return Boolean.valueOf(this.a.n.v());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(lw4 lw4Var, wf1 wf1Var, wd0 wd0Var) throws Throwable {
        to4 to4Var;
        uo4 uo4Var;
        we1 we1Var;
        if (wd0Var instanceof to4) {
            to4Var = (to4) wd0Var;
            int i = to4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                to4Var.r = i - Integer.MIN_VALUE;
            } else {
                to4Var = new to4(this, wd0Var);
            }
        } else {
            to4Var = new to4(this, wd0Var);
        }
        Object obj = to4Var.p;
        int i2 = to4Var.r;
        if (i2 == 0) {
            kb4.X(obj);
            we1 we1Var2 = this.a.n;
            we1Var2.v();
            int iOrdinal = lw4Var.ordinal();
            if (iOrdinal == 0) {
                SQLiteDatabase sQLiteDatabase = we1Var2.n;
                r72 r72Var = we1.r;
                if (((Method) r72Var.getValue()) != null) {
                    r72 r72Var2 = we1.q;
                    if (((Method) r72Var2.getValue()) != null) {
                        Method method = (Method) r72Var.getValue();
                        method.getClass();
                        Method method2 = (Method) r72Var2.getValue();
                        method2.getClass();
                        Object objInvoke = method2.invoke(sQLiteDatabase, null);
                        if (objInvoke != null) {
                            method.invoke(objInvoke, 0, null, 0, null);
                        } else {
                            kf2.o("Required value was null.");
                        }
                    } else {
                        we1Var2.b();
                    }
                } else {
                    we1Var2.b();
                }
            } else if (iOrdinal == 1) {
                we1Var2.f();
            } else {
                if (iOrdinal != 2) {
                    er1.n();
                    return null;
                }
                we1Var2.b();
            }
            try {
                Object ao3Var = new ao3(1, this);
                to4Var.n = this;
                to4Var.o = we1Var2;
                to4Var.r = 1;
                Object objInvoke2 = wf1Var.invoke(ao3Var, to4Var);
                Object obj2 = xe0.n;
                if (objInvoke2 == obj2) {
                    return obj2;
                }
                uo4Var = this;
                we1Var = we1Var2;
                obj = objInvoke2;
            } catch (Throwable th) {
                th = th;
                uo4Var = this;
                we1Var = we1Var2;
                we1Var.n();
                if (!we1Var.v()) {
                    uo4Var.getClass();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we1Var = to4Var.o;
            uo4Var = to4Var.n;
            try {
                kb4.X(obj);
            } catch (Throwable th2) {
                th = th2;
                we1Var.n();
                if (!we1Var.v()) {
                    uo4Var.getClass();
                }
                throw th;
            }
        }
        we1Var.H();
        we1Var.n();
        if (!we1Var.v()) {
            uo4Var.getClass();
        }
        return obj;
    }
}
