package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zf4 extends ji2 {
    public final /* synthetic */ int c;

    @Override // defpackage.bg4
    public final float b(ViewGroup viewGroup, View view) {
        switch (this.c) {
            case 0:
                return view.getTranslationX() - viewGroup.getWidth();
            case 1:
                WeakHashMap weakHashMap = j65.a;
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
            case 2:
                return view.getTranslationX() + viewGroup.getWidth();
            default:
                WeakHashMap weakHashMap2 = j65.a;
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }
}
