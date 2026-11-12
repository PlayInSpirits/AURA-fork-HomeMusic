.class public Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic t:I


# instance fields
.field public n:Landroid/widget/TextView;

.field public o:Landroid/view/View;

.field public p:Landroidx/recyclerview/widget/RecyclerView;

.field public q:I

.field public r:Landroid/animation/ObjectAnimator;

.field public final s:Lc61;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 23
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 25
    new-instance p1, Lc61;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Lc61;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->s:Lc61;

    const/4 p1, 0x0

    .line 26
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 27
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 29
    iput-object p1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 30
    new-instance p1, Lc61;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, Lc61;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->s:Lc61;

    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 32
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 6
    .line 7
    new-instance p1, Lc61;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-direct {p1, p2, p0}, Lc61;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->s:Lc61;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private setBubbleAndHandlePosition(F)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 8
    .line 9
    iget v2, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->q:I

    .line 10
    .line 11
    sub-int/2addr v2, v0

    .line 12
    div-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    int-to-float v3, v0

    .line 15
    sub-float v3, p1, v3

    .line 16
    .line 17
    float-to-int v3, v3

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    int-to-float v2, v2

    .line 28
    invoke-virtual {v1, v2}, Landroid/view/View;->setY(F)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v2, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 40
    .line 41
    iget p0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->q:I

    .line 42
    .line 43
    sub-int/2addr p0, v1

    .line 44
    sub-int/2addr p0, v0

    .line 45
    int-to-float v0, v1

    .line 46
    sub-float/2addr p1, v0

    .line 47
    float-to-int p1, p1

    .line 48
    invoke-static {v4, p1}, Ljava/lang/Math;->max(II)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    int-to-float p0, p0

    .line 57
    invoke-virtual {v2, p0}, Landroid/view/View;->setY(F)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method

.method private setRecyclerViewPosition(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->p:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ldw3;->a()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    cmpl-float v1, v1, v2

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v2, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    int-to-float v2, v2

    .line 38
    add-float/2addr v1, v2

    .line 39
    iget v2, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->q:I

    .line 40
    .line 41
    add-int/lit8 v3, v2, -0x5

    .line 42
    .line 43
    int-to-float v3, v3

    .line 44
    cmpl-float v1, v1, v3

    .line 45
    .line 46
    if-ltz v1, :cond_1

    .line 47
    .line 48
    const/high16 v2, 0x3f800000    # 1.0f

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    int-to-float v1, v2

    .line 52
    div-float v2, p1, v1

    .line 53
    .line 54
    :goto_0
    add-int/lit8 p1, v0, -0x1

    .line 55
    .line 56
    int-to-float v0, v0

    .line 57
    mul-float/2addr v2, v0

    .line 58
    float-to-int v0, v2

    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->p:Landroidx/recyclerview/widget/RecyclerView;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 75
    .line 76
    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1(II)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->p:Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lb03;

    .line 86
    .line 87
    iget-object v2, v0, Lb03;->r:Ljava/util/List;

    .line 88
    .line 89
    if-eqz v2, :cond_2

    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_2

    .line 96
    .line 97
    iget-object v0, v0, Lb03;->r:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Artist;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-static {p1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    goto :goto_1

    .line 125
    :cond_2
    const/4 p1, 0x0

    .line 126
    :goto_1
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_3

    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->a()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_3
    iget-object p1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    const/4 v0, 0x4

    .line 150
    if-ne p1, v0, :cond_4

    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->b()V

    .line 153
    .line 154
    .line 155
    :cond_4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 11
    .line 12
    .line 13
    :cond_1
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    new-array v1, v1, [F

    .line 17
    .line 18
    fill-array-data v1, :array_0

    .line 19
    .line 20
    .line 21
    const-string v2, "alpha"

    .line 22
    .line 23
    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-wide/16 v1, 0x64

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 34
    .line 35
    new-instance v1, Ll4;

    .line 36
    .line 37
    const/4 v2, 0x7

    .line 38
    invoke-direct {v1, v2, p0}, Ll4;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    new-array v1, v1, [F

    .line 21
    .line 22
    fill-array-data v1, :array_0

    .line 23
    .line 24
    .line 25
    const-string v2, "alpha"

    .line 26
    .line 27
    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-wide/16 v1, 0x64

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->p:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->p:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-float v0, v0

    .line 27
    int-to-float v1, v1

    .line 28
    iget v2, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->q:I

    .line 29
    .line 30
    int-to-float v3, v2

    .line 31
    sub-float/2addr v1, v3

    .line 32
    div-float/2addr v0, v1

    .line 33
    int-to-float v1, v2

    .line 34
    mul-float/2addr v1, v0

    .line 35
    invoke-direct {p0, v1}, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->setBubbleAndHandlePosition(F)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->p:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->w0:Ljava/util/ArrayList;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->s:Lc61;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->p:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->q:I

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->c()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq v0, v3, :cond_5

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    if-eq v0, v3, :cond_0

    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/view/View;->setSelected(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->a()V

    .line 28
    .line 29
    .line 30
    return v2

    .line 31
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v3, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/view/View;->getX()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget-object v4, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 42
    .line 43
    sget-object v5, Lj65;->a:Ljava/util/WeakHashMap;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/view/View;->getPaddingStart()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    int-to-float v4, v4

    .line 50
    sub-float/2addr v3, v4

    .line 51
    cmpg-float v0, v0, v3

    .line 52
    .line 53
    if-gez v0, :cond_2

    .line 54
    .line 55
    return v1

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x4

    .line 72
    if-ne v0, v1, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->b()V

    .line 75
    .line 76
    .line 77
    :cond_4
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->o:Landroid/view/View;

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 80
    .line 81
    .line 82
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-direct {p0, p1}, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->setBubbleAndHandlePosition(F)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, p1}, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->setRecyclerViewPosition(F)V

    .line 90
    .line 91
    .line 92
    return v2
.end method

.method public setRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->p:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->s:Lc61;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->w0:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object p1, p0, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->p:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->j(Lrw3;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_0
    return-void
.end method
