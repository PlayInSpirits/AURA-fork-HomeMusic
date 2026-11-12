package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rv1 {
    public final WorkDatabase a;

    public rv1(WorkDatabase workDatabase, int i) {
        switch (i) {
            case 1:
                this.a = workDatabase;
                break;
            default:
                workDatabase.getClass();
                this.a = workDatabase;
                break;
        }
    }
}
