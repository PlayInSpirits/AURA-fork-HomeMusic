package defpackage;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ey4 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ jy4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey4(jy4 jy4Var, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.r = jy4Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        jy4 jy4Var = this.r;
        switch (i) {
            case 0:
                ey4 ey4Var = new ey4(jy4Var, vd0Var, 0);
                ey4Var.q = obj;
                return ey4Var;
            case 1:
                ey4 ey4Var2 = new ey4(jy4Var, vd0Var, 1);
                ey4Var2.q = obj;
                return ey4Var2;
            default:
                ey4 ey4Var3 = new ey4(jy4Var, vd0Var, 2);
                ey4Var3.q = obj;
                return ey4Var3;
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((ey4) create((ao3) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 1:
                return ((ey4) create((mw4) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((ey4) create((mw4) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        mw4 mw4Var;
        Object objD;
        Object objA;
        mw4 mw4Var2;
        Object objD2;
        y73[] y73VarArr;
        y73 y73Var;
        int i = this.o;
        lw4 lw4Var = lw4.o;
        boolean z = false;
        xe0 xe0Var = xe0.n;
        boolean z2 = true;
        jy4 jy4Var = this.r;
        vd0 vd0Var = null;
        switch (i) {
            case 0:
                int i2 = this.p;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                ao3 ao3Var = (ao3) this.q;
                this.p = 1;
                Object objA2 = jy4.a(jy4Var, ao3Var, this);
                return objA2 == xe0Var ? xe0Var : objA2;
            case 1:
                int i3 = this.p;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            mw4Var = (mw4) this.q;
                            kb4.X(obj);
                            objD = obj;
                        } else {
                            if (i3 != 2) {
                                kf2.o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kb4.X(obj);
                            objA = obj;
                        }
                        return (Set) objA;
                    }
                    kb4.X(obj);
                    mw4Var = (mw4) this.q;
                    this.q = mw4Var;
                    this.p = 1;
                    objD = mw4Var.d(this);
                    if (objD == xe0Var) {
                        return xe0Var;
                    }
                    if (!((Boolean) objD).booleanValue()) {
                        ey4 ey4Var = new ey4(jy4Var, vd0Var, 0);
                        this.q = null;
                        this.p = 2;
                        objA = mw4Var.a(lw4Var, ey4Var, this);
                        if (objA == xe0Var) {
                            return xe0Var;
                        }
                        return (Set) objA;
                    }
                } catch (SQLException unused) {
                }
                return z01.n;
            default:
                int i4 = this.p;
                j15 j15Var = j15.a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        mw4Var2 = (mw4) this.q;
                        kb4.X(obj);
                        objD2 = obj;
                    } else {
                        if (i4 != 2) {
                            kf2.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kb4.X(obj);
                    }
                    return j15Var;
                }
                kb4.X(obj);
                mw4Var2 = (mw4) this.q;
                this.q = mw4Var2;
                this.p = 1;
                objD2 = mw4Var2.d(this);
                if (objD2 == xe0Var) {
                    return xe0Var;
                }
                if (!((Boolean) objD2).booleanValue()) {
                    ll llVar = jy4Var.h;
                    long[] jArr = (long[]) llVar.q;
                    ReentrantLock reentrantLock = (ReentrantLock) llVar.p;
                    reentrantLock.lock();
                    try {
                        if (llVar.o) {
                            llVar.o = false;
                            int length = jArr.length;
                            y73VarArr = new y73[length];
                            int i5 = 0;
                            boolean z3 = false;
                            while (i5 < length) {
                                if (jArr[i5] > 0) {
                                    z = z2;
                                }
                                boolean[] zArr = (boolean[]) llVar.r;
                                if (z != zArr[i5]) {
                                    zArr[i5] = z;
                                    y73Var = z ? y73.o : y73.p;
                                    z3 = true;
                                } else {
                                    y73Var = y73.n;
                                }
                                y73VarArr[i5] = y73Var;
                                i5++;
                                z = false;
                                z2 = true;
                            }
                            if (!z3) {
                                y73VarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            y73VarArr = null;
                        }
                        if (y73VarArr != null) {
                            iy4 iy4Var = new iy4(y73VarArr, jy4Var, mw4Var2, null);
                            this.q = null;
                            this.p = 2;
                            if (mw4Var2.a(lw4Var, iy4Var, this) == xe0Var) {
                                return xe0Var;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return j15Var;
        }
    }
}
