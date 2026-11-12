package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hc5 extends ep4 implements wf1 {
    public xv o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ContentResolver r;
    public final /* synthetic */ Uri s;
    public final /* synthetic */ ng0 t;
    public final /* synthetic */ aw u;
    public final /* synthetic */ Context v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc5(ContentResolver contentResolver, Uri uri, ng0 ng0Var, aw awVar, Context context, vd0 vd0Var) {
        super(2, vd0Var);
        this.r = contentResolver;
        this.s = uri;
        this.t = ng0Var;
        this.u = awVar;
        this.v = context;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        hc5 hc5Var = new hc5(this.r, this.s, this.t, this.u, this.v, vd0Var);
        hc5Var.q = obj;
        return hc5Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((hc5) create((q81) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0043, B:22:0x0054, B:24:0x005c, B:14:0x002b, B:17:0x003c), top: B:31:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r6.b(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q81 q81Var;
        xv xvVar;
        q81 q81Var2;
        xv xvVar2;
        Object objB;
        int i = this.p;
        ng0 ng0Var = this.t;
        ContentResolver contentResolver = this.r;
        xe0 xe0Var = xe0.n;
        try {
            if (i == 0) {
                kb4.X(obj);
                q81Var = (q81) this.q;
                contentResolver.registerContentObserver(this.s, false, ng0Var);
                xvVar = new xv(this.u);
                this.q = q81Var;
                this.o = xvVar;
                this.p = 1;
                objB = xvVar.b(this);
                if (objB == xe0Var) {
                    xv xvVar3 = xvVar;
                    q81Var2 = q81Var;
                    obj = objB;
                    xvVar2 = xvVar3;
                    if (!((Boolean) obj).booleanValue()) {
                        contentResolver.unregisterContentObserver(ng0Var);
                        return j15.a;
                    }
                    xvVar2.c();
                    Context context = this.v;
                    w03 w03Var = ic5.a;
                    Float f = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    this.q = q81Var2;
                    this.o = xvVar2;
                    this.p = 2;
                }
                return xe0Var;
            }
            if (i == 1) {
                xvVar2 = this.o;
                q81Var2 = (q81) this.q;
                kb4.X(obj);
                if (!((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(ng0Var);
                    return j15.a;
                }
                xvVar2.c();
                Context context2 = this.v;
                w03 w03Var2 = ic5.a;
                Float f2 = new Float(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f));
                this.q = q81Var2;
                this.o = xvVar2;
                this.p = 2;
            } else {
                if (i != 2) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xvVar2 = this.o;
                q81Var2 = (q81) this.q;
                kb4.X(obj);
            }
            q81Var = q81Var2;
            xvVar = xvVar2;
            this.q = q81Var;
            this.o = xvVar;
            this.p = 1;
            objB = xvVar.b(this);
            if (objB == xe0Var) {
                xv xvVar4 = xvVar;
                q81Var2 = q81Var;
                obj = objB;
                xvVar2 = xvVar4;
                if (!((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(ng0Var);
                    return j15.a;
                }
                xvVar2.c();
                Context context3 = this.v;
                w03 w03Var3 = ic5.a;
                Float f3 = new Float(Settings.Global.getFloat(context3.getContentResolver(), "animator_duration_scale", 1.0f));
                this.q = q81Var2;
                this.o = xvVar2;
                this.p = 2;
            }
            return xe0Var;
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(ng0Var);
            throw th;
        }
    }
}
