/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import androidx.work.impl.WorkDatabase;
import defpackage.fp3;
import defpackage.rv1;
import java.util.concurrent.Callable;

public final class qv1
implements Callable {
    public final rv1 a;
    public final int b;

    public qv1(rv1 rv12, int n16) {
        this.a = rv12;
        this.b = n16;
    }

    public final Object call() {
        WorkDatabase workDatabase = this.a.a;
        Long l16 = workDatabase.w().l("next_job_scheduler_id");
        int n16 = 0;
        int n17 = l16 != null ? (int)l16.longValue() : 0;
        int n18 = n17 == Integer.MAX_VALUE ? 0 : n17 + 1;
        workDatabase.w().n(new fp3("next_job_scheduler_id", Long.valueOf(n18)));
        if (n17 < 0 || n17 > this.b) {
            workDatabase.w().n(new fp3("next_job_scheduler_id", 1L));
            n17 = n16;
        }
        return n17;
    }
}

