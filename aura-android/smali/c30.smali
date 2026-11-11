.class public final Lc30;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf30;Le30;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc30;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc30;->c:Ljava/lang/Object;

    iput-object p2, p0, Lc30;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Loz2;[Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lc30;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc30;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lc30;->c:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public static varargs a([Landroid/view/View;)Lc30;
    .locals 3

    .line 1
    new-instance v0, Lc30;

    .line 2
    .line 3
    new-instance v1, Lzr2;

    .line 4
    .line 5
    const/16 v2, 0x1d

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lzr2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Lc30;-><init>(Loz2;[Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    .line 1
    iget v0, p0, Lc30;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lc30;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lc30;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, [Landroid/view/View;

    .line 12
    .line 13
    array-length v0, p0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_0

    .line 15
    .line 16
    aget-object v3, p0, v2

    .line 17
    .line 18
    move-object v4, v1

    .line 19
    check-cast v4, Loz2;

    .line 20
    .line 21
    invoke-interface {v4, p1, v3}, Loz2;->a(Landroid/animation/ValueAnimator;Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/lang/Float;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    check-cast p0, Lf30;

    .line 39
    .line 40
    check-cast v1, Le30;

    .line 41
    .line 42
    invoke-static {p1, v1}, Lf30;->d(FLe30;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v1, v2}, Lf30;->a(FLe30;Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
