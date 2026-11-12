package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vq4 {
    public static final /* synthetic */ int a = 0;

    static {
        new nv0(3, null, 2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.hp4 r5, defpackage.ln3 r6, defpackage.jp r7) {
        /*
            boolean r0 = r7 instanceof defpackage.uq4
            if (r0 == 0) goto L13
            r0 = r7
            uq4 r0 = (defpackage.uq4) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            uq4 r0 = new uq4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.p
            int r1 = r0.q
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            ln3 r5 = r0.o
            hp4 r6 = r0.n
            defpackage.kb4.X(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.kf2.o(r5)
            r5 = 0
            return r5
        L33:
            defpackage.kb4.X(r7)
        L36:
            r0.n = r5
            r0.o = r6
            r0.q = r2
            java.lang.Object r7 = r5.a(r6, r0)
            xe0 r1 = defpackage.xe0.n
            if (r7 != r1) goto L45
            return r1
        L45:
            kn3 r7 = (defpackage.kn3) r7
            r1 = 0
            boolean r3 = b(r7, r1)
            if (r3 == 0) goto L36
            java.util.List r5 = r7.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq4.a(hp4, ln3, jp):java.lang.Object");
    }

    public static boolean b(kn3 kn3Var, boolean z) {
        List list = kn3Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean zG = true;
            if (i >= size) {
                return true;
            }
            on3 on3Var = (on3) list.get(i);
            if (!z) {
                zG = gi1.g(on3Var);
            } else if (on3Var.c() || on3Var.h || !on3Var.d) {
                zG = false;
            }
            if (!zG) {
                return false;
            }
            i++;
        }
    }
}
