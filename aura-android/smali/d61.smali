.class public final Ld61;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le61;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld61;->a:I

    .line 13
    iput-object p1, p0, Ld61;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 14
    iput-boolean v0, p0, Ld61;->b:Z

    return-void
.end method

.method public constructor <init>(Llo;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ld61;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Ld61;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p2, p0, Ld61;->b:Z

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lm81;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld61;->a:I

    .line 12
    iput-object p1, p0, Ld61;->c:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Ld61;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Ld61;->b:Z

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Ld61;->b:Z

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget p1, p0, Ld61;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Ld61;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Llo;

    .line 12
    .line 13
    iget-boolean p0, p0, Ld61;->b:Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/high16 p0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p0, v2

    .line 21
    :goto_0
    invoke-static {v3, p0}, Llo;->a(Llo;F)V

    .line 22
    .line 23
    .line 24
    iget-object p0, v3, Llo;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 27
    .line 28
    iput-object v1, p0, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->n:Landroid/graphics/Path;

    .line 29
    .line 30
    iput v2, p0, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->o:F

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    check-cast v3, Lm81;

    .line 37
    .line 38
    iput v0, v3, Lm81;->q:I

    .line 39
    .line 40
    iput-object v1, v3, Lm81;->l:Landroid/animation/Animator;

    .line 41
    .line 42
    iget-boolean p0, p0, Ld61;->b:Z

    .line 43
    .line 44
    if-nez p0, :cond_1

    .line 45
    .line 46
    iget-object p0, v3, Lm81;->r:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 47
    .line 48
    const/4 p1, 0x4

    .line 49
    invoke-virtual {p0, p1, v0}, Lm85;->a(IZ)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void

    .line 53
    :pswitch_1
    check-cast v3, Le61;

    .line 54
    .line 55
    iget-boolean p1, p0, Ld61;->b:Z

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iput-boolean v0, p0, Ld61;->b:Z

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget-object p0, v3, Le61;->z:Landroid/animation/ValueAnimator;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Ljava/lang/Float;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    cmpl-float p0, p0, v2

    .line 75
    .line 76
    if-nez p0, :cond_3

    .line 77
    .line 78
    iput v0, v3, Le61;->A:I

    .line 79
    .line 80
    invoke-virtual {v3, v0}, Le61;->l(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    const/4 p0, 0x2

    .line 85
    iput p0, v3, Le61;->A:I

    .line 86
    .line 87
    iget-object p0, v3, Le61;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-void

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget v0, p0, Ld61;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ld61;->c:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast v1, Llo;

    .line 13
    .line 14
    iget-boolean p0, p0, Ld61;->b:Z

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    :goto_0
    invoke-static {v1, p0}, Llo;->a(Llo;F)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    check-cast v1, Lm81;

    .line 27
    .line 28
    iget-object v0, v1, Lm81;->r:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {v0, v2, v2}, Lm85;->a(IZ)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput v0, v1, Lm81;->q:I

    .line 36
    .line 37
    iput-object p1, v1, Lm81;->l:Landroid/animation/Animator;

    .line 38
    .line 39
    iput-boolean v2, p0, Ld61;->b:Z

    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
