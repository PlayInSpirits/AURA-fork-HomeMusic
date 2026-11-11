.class public final Lb22;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:Lcx3;

.field public final f:I

.field public final g:Landroid/animation/ValueAnimator;

.field public h:Z

.field public i:F

.field public j:F

.field public k:Z

.field public l:Z

.field public m:F

.field public final synthetic n:I

.field public final synthetic o:Lcx3;

.field public final synthetic p:Lf22;


# direct methods
.method public constructor <init>(Lf22;Lcx3;IFFFFILcx3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb22;->p:Lf22;

    .line 5
    .line 6
    iput p8, p0, Lb22;->n:I

    .line 7
    .line 8
    iput-object p9, p0, Lb22;->o:Lcx3;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lb22;->k:Z

    .line 12
    .line 13
    iput-boolean p1, p0, Lb22;->l:Z

    .line 14
    .line 15
    iput p3, p0, Lb22;->f:I

    .line 16
    .line 17
    iput-object p2, p0, Lb22;->e:Lcx3;

    .line 18
    .line 19
    iput p4, p0, Lb22;->a:F

    .line 20
    .line 21
    iput p5, p0, Lb22;->b:F

    .line 22
    .line 23
    iput p6, p0, Lb22;->c:F

    .line 24
    .line 25
    iput p7, p0, Lb22;->d:F

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    new-array p1, p1, [F

    .line 29
    .line 30
    fill-array-data p1, :array_0

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lb22;->g:Landroid/animation/ValueAnimator;

    .line 38
    .line 39
    new-instance p3, Lqq;

    .line 40
    .line 41
    const/4 p4, 0x4

    .line 42
    invoke-direct {p3, p4, p0}, Lqq;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p2, Lcx3;->a:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    iput p1, p0, Lb22;->m:F

    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final a(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lb22;->l:Z

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lb22;->e:Lcx3;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcx3;->p(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-boolean v0, p0, Lb22;->l:Z

    .line 12
    .line 13
    return-void
.end method

.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    .line 3
    iput p1, p0, Lb22;->m:F

    .line 4
    .line 5
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lb22;->a(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lb22;->k:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget p1, p0, Lb22;->n:I

    .line 10
    .line 11
    iget-object v0, p0, Lb22;->o:Lcx3;

    .line 12
    .line 13
    iget-object v1, p0, Lb22;->p:Lf22;

    .line 14
    .line 15
    if-gtz p1, :cond_1

    .line 16
    .line 17
    iget-object p0, v1, Lf22;->m:Le22;

    .line 18
    .line 19
    iget-object p1, v1, Lf22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Le22;->a(Landroidx/recyclerview/widget/RecyclerView;Lcx3;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v2, v1, Lf22;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v3, v0, Lcx3;->a:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    iput-boolean v2, p0, Lb22;->h:Z

    .line 34
    .line 35
    if-lez p1, :cond_2

    .line 36
    .line 37
    iget-object v2, v1, Lf22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    new-instance v3, Llg1;

    .line 40
    .line 41
    invoke-direct {v3, v1, p0, p1}, Llg1;-><init>(Lf22;Lb22;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    iget-object p0, v1, Lf22;->w:Landroid/view/View;

    .line 48
    .line 49
    iget-object p1, v0, Lcx3;->a:Landroid/view/View;

    .line 50
    .line 51
    if-ne p0, p1, :cond_3

    .line 52
    .line 53
    if-ne p1, p0, :cond_3

    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    iput-object p0, v1, Lf22;->w:Landroid/view/View;

    .line 57
    .line 58
    :cond_3
    :goto_1
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    return-void
.end method
