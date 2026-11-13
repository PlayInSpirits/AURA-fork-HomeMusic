.class public final Ldefpackage/f22;
.super Ldefpackage/kw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ow3;


# instance fields
.field public A:Landroid/graphics/Rect;

.field public B:J

.field public final a:Ljava/util/ArrayList;

.field public final b:[F

.field public c:Ldefpackage/cx3;

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public final m:Ldefpackage/e22;

.field public n:I

.field public o:I

.field public final p:Ljava/util/ArrayList;

.field public q:I

.field public r:Landroidx/recyclerview/widget/RecyclerView;

.field public final s:Ldefpackage/g5;

.field public t:Landroid/view/VelocityTracker;

.field public u:Ljava/util/ArrayList;

.field public v:Ljava/util/ArrayList;

.field public w:Landroid/view/View;

.field public x:Landroid/view/GestureDetector;

.field public y:Ldefpackage/d22;

.field public final z:Ldefpackage/a22;


# direct methods
.method public constructor <init>(Ldefpackage/e22;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/f22;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    new-array v0, v0, [F

    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/f22;->b:[F

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Ldefpackage/f22;->l:I

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput v1, p0, Ldefpackage/f22;->n:I

    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Ldefpackage/f22;->p:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v1, Ldefpackage/g5;

    .line 33
    .line 34
    const/16 v2, 0x10

    .line 35
    .line 36
    invoke-direct {v1, v2, p0}, Ldefpackage/g5;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Ldefpackage/f22;->s:Ldefpackage/g5;

    .line 40
    .line 41
    iput-object v0, p0, Ldefpackage/f22;->w:Landroid/view/View;

    .line 42
    .line 43
    new-instance v0, Ldefpackage/a22;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Ldefpackage/a22;-><init>(Ldefpackage/f22;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Ldefpackage/f22;->z:Ldefpackage/a22;

    .line 49
    .line 50
    iput-object p1, p0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 51
    .line 52
    return-void
.end method

.method public static p(Landroid/view/View;FFFF)Z
    .locals 1

    .line 1
    cmpl-float v0, p1, p3

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    add-float/2addr p3, v0

    .line 11
    cmpg-float p1, p1, p3

    .line 12
    .line 13
    if-gtz p1, :cond_0

    .line 14
    .line 15
    cmpl-float p1, p2, p4

    .line 16
    .line 17
    if-ltz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-float p0, p0

    .line 24
    add-float/2addr p4, p0

    .line 25
    cmpg-float p0, p2, p4

    .line 26
    .line 27
    if-gtz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/f22;->w:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Ldefpackage/f22;->w:Landroid/view/View;

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Ldefpackage/cx3;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v0, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    if-ne p1, v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v1, v2}, Ldefpackage/f22;->r(Ldefpackage/cx3;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    invoke-virtual {p0, p1, v2}, Ldefpackage/f22;->m(Ldefpackage/cx3;Z)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Ldefpackage/f22;->a:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 42
    .line 43
    iget-object p0, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    .line 45
    invoke-virtual {v0, p0, p1}, Ldefpackage/e22;->a(Landroidx/recyclerview/widget/RecyclerView;Ldefpackage/cx3;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_0
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Ldefpackage/yw3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 12

    .line 1
    iget-object v0, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/f22;->b:[F

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ldefpackage/f22;->o([F)V

    .line 10
    .line 11
    .line 12
    aget v3, v0, v2

    .line 13
    .line 14
    aget v0, v0, v1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    move v0, v3

    .line 19
    :goto_0
    iget-object v4, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 20
    .line 21
    iget-object v5, p0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Ldefpackage/f22;->p:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    move v6, v2

    .line 33
    :goto_1
    if-ge v6, v5, :cond_3

    .line 34
    .line 35
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    check-cast v7, Ldefpackage/b22;

    .line 40
    .line 41
    iget-object v8, v7, Ldefpackage/b22;->e:Ldefpackage/cx3;

    .line 42
    .line 43
    iget v9, v7, Ldefpackage/b22;->a:F

    .line 44
    .line 45
    iget v10, v7, Ldefpackage/b22;->c:F

    .line 46
    .line 47
    cmpl-float v11, v9, v10

    .line 48
    .line 49
    if-nez v11, :cond_1

    .line 50
    .line 51
    iget-object v9, v8, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 52
    .line 53
    invoke-virtual {v9}, Landroid/view/View;->getTranslationX()F

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    iput v9, v7, Ldefpackage/b22;->i:F

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    iget v11, v7, Ldefpackage/b22;->m:F

    .line 61
    .line 62
    invoke-static {v10, v9, v11, v9}, Ldefpackage/xa3;->a(FFFF)F

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    iput v9, v7, Ldefpackage/b22;->i:F

    .line 67
    .line 68
    :goto_2
    iget v9, v7, Ldefpackage/b22;->b:F

    .line 69
    .line 70
    iget v10, v7, Ldefpackage/b22;->d:F

    .line 71
    .line 72
    cmpl-float v11, v9, v10

    .line 73
    .line 74
    if-nez v11, :cond_2

    .line 75
    .line 76
    iget-object v8, v8, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {v8}, Landroid/view/View;->getTranslationY()F

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    iput v8, v7, Ldefpackage/b22;->j:F

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_2
    iget v8, v7, Ldefpackage/b22;->m:F

    .line 86
    .line 87
    invoke-static {v10, v9, v8, v9}, Ldefpackage/xa3;->a(FFFF)F

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    iput v8, v7, Ldefpackage/b22;->j:F

    .line 92
    .line 93
    :goto_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    iget-object v9, v7, Ldefpackage/b22;->e:Ldefpackage/cx3;

    .line 98
    .line 99
    iget v10, v7, Ldefpackage/b22;->i:F

    .line 100
    .line 101
    iget v7, v7, Ldefpackage/b22;->j:F

    .line 102
    .line 103
    invoke-static {p2, v9, v10, v7, v2}, Ldefpackage/e22;->g(Landroidx/recyclerview/widget/RecyclerView;Ldefpackage/cx3;FFZ)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v6, v6, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    if-eqz v4, :cond_4

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-static {p2, v4, v3, v0, v1}, Ldefpackage/e22;->g(Landroidx/recyclerview/widget/RecyclerView;Ldefpackage/cx3;FFZ)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 122
    .line 123
    .line 124
    :cond_4
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/f22;->b:[F

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ldefpackage/f22;->o([F)V

    .line 10
    .line 11
    .line 12
    aget v3, v0, v2

    .line 13
    .line 14
    aget v0, v0, v1

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 17
    .line 18
    iget-object v3, p0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/f22;->p:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    move v4, v2

    .line 30
    :goto_0
    if-ge v4, v3, :cond_1

    .line 31
    .line 32
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Ldefpackage/b22;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    iget-object v5, v5, Ldefpackage/b22;->e:Ldefpackage/cx3;

    .line 43
    .line 44
    iget-object v5, v5, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 59
    .line 60
    .line 61
    :cond_2
    sub-int/2addr v3, v1

    .line 62
    :goto_1
    if-ltz v3, :cond_5

    .line 63
    .line 64
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Ldefpackage/b22;

    .line 69
    .line 70
    iget-boolean v0, p1, Ldefpackage/b22;->l:Z

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iget-boolean p1, p1, Ldefpackage/b22;->h:Z

    .line 75
    .line 76
    if-nez p1, :cond_3

    .line 77
    .line 78
    invoke-interface {p0, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    if-nez v0, :cond_4

    .line 83
    .line 84
    move v2, v1

    .line 85
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, -0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    if-eqz v2, :cond_6

    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 91
    .line 92
    .line 93
    :cond_6
    return-void
.end method

.method public final i(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Ldefpackage/f22;->z:Ldefpackage/a22;

    .line 7
    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->f0(Ldefpackage/kw3;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->D:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Ldefpackage/qw3;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-ne v2, v1, :cond_1

    .line 24
    .line 25
    iput-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Ldefpackage/qw3;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->P:Ljava/util/ArrayList;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v0, p0, Ldefpackage/f22;->p:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    add-int/lit8 v2, v2, -0x1

    .line 44
    .line 45
    :goto_1
    const/4 v4, 0x0

    .line 46
    if-ltz v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Ldefpackage/b22;

    .line 53
    .line 54
    iget-object v5, v4, Ldefpackage/b22;->g:Landroid/animation/ValueAnimator;

    .line 55
    .line 56
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    .line 57
    .line 58
    .line 59
    iget-object v5, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    iget-object v4, v4, Ldefpackage/b22;->e:Ldefpackage/cx3;

    .line 62
    .line 63
    iget-object v6, p0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 64
    .line 65
    invoke-virtual {v6, v5, v4}, Ldefpackage/e22;->a(Landroidx/recyclerview/widget/RecyclerView;Ldefpackage/cx3;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v2, v2, -0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 72
    .line 73
    .line 74
    iput-object v3, p0, Ldefpackage/f22;->w:Landroid/view/View;

    .line 75
    .line 76
    iget-object v0, p0, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 81
    .line 82
    .line 83
    iput-object v3, p0, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 84
    .line 85
    :cond_4
    iget-object v0, p0, Ldefpackage/f22;->y:Ldefpackage/d22;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iput-boolean v4, v0, Ldefpackage/d22;->n:Z

    .line 90
    .line 91
    iput-object v3, p0, Ldefpackage/f22;->y:Ldefpackage/d22;

    .line 92
    .line 93
    :cond_5
    iget-object v0, p0, Ldefpackage/f22;->x:Landroid/view/GestureDetector;

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    iput-object v3, p0, Ldefpackage/f22;->x:Landroid/view/GestureDetector;

    .line 98
    .line 99
    :cond_6
    iput-object p1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const v0, 0x7f070362

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iput v0, p0, Ldefpackage/f22;->f:F

    .line 113
    .line 114
    const v0, 0x7f070361

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    iput p1, p0, Ldefpackage/f22;->g:F

    .line 122
    .line 123
    iget-object p1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    iput p1, p0, Ldefpackage/f22;->q:I

    .line 138
    .line 139
    iget-object p1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 140
    .line 141
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->i(Ldefpackage/kw3;)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 145
    .line 146
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->D:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 152
    .line 153
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->P:Ljava/util/ArrayList;

    .line 154
    .line 155
    if-nez v0, :cond_7

    .line 156
    .line 157
    new-instance v0, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    iput-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->P:Ljava/util/ArrayList;

    .line 163
    .line 164
    :cond_7
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->P:Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    new-instance p1, Ldefpackage/d22;

    .line 170
    .line 171
    invoke-direct {p1, p0}, Ldefpackage/d22;-><init>(Ldefpackage/f22;)V

    .line 172
    .line 173
    .line 174
    iput-object p1, p0, Ldefpackage/f22;->y:Ldefpackage/d22;

    .line 175
    .line 176
    new-instance p1, Landroid/view/GestureDetector;

    .line 177
    .line 178
    iget-object v0, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 179
    .line 180
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iget-object v1, p0, Ldefpackage/f22;->y:Ldefpackage/d22;

    .line 185
    .line 186
    invoke-direct {p1, v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 187
    .line 188
    .line 189
    iput-object p1, p0, Ldefpackage/f22;->x:Landroid/view/GestureDetector;

    .line 190
    .line 191
    return-void
.end method

.method public final j(I)I
    .locals 8

    .line 1
    and-int/lit8 v0, p1, 0xc

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/f22;->h:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    const/16 v3, 0x8

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    move v0, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    iget-object v4, p0, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 19
    .line 20
    iget-object v5, p0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    iget v6, p0, Ldefpackage/f22;->l:I

    .line 25
    .line 26
    const/4 v7, -0x1

    .line 27
    if-le v6, v7, :cond_2

    .line 28
    .line 29
    iget v6, p0, Ldefpackage/f22;->g:F

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/16 v7, 0x3e8

    .line 35
    .line 36
    invoke-virtual {v4, v7, v6}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 40
    .line 41
    iget v6, p0, Ldefpackage/f22;->l:I

    .line 42
    .line 43
    invoke-virtual {v4, v6}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iget-object v6, p0, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 48
    .line 49
    iget v7, p0, Ldefpackage/f22;->l:I

    .line 50
    .line 51
    invoke-virtual {v6, v7}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    cmpl-float v1, v4, v1

    .line 56
    .line 57
    if-lez v1, :cond_1

    .line 58
    .line 59
    move v2, v3

    .line 60
    :cond_1
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    and-int v3, v2, p1

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    if-ne v0, v2, :cond_2

    .line 69
    .line 70
    iget v3, p0, Ldefpackage/f22;->f:F

    .line 71
    .line 72
    cmpl-float v3, v1, v3

    .line 73
    .line 74
    if-ltz v3, :cond_2

    .line 75
    .line 76
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    cmpl-float v1, v1, v3

    .line 81
    .line 82
    if-lez v1, :cond_2

    .line 83
    .line 84
    return v2

    .line 85
    :cond_2
    iget-object v1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    int-to-float v1, v1

    .line 92
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const/high16 v2, 0x3f000000    # 0.5f

    .line 96
    .line 97
    mul-float/2addr v1, v2

    .line 98
    and-int/2addr p1, v0

    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    iget p0, p0, Ldefpackage/f22;->h:F

    .line 102
    .line 103
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    cmpl-float p0, p0, v1

    .line 108
    .line 109
    if-lez p0, :cond_3

    .line 110
    .line 111
    return v0

    .line 112
    :cond_3
    const/4 p0, 0x0

    .line 113
    return p0
.end method

.method public final k(IILandroid/view/MotionEvent;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-ne p1, v0, :cond_d

    .line 7
    .line 8
    iget p1, p0, Ldefpackage/f22;->n:I

    .line 9
    .line 10
    if-eq p1, v0, :cond_d

    .line 11
    .line 12
    iget-object p1, p0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_0
    iget-object v1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Ldefpackage/mw3;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v3, p0, Ldefpackage/f22;->l:I

    .line 35
    .line 36
    const/4 v4, -0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iget v6, p0, Ldefpackage/f22;->d:F

    .line 50
    .line 51
    sub-float/2addr v4, v6

    .line 52
    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iget v6, p0, Ldefpackage/f22;->e:F

    .line 57
    .line 58
    sub-float/2addr v3, v6

    .line 59
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    iget v6, p0, Ldefpackage/f22;->q:I

    .line 68
    .line 69
    int-to-float v6, v6

    .line 70
    cmpg-float v7, v4, v6

    .line 71
    .line 72
    if-gez v7, :cond_2

    .line 73
    .line 74
    cmpg-float v6, v3, v6

    .line 75
    .line 76
    if-gez v6, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    cmpl-float v6, v4, v3

    .line 80
    .line 81
    if-lez v6, :cond_3

    .line 82
    .line 83
    invoke-virtual {v1}, Ldefpackage/mw3;->d()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    cmpl-float v3, v3, v4

    .line 91
    .line 92
    if-lez v3, :cond_4

    .line 93
    .line 94
    invoke-virtual {v1}, Ldefpackage/mw3;->e()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    invoke-virtual {p0, p3}, Ldefpackage/f22;->n(Landroid/view/MotionEvent;)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    iget-object v3, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 109
    .line 110
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Ldefpackage/cx3;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    :goto_0
    if-nez v5, :cond_6

    .line 115
    .line 116
    goto/16 :goto_1

    .line 117
    .line 118
    :cond_6
    iget-object v1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 119
    .line 120
    iget p1, p1, Ldefpackage/e22;->c:I

    .line 121
    .line 122
    or-int/lit8 v3, p1, 0x3

    .line 123
    .line 124
    shl-int/lit8 p1, p1, 0x8

    .line 125
    .line 126
    or-int/2addr p1, v3

    .line 127
    const/high16 v3, 0x30000

    .line 128
    .line 129
    or-int/2addr p1, v3

    .line 130
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    invoke-static {p1, v1}, Ldefpackage/e22;->b(II)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    const v1, 0xff00

    .line 139
    .line 140
    .line 141
    and-int/2addr p1, v1

    .line 142
    shr-int/lit8 p1, p1, 0x8

    .line 143
    .line 144
    if-nez p1, :cond_7

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_7
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    iget v3, p0, Ldefpackage/f22;->d:F

    .line 156
    .line 157
    sub-float/2addr v1, v3

    .line 158
    iget v3, p0, Ldefpackage/f22;->e:F

    .line 159
    .line 160
    sub-float/2addr p2, v3

    .line 161
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    iget v6, p0, Ldefpackage/f22;->q:I

    .line 170
    .line 171
    int-to-float v6, v6

    .line 172
    cmpg-float v7, v3, v6

    .line 173
    .line 174
    if-gez v7, :cond_8

    .line 175
    .line 176
    cmpg-float v6, v4, v6

    .line 177
    .line 178
    if-gez v6, :cond_8

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_8
    cmpl-float v3, v3, v4

    .line 182
    .line 183
    const/4 v4, 0x0

    .line 184
    if-lez v3, :cond_a

    .line 185
    .line 186
    cmpg-float p2, v1, v4

    .line 187
    .line 188
    if-gez p2, :cond_9

    .line 189
    .line 190
    and-int/lit8 p2, p1, 0x4

    .line 191
    .line 192
    if-nez p2, :cond_9

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_9
    cmpl-float p2, v1, v4

    .line 196
    .line 197
    if-lez p2, :cond_c

    .line 198
    .line 199
    and-int/lit8 p1, p1, 0x8

    .line 200
    .line 201
    if-nez p1, :cond_c

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_a
    cmpg-float v1, p2, v4

    .line 205
    .line 206
    if-gez v1, :cond_b

    .line 207
    .line 208
    and-int/lit8 v1, p1, 0x1

    .line 209
    .line 210
    if-nez v1, :cond_b

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_b
    cmpl-float p2, p2, v4

    .line 214
    .line 215
    if-lez p2, :cond_c

    .line 216
    .line 217
    and-int/2addr p1, v0

    .line 218
    if-nez p1, :cond_c

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_c
    iput v4, p0, Ldefpackage/f22;->i:F

    .line 222
    .line 223
    iput v4, p0, Ldefpackage/f22;->h:F

    .line 224
    .line 225
    const/4 p1, 0x0

    .line 226
    invoke-virtual {p3, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    iput p1, p0, Ldefpackage/f22;->l:I

    .line 231
    .line 232
    invoke-virtual {p0, v5, v2}, Ldefpackage/f22;->r(Ldefpackage/cx3;I)V

    .line 233
    .line 234
    .line 235
    :cond_d
    :goto_1
    return-void
.end method

.method public final l(I)I
    .locals 8

    .line 1
    and-int/lit8 v0, p1, 0x3

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/f22;->i:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x2

    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    move v0, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    :goto_0
    iget-object v4, p0, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 18
    .line 19
    iget-object v5, p0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 20
    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    iget v6, p0, Ldefpackage/f22;->l:I

    .line 24
    .line 25
    const/4 v7, -0x1

    .line 26
    if-le v6, v7, :cond_2

    .line 27
    .line 28
    iget v6, p0, Ldefpackage/f22;->g:F

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/16 v7, 0x3e8

    .line 34
    .line 35
    invoke-virtual {v4, v7, v6}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 36
    .line 37
    .line 38
    iget-object v4, p0, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 39
    .line 40
    iget v6, p0, Ldefpackage/f22;->l:I

    .line 41
    .line 42
    invoke-virtual {v4, v6}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    iget-object v6, p0, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 47
    .line 48
    iget v7, p0, Ldefpackage/f22;->l:I

    .line 49
    .line 50
    invoke-virtual {v6, v7}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    cmpl-float v1, v6, v1

    .line 55
    .line 56
    if-lez v1, :cond_1

    .line 57
    .line 58
    move v2, v3

    .line 59
    :cond_1
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    and-int v3, v2, p1

    .line 64
    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    if-ne v2, v0, :cond_2

    .line 68
    .line 69
    iget v3, p0, Ldefpackage/f22;->f:F

    .line 70
    .line 71
    cmpl-float v3, v1, v3

    .line 72
    .line 73
    if-ltz v3, :cond_2

    .line 74
    .line 75
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    cmpl-float v1, v1, v3

    .line 80
    .line 81
    if-lez v1, :cond_2

    .line 82
    .line 83
    return v2

    .line 84
    :cond_2
    iget-object v1, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    int-to-float v1, v1

    .line 91
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const/high16 v2, 0x3f000000    # 0.5f

    .line 95
    .line 96
    mul-float/2addr v1, v2

    .line 97
    and-int/2addr p1, v0

    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    iget p0, p0, Ldefpackage/f22;->i:F

    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    cmpl-float p0, p0, v1

    .line 107
    .line 108
    if-lez p0, :cond_3

    .line 109
    .line 110
    return v0

    .line 111
    :cond_3
    const/4 p0, 0x0

    .line 112
    return p0
.end method

.method public final m(Ldefpackage/cx3;Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/f22;->p:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ldefpackage/b22;

    .line 16
    .line 17
    iget-object v2, v1, Ldefpackage/b22;->e:Ldefpackage/cx3;

    .line 18
    .line 19
    if-ne v2, p1, :cond_1

    .line 20
    .line 21
    iget-boolean p1, v1, Ldefpackage/b22;->k:Z

    .line 22
    .line 23
    or-int/2addr p1, p2

    .line 24
    iput-boolean p1, v1, Ldefpackage/b22;->k:Z

    .line 25
    .line 26
    iget-boolean p1, v1, Ldefpackage/b22;->l:Z

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, v1, Ldefpackage/b22;->g:Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    return-void
.end method

.method public final n(Landroid/view/MotionEvent;)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 14
    .line 15
    iget v2, p0, Ldefpackage/f22;->j:F

    .line 16
    .line 17
    iget v3, p0, Ldefpackage/f22;->h:F

    .line 18
    .line 19
    add-float/2addr v2, v3

    .line 20
    iget v3, p0, Ldefpackage/f22;->k:F

    .line 21
    .line 22
    iget v4, p0, Ldefpackage/f22;->i:F

    .line 23
    .line 24
    add-float/2addr v3, v4

    .line 25
    invoke-static {v1, v0, p1, v2, v3}, Ldefpackage/f22;->p(Landroid/view/View;FFFF)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    iget-object v1, p0, Ldefpackage/f22;->p:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/lit8 v2, v2, -0x1

    .line 39
    .line 40
    :goto_0
    if-ltz v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ldefpackage/b22;

    .line 47
    .line 48
    iget-object v4, v3, Ldefpackage/b22;->e:Ldefpackage/cx3;

    .line 49
    .line 50
    iget-object v4, v4, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 51
    .line 52
    iget v5, v3, Ldefpackage/b22;->i:F

    .line 53
    .line 54
    iget v3, v3, Ldefpackage/b22;->j:F

    .line 55
    .line 56
    invoke-static {v4, v0, p1, v5, v3}, Ldefpackage/f22;->p(Landroid/view/View;FFFF)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    return-object v4

    .line 63
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p0, p0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Ldefpackage/ew4;

    .line 69
    .line 70
    invoke-virtual {v1}, Ldefpackage/ew4;->h()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    add-int/lit8 v1, v1, -0x1

    .line 75
    .line 76
    :goto_1
    if-ltz v1, :cond_4

    .line 77
    .line 78
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Ldefpackage/ew4;

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Ldefpackage/ew4;->g(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    int-to-float v5, v5

    .line 97
    add-float/2addr v5, v3

    .line 98
    cmpl-float v5, v0, v5

    .line 99
    .line 100
    if-ltz v5, :cond_3

    .line 101
    .line 102
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    int-to-float v5, v5

    .line 107
    add-float/2addr v5, v3

    .line 108
    cmpg-float v3, v0, v5

    .line 109
    .line 110
    if-gtz v3, :cond_3

    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    int-to-float v3, v3

    .line 117
    add-float/2addr v3, v4

    .line 118
    cmpl-float v3, p1, v3

    .line 119
    .line 120
    if-ltz v3, :cond_3

    .line 121
    .line 122
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    int-to-float v3, v3

    .line 127
    add-float/2addr v3, v4

    .line 128
    cmpg-float v3, p1, v3

    .line 129
    .line 130
    if-gtz v3, :cond_3

    .line 131
    .line 132
    return-object v2

    .line 133
    :cond_3
    add-int/lit8 v1, v1, -0x1

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    const/4 p0, 0x0

    .line 137
    return-object p0
.end method

.method public final o([F)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/f22;->o:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0xc

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p0, Ldefpackage/f22;->j:F

    .line 9
    .line 10
    iget v2, p0, Ldefpackage/f22;->h:F

    .line 11
    .line 12
    add-float/2addr v0, v2

    .line 13
    iget-object v2, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 14
    .line 15
    iget-object v2, v2, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-float v2, v2

    .line 22
    sub-float/2addr v0, v2

    .line 23
    aput v0, p1, v1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 27
    .line 28
    iget-object v0, v0, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    aput v0, p1, v1

    .line 35
    .line 36
    :goto_0
    iget v0, p0, Ldefpackage/f22;->o:I

    .line 37
    .line 38
    and-int/lit8 v0, v0, 0x3

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget v0, p0, Ldefpackage/f22;->k:F

    .line 44
    .line 45
    iget v2, p0, Ldefpackage/f22;->i:F

    .line 46
    .line 47
    add-float/2addr v0, v2

    .line 48
    iget-object p0, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 49
    .line 50
    iget-object p0, p0, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    int-to-float p0, p0

    .line 57
    sub-float/2addr v0, p0

    .line 58
    aput v0, p1, v1

    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    iget-object p0, p0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 62
    .line 63
    iget-object p0, p0, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    aput p0, p1, v1

    .line 70
    .line 71
    return-void
.end method

.method public final q(Ldefpackage/cx3;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    iget v2, v0, Ldefpackage/f22;->n:I

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    if-eq v2, v3, :cond_1

    .line 19
    .line 20
    goto/16 :goto_8

    .line 21
    .line 22
    :cond_1
    iget-object v2, v0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget v4, v0, Ldefpackage/f22;->j:F

    .line 28
    .line 29
    iget v5, v0, Ldefpackage/f22;->h:F

    .line 30
    .line 31
    add-float/2addr v4, v5

    .line 32
    float-to-int v4, v4

    .line 33
    iget v5, v0, Ldefpackage/f22;->k:F

    .line 34
    .line 35
    iget v6, v0, Ldefpackage/f22;->i:F

    .line 36
    .line 37
    add-float/2addr v5, v6

    .line 38
    float-to-int v5, v5

    .line 39
    iget-object v6, v1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    sub-int v7, v5, v7

    .line 46
    .line 47
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    int-to-float v7, v7

    .line 52
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    int-to-float v8, v8

    .line 57
    const/high16 v9, 0x3f000000    # 0.5f

    .line 58
    .line 59
    mul-float/2addr v8, v9

    .line 60
    cmpg-float v7, v7, v8

    .line 61
    .line 62
    if-gez v7, :cond_2

    .line 63
    .line 64
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    sub-int v7, v4, v7

    .line 69
    .line 70
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    int-to-float v7, v7

    .line 75
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    int-to-float v8, v8

    .line 80
    mul-float/2addr v8, v9

    .line 81
    cmpg-float v7, v7, v8

    .line 82
    .line 83
    if-gez v7, :cond_2

    .line 84
    .line 85
    goto/16 :goto_8

    .line 86
    .line 87
    :cond_2
    iget-object v7, v0, Ldefpackage/f22;->u:Ljava/util/ArrayList;

    .line 88
    .line 89
    if-nez v7, :cond_3

    .line 90
    .line 91
    new-instance v7, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v7, v0, Ldefpackage/f22;->u:Ljava/util/ArrayList;

    .line 97
    .line 98
    new-instance v7, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v7, v0, Ldefpackage/f22;->v:Ljava/util/ArrayList;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 107
    .line 108
    .line 109
    iget-object v7, v0, Ldefpackage/f22;->v:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 112
    .line 113
    .line 114
    :goto_0
    iget v7, v0, Ldefpackage/f22;->j:F

    .line 115
    .line 116
    iget v8, v0, Ldefpackage/f22;->h:F

    .line 117
    .line 118
    add-float/2addr v7, v8

    .line 119
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    iget v8, v0, Ldefpackage/f22;->k:F

    .line 124
    .line 125
    iget v9, v0, Ldefpackage/f22;->i:F

    .line 126
    .line 127
    add-float/2addr v8, v9

    .line 128
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    add-int/2addr v9, v7

    .line 137
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    add-int/2addr v10, v8

    .line 142
    add-int v11, v7, v9

    .line 143
    .line 144
    div-int/2addr v11, v3

    .line 145
    add-int v12, v8, v10

    .line 146
    .line 147
    div-int/2addr v12, v3

    .line 148
    iget-object v13, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 149
    .line 150
    invoke-virtual {v13}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Ldefpackage/mw3;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    invoke-virtual {v13}, Ldefpackage/mw3;->v()I

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    move/from16 v16, v3

    .line 159
    .line 160
    const/4 v3, 0x0

    .line 161
    :goto_1
    if-ge v3, v14, :cond_8

    .line 162
    .line 163
    invoke-virtual {v13, v3}, Ldefpackage/mw3;->u(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    if-ne v15, v6, :cond_5

    .line 168
    .line 169
    move/from16 v18, v3

    .line 170
    .line 171
    :cond_4
    :goto_2
    move/from16 v19, v4

    .line 172
    .line 173
    move/from16 v20, v5

    .line 174
    .line 175
    move/from16 v21, v7

    .line 176
    .line 177
    goto/16 :goto_4

    .line 178
    .line 179
    :cond_5
    move/from16 v18, v3

    .line 180
    .line 181
    invoke-virtual {v15}, Landroid/view/View;->getBottom()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-lt v3, v8, :cond_4

    .line 186
    .line 187
    invoke-virtual {v15}, Landroid/view/View;->getTop()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-gt v3, v10, :cond_4

    .line 192
    .line 193
    invoke-virtual {v15}, Landroid/view/View;->getRight()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-lt v3, v7, :cond_4

    .line 198
    .line 199
    invoke-virtual {v15}, Landroid/view/View;->getLeft()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-le v3, v9, :cond_6

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_6
    iget-object v3, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 207
    .line 208
    invoke-virtual {v3, v15}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Ldefpackage/cx3;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v15}, Landroid/view/View;->getLeft()I

    .line 213
    .line 214
    .line 215
    move-result v19

    .line 216
    invoke-virtual {v15}, Landroid/view/View;->getRight()I

    .line 217
    .line 218
    .line 219
    move-result v20

    .line 220
    add-int v20, v20, v19

    .line 221
    .line 222
    div-int/lit8 v20, v20, 0x2

    .line 223
    .line 224
    sub-int v19, v11, v20

    .line 225
    .line 226
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(I)I

    .line 227
    .line 228
    .line 229
    move-result v19

    .line 230
    invoke-virtual {v15}, Landroid/view/View;->getTop()I

    .line 231
    .line 232
    .line 233
    move-result v20

    .line 234
    invoke-virtual {v15}, Landroid/view/View;->getBottom()I

    .line 235
    .line 236
    .line 237
    move-result v15

    .line 238
    add-int v15, v15, v20

    .line 239
    .line 240
    div-int/lit8 v15, v15, 0x2

    .line 241
    .line 242
    sub-int v15, v12, v15

    .line 243
    .line 244
    invoke-static {v15}, Ljava/lang/Math;->abs(I)I

    .line 245
    .line 246
    .line 247
    move-result v15

    .line 248
    mul-int v19, v19, v19

    .line 249
    .line 250
    mul-int/2addr v15, v15

    .line 251
    add-int v15, v15, v19

    .line 252
    .line 253
    move/from16 v19, v4

    .line 254
    .line 255
    iget-object v4, v0, Ldefpackage/f22;->u:Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    move/from16 v20, v5

    .line 262
    .line 263
    move/from16 v21, v7

    .line 264
    .line 265
    const/4 v5, 0x0

    .line 266
    const/4 v7, 0x0

    .line 267
    :goto_3
    if-ge v5, v4, :cond_7

    .line 268
    .line 269
    move/from16 v22, v4

    .line 270
    .line 271
    iget-object v4, v0, Ldefpackage/f22;->v:Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    check-cast v4, Ljava/lang/Integer;

    .line 278
    .line 279
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    if-le v15, v4, :cond_7

    .line 284
    .line 285
    add-int/lit8 v7, v7, 0x1

    .line 286
    .line 287
    add-int/lit8 v5, v5, 0x1

    .line 288
    .line 289
    move/from16 v4, v22

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_7
    iget-object v4, v0, Ldefpackage/f22;->u:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {v4, v7, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    iget-object v3, v0, Ldefpackage/f22;->v:Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v3, v7, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :goto_4
    add-int/lit8 v3, v18, 0x1

    .line 307
    .line 308
    move/from16 v4, v19

    .line 309
    .line 310
    move/from16 v5, v20

    .line 311
    .line 312
    move/from16 v7, v21

    .line 313
    .line 314
    goto/16 :goto_1

    .line 315
    .line 316
    :cond_8
    move/from16 v19, v4

    .line 317
    .line 318
    move/from16 v20, v5

    .line 319
    .line 320
    iget-object v3, v0, Ldefpackage/f22;->u:Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-nez v4, :cond_9

    .line 327
    .line 328
    goto/16 :goto_8

    .line 329
    .line 330
    :cond_9
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    add-int v4, v4, v19

    .line 335
    .line 336
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 337
    .line 338
    .line 339
    move-result v5

    .line 340
    add-int v5, v5, v20

    .line 341
    .line 342
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    sub-int v7, v19, v7

    .line 347
    .line 348
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    sub-int v8, v20, v8

    .line 353
    .line 354
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    const/4 v11, 0x0

    .line 359
    const/4 v12, -0x1

    .line 360
    const/4 v15, 0x0

    .line 361
    :goto_5
    if-ge v15, v9, :cond_f

    .line 362
    .line 363
    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v13

    .line 367
    check-cast v13, Ldefpackage/cx3;

    .line 368
    .line 369
    if-lez v7, :cond_a

    .line 370
    .line 371
    iget-object v14, v13, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 372
    .line 373
    invoke-virtual {v14}, Landroid/view/View;->getRight()I

    .line 374
    .line 375
    .line 376
    move-result v14

    .line 377
    sub-int/2addr v14, v4

    .line 378
    if-gez v14, :cond_a

    .line 379
    .line 380
    iget-object v10, v13, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 381
    .line 382
    invoke-virtual {v10}, Landroid/view/View;->getRight()I

    .line 383
    .line 384
    .line 385
    move-result v10

    .line 386
    move-object/from16 v17, v3

    .line 387
    .line 388
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    if-le v10, v3, :cond_b

    .line 393
    .line 394
    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    if-le v3, v12, :cond_b

    .line 399
    .line 400
    move v12, v3

    .line 401
    move-object v11, v13

    .line 402
    goto :goto_6

    .line 403
    :cond_a
    move-object/from16 v17, v3

    .line 404
    .line 405
    :cond_b
    :goto_6
    if-gez v7, :cond_c

    .line 406
    .line 407
    iget-object v3, v13, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 408
    .line 409
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    sub-int v3, v3, v19

    .line 414
    .line 415
    if-lez v3, :cond_c

    .line 416
    .line 417
    iget-object v10, v13, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 418
    .line 419
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 420
    .line 421
    .line 422
    move-result v10

    .line 423
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 424
    .line 425
    .line 426
    move-result v14

    .line 427
    if-ge v10, v14, :cond_c

    .line 428
    .line 429
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    if-le v3, v12, :cond_c

    .line 434
    .line 435
    move v12, v3

    .line 436
    move-object v11, v13

    .line 437
    :cond_c
    if-gez v8, :cond_d

    .line 438
    .line 439
    iget-object v3, v13, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 440
    .line 441
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    sub-int v3, v3, v20

    .line 446
    .line 447
    if-lez v3, :cond_d

    .line 448
    .line 449
    iget-object v10, v13, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 450
    .line 451
    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    .line 452
    .line 453
    .line 454
    move-result v10

    .line 455
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 456
    .line 457
    .line 458
    move-result v14

    .line 459
    if-ge v10, v14, :cond_d

    .line 460
    .line 461
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 462
    .line 463
    .line 464
    move-result v3

    .line 465
    if-le v3, v12, :cond_d

    .line 466
    .line 467
    move v12, v3

    .line 468
    move-object v11, v13

    .line 469
    :cond_d
    if-lez v8, :cond_e

    .line 470
    .line 471
    iget-object v3, v13, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 472
    .line 473
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    sub-int/2addr v3, v5

    .line 478
    if-gez v3, :cond_e

    .line 479
    .line 480
    iget-object v10, v13, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 481
    .line 482
    invoke-virtual {v10}, Landroid/view/View;->getBottom()I

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    .line 487
    .line 488
    .line 489
    move-result v14

    .line 490
    if-le v10, v14, :cond_e

    .line 491
    .line 492
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    if-le v3, v12, :cond_e

    .line 497
    .line 498
    move v12, v3

    .line 499
    move-object v11, v13

    .line 500
    :cond_e
    add-int/lit8 v15, v15, 0x1

    .line 501
    .line 502
    move-object/from16 v3, v17

    .line 503
    .line 504
    goto/16 :goto_5

    .line 505
    .line 506
    :cond_f
    if-nez v11, :cond_10

    .line 507
    .line 508
    iget-object v1, v0, Ldefpackage/f22;->u:Ljava/util/ArrayList;

    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 511
    .line 512
    .line 513
    iget-object v0, v0, Ldefpackage/f22;->v:Ljava/util/ArrayList;

    .line 514
    .line 515
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 516
    .line 517
    .line 518
    return-void

    .line 519
    :cond_10
    iget-object v3, v11, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 520
    .line 521
    invoke-virtual {v11}, Ldefpackage/cx3;->b()I

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    invoke-virtual {v1}, Ldefpackage/cx3;->b()I

    .line 526
    .line 527
    .line 528
    iget-object v5, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 529
    .line 530
    invoke-virtual {v2, v5, v1, v11}, Ldefpackage/e22;->h(Landroidx/recyclerview/widget/RecyclerView;Ldefpackage/cx3;Ldefpackage/cx3;)Z

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    if-eqz v1, :cond_19

    .line 535
    .line 536
    iget-object v0, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 537
    .line 538
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Ldefpackage/mw3;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    instance-of v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 543
    .line 544
    if-eqz v2, :cond_15

    .line 545
    .line 546
    check-cast v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 547
    .line 548
    const-string v0, "Cannot drop a view during a scroll or layout calculation"

    .line 549
    .line 550
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0()V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1()V

    .line 557
    .line 558
    .line 559
    invoke-static {v6}, Ldefpackage/mw3;->I(Landroid/view/View;)I

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    invoke-static {v3}, Ldefpackage/mw3;->I(Landroid/view/View;)I

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    const/4 v4, 0x1

    .line 568
    if-ge v0, v2, :cond_11

    .line 569
    .line 570
    move v0, v4

    .line 571
    goto :goto_7

    .line 572
    :cond_11
    const/4 v0, -0x1

    .line 573
    :goto_7
    iget-boolean v5, v1, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 574
    .line 575
    iget-object v7, v1, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Ldefpackage/qz0;

    .line 576
    .line 577
    if-eqz v5, :cond_13

    .line 578
    .line 579
    if-ne v0, v4, :cond_12

    .line 580
    .line 581
    invoke-virtual {v7}, Ldefpackage/qz0;->i()I

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    iget-object v4, v1, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Ldefpackage/qz0;

    .line 586
    .line 587
    invoke-virtual {v4, v3}, Ldefpackage/qz0;->g(Landroid/view/View;)I

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    iget-object v4, v1, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Ldefpackage/qz0;

    .line 592
    .line 593
    invoke-virtual {v4, v6}, Ldefpackage/qz0;->e(Landroid/view/View;)I

    .line 594
    .line 595
    .line 596
    move-result v4

    .line 597
    add-int/2addr v4, v3

    .line 598
    sub-int/2addr v0, v4

    .line 599
    invoke-virtual {v1, v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1(II)V

    .line 600
    .line 601
    .line 602
    return-void

    .line 603
    :cond_12
    invoke-virtual {v7}, Ldefpackage/qz0;->i()I

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    iget-object v4, v1, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Ldefpackage/qz0;

    .line 608
    .line 609
    invoke-virtual {v4, v3}, Ldefpackage/qz0;->d(Landroid/view/View;)I

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    sub-int/2addr v0, v3

    .line 614
    invoke-virtual {v1, v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1(II)V

    .line 615
    .line 616
    .line 617
    return-void

    .line 618
    :cond_13
    const/4 v4, -0x1

    .line 619
    if-ne v0, v4, :cond_14

    .line 620
    .line 621
    invoke-virtual {v7, v3}, Ldefpackage/qz0;->g(Landroid/view/View;)I

    .line 622
    .line 623
    .line 624
    move-result v0

    .line 625
    invoke-virtual {v1, v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1(II)V

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :cond_14
    invoke-virtual {v7, v3}, Ldefpackage/qz0;->d(Landroid/view/View;)I

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    iget-object v3, v1, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Ldefpackage/qz0;

    .line 634
    .line 635
    invoke-virtual {v3, v6}, Ldefpackage/qz0;->e(Landroid/view/View;)I

    .line 636
    .line 637
    .line 638
    move-result v3

    .line 639
    sub-int/2addr v0, v3

    .line 640
    invoke-virtual {v1, v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1(II)V

    .line 641
    .line 642
    .line 643
    return-void

    .line 644
    :cond_15
    invoke-virtual {v1}, Ldefpackage/mw3;->d()Z

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    if-eqz v2, :cond_17

    .line 649
    .line 650
    invoke-static {v3}, Ldefpackage/mw3;->A(Landroid/view/View;)I

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 655
    .line 656
    .line 657
    move-result v5

    .line 658
    if-gt v2, v5, :cond_16

    .line 659
    .line 660
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 661
    .line 662
    .line 663
    :cond_16
    invoke-static {v3}, Ldefpackage/mw3;->B(Landroid/view/View;)I

    .line 664
    .line 665
    .line 666
    move-result v2

    .line 667
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 672
    .line 673
    .line 674
    move-result v6

    .line 675
    sub-int/2addr v5, v6

    .line 676
    if-lt v2, v5, :cond_17

    .line 677
    .line 678
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 679
    .line 680
    .line 681
    :cond_17
    invoke-virtual {v1}, Ldefpackage/mw3;->e()Z

    .line 682
    .line 683
    .line 684
    move-result v1

    .line 685
    if-eqz v1, :cond_19

    .line 686
    .line 687
    invoke-static {v3}, Ldefpackage/mw3;->C(Landroid/view/View;)I

    .line 688
    .line 689
    .line 690
    move-result v1

    .line 691
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    if-gt v1, v2, :cond_18

    .line 696
    .line 697
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 698
    .line 699
    .line 700
    :cond_18
    invoke-static {v3}, Ldefpackage/mw3;->y(Landroid/view/View;)I

    .line 701
    .line 702
    .line 703
    move-result v1

    .line 704
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 709
    .line 710
    .line 711
    move-result v3

    .line 712
    sub-int/2addr v2, v3

    .line 713
    if-lt v1, v2, :cond_19

    .line 714
    .line 715
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 716
    .line 717
    .line 718
    :cond_19
    :goto_8
    return-void
.end method

.method public final r(Ldefpackage/cx3;I)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    move/from16 v11, p2

    .line 6
    .line 7
    iget-object v0, v1, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 8
    .line 9
    if-ne v10, v0, :cond_0

    .line 10
    .line 11
    iget v0, v1, Ldefpackage/f22;->n:I

    .line 12
    .line 13
    if-ne v11, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-wide/high16 v2, -0x8000000000000000L

    .line 17
    .line 18
    iput-wide v2, v1, Ldefpackage/f22;->B:J

    .line 19
    .line 20
    iget v3, v1, Ldefpackage/f22;->n:I

    .line 21
    .line 22
    const/4 v12, 0x1

    .line 23
    invoke-virtual {v1, v10, v12}, Ldefpackage/f22;->m(Ldefpackage/cx3;Z)V

    .line 24
    .line 25
    .line 26
    iput v11, v1, Ldefpackage/f22;->n:I

    .line 27
    .line 28
    const/4 v13, 0x2

    .line 29
    if-ne v11, v13, :cond_2

    .line 30
    .line 31
    if-eqz v10, :cond_1

    .line 32
    .line 33
    iget-object v0, v10, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, v1, Ldefpackage/f22;->w:Landroid/view/View;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-string v0, "Must pass a ViewHolder when dragging"

    .line 39
    .line 40
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    :goto_0
    mul-int/lit8 v0, v11, 0x8

    .line 45
    .line 46
    const/16 v14, 0x8

    .line 47
    .line 48
    add-int/2addr v0, v14

    .line 49
    shl-int v0, v12, v0

    .line 50
    .line 51
    add-int/lit8 v15, v0, -0x1

    .line 52
    .line 53
    iget-object v2, v1, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 54
    .line 55
    const/high16 v16, 0x30000

    .line 56
    .line 57
    iget-object v0, v1, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 58
    .line 59
    if-eqz v2, :cond_15

    .line 60
    .line 61
    iget-object v5, v2, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const/4 v7, 0x0

    .line 68
    if-eqz v6, :cond_13

    .line 69
    .line 70
    if-ne v3, v13, :cond_4

    .line 71
    .line 72
    :cond_3
    :goto_1
    const/4 v8, 0x0

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    iget v5, v1, Ldefpackage/f22;->n:I

    .line 75
    .line 76
    if-ne v5, v13, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    iget-object v5, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    iget v6, v0, Ldefpackage/e22;->c:I

    .line 82
    .line 83
    or-int/lit8 v8, v6, 0x3

    .line 84
    .line 85
    shl-int/2addr v6, v14

    .line 86
    or-int/2addr v6, v8

    .line 87
    or-int v6, v6, v16

    .line 88
    .line 89
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    invoke-static {v6, v5}, Ldefpackage/e22;->b(II)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    const v8, 0xff00

    .line 98
    .line 99
    .line 100
    and-int/2addr v5, v8

    .line 101
    shr-int/2addr v5, v14

    .line 102
    if-nez v5, :cond_6

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    and-int/2addr v6, v8

    .line 106
    shr-int/2addr v6, v14

    .line 107
    iget v8, v1, Ldefpackage/f22;->h:F

    .line 108
    .line 109
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    iget v9, v1, Ldefpackage/f22;->i:F

    .line 114
    .line 115
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    cmpl-float v8, v8, v9

    .line 120
    .line 121
    if-lez v8, :cond_8

    .line 122
    .line 123
    invoke-virtual {v1, v5}, Ldefpackage/f22;->j(I)I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-lez v8, :cond_7

    .line 128
    .line 129
    and-int v5, v6, v8

    .line 130
    .line 131
    if-nez v5, :cond_a

    .line 132
    .line 133
    iget-object v5, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 134
    .line 135
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    invoke-static {v8, v5}, Ldefpackage/e22;->c(II)I

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    goto :goto_2

    .line 144
    :cond_7
    invoke-virtual {v1, v5}, Ldefpackage/f22;->l(I)I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    if-lez v8, :cond_3

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_8
    invoke-virtual {v1, v5}, Ldefpackage/f22;->l(I)I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-lez v8, :cond_9

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_9
    invoke-virtual {v1, v5}, Ldefpackage/f22;->j(I)I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-lez v8, :cond_3

    .line 163
    .line 164
    and-int v5, v6, v8

    .line 165
    .line 166
    if-nez v5, :cond_a

    .line 167
    .line 168
    iget-object v5, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 169
    .line 170
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-static {v8, v5}, Ldefpackage/e22;->c(II)I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    :cond_a
    :goto_2
    iget-object v5, v1, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 179
    .line 180
    if-eqz v5, :cond_b

    .line 181
    .line 182
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->recycle()V

    .line 183
    .line 184
    .line 185
    iput-object v7, v1, Ldefpackage/f22;->t:Landroid/view/VelocityTracker;

    .line 186
    .line 187
    :cond_b
    const/4 v5, 0x4

    .line 188
    const/4 v6, 0x0

    .line 189
    if-eq v8, v12, :cond_d

    .line 190
    .line 191
    if-eq v8, v13, :cond_d

    .line 192
    .line 193
    if-eq v8, v5, :cond_c

    .line 194
    .line 195
    if-eq v8, v14, :cond_c

    .line 196
    .line 197
    const/16 v9, 0x10

    .line 198
    .line 199
    if-eq v8, v9, :cond_c

    .line 200
    .line 201
    const/16 v9, 0x20

    .line 202
    .line 203
    if-eq v8, v9, :cond_c

    .line 204
    .line 205
    move-object v4, v7

    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    move v7, v6

    .line 209
    goto :goto_3

    .line 210
    :cond_c
    iget v9, v1, Ldefpackage/f22;->h:F

    .line 211
    .line 212
    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    const/16 v17, 0x0

    .line 217
    .line 218
    iget-object v4, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 219
    .line 220
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    int-to-float v4, v4

    .line 225
    mul-float/2addr v9, v4

    .line 226
    move-object v4, v7

    .line 227
    move v7, v6

    .line 228
    move v6, v9

    .line 229
    goto :goto_3

    .line 230
    :cond_d
    const/16 v17, 0x0

    .line 231
    .line 232
    iget v4, v1, Ldefpackage/f22;->i:F

    .line 233
    .line 234
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    iget-object v9, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 239
    .line 240
    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    int-to-float v9, v9

    .line 245
    mul-float/2addr v4, v9

    .line 246
    move-object/from16 v21, v7

    .line 247
    .line 248
    move v7, v4

    .line 249
    move-object/from16 v4, v21

    .line 250
    .line 251
    :goto_3
    if-ne v3, v13, :cond_e

    .line 252
    .line 253
    move v5, v14

    .line 254
    goto :goto_4

    .line 255
    :cond_e
    if-lez v8, :cond_f

    .line 256
    .line 257
    move v5, v13

    .line 258
    :cond_f
    :goto_4
    iget-object v9, v1, Ldefpackage/f22;->b:[F

    .line 259
    .line 260
    invoke-virtual {v1, v9}, Ldefpackage/f22;->o([F)V

    .line 261
    .line 262
    .line 263
    move-object/from16 v18, v4

    .line 264
    .line 265
    aget v4, v9, v17

    .line 266
    .line 267
    aget v9, v9, v12

    .line 268
    .line 269
    move-object/from16 v19, v0

    .line 270
    .line 271
    new-instance v0, Ldefpackage/b22;

    .line 272
    .line 273
    move/from16 v20, v5

    .line 274
    .line 275
    move v5, v9

    .line 276
    move-object v9, v2

    .line 277
    move/from16 v12, v17

    .line 278
    .line 279
    move/from16 v13, v20

    .line 280
    .line 281
    invoke-direct/range {v0 .. v9}, Ldefpackage/b22;-><init>(Ldefpackage/f22;Ldefpackage/cx3;IFFFFILdefpackage/cx3;)V

    .line 282
    .line 283
    .line 284
    iget-object v3, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 285
    .line 286
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Ldefpackage/jw3;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    if-nez v3, :cond_11

    .line 294
    .line 295
    if-ne v13, v14, :cond_10

    .line 296
    .line 297
    const-wide/16 v3, 0xc8

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_10
    const-wide/16 v3, 0xfa

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_11
    if-ne v13, v14, :cond_12

    .line 304
    .line 305
    iget-wide v3, v3, Ldefpackage/jw3;->e:J

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_12
    iget-wide v3, v3, Ldefpackage/jw3;->d:J

    .line 309
    .line 310
    :goto_5
    iget-object v5, v0, Ldefpackage/b22;->g:Landroid/animation/ValueAnimator;

    .line 311
    .line 312
    invoke-virtual {v5, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 313
    .line 314
    .line 315
    iget-object v3, v1, Ldefpackage/f22;->p:Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v12}, Ldefpackage/cx3;->p(Z)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->start()V

    .line 324
    .line 325
    .line 326
    move-object/from16 v3, v19

    .line 327
    .line 328
    const/4 v0, 0x1

    .line 329
    const/4 v4, 0x0

    .line 330
    goto :goto_7

    .line 331
    :cond_13
    move-object/from16 v19, v0

    .line 332
    .line 333
    const/4 v12, 0x0

    .line 334
    iget-object v0, v1, Ldefpackage/f22;->w:Landroid/view/View;

    .line 335
    .line 336
    if-ne v5, v0, :cond_14

    .line 337
    .line 338
    const/4 v4, 0x0

    .line 339
    iput-object v4, v1, Ldefpackage/f22;->w:Landroid/view/View;

    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_14
    const/4 v4, 0x0

    .line 343
    :goto_6
    iget-object v0, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 344
    .line 345
    move-object/from16 v3, v19

    .line 346
    .line 347
    invoke-virtual {v3, v0, v2}, Ldefpackage/e22;->a(Landroidx/recyclerview/widget/RecyclerView;Ldefpackage/cx3;)V

    .line 348
    .line 349
    .line 350
    move v0, v12

    .line 351
    :goto_7
    iput-object v4, v1, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 352
    .line 353
    move v4, v0

    .line 354
    goto :goto_8

    .line 355
    :cond_15
    move-object v3, v0

    .line 356
    const/4 v12, 0x0

    .line 357
    move v4, v12

    .line 358
    :goto_8
    if-eqz v10, :cond_16

    .line 359
    .line 360
    iget-object v0, v10, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 361
    .line 362
    iget-object v2, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 363
    .line 364
    iget v5, v3, Ldefpackage/e22;->c:I

    .line 365
    .line 366
    or-int/lit8 v6, v5, 0x3

    .line 367
    .line 368
    shl-int/2addr v5, v14

    .line 369
    or-int/2addr v5, v6

    .line 370
    or-int v5, v5, v16

    .line 371
    .line 372
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    invoke-static {v5, v2}, Ldefpackage/e22;->b(II)I

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    and-int/2addr v2, v15

    .line 381
    iget v5, v1, Ldefpackage/f22;->n:I

    .line 382
    .line 383
    mul-int/2addr v5, v14

    .line 384
    shr-int/2addr v2, v5

    .line 385
    iput v2, v1, Ldefpackage/f22;->o:I

    .line 386
    .line 387
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    int-to-float v2, v2

    .line 392
    iput v2, v1, Ldefpackage/f22;->j:F

    .line 393
    .line 394
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    int-to-float v2, v2

    .line 399
    iput v2, v1, Ldefpackage/f22;->k:F

    .line 400
    .line 401
    iput-object v10, v1, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 402
    .line 403
    const/4 v2, 0x2

    .line 404
    if-ne v11, v2, :cond_16

    .line 405
    .line 406
    invoke-virtual {v0, v12}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 407
    .line 408
    .line 409
    :cond_16
    iget-object v0, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 410
    .line 411
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    if-eqz v0, :cond_18

    .line 416
    .line 417
    iget-object v2, v1, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 418
    .line 419
    if-eqz v2, :cond_17

    .line 420
    .line 421
    const/4 v12, 0x1

    .line 422
    :cond_17
    invoke-interface {v0, v12}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 423
    .line 424
    .line 425
    :cond_18
    if-nez v4, :cond_19

    .line 426
    .line 427
    iget-object v0, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 428
    .line 429
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Ldefpackage/mw3;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    const/4 v2, 0x1

    .line 434
    iput-boolean v2, v0, Ldefpackage/mw3;->f:Z

    .line 435
    .line 436
    :cond_19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    iget-object v0, v1, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 440
    .line 441
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 442
    .line 443
    .line 444
    return-void
.end method

.method public final s(IILandroid/view/MotionEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget p3, p0, Ldefpackage/f22;->d:F

    .line 10
    .line 11
    sub-float/2addr v0, p3

    .line 12
    iput v0, p0, Ldefpackage/f22;->h:F

    .line 13
    .line 14
    iget p3, p0, Ldefpackage/f22;->e:F

    .line 15
    .line 16
    sub-float/2addr p2, p3

    .line 17
    iput p2, p0, Ldefpackage/f22;->i:F

    .line 18
    .line 19
    and-int/lit8 p2, p1, 0x4

    .line 20
    .line 21
    const/4 p3, 0x0

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    invoke-static {p3, v0}, Ljava/lang/Math;->max(FF)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iput p2, p0, Ldefpackage/f22;->h:F

    .line 29
    .line 30
    :cond_0
    and-int/lit8 p2, p1, 0x8

    .line 31
    .line 32
    if-nez p2, :cond_1

    .line 33
    .line 34
    iget p2, p0, Ldefpackage/f22;->h:F

    .line 35
    .line 36
    invoke-static {p3, p2}, Ljava/lang/Math;->min(FF)F

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iput p2, p0, Ldefpackage/f22;->h:F

    .line 41
    .line 42
    :cond_1
    and-int/lit8 p2, p1, 0x1

    .line 43
    .line 44
    if-nez p2, :cond_2

    .line 45
    .line 46
    iget p2, p0, Ldefpackage/f22;->i:F

    .line 47
    .line 48
    invoke-static {p3, p2}, Ljava/lang/Math;->max(FF)F

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    iput p2, p0, Ldefpackage/f22;->i:F

    .line 53
    .line 54
    :cond_2
    and-int/lit8 p1, p1, 0x2

    .line 55
    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    iget p1, p0, Ldefpackage/f22;->i:F

    .line 59
    .line 60
    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iput p1, p0, Ldefpackage/f22;->i:F

    .line 65
    .line 66
    :cond_3
    return-void
.end method
