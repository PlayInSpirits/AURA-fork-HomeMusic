package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zf5 extends BasePendingResult {
    public final Status k;

    public zf5(Status r2) {
        super(null);
        this.k = r2;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final t14 b(Status r1) {
        return this.k;
    }
}
