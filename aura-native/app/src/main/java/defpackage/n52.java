/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Context;
import android.widget.Toast;
import defpackage.u52;

public final class n52
implements Runnable {
    public final int n;

    public n52(int n16) {
        this.n = n16;
    }

    @Override
    public final void run() {
        Context context = u52.f;
        if (context != null) {
            Toast.makeText(context, this.n, 1).show();
        }
    }
}

