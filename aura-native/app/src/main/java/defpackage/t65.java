/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.v65;

public final class t65
extends ViewOutlineProvider {
    public final int a;

    public t65(int n16) {
        this.a = n16;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            default: {
                view.getClass();
                throw new ClassCastException();
            }
            case 0: 
        }
        if (view instanceof v65) {
            view = (v65)view;
            Outline outline2 = ((v65)view).r;
            if (outline2 != null) {
                outline.set(outline2);
                float f16 = ((v65)view).x;
                if (f16 != 0.0f || ((v65)view).y != 0.0f) {
                    outline.offset((int)f16, (int)((v65)view).y);
                }
            }
        }
    }
}

