package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.mb0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public boolean n;

    public Guideline(Context context) {
        super(context);
        this.n = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.n = z;
    }

    public void setGuidelineBegin(int i) {
        mb0 mb0Var = (mb0) getLayoutParams();
        if (this.n && mb0Var.a == i) {
            return;
        }
        mb0Var.a = i;
        setLayoutParams(mb0Var);
    }

    public void setGuidelineEnd(int i) {
        mb0 mb0Var = (mb0) getLayoutParams();
        if (this.n && mb0Var.b == i) {
            return;
        }
        mb0Var.b = i;
        setLayoutParams(mb0Var);
    }

    public void setGuidelinePercent(float f) {
        mb0 mb0Var = (mb0) getLayoutParams();
        if (this.n && mb0Var.c == f) {
            return;
        }
        mb0Var.c = f;
        setLayoutParams(mb0Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.n = true;
        super.setVisibility(8);
    }
}
