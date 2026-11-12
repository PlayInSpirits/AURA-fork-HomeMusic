.class public final synthetic La84;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Llo;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Landroid/graphics/Rect;


# direct methods
.method public synthetic constructor <init>(Llo;FFLandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La84;->a:Llo;

    .line 5
    .line 6
    iput p2, p0, La84;->b:F

    .line 7
    .line 8
    iput p3, p0, La84;->c:F

    .line 9
    .line 10
    iput-object p4, p0, La84;->d:Landroid/graphics/Rect;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, La84;->b:F

    .line 6
    .line 7
    iget v1, p0, La84;->c:F

    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lyd;->a(FFF)F

    .line 10
    .line 11
    .line 12
    move-result v7

    .line 13
    iget-object p1, p0, La84;->a:Llo;

    .line 14
    .line 15
    iget-object p1, p1, Llo;->c:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v2, p1

    .line 18
    check-cast v2, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La84;->d:Landroid/graphics/Rect;

    .line 24
    .line 25
    iget p1, p0, Landroid/graphics/Rect;->left:I

    .line 26
    .line 27
    int-to-float v3, p1

    .line 28
    iget p1, p0, Landroid/graphics/Rect;->top:I

    .line 29
    .line 30
    int-to-float v4, p1

    .line 31
    iget p1, p0, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    int-to-float v5, p1

    .line 34
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 35
    .line 36
    int-to-float v6, p0

    .line 37
    invoke-virtual/range {v2 .. v7}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->a(FFFFF)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
