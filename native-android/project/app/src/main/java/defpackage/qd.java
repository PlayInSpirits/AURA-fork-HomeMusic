package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qd extends q35 implements Animatable {
    public final Context p;
    public l4 q = null;
    public ArrayList r = null;
    public final nd s = new nd(this);
    public final od o = new od();

    public qd(Context context) {
        this.p = context;
    }

    @Override // defpackage.q35, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        od odVar = this.o;
        odVar.a.draw(canvas);
        if (odVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.getAlpha() : this.o.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.o.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.getColorFilter() : this.o.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.n == null) {
            return null;
        }
        return new pd(0, this.n.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.getIntrinsicHeight() : this.o.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.getIntrinsicWidth() : this.o.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.getOpacity() : this.o.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        od odVar;
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            odVar = this.o;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayO = gi1.O(resources, theme, attributeSet, fh0.e);
                    int resourceId = typedArrayO.getResourceId(0, 0);
                    if (resourceId != 0) {
                        z35 z35Var = new z35();
                        ThreadLocal threadLocal = g14.a;
                        z35Var.n = resources.getDrawable(resourceId, theme);
                        new y35(z35Var.n.getConstantState());
                        z35Var.s = false;
                        z35Var.setCallback(this.s);
                        z35 z35Var2 = odVar.a;
                        if (z35Var2 != null) {
                            z35Var2.setCallback(null);
                        }
                        odVar.a = z35Var;
                    }
                    typedArrayO.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, fh0.f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.p;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            kf2.o("Context can't be null when inflating animators");
                            return;
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(odVar.a.o.b.o.get(string));
                        if (odVar.c == null) {
                            odVar.c = new ArrayList();
                            odVar.d = new oi(0);
                        }
                        odVar.c.add(animatorLoadAnimator);
                        odVar.d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (odVar.b == null) {
            odVar.b = new AnimatorSet();
        }
        odVar.b.playTogether(odVar.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.isAutoMirrored() : this.o.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.n;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.o.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.n;
        return drawable != null ? drawable.isStateful() : this.o.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.o.a.setBounds(rect);
        }
    }

    @Override // defpackage.q35, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.n;
        return drawable != null ? drawable.setLevel(i) : this.o.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.n;
        return drawable != null ? drawable.setState(iArr) : this.o.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.o.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.o.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.o.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.o.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.o.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.o.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.n;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.o.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        od odVar = this.o;
        if (odVar.b.isStarted()) {
            return;
        }
        odVar.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.n;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.o.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
