package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mk4 {
    public static final /* synthetic */ int a = 0;

    static {
        Exception r0 = new Exception();
        String r1 = te5.class.getSimpleName();
        StackTraceElement r2 = r0.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(r1), "_", r2.getFileName(), r2.getLineNumber());
        Object r3 = jp.class.getCanonicalName();     // Catch: Throwable -> L5
    L8:
        if (bb3.a(r3) == null) goto L11;
        r3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    L11:
        String r4 = (String) r3;
        Object r5 = mk4.class.getCanonicalName();     // Catch: Throwable -> L14
    L17:
        if (bb3.a(r5) == null) goto L20;
        r5 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    L20:
        String r6 = (String) r5;
        return;
    L14:
        th = move-exception;
        r5 = new s14(th);
    L5:
        th = move-exception;
        r3 = new s14(th);
        goto L8
    }
}
