package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import app.homemusic.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l85 extends dx4 {
    public static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    public int K = 3;

    public static void F(mx4 mx4Var) {
        View view = mx4Var.b;
        int visibility = view.getVisibility();
        HashMap map = mx4Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static ez3 G(mx4 mx4Var, mx4 mx4Var2) {
        ez3 ez3Var = new ez3();
        ez3Var.a = false;
        ez3Var.b = false;
        if (mx4Var != null) {
            HashMap map = mx4Var.a;
            if (map.containsKey("android:visibility:visibility")) {
                ez3Var.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                ez3Var.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                ez3Var.c = -1;
                ez3Var.e = null;
            }
        } else {
            ez3Var.c = -1;
            ez3Var.e = null;
        }
        if (mx4Var2 != null) {
            HashMap map2 = mx4Var2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                ez3Var.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                ez3Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                ez3Var.d = -1;
                ez3Var.f = null;
            }
        } else {
            ez3Var.d = -1;
            ez3Var.f = null;
        }
        if (mx4Var != null && mx4Var2 != null) {
            int i = ez3Var.c;
            int i2 = ez3Var.d;
            if (i != i2 || ((ViewGroup) ez3Var.e) != ((ViewGroup) ez3Var.f)) {
                if (i != i2) {
                    if (i == 0) {
                        ez3Var.b = false;
                        ez3Var.a = true;
                        return ez3Var;
                    }
                    if (i2 == 0) {
                        ez3Var.b = true;
                        ez3Var.a = true;
                        return ez3Var;
                    }
                } else {
                    if (((ViewGroup) ez3Var.f) == null) {
                        ez3Var.b = false;
                        ez3Var.a = true;
                        return ez3Var;
                    }
                    if (((ViewGroup) ez3Var.e) == null) {
                        ez3Var.b = true;
                        ez3Var.a = true;
                        return ez3Var;
                    }
                }
            }
        } else {
            if (mx4Var == null && ez3Var.d == 0) {
                ez3Var.b = true;
                ez3Var.a = true;
                return ez3Var;
            }
            if (mx4Var2 == null && ez3Var.c == 0) {
                ez3Var.b = false;
                ez3Var.a = true;
            }
        }
        return ez3Var;
    }

    public abstract ObjectAnimator H(ViewGroup viewGroup, View view, mx4 mx4Var, mx4 mx4Var2);

    public abstract ObjectAnimator I(ViewGroup viewGroup, View view, mx4 mx4Var);

    @Override // defpackage.dx4
    public void c(mx4 mx4Var) {
        F(mx4Var);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0206  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (G(m(r5, false), p(r5, false)).a != false) goto L9;
     */
    @Override // defpackage.dx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator j(ViewGroup viewGroup, mx4 mx4Var, mx4 mx4Var2) {
        boolean z;
        View view;
        int i;
        char c;
        int i2;
        View view2;
        Animator animator;
        View view3;
        View view4;
        int id;
        ImageView imageView;
        boolean zIsAttachedToWindow;
        boolean zIsAttachedToWindow2;
        ViewGroup viewGroup2;
        int i3;
        int iRound;
        Bitmap bitmapCreateBitmap;
        ez3 ez3VarG = G(mx4Var, mx4Var2);
        if (ez3VarG.a && (((ViewGroup) ez3VarG.e) != null || ((ViewGroup) ez3VarG.f) != null)) {
            int i4 = 1;
            if (!ez3VarG.b) {
                int i5 = ez3VarG.d;
                if ((this.K & 2) == 2 && mx4Var != null) {
                    View view5 = mx4Var.b;
                    View view6 = mx4Var2 != null ? mx4Var2.b : null;
                    View view7 = (View) view5.getTag(R.id.save_overlay_view);
                    if (view7 != null) {
                        i = i5;
                        c = 1;
                        i2 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view6 == null || view6.getParent() == null) {
                            if (view6 != null) {
                                z = false;
                            }
                            view = null;
                            if (!z) {
                                i = i5;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view7 = view6;
                                i4 = i2;
                                view3 = view2;
                            } else if (view5.getParent() == null) {
                                i = i5;
                                c = 1;
                                i4 = 0;
                                i2 = 0;
                                view3 = view;
                                animator = null;
                                view7 = view5;
                            } else {
                                if (view5.getParent() instanceof View) {
                                    view4 = (View) view5.getParent();
                                    if (G(p(view4, true), m(view4, true)).a) {
                                        i = i5;
                                        c = 1;
                                        i2 = 0;
                                        view2 = view;
                                        animator = null;
                                        id = view4.getId();
                                        if (view4.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                    } else {
                                        boolean z2 = lx4.a;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        f85 f85Var = d85.a;
                                        f85Var.X(view5, matrix);
                                        f85Var.Y(viewGroup, matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                        matrix.mapRect(rectF);
                                        int iRound2 = Math.round(rectF.left);
                                        int iRound3 = Math.round(rectF.top);
                                        int iRound4 = Math.round(rectF.right);
                                        animator = null;
                                        int iRound5 = Math.round(rectF.bottom);
                                        c = 1;
                                        i2 = 0;
                                        imageView = new ImageView(view5.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        zIsAttachedToWindow = view5.isAttachedToWindow();
                                        if (viewGroup == null) {
                                            zIsAttachedToWindow2 = false;
                                        } else {
                                            zIsAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                        }
                                        if (zIsAttachedToWindow) {
                                            viewGroup2 = null;
                                            i3 = 0;
                                        } else {
                                            if (zIsAttachedToWindow2) {
                                                viewGroup2 = (ViewGroup) view5.getParent();
                                                int iIndexOfChild = viewGroup2.indexOfChild(view5);
                                                viewGroup.getOverlay().add(view5);
                                                i3 = iIndexOfChild;
                                            } else {
                                                i = i5;
                                                view2 = view;
                                                bitmapCreateBitmap = null;
                                            }
                                            if (bitmapCreateBitmap != null) {
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                            imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                            view7 = imageView;
                                        }
                                        iRound = Math.round(rectF.width());
                                        view2 = view;
                                        int iRound6 = Math.round(rectF.height());
                                        if (iRound > 0 || iRound6 <= 0) {
                                            i = i5;
                                            bitmapCreateBitmap = null;
                                        } else {
                                            i = i5;
                                            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound6));
                                            int iRound7 = Math.round(iRound * fMin);
                                            int iRound8 = Math.round(iRound6 * fMin);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(fMin, fMin);
                                            if (lx4.a) {
                                                Picture picture = new Picture();
                                                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                                canvasBeginRecording.concat(matrix);
                                                view5.draw(canvasBeginRecording);
                                                picture.endRecording();
                                                bitmapCreateBitmap = Bitmap.createBitmap(picture);
                                            } else {
                                                bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                                canvas.concat(matrix);
                                                view5.draw(canvas);
                                            }
                                        }
                                        if (!zIsAttachedToWindow) {
                                            viewGroup.getOverlay().remove(view5);
                                            viewGroup2.addView(view5, i3);
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound5 - iRound3, 1073741824));
                                        imageView.layout(iRound2, iRound3, iRound4, iRound5);
                                        view7 = imageView;
                                    }
                                    i4 = i2;
                                    view3 = view2;
                                } else {
                                    i = i5;
                                    c = 1;
                                    i2 = 0;
                                    view2 = view;
                                    animator = null;
                                }
                                view7 = view6;
                                i4 = i2;
                                view3 = view2;
                            }
                        } else {
                            if (i5 == 4 || view5 == view6) {
                                view = view6;
                                z = false;
                                view6 = null;
                            }
                            if (!z) {
                                i = i5;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view7 = view6;
                                i4 = i2;
                                view3 = view2;
                            } else if (view5.getParent() == null) {
                                i = i5;
                                c = 1;
                                i4 = 0;
                                i2 = 0;
                                view3 = view;
                                animator = null;
                                view7 = view5;
                            } else {
                                if (view5.getParent() instanceof View) {
                                    view4 = (View) view5.getParent();
                                    if (G(p(view4, true), m(view4, true)).a) {
                                        boolean z3 = lx4.a;
                                        Matrix matrix2 = new Matrix();
                                        matrix2.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                        f85 f85Var2 = d85.a;
                                        f85Var2.X(view5, matrix2);
                                        f85Var2.Y(viewGroup, matrix2);
                                        RectF rectF2 = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                        matrix2.mapRect(rectF2);
                                        int iRound9 = Math.round(rectF2.left);
                                        int iRound10 = Math.round(rectF2.top);
                                        int iRound11 = Math.round(rectF2.right);
                                        animator = null;
                                        int iRound12 = Math.round(rectF2.bottom);
                                        c = 1;
                                        i2 = 0;
                                        imageView = new ImageView(view5.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        zIsAttachedToWindow = view5.isAttachedToWindow();
                                        if (viewGroup == null) {
                                            zIsAttachedToWindow2 = false;
                                        } else {
                                            zIsAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                        }
                                        if (zIsAttachedToWindow) {
                                            if (zIsAttachedToWindow2) {
                                                i = i5;
                                                view2 = view;
                                                bitmapCreateBitmap = null;
                                            } else {
                                                viewGroup2 = (ViewGroup) view5.getParent();
                                                int iIndexOfChild2 = viewGroup2.indexOfChild(view5);
                                                viewGroup.getOverlay().add(view5);
                                                i3 = iIndexOfChild2;
                                            }
                                            if (bitmapCreateBitmap != null) {
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
                                            imageView.layout(iRound9, iRound10, iRound11, iRound12);
                                            view7 = imageView;
                                        } else {
                                            viewGroup2 = null;
                                            i3 = 0;
                                        }
                                        iRound = Math.round(rectF2.width());
                                        view2 = view;
                                        int iRound13 = Math.round(rectF2.height());
                                        if (iRound > 0) {
                                            i = i5;
                                            bitmapCreateBitmap = null;
                                        } else {
                                            i = i5;
                                            bitmapCreateBitmap = null;
                                        }
                                        if (!zIsAttachedToWindow) {
                                            viewGroup.getOverlay().remove(view5);
                                            viewGroup2.addView(view5, i3);
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound11 - iRound9, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound12 - iRound10, 1073741824));
                                        imageView.layout(iRound9, iRound10, iRound11, iRound12);
                                        view7 = imageView;
                                    } else {
                                        i = i5;
                                        c = 1;
                                        i2 = 0;
                                        view2 = view;
                                        animator = null;
                                        id = view4.getId();
                                        if (view4.getParent() == null) {
                                            viewGroup.findViewById(id);
                                        }
                                    }
                                    i4 = i2;
                                    view3 = view2;
                                } else {
                                    i = i5;
                                    c = 1;
                                    i2 = 0;
                                    view2 = view;
                                    animator = null;
                                }
                                view7 = view6;
                                i4 = i2;
                                view3 = view2;
                            }
                        }
                        z = true;
                        view6 = null;
                        view = null;
                        if (!z) {
                            i = i5;
                            c = 1;
                            i2 = 0;
                            view2 = view;
                            animator = null;
                            view7 = view6;
                            i4 = i2;
                            view3 = view2;
                        } else if (view5.getParent() == null) {
                            i = i5;
                            c = 1;
                            i4 = 0;
                            i2 = 0;
                            view3 = view;
                            animator = null;
                            view7 = view5;
                        } else {
                            if (view5.getParent() instanceof View) {
                                view4 = (View) view5.getParent();
                                if (G(p(view4, true), m(view4, true)).a) {
                                    boolean z4 = lx4.a;
                                    Matrix matrix3 = new Matrix();
                                    matrix3.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                    f85 f85Var3 = d85.a;
                                    f85Var3.X(view5, matrix3);
                                    f85Var3.Y(viewGroup, matrix3);
                                    RectF rectF3 = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                    matrix3.mapRect(rectF3);
                                    int iRound14 = Math.round(rectF3.left);
                                    int iRound15 = Math.round(rectF3.top);
                                    int iRound16 = Math.round(rectF3.right);
                                    animator = null;
                                    int iRound17 = Math.round(rectF3.bottom);
                                    c = 1;
                                    i2 = 0;
                                    imageView = new ImageView(view5.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    zIsAttachedToWindow = view5.isAttachedToWindow();
                                    if (viewGroup == null) {
                                        zIsAttachedToWindow2 = false;
                                    } else {
                                        zIsAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                    }
                                    if (zIsAttachedToWindow) {
                                        if (zIsAttachedToWindow2) {
                                            i = i5;
                                            view2 = view;
                                            bitmapCreateBitmap = null;
                                        } else {
                                            viewGroup2 = (ViewGroup) view5.getParent();
                                            int iIndexOfChild3 = viewGroup2.indexOfChild(view5);
                                            viewGroup.getOverlay().add(view5);
                                            i3 = iIndexOfChild3;
                                        }
                                        if (bitmapCreateBitmap != null) {
                                            imageView.setImageBitmap(bitmapCreateBitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound16 - iRound14, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824));
                                        imageView.layout(iRound14, iRound15, iRound16, iRound17);
                                        view7 = imageView;
                                    } else {
                                        viewGroup2 = null;
                                        i3 = 0;
                                    }
                                    iRound = Math.round(rectF3.width());
                                    view2 = view;
                                    int iRound18 = Math.round(rectF3.height());
                                    if (iRound > 0) {
                                        i = i5;
                                        bitmapCreateBitmap = null;
                                    } else {
                                        i = i5;
                                        bitmapCreateBitmap = null;
                                    }
                                    if (!zIsAttachedToWindow) {
                                        viewGroup.getOverlay().remove(view5);
                                        viewGroup2.addView(view5, i3);
                                    }
                                    if (bitmapCreateBitmap != null) {
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound16 - iRound14, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound17 - iRound15, 1073741824));
                                    imageView.layout(iRound14, iRound15, iRound16, iRound17);
                                    view7 = imageView;
                                } else {
                                    i = i5;
                                    c = 1;
                                    i2 = 0;
                                    view2 = view;
                                    animator = null;
                                    id = view4.getId();
                                    if (view4.getParent() == null) {
                                        viewGroup.findViewById(id);
                                    }
                                }
                                i4 = i2;
                                view3 = view2;
                            } else {
                                i = i5;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                            }
                            view7 = view6;
                            i4 = i2;
                            view3 = view2;
                        }
                    }
                    if (view7 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        f85 f85Var4 = d85.a;
                        f85Var4.W(view3, i2);
                        ObjectAnimator objectAnimatorI = I(viewGroup, view3, mx4Var);
                        if (objectAnimatorI == null) {
                            f85Var4.W(view3, visibility);
                            return objectAnimatorI;
                        }
                        k85 k85Var = new k85(view3, i);
                        objectAnimatorI.addListener(k85Var);
                        objectAnimatorI.addPauseListener(k85Var);
                        a(k85Var);
                        return objectAnimatorI;
                    }
                    if (i4 == 0) {
                        int[] iArr = (int[]) mx4Var.a.get("android:visibility:screenLocation");
                        int i6 = iArr[i2];
                        int i7 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view7.offsetLeftAndRight((i6 - iArr2[i2]) - view7.getLeft());
                        view7.offsetTopAndBottom((i7 - iArr2[c]) - view7.getTop());
                        viewGroup.getOverlay().add(view7);
                    }
                    ObjectAnimator objectAnimatorI2 = I(viewGroup, view7, mx4Var);
                    if (i4 == 0) {
                        if (objectAnimatorI2 == null) {
                            viewGroup.getOverlay().remove(view7);
                            return objectAnimatorI2;
                        }
                        view5.setTag(R.id.save_overlay_view, view7);
                        a(new j85(this, viewGroup, view7, view5));
                    }
                    return objectAnimatorI2;
                }
            } else if ((this.K & 1) == 1 && mx4Var2 != null) {
                View view8 = mx4Var2.b;
                if (mx4Var == null) {
                    View view9 = (View) view8.getParent();
                }
                return H(viewGroup, view8, mx4Var, mx4Var2);
            }
        }
        return null;
    }

    @Override // defpackage.dx4
    public final String[] o() {
        return L;
    }

    @Override // defpackage.dx4
    public final boolean q(mx4 mx4Var, mx4 mx4Var2) {
        if (mx4Var == null && mx4Var2 == null) {
            return false;
        }
        if (mx4Var != null && mx4Var2 != null && mx4Var2.a.containsKey("android:visibility:visibility") != mx4Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        ez3 ez3VarG = G(mx4Var, mx4Var2);
        if (ez3VarG.a) {
            return ez3VarG.c == 0 || ez3VarG.d == 0;
        }
        return false;
    }
}
