/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.hh3;
import defpackage.uq3;
import defpackage.yy1;
import java.util.Collections;
import java.util.List;

public class ProfileInstallerInitializer
implements yy1 {
    @Override
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public final Object b(Context context) {
        context = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new uq3(this, context));
        return new hh3(5);
    }
}

