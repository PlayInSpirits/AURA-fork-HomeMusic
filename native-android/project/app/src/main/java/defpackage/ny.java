package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ny extends z00 {
    public final wf1 q;
    public final wf1 r;

    public ny(wf1 wf1Var, ne0 ne0Var, int i, wv wvVar) {
        super(ne0Var, i, wvVar);
        this.q = wf1Var;
        this.r = wf1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.z00
    public final Object b(rq3 rq3Var, vd0 vd0Var) {
        my myVar;
        if (vd0Var instanceof my) {
            myVar = (my) vd0Var;
            int i = myVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                myVar.q = i - Integer.MIN_VALUE;
            } else {
                myVar = new my(this, (wd0) vd0Var);
            }
        } else {
            myVar = new my(this, (wd0) vd0Var);
        }
        Object obj = myVar.o;
        int i2 = myVar.q;
        j15 j15Var = j15.a;
        if (i2 == 0) {
            kb4.X(obj);
            myVar.n = rq3Var;
            myVar.q = 1;
            Object objInvoke = this.q.invoke(rq3Var, myVar);
            xe0 xe0Var = xe0.n;
            if (objInvoke != xe0Var) {
                objInvoke = j15Var;
            }
            if (objInvoke == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rq3Var = myVar.n;
            kb4.X(obj);
        }
        if (rq3Var.s.C()) {
            return j15Var;
        }
        kf2.o("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.z00
    public final z00 d(ne0 ne0Var, int i, wv wvVar) {
        return new ny(this.r, ne0Var, i, wvVar);
    }

    @Override // defpackage.z00
    public final String toString() {
        return "block[" + this.q + "] -> " + super.toString();
    }
}
